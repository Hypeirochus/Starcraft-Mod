package com.hypeirochus.scmc.client.gui;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.lwjgl.input.Keyboard;

import com.hypeirochus.scmc.client.gui.element.ItemShopTab;
import com.hypeirochus.scmc.enums.MetaHandler;
import com.hypeirochus.scmc.handlers.ArmorHandler;
import com.hypeirochus.scmc.handlers.BlockHandler;
import com.hypeirochus.scmc.handlers.ItemHandler;
import com.hypeirochus.scmc.handlers.ToolHandler;
import com.hypeirochus.scmc.items.ItemMagazine;
import com.hypeirochus.scmc.network.NetworkHandler;
import com.hypeirochus.scmc.network.message.MessageSpawnItem;
import com.ocelot.api.utils.GuiUtils;
import com.ocelot.api.utils.GuiUtils.GuiType;
import com.ocelot.api.utils.InventoryUtils;
import com.ocelot.api.utils.SoundUtils;
import com.ocelot.api.utils.TimeUtils;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiTextField;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag.TooltipFlags;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextFormatting;

/**
 * <em><b>Copyright (c) 2018 The Starcraft Minecraft (SCMC) Mod Team.</b></em>
 * <br>
 * </br>
 * 
 * @author Ocelot5836
 */
public class GuiItemShop extends BasicGui
{

	private EntityPlayer customer;
	private String displayName;

	private static final ItemStack MINERAL = new ItemStack(ItemHandler.MINERAL_SHARD);
	private static final ItemStack VESPENE = new ItemStack(ItemHandler.VESPENE, 1, 2);

	private List<ItemShopTab> tabs = new ArrayList<ItemShopTab>();
	private int tab;

	private GuiButton buttonBuy;
	private GuiTextField textBox;
	private static final int BUTTON_BUY = 0;
	private static final int TEXT_BOX = 1;

	private int selectedIndex = -1;
	private int buyAmount = 1;
	private ItemStack modifyingStack = null;
	private int modifyingStackWindowX = 0;
	private int modifyingStackWindowY = 0;

	public GuiItemShop(EntityPlayer player)
	{
		this.customer = player;
		this.displayName = I18n.format("gui.item_shop");
	}

	@Override
	public void initGui()
	{
		xSize = 152;
		ySize = 230;
		guiLeft = (width - xSize) / 2;
		guiTop = (height - ySize) / 2;

		tab = 0;

		tabs.clear();
		tabs.add(new ItemShopTab(ItemMagazine.getDefaultStack(MetaHandler.BulletMagazineType.C14.getID()), I18n.format("itemGroup.terran.general"), guiLeft - 29, guiTop + 4, GuiLists.TRADES[0]));
		tabs.add(new ItemShopTab(new ItemStack(BlockHandler.GAS_COLLECTOR, 1, 1), I18n.format("itemGroup.terran.machine"), guiLeft - 29, guiTop + 34, GuiLists.TRADES[1]));
		tabs.add(new ItemShopTab(new ItemStack(BlockHandler.PARISTEEL_METAL, 1, 0), I18n.format("itemGroup.terran.decoration"), guiLeft - 29, guiTop + 64, GuiLists.TRADES[2]));
		tabs.add(new ItemShopTab(new ItemStack(ItemHandler.C14_GAUSS_RIFLE, 1, 0), I18n.format("itemGroup.terran.weapons"), guiLeft - 29, guiTop + 94, GuiLists.TRADES[3]));
		tabs.add(new ItemShopTab(new ItemStack(ArmorHandler.COPPER_HELMET, 1, 0), I18n.format("itemGroup.terran.armors"), guiLeft - 29, guiTop + 124, GuiLists.TRADES[4]));
		tabs.add(new ItemShopTab(new ItemStack(ToolHandler.COPPER_PICKAXE, 1, 0), I18n.format("itemGroup.terran.tools"), guiLeft - 29, guiTop + 154, GuiLists.TRADES[5]));

		buttonList.clear();
		buttonBuy = new GuiButton(BUTTON_BUY, guiLeft + 105, guiTop + 120, 30, 20, I18n.format("gui.buy"));
		textBox = new GuiTextField(TEXT_BOX, mc.fontRenderer, 0, 0, 0, 0);
		buttonList.add(buttonBuy);
	}

	@Override
	public void drawScreen(int mouseX, int mouseY, float partialTicks)
	{
		if (modifyingStack == null)
			this.drawDefaultBackground();
		this.drawGuiBackgroundLayer(partialTicks, mouseX, mouseY);
		GlStateManager.disableRescaleNormal();
		RenderHelper.disableStandardItemLighting();
		GlStateManager.disableLighting();
		GlStateManager.disableDepth();

		for (int i = 0; i < this.buttonList.size(); ++i)
		{
			((GuiButton) this.buttonList.get(i)).drawButton(this.mc, mouseX, mouseY, partialTicks);
		}

		GlStateManager.pushMatrix();
		GlStateManager.color(1F, 1F, 1F, 1F);
		GlStateManager.enableRescaleNormal();
		OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, 240.0F, 240.0F);
		GlStateManager.color(1F, 1F, 1F, 1F);

		for (ItemShopTab tab : tabs)
		{
			tab.renderLit(mouseX, mouseY);
			GlStateManager.enableDepth();
			RenderHelper.enableGUIStandardItemLighting();
			tab.renderIcon();
		}

		GlStateManager.translate(this.guiLeft, this.guiTop, 0.0F);
		drawCenterLayer(mouseX, mouseY);
		RenderHelper.disableStandardItemLighting();
		this.drawGuiForegroundLayer(mouseX, mouseY);
		GlStateManager.popMatrix();
		GlStateManager.enableLighting();
		GlStateManager.enableDepth();
		GlStateManager.disableDepth();
		RenderHelper.enableGUIStandardItemLighting();
		if (modifyingStack != null)
		{
			drawDefaultBackground();
			GlStateManager.color(1, 1, 1, 1);
			GuiUtils.drawCustomSizeGui(modifyingStackWindowX, modifyingStackWindowY, 80, 50, GuiType.DEFAULT);
			GuiUtils.drawSlot(modifyingStackWindowX + 5, modifyingStackWindowY + 5, 18, 18);
			GlStateManager.enableDepth();
			Minecraft.getMinecraft().getRenderItem().renderItemAndEffectIntoGUI(modifyingStack, modifyingStackWindowX + 6, modifyingStackWindowY + 6);
			GlStateManager.disableDepth();
			textBox.drawTextBox();
			this.fontRenderer.drawString("How Much?", modifyingStackWindowX + 25, modifyingStackWindowY + 12, 4210752);
		}
		RenderHelper.enableStandardItemLighting();

		drawTooltips(mouseX, mouseY);
	}

	@Override
	public void drawGuiBackgroundLayer(float partialTicks, int mouseX, int mouseY)
	{
		for (ItemShopTab tab : tabs)
		{
			tab.renderUnlit(mouseX, mouseY);
		}

		tabs.get(tab).renderBackground(guiLeft, guiTop, xSize, ySize);

		if (MINERAL.getCount() <= 0)
		{
			this.bindTexture();
			this.drawTexturedModalRect(guiLeft + 105, guiTop + 91, 152, 0, 16, 16);
		}

		if (VESPENE.getCount() <= 0)
		{
			this.bindTexture();
			this.drawTexturedModalRect(guiLeft + 123, guiTop + 91, 152, 0, 16, 16);
		}
	}

	@Override
	public void drawCenterLayer(int mouseX, int mouseY)
	{
		if (selectedIndex != -1)
		{
			int selectedX = selectedIndex % 4;
			int selectedY = selectedIndex / 4;
			GlStateManager.color(0.1F, 0.1F, 0.1F, 0.1F);
			int xOffset = 25;
			int yOffset = 25;
			drawRect(xOffset + selectedX * 18, yOffset + selectedY * 22, xOffset + (selectedX * 18) + 16, yOffset + (selectedY * 22) + 16, GuiLists.HIGHLIGHT_COLOR);
		}

		for (int i = 0; i < 7; i++)
		{
			for (int j = 0; j < 4; j++)
			{
				int index = 4 * i + j;
				if (index < tabs.get(tab).getItems().size())
				{
					if (index != selectedIndex && (MINERAL.getCount() < tabs.get(tab).getItems().get(index).getMineralCost() * buyAmount || VESPENE.getCount() < tabs.get(tab).getItems().get(index).getVespeneCost() * buyAmount))
					{
						int selectedX = index % 4;
						int selectedY = index / 4;
						int xOffset = 25;
						int yOffset = 25;
						drawRect(xOffset + selectedX * 18, yOffset + selectedY * 22, xOffset + (selectedX * 18) + 16, yOffset + (selectedY * 22) + 16, GuiLists.NO_FUNDS_COLOR);
					}
					Minecraft.getMinecraft().getRenderItem().renderItemAndEffectIntoGUI(tabs.get(tab).getItems().get(index).getStack(), 25 + j * 18, 25 + i * 22);
					Minecraft.getMinecraft().getRenderItem().renderItemOverlays(mc.fontRenderer, tabs.get(tab).getItems().get(index).getStack(), 25 + j * 18, 25 + i * 22);
				}
			}
		}
	}

	@Override
	public void drawGuiForegroundLayer(int mouseX, int mouseY)
	{
		this.fontRenderer.drawString(displayName, xSize / 2 - this.fontRenderer.getStringWidth(displayName) / 2, 8, 4210752);
		this.fontRenderer.drawString(I18n.format("gui.item_shop.money"), 123 - this.fontRenderer.getStringWidth(I18n.format("gui.item_shop.money")) / 2, 75, 4210752);

		if (TimeUtils.isChristmas())
		{
			this.fontRenderer.drawString(I18n.format("gui.item_shop.christmas"), xSize / 2 - this.fontRenderer.getStringWidth(I18n.format("gui.item_shop.christmas")) / 2, 206, 0x005f00);
		}

		MINERAL.setCount(InventoryUtils.getItemAmount(customer, MINERAL.getItem(), MINERAL.getMetadata()));
		VESPENE.setCount(InventoryUtils.getItemAmount(customer, VESPENE.getItem(), VESPENE.getMetadata()));

		if (MINERAL.getCount() > 0)
		{
			Minecraft.getMinecraft().getRenderItem().renderItemAndEffectIntoGUI(MINERAL, 105, 91);
			Minecraft.getMinecraft().getRenderItem().renderItemOverlays(mc.fontRenderer, MINERAL, 105, 91);
		}

		if (VESPENE.getCount() > 0)
		{
			Minecraft.getMinecraft().getRenderItem().renderItemAndEffectIntoGUI(VESPENE, 123, 91);
			Minecraft.getMinecraft().getRenderItem().renderItemOverlays(mc.fontRenderer, VESPENE, 123, 91);
		}
	}

	@Override
	public void drawTooltips(int mouseX, int mouseY)
	{
		if (modifyingStack != null)
		{
			drawTooltip(modifyingStack.getTooltip(customer, TooltipFlags.values()[this.mc.gameSettings.advancedItemTooltips ? 1 : 0]), modifyingStackWindowX + 5, modifyingStackWindowY + 5, 18, 18, mouseX, mouseY);
		} else
		{
			for (ItemShopTab tab : tabs)
			{
				drawTooltip(tab.getName(), tab.getX(), tab.getY(), tab.getWidth(), tab.getHeight(), mouseX, mouseY);
			}

			for (int i = 0; i < 7; i++)
			{
				for (int j = 0; j < 4; j++)
				{
					int index = 4 * i + j;
					if (index < tabs.get(tab).getItems().size())
					{
						List<String> tooltip = tabs.get(tab).getItems().get(index).getStack().getTooltip(customer, TooltipFlags.values()[this.mc.gameSettings.advancedItemTooltips ? 1 : 0]);
						tooltip.add("");
						tooltip.add(TextFormatting.GRAY + I18n.format("gui.item_shop.tooltip.mineral_cost", tabs.get(tab).getItems().get(index).getMineralCost() * buyAmount));
						tooltip.add(TextFormatting.GRAY + I18n.format("gui.item_shop.tooltip.vespene_cost", tabs.get(tab).getItems().get(index).getVespeneCost() * buyAmount));
						drawTooltip(tooltip, guiLeft + 24 + j * 18, guiTop + 24 + i * 22, 18, 18, mouseX, mouseY);
					}
				}
			}

			if (MINERAL.getCount() <= 0)
			{
				drawTooltip(I18n.format("gui.item_shop.no_minerals"), guiLeft + 105, guiTop + 91, 16, 16, mouseX, mouseY);
			} else
			{
				drawTooltip(MINERAL.getTooltip(customer, TooltipFlags.values()[this.mc.gameSettings.advancedItemTooltips ? 1 : 0]), guiLeft + 104, guiTop + 90, 18, 18, mouseX, mouseY);
			}

			if (VESPENE.getCount() <= 0)
			{
				drawTooltip(I18n.format("gui.item_shop.no_vespene"), guiLeft + 123, guiTop + 91, 16, 16, mouseX, mouseY);
			} else
			{
				drawTooltip(VESPENE.getTooltip(customer, TooltipFlags.values()[this.mc.gameSettings.advancedItemTooltips ? 1 : 0]), guiLeft + 122, guiTop + 90, 18, 168, mouseX, mouseY);
			}
		}
	}

	@Override
	protected void mouseClicked(int mouseX, int mouseY, int mouseButton) throws IOException
	{
		textBox.mouseClicked(mouseX, mouseY, mouseButton);

		if (modifyingStack != null)
		{
			if (!GuiUtils.isMouseInside(modifyingStackWindowX, modifyingStackWindowY, 80, 40, mouseX, mouseY))
			{
				try
				{
					int newAmount = Integer.parseInt(textBox.getText());
					this.buyAmount = newAmount;
				} catch (NumberFormatException e)
				{
					textBox.setText(Integer.toString(this.buyAmount));
				}
				modifyingStack = null;
			}
			return;
		}

		for (int i = 0; i < tabs.size(); i++)
		{
			tabs.get(i).onMouseClicked(mouseX, mouseY, mouseButton);

			if (mouseButton == 0)
			{
				if (GuiUtils.isMouseInside((int) tabs.get(i).getX(), (int) tabs.get(i).getY(), tabs.get(i).getWidth(), tabs.get(i).getHeight(), mouseX, mouseY))
				{
					tab = i;
					selectedIndex = -1;
				}
			}
		}

		if (mouseButton >= 0 && mouseButton < 2)
		{
			for (int y = 0; y < 7; y++)
			{
				for (int x = 0; x < 4; x++)
				{
					int index = 4 * y + x;
					if (index < tabs.get(tab).getItems().size())
					{
						if (GuiUtils.isMouseInside(guiLeft + 25 + x * 18, guiTop + 25 + y * 22, 16, 16, mouseX, mouseY))
						{
							if (mouseButton == 0)
							{
								this.selectedIndex = index;
								this.buyAmount = tabs.get(tab).getItems().get(index).getStack().getCount();
								SoundUtils.playButtonClick();
								return;
							} else
							{
								this.selectedIndex = index;
								this.modifyingStack = tabs.get(tab).getItems().get(index).getStack().copy();
								this.modifyingStackWindowX = mouseX + 10;
								this.modifyingStackWindowY = mouseY - 15;
								textBox = new GuiTextField(TEXT_BOX, mc.fontRenderer, modifyingStackWindowX + 6, modifyingStackWindowY + 28, 65, 14);
								textBox.setText(Integer.toString(buyAmount));
								SoundUtils.playButtonClick();
								return;
							}
						}
					}
				}
			}
		} else
		{
			this.selectedIndex = -1;
		}

		super.mouseClicked(mouseX, mouseY, mouseButton);
	}

	@Override
	public void updateScreen()
	{
		if (selectedIndex == -1 || MINERAL.getCount() < tabs.get(tab).getItems().get(selectedIndex).getMineralCost() * buyAmount || VESPENE.getCount() < tabs.get(tab).getItems().get(selectedIndex).getVespeneCost() * buyAmount)
		{
			buttonBuy.enabled = false;
		} else
		{
			buttonBuy.enabled = true;
		}

		for (ItemShopTab tab : tabs)
		{
			tab.deselect();
		}

		if (tab > tabs.size())
		{
			tab = 0;
		} else
		{
			tabs.get(tab).select();
		}
	}

	@Override
	protected void actionPerformed(GuiButton button) throws IOException
	{
		switch (button.id)
		{
		case BUTTON_BUY:
			if (selectedIndex != -1 && MINERAL.getCount() >= tabs.get(tab).getItems().get(selectedIndex).getMineralCost() * buyAmount && VESPENE.getCount() >= tabs.get(tab).getItems().get(selectedIndex).getVespeneCost() * buyAmount)
			{
				ItemStack stack = tabs.get(tab).getItems().get(selectedIndex).getStack().copy();
				stack.setCount(stack.getCount() * buyAmount);
				NetworkHandler.sendToServer(new MessageSpawnItem(stack));
				InventoryUtils.removeItemWithAmount(customer, MINERAL.getItem(), tabs.get(tab).getItems().get(selectedIndex).getMineralCost() * buyAmount);
				InventoryUtils.removeItemWithAmount(customer, VESPENE.getItem(), tabs.get(tab).getItems().get(selectedIndex).getVespeneCost() * buyAmount);
			}
			break;
		}
	}

	@Override
	public boolean doesGuiPauseGame()
	{
		return false;
	}

	@Override
	protected void keyTyped(char typedChar, int keyCode) throws IOException
	{
		super.keyTyped(typedChar, keyCode);
		textBox.textboxKeyTyped(typedChar, keyCode);

		if (keyCode == 1 || this.mc.gameSettings.keyBindInventory.isActiveAndMatches(keyCode))
		{
			this.mc.player.closeScreen();
		}

		if (keyCode == Keyboard.KEY_RETURN)
		{
			textBox.setFocused(false);
			try
			{
				int newAmount = Integer.parseInt(textBox.getText());
				this.buyAmount = newAmount;
			} catch (NumberFormatException e)
			{
				textBox.setText(Integer.toString(this.buyAmount));
			}
		}
	}

	private void bindTexture()
	{
		tabs.get(tab).bindTexture();
	}
}