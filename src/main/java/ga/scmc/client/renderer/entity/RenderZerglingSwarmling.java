package ga.scmc.client.renderer.entity;

import ga.scmc.client.renderer.layers.LayerZerglingSwarmling;
import ga.scmc.entity.living.EntityZerglingSwarmling;
import ga.scmc.lib.Library;
import ga.scmc.model.ModelZerglingSwarmling;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderZerglingSwarmling<T> extends RenderLiving<EntityZerglingSwarmling> {
	private static final ResourceLocation ZERGLINGSWARMLING_TEXTURES = new ResourceLocation(Library.RL_BASE + "textures/entity/zerglingswarmling.png");
	protected ModelZerglingSwarmling modelEntity;

	public RenderZerglingSwarmling(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn) {
		super(renderManagerIn, modelBaseIn, shadowSizeIn);
		modelEntity = ((ModelZerglingSwarmling) mainModel);
		addLayer(new LayerZerglingSwarmling(this));
	}

	@Override
	public void doRender(EntityZerglingSwarmling entity, double x, double y, double z, float entityYaw, float partialTicks) {
		super.doRender(entity, x, y, z, entityYaw, partialTicks);

		if (!renderOutlines) {
			renderLeash(entity, x, y, z, entityYaw, partialTicks);
		}
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityZerglingSwarmling entity) {
		return ZERGLINGSWARMLING_TEXTURES;
	}

	@Override
	protected void preRenderCallback(EntityZerglingSwarmling entitylivingbaseIn, float partialTickTime) {
		GlStateManager.scale(1.25F + (entitylivingbaseIn.getColor()/60), 1.25F + (entitylivingbaseIn.getColor()/60), 1.25F + (entitylivingbaseIn.getColor()/60));
	}
}
