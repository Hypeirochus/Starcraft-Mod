package ga.scmc.client.renderer.entity;

import ga.scmc.client.renderer.layers.LayerScarab;
import ga.scmc.entity.living.EntityScarab;
import ga.scmc.lib.Library;
import ga.scmc.model.ModelScarab;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;


public class RenderScarab<T> extends RenderLiving<EntityScarab> {
	private static final ResourceLocation SCARAB_TEXTURES = new ResourceLocation(Library.RL_BASE + "textures/entity/scarab.png");
	protected ModelScarab modelEntity;

	public RenderScarab(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn) {
		super(renderManagerIn, modelBaseIn, shadowSizeIn);
		modelEntity = ((ModelScarab) mainModel);
		addLayer(new LayerScarab(this));
	}

	@Override
	public void doRender(EntityScarab entity, double x, double y, double z, float entityYaw, float partialTicks) {
		super.doRender(entity, x, y, z, entityYaw, partialTicks);

		if (!renderOutlines) {
			renderLeash(entity, x, y, z, entityYaw, partialTicks);
		}
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityScarab entity) {
		return SCARAB_TEXTURES;
	}

	@Override
	protected void preRenderCallback(EntityScarab entitylivingbaseIn, float partialTickTime) {
		GlStateManager.scale(0.65F, 0.65F, 0.65F);
	}
}
