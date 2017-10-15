package ga.scmc.client.renderer.entity;

import ga.scmc.entity.living.EntityAdept;
import ga.scmc.lib.Library;
import ga.scmc.model.ModelAdept;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderAdept extends RenderLiving<EntityAdept> {
	private static final ResourceLocation ADEPT_TEXTURES = new ResourceLocation(Library.RL_BASE + "textures/entity/adept.png");
	protected ModelAdept modelEntity;

	public RenderAdept(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn) {
		super(renderManagerIn, modelBaseIn, shadowSizeIn);
		modelEntity = ((ModelAdept) mainModel);
	}

	@Override
	public void doRender(EntityAdept entity, double x, double y, double z, float entityYaw, float partialTicks) {
		super.doRender(entity, x, y, z, entityYaw, partialTicks);

		if(!renderOutlines) {
			renderLeash(entity, x, y, z, entityYaw, partialTicks);
		}
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityAdept entity) {
		return ADEPT_TEXTURES;
	}
}