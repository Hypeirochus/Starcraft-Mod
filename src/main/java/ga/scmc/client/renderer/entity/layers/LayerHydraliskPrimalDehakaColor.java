package ga.scmc.client.renderer.entity.layers;

import ga.scmc.client.renderer.Resources;
import ga.scmc.client.renderer.entity.RenderHydraliskPrimalDehaka;
import ga.scmc.entity.living.EntityHydraliskPrimalDehaka;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * @author Hypeirochus
 */
@SideOnly(Side.CLIENT)
public class LayerHydraliskPrimalDehakaColor<T extends EntityHydraliskPrimalDehaka> implements LayerRenderer<T> {

	private static final ResourceLocation TEXTURE = new ResourceLocation(Resources.HYDRALISK_OVERLAY);
	private final RenderHydraliskPrimalDehaka<T> RENDERER;

	public LayerHydraliskPrimalDehakaColor(RenderHydraliskPrimalDehaka<T> rendererIn) {
		this.RENDERER = rendererIn;
	}

	public void doRenderLayer(EntityHydraliskPrimalDehaka entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
		ColoredLayerRender.render(this.RENDERER, entitylivingbaseIn, TEXTURE, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
	}

	@Override
	public boolean shouldCombineTextures() {
		return true;
	}
}