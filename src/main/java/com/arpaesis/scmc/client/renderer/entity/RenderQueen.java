package com.arpaesis.scmc.client.renderer.entity;

import com.arpaesis.scmc.client.model.entity.ModelQueen;
import com.arpaesis.scmc.client.renderer.ColoredLayerRender;
import com.arpaesis.scmc.client.renderer.Resources;
import com.arpaesis.scmc.entity.living.EntityQueen;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;

public class RenderQueen extends RenderLiving<EntityQueen> implements LayerRenderer<EntityQueen>
{
	private static final ResourceLocation BASE = new ResourceLocation(Resources.QUEEN_BASE);
	private static final ResourceLocation OVERLAY = new ResourceLocation(Resources.QUEEN_OVERLAY);
	private static final ResourceLocation STATICGLOW = new ResourceLocation(Resources.QUEEN_GLOW_STATIC);

	public RenderQueen(RenderManager renderManagerIn)
	{
		super(renderManagerIn, new ModelQueen(), 0.5f);
		this.addLayer(this);
	}

	@Override
	public void doRender(EntityQueen entity, double x, double y, double z, float entityYaw, float partialTicks)
	{
		super.doRender(entity, x, y, z, entityYaw, partialTicks);

		if (!renderOutlines)
		{
			renderLeash(entity, x, y, z, entityYaw, partialTicks);
		}
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityQueen entity)
	{
		return BASE;
	}

	@Override
	public void doRenderLayer(EntityQueen entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale)
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
