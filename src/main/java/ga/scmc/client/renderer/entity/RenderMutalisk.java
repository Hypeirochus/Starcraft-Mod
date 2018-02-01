package ga.scmc.client.renderer.entity;

import ga.scmc.client.renderer.Resources;
import ga.scmc.client.renderer.entity.layers.LayerMutaliskColor;
import ga.scmc.client.renderer.entity.layers.LayerMutaliskGlowStatic;
import ga.scmc.client.renderer.model.ModelMutalisk;
import ga.scmc.entity.living.EntityMutalisk;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;

public class RenderMutalisk<T> extends RenderLiving<EntityMutalisk> {
	private static final ResourceLocation TEXTURE = new ResourceLocation(Resources.MUTALISK_BASE);
	protected ModelMutalisk model;
	int x = 0;
	public RenderMutalisk(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn) {
		super(renderManagerIn, modelBaseIn, shadowSizeIn);
		model = ((ModelMutalisk) mainModel);
		addLayer(new LayerMutaliskColor(this));
		addLayer(new LayerMutaliskGlowStatic(this));
	}

	@Override
	public void doRender(EntityMutalisk entity, double x, double y, double z, float entityYaw, float partialTicks) {
		super.doRender(entity, x, y, z, entityYaw, partialTicks);

		if (!renderOutlines) {
			renderLeash(entity, x, y, z, entityYaw, partialTicks);
		}
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityMutalisk entity) {
		return TEXTURE;
	}

	@Override
	protected void preRenderCallback(EntityMutalisk entitylivingbaseIn, float partialTickTime) {
		if(entitylivingbaseIn.motionY > 0) {
			GlStateManager.rotate(MathHelper.clamp(x--, -30, 0), 1.0F, 0, 0);
			x = MathHelper.clamp(x--, -50, 0);
		}
		if(entitylivingbaseIn.motionY < 0) {
			GlStateManager.rotate(MathHelper.clamp(x++, 0, 30), 1.0F, 0, 0);
			x = MathHelper.clamp(x++, 0, 50);
		}
		//GlStateManager.scale(1.0F + (entitylivingbaseIn.getBiomass() / 60), 1.0F + (entitylivingbaseIn.getBiomass() / 60), 1.0F + (entitylivingbaseIn.getBiomass() / 60));
	}
}