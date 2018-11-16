package com.hypeirochus.scmc.client.gui;

import com.hypeirochus.scmc.Starcraft;
import com.hypeirochus.scmc.container.ContainerStarcraftFurnace;
import com.hypeirochus.scmc.enums.EnumWorldType;
import com.hypeirochus.scmc.network.NetworkHandler;
import com.hypeirochus.scmc.network.message.MessageGetFurnaceData;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.items.IItemHandler;

/**
 * The gui for all of the starcraft furnaces
 *
 * @author CJMinecraft
 */
public class GuiStarcraftFurnace extends GuiContainer
{

	/**
	 * The texture path for the background
	 */
	private ResourceLocation texturePath;

	/**
	 * Used for synchronisation with the server
	 */
	public static float burnTime, cookTime;

	/**
	 * The position of the furnace tile entity
	 */
	private BlockPos pos;

	/**
	 * The holder of the sync timer (we sync every 10 ticks)
	 */
	private int sync;

	private EntityPlayer player;

	/**
	 * Create a new gui for a starcraft furnace
	 *
	 * @param player The player for use inside the container
	 * @param furnaceInv The inventory of the furnace for use inside the container
	 * @param worldType The type of furnace this is (used for getting the texture)
	 * @param pos The position of the furnace tile entity
	 */
	public GuiStarcraftFurnace(EntityPlayer player, IItemHandler furnaceInv, EnumWorldType worldType, BlockPos pos)
	{
		super(new ContainerStarcraftFurnace(player, furnaceInv));
		this.texturePath = new ResourceLocation(Starcraft.RL_BASE + "textures/gui/container/" + worldType.getName() + "_furnace.png");
		this.pos = pos;
		this.player = player;
		setGuiSize(175, 165);
	}

	@Override
	public void drawScreen(int mouseX, int mouseY, float partialTicks)
	{
		drawDefaultBackground();
		super.drawScreen(mouseX, mouseY, partialTicks);
		renderHoveredToolTip(mouseX, mouseY);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float v, int i, int i1)
	{
		GlStateManager.color(1F, 1F, 1F, 1F);
		this.mc.getTextureManager().bindTexture(this.texturePath);
		this.drawTexturedModalRect(this.guiLeft, this.guiTop, 0, 0, this.xSize, this.ySize);

		if (this.sync == 0)
			NetworkHandler.sendToServer(new MessageGetFurnaceData(this.pos, "com.hypeirochus.scmc.client.gui.GuiStarcraftFurnace", "burnTime", "cookTime"));
		this.sync++;
		this.sync %= 10;

		if (burnTime != 0)
			this.drawTexturedModalRect(this.guiLeft + 58, this.guiTop + 37 + (int) ((1 - burnTime) * 14.0F), 176, (int) ((1 - burnTime) * 14.0F), 14, (int) (burnTime * 14.0F));
		this.drawTexturedModalRect(this.guiLeft + 80, this.guiTop + 35, 176, 14, (int) (cookTime * 24.0F), 17);
	}

	@Override
	protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY)
	{
		String title = Item.getItemFromBlock(Blocks.FURNACE).getItemStackDisplayName(new ItemStack(Blocks.FURNACE, 1, 0));
		this.fontRenderer.drawString(title, this.xSize / 2 - this.fontRenderer.getStringWidth(title) / 2, 6, 4210752);
		this.fontRenderer.drawString(this.player.inventory.getDisplayName().getUnformattedText(), 8, this.ySize - 96 + 2, 4210752);
	}
}
