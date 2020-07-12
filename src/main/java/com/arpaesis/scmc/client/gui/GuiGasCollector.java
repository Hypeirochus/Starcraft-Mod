package com.arpaesis.scmc.client.gui;

import java.util.ArrayList;
import java.util.List;

import com.arpaesis.scmc.SCConstants;
import com.arpaesis.scmc.blocks.metablocks.BlockGasCollector.GasCollectorType;
import com.arpaesis.scmc.container.ContainerGasCollector;
import com.arpaesis.scmc.handlers.BlockHandler;
import com.arpaesis.scmc.handlers.ItemHandler;
import com.arpaesis.scmc.tileentity.TileEntityGasCollector;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.fml.client.config.GuiUtils;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import net.rom.utils.CoreUtil;

/**
 * <em><b>Copyright (c) 2017 The Starcraft Minecraft (SCMC) Mod Team.</b></em>
 * <br>
 * </br>
 * 
 * @author Ocelot5836
 */
public class GuiGasCollector extends GuiContainer
{

	private TileEntityGasCollector te;
	private IInventory playerInv;
	private IItemHandler itemHandler;

	private String[][] names;
	private int nameCounter;
	private int currentName;

	public GuiGasCollector(EntityPlayer player, TileEntityGasCollector te)
	{
		super(new ContainerGasCollector(player, te));

		this.te = te;
		this.playerInv = player.inventory;
		this.itemHandler = te.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null);
	}

	@Override
	public void initGui()
	{
		this.guiLeft = 175;
		this.guiTop = 165;
		names = new String[][] { { ItemHandler.PROTOSS_INGOT.getItemStackDisplayName(new ItemStack(ItemHandler.PROTOSS_INGOT, 4, 0)) }, { Item.getItemFromBlock(Blocks.PLANKS).getItemStackDisplayName(new ItemStack(Blocks.PLANKS, 4, 0)), Item.getItemFromBlock(Blocks.PLANKS).getItemStackDisplayName(new ItemStack(Blocks.PLANKS, 4, 1)), Item.getItemFromBlock(Blocks.PLANKS).getItemStackDisplayName(new ItemStack(Blocks.PLANKS, 4, 2)), Item.getItemFromBlock(Blocks.PLANKS).getItemStackDisplayName(new ItemStack(Blocks.PLANKS, 4, 3)), Item.getItemFromBlock(Blocks.PLANKS).getItemStackDisplayName(new ItemStack(Blocks.PLANKS, 4, 4)), Item.getItemFromBlock(Blocks.PLANKS).getItemStackDisplayName(new ItemStack(Blocks.PLANKS, 4, 5)) }, { ItemHandler.ORGANIC_TISSUE.getItemStackDisplayName(new ItemStack(ItemHandler.ORGANIC_TISSUE, 1, 0)) } };
		super.initGui();
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY)
	{
		bindTexture();
		GlStateManager.color(1F, 1F, 1F, 1F);
		drawTexturedModalRect((width - xSize) / 2, (height - ySize) / 2, 0, 0, this.xSize, this.ySize);
	}

	@Override
	public void updateScreen()
	{
		super.updateScreen();
		this.nameCounter++;
		this.nameCounter %= 20;
		if (this.nameCounter == 0)
		{
			this.currentName++;
			if (this.currentName >= this.names[this.te.getType()].length)
			{
				this.currentName = 0;
			}
		}
	}

	@Override
	public void drawScreen(int mouseX, int mouseY, float partialTicks)
	{
		drawDefaultBackground();
		super.drawScreen(mouseX, mouseY, partialTicks);
		renderHoveredToolTip(mouseX, mouseY);
		if (this.itemHandler.getStackInSlot(9).isEmpty())
		{
			bindTexture();
			String s = TextFormatting.GRAY + I18n.format("gui.gas_collector." + GasCollectorType.values()[this.te.getType()] + ".fuel.tooltip", getRequiredFuel(), TextFormatting.DARK_GRAY + this.names[this.te.getType()][this.currentName] + TextFormatting.GRAY);
			drawTooltip(this.fontRenderer.listFormattedStringToWidth(s, 150), this.guiLeft + 133, this.guiTop + 34, 18, 18, mouseX, mouseY);
		}
	}

	@Override
	protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY)
	{
		int color = 4210752;
		String title = Item.getItemFromBlock(BlockHandler.GAS_COLLECTOR).getItemStackDisplayName(new ItemStack(BlockHandler.GAS_COLLECTOR, 1, this.te.getType()));
		this.mc.fontRenderer.drawString(title, this.xSize / 2 - this.mc.fontRenderer.getStringWidth(title) / 2, 6, 4210752);
		this.mc.fontRenderer.drawString(this.playerInv.getDisplayName().getFormattedText(), 8, 72, color);
	}

	public int getRequiredFuel()
	{
		ItemStack stack = this.itemHandler.getStackInSlot(9);
		if (!stack.isEmpty())
		{
			if (stack.getCount() > 4)
			{
				return 0;
			}
			else
			{
				return stack.getCount();
			}
		}
		return 4;
	}

	@Override
	public boolean doesGuiPauseGame()
	{
		return false;
	}

	private void bindTexture()
	{
		CoreUtil.bindTexture(SCConstants.MODID, "textures/gui/container/gas_collector_" + GasCollectorType.values()[this.te.getType()].getName() + ".png");
	}

	public void drawTooltip(List<String> lines, int posX, int posY, int width, int height, int mouseX, int mouseY)
	{
		if (GuiUtils.isMouseInside(posX, posY, width, height, mouseX, mouseY))
		{
			drawHoveringText(lines, mouseX, mouseY);
		}
	}

	public void drawTooltip(String line, int posX, int posY, int width, int height, int mouseX, int mouseY)
	{
		if (GuiUtils.isMouseInside(posX, posY, width, height, mouseX, mouseY))
		{
			List<String> lines = new ArrayList<String>();
			lines.add(line);
			drawHoveringText(lines, mouseX, mouseY);
		}
	}
}
