package ga.scmc.client.renderer.entity.layers;

import ga.scmc.client.renderer.Resources;
import ga.scmc.client.renderer.entity.RenderMutalisk;
import ga.scmc.entity.living.EntityMutalisk;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * @since 1.6
 * @author Hypeirochus
 */
@SideOnly(Side.CLIENT)
public class LayerMutaliskColor<T extends EntityMutalisk> implements LayerRenderer<T> {

	private static final ResourceLocation TEXTURE = new ResourceLocation(Resources.MUTALISK_OVERLAY);
	private final RenderMutalisk<T> RENDERER;

	public LayerMutaliskColor(RenderMutalisk<T> rendererIn) {
		this.RENDERER = rendererIn;
	}

	public void doRenderLayer(EntityMutalisk entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
		ColoredLayerRender.render(this.RENDERER, entitylivingbaseIn, TEXTURE, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
	}

	@Override
	public boolean shouldCombineTextures() {
		return true;
	}
}