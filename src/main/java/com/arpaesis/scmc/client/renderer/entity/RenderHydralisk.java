package com.arpaesis.scmc.client.renderer.entity;

import com.arpaesis.scmc.client.model.entity.ModelHydralisk;
import com.arpaesis.scmc.client.renderer.ColoredLayerRender;
import com.arpaesis.scmc.client.renderer.Resources;
import com.arpaesis.scmc.entity.living.EntityHydralisk;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;

public class RenderHydralisk extends RenderLiving<EntityHydralisk> implements LayerRenderer<EntityHydralisk>
{

	private static final ResourceLocation BASE = new ResourceLocation(Resources.HYDRALISK_BASE);
	private static final ResourceLocation OVERLAY = new ResourceLocation(Resources.HYDRALISK_OVERLAY);
	private static final ResourceLocation STATICGLOW = new ResourceLocation(Resources.HYDRALISK_GLOW_STATIC);

	public RenderHydralisk(RenderManager renderManagerIn)
	{
		super(renderManagerIn, new ModelHydralisk(), 0.7f);
		this.addLayer(this);
	}

	@Override
	public void doRender(EntityHydralisk entity, double x, double y, double z, float entityYaw, float partialTicks)
	{
		super.doRender(entity, x, y, z, entityYaw, partialTicks);

		if (!renderOutlines)
		{
			renderLeash(entity, x, y, z, entityYaw, partialTicks);
		}
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityHydralisk entity)
	{
		return BASE;
	}

	@Override
	protected void preRenderCallback(EntityHydralisk entitylivingbaseIn, float partialTickTime)
	{
		GlStateManager.scale(1.3F + (entitylivingbaseIn.getBiomass() / 60), 1.3F + (entitylivingbaseIn.getBiomass() / 60), 1.3F + (entitylivingbaseIn.getBiomass() / 60));

		if (entitylivingbaseIn.getBurrowState() == true)
		{
			GlStateManager.translate(0, 2.0F, 0);
		}
	}

	@Override
	public void doRenderLayer(EntityHydralisk entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale)
	{
		ColoredLayerRender.render(this, entitylivingbaseIn, OVERLAY, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
		ColoredLayerRender.renderStaticGlow(this, entitylivingbaseIn, STATICGLOW, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, partialTicks);
	}

	@Override
	public boolean shouldCombineTextures()
	{
		return true;
	}
}