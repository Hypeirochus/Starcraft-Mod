package com.arpaesis.scmc.client.renderer.entity;

import com.arpaesis.scmc.client.model.entity.ModelBrakk;
import com.arpaesis.scmc.client.renderer.ColoredLayerRender;
import com.arpaesis.scmc.client.renderer.Resources;
import com.arpaesis.scmc.entity.living.EntityBrakk;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderBrakk extends RenderLiving<EntityBrakk> implements LayerRenderer<EntityBrakk>
{

	private static final ResourceLocation BASE = new ResourceLocation(Resources.BRAKK_BASE);
	private static final ResourceLocation OVERLAY = new ResourceLocation(Resources.BRAKK_OVERLAY);
	private static final ResourceLocation DYNAMICGLOW = new ResourceLocation(Resources.BRAKK_GLOW_DYNAMIC);

	public static final Factory FACTORY = new Factory();

	public RenderBrakk(RenderManager renderManagerIn)
	{
		super(renderManagerIn, new ModelBrakk(), 0.4f);
		this.addLayer(this);
	}

	@Override
	public void doRender(EntityBrakk entity, double x, double y, double z, float entityYaw, float partialTicks)
	{
		super.doRender(entity, x, y, z, entityYaw, partialTicks);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityBrakk entity)
	{
		return BASE;
	}

	@Override
	protected void preRenderCallback(EntityBrakk entitylivingbaseIn, float partialTickTime)
	{
		GlStateManager.scale(5.5F + (entitylivingbaseIn.getBiomass() / 60), 5.5F + (entitylivingbaseIn.getBiomass() / 60), 5.5F + (entitylivingbaseIn.getBiomass() / 60));
		super.preRenderCallback(entitylivingbaseIn, partialTickTime);
	}

	@Override
	public void doRenderLayer(EntityBrakk entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale)
	{
		ColoredLayerRender.render(this, entitylivingbaseIn, OVERLAY, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
		ColoredLayerRender.renderDynamicGlow(this, entitylivingbaseIn, DYNAMICGLOW, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, partialTicks);
	}

	@Override
	public boolean shouldCombineTextures()
	{
		return true;
	}

	public static class Factory implements IRenderFactory<EntityBrakk>
	{

		@Override
		public Render<? super EntityBrakk> createRenderFor(RenderManager manager)
		{
			return new RenderBrakk(manager);
		}

	}
}