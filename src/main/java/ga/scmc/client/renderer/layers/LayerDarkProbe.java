package ga.scmc.client.renderer.layers;

import ga.scmc.client.renderer.entity.RenderDarkProbe;
import ga.scmc.entity.living.EntityDarkProbe;
import ga.scmc.lib.Library;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class LayerDarkProbe<T extends EntityDarkProbe> implements LayerRenderer<T> {
    private static final ResourceLocation DARKPROBE_LAYER = new ResourceLocation(Library.RL_BASE + "textures/entity/darkprobe_layer.png");
    private final RenderDarkProbe<T> darkPprobeRenderer;

    public LayerDarkProbe(RenderDarkProbe<T> darkprobeRendererIn) {
        darkPprobeRenderer = darkprobeRendererIn;
    }

    @Override
    public void doRenderLayer(EntityDarkProbe entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
    	if(!entitylivingbaseIn.isInvisible()) {
    		darkPprobeRenderer.bindTexture(DARKPROBE_LAYER);
    		GlStateManager.enableBlend();
    		GlStateManager.enableAlpha();
    		GlStateManager.blendFunc(GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ONE);

    		if(entitylivingbaseIn.isInvisible()) {
    			GlStateManager.depthMask(false);
    		} else {
    			GlStateManager.depthMask(true);
    		}

    		int i = 61680;
    		int j = i % 65536;
    		int k = i / 65536;
    		OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, (float)j, (float)k);
    		GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
    		darkPprobeRenderer.getMainModel().render(entitylivingbaseIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
    		i = entitylivingbaseIn.getBrightnessForRender(partialTicks);
    		j = i % 65536;
    		k = i / 65536;
    		OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, (float)j, (float)k);
    		darkPprobeRenderer.setLightmap(entitylivingbaseIn, partialTicks);
    		GlStateManager.disableBlend();
    		GlStateManager.enableAlpha();
    	}
    }

    @Override
    public boolean shouldCombineTextures() {
        return false;
    }
}
