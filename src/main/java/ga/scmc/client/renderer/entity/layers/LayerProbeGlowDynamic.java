package ga.scmc.client.renderer.entity.layers;

import org.lwjgl.opengl.GL11;

import ga.scmc.client.renderer.Resources;
import ga.scmc.client.renderer.entity.RenderProbe;
import ga.scmc.entity.living.EntityProbe;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * @since 1.6
 * @author Ocelot5836
 */
@SideOnly(Side.CLIENT)
public class LayerProbeGlowDynamic<T extends EntityProbe> implements LayerRenderer<T> {

	private static final ResourceLocation TEXTURE = new ResourceLocation(Resources.PROBE_GLOW_DYNAMIC);
	private final RenderProbe<T> RENDERER;

	public LayerProbeGlowDynamic(RenderProbe<T> zealotRendererIn) {
		this.RENDERER = zealotRendererIn;
	}

	public void doRenderLayer(EntityProbe entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
		this.RENDERER.bindTexture(TEXTURE);
		GlStateManager.enableAlpha();
		GlStateManager.enableBlend();
		GlStateManager.blendFunc(GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ONE);

		if (entitylivingbaseIn.isInvisible()) {
			GlStateManager.depthMask(false);
		} else {
			GlStateManager.depthMask(true);
		}

		GL11.glColor3f(entitylivingbaseIn.getTeamColor().getR(), entitylivingbaseIn.getTeamColor().getG(), entitylivingbaseIn.getTeamColor().getB());

		int i = 61680;
		int j = i % 65536;
		int k = i / 65536;
		OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, (float) j, (float) k);
		GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
		GL11.glColor3f(entitylivingbaseIn.getTeamColor().getR() / 255, entitylivingbaseIn.getTeamColor().getG() / 255, entitylivingbaseIn.getTeamColor().getB() / 255);
		this.RENDERER.getMainModel().render(entitylivingbaseIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
		i = entitylivingbaseIn.getBrightnessForRender(partialTicks);
		j = i % 65536;
		k = i / 65536;
		OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, (float) j, (float) k);
		this.RENDERER.setLightmap(entitylivingbaseIn, partialTicks);
		GlStateManager.disableBlend();
		GlStateManager.disableAlpha();
		GlStateManager.resetColor();
	}

	@Override
	public boolean shouldCombineTextures() {
		return false;
	}
}