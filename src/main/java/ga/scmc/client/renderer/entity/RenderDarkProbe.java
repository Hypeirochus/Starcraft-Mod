package ga.scmc.client.renderer.entity;

import ga.scmc.client.renderer.layers.LayerDarkProbe;
import ga.scmc.entity.living.EntityDarkProbe;
import ga.scmc.lib.Library;
import ga.scmc.model.ModelDarkProbe;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderDarkProbe<T> extends RenderLiving<EntityDarkProbe> {
	private static final ResourceLocation DARK_PROBE_TEXTURES = new ResourceLocation(Library.RL_BASE + "textures/entity/darkprobe.png");
	protected ModelDarkProbe modelEntity;

	public RenderDarkProbe(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn) {
		super(renderManagerIn, modelBaseIn, shadowSizeIn);
		modelEntity = ((ModelDarkProbe) mainModel);
		addLayer(new LayerDarkProbe(this));
	}

	@Override
	public void doRender(EntityDarkProbe entity, double x, double y, double z, float entityYaw, float partialTicks) {
		super.doRender(entity, x, y, z, entityYaw, partialTicks);

		if (!renderOutlines) {
			renderLeash(entity, x, y, z, entityYaw, partialTicks);
		}
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityDarkProbe entity) {
		return DARK_PROBE_TEXTURES;
	}

	@Override
	protected void preRenderCallback(EntityDarkProbe entitylivingbaseIn, float partialTickTime) {
		GlStateManager.scale(1.5F, 1.5F, 1.5F);
	}
}
