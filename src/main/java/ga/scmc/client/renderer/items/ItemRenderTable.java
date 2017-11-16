package ga.scmc.client.renderer.items;

import ga.scmc.api.GuiUtils;
import ga.scmc.api.TextureUtils;
import ga.scmc.client.renderer.RenderUtil;
import ga.scmc.client.renderer.blocks.ModelTable;
import ga.scmc.lib.Library;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms.TransformType;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

public class ItemRenderTable extends ItemRenderer {

	private static final ResourceLocation TEXTURE = new ResourceLocation(Library.MODID, "textures/models/block/table.png");

	public ItemRenderTable() {
		super(new ModelTable(), TEXTURE);
	}

	@Override
	public void renderFirstPersonLeft(ItemStack itemstack, EntityLivingBase entity, TransformType cameraTransformType) {
		renderFirstPersonRight(itemstack, entity, cameraTransformType);
	}

	@Override
	public void renderFirstPersonRight(ItemStack itemstack, EntityLivingBase entity, TransformType cameraTransformType) {
		GlStateManager.pushMatrix();
		GlStateManager.rotate(45, 0, 1, 0);
		GlStateManager.translate(-0.5, -1.1, -0.5);
		TextureUtils.bindTexture("textures/models/block/table.png");
		renderModel(0, 0, 0, 0.0625 * 0.4);
		GlStateManager.popMatrix();
	}

	@Override
	public void renderInInventory(ItemStack itemstack, EntityLivingBase entity, TransformType cameraTransformType) {
		GlStateManager.pushMatrix();
		GlStateManager.rotate(30, 1, 0, 0);
		GlStateManager.rotate(225, 0, 1, 0);
		GlStateManager.translate(-0.5, -0.9, -0.5);
		TextureUtils.bindTexture("textures/models/block/table.png");
		renderModel(0, 0, 0, 0.0625 * 0.626);
		GlStateManager.popMatrix();
	}

	@Override
	public void renderInWorld(ItemStack itemstack, EntityLivingBase entity, TransformType cameraTransformType) {
		GlStateManager.pushMatrix();
		GlStateManager.rotate(45, 0, 1, 0);
		GlStateManager.translate(-0.5, -1.3, -0.5);
		TextureUtils.bindTexture("textures/models/block/table.png");
		renderModel(0, 0, 0, 0.0625 * 0.25);
		GlStateManager.popMatrix();
	}

	@Override
	public void renderFixed(ItemStack itemstack, EntityLivingBase entity, TransformType cameraTransformType) {
		GlStateManager.pushMatrix();
		GlStateManager.translate(-0.5, -1, -0.5);
		TextureUtils.bindTexture("textures/models/block/table.png");
		renderModel(0, 0, 0, 0.0625 * 0.5);
		GlStateManager.popMatrix();
	}

	@Override
	public void renderHead(ItemStack itemstack, EntityLivingBase entity, TransformType cameraTransformType) {

	}

	@Override
	public void renderThirdPersonLeft(ItemStack itemstack, EntityLivingBase entity, TransformType cameraTransformType) {
		renderThirdPersonRight(itemstack, entity, cameraTransformType);
	}

	@Override
	public void renderThirdPersonRight(ItemStack itemstack, EntityLivingBase entity, TransformType cameraTransformType) {
		GlStateManager.pushMatrix();
		GlStateManager.rotate(75, 1, 0, 0);
		GlStateManager.rotate(45, 0, 1, 0);
		GlStateManager.translate(-0.4, -1.1, -0.6);
		TextureUtils.bindTexture("textures/models/block/table.png");
		renderModel(0, 0, 0, 0.0625 * 0.4);
		GlStateManager.popMatrix();
	}

	public void renderModel(double x, double y, double z, double scale) {
		GlStateManager.pushMatrix();
		ModelTable model = new ModelTable();
		GlStateManager.translate(x + 0.5, y + 1.5, z + 0.5);
		GlStateManager.rotate(180, 0, 0, 1);
		RenderUtil.bindTexture(TEXTURE);
		model.renderModel((float) scale);
		GlStateManager.popMatrix();
	}
}