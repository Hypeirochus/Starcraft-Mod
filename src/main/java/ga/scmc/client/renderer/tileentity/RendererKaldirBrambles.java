package ga.scmc.client.renderer.tileentity;

import ga.scmc.client.renderer.model.blocks.ModelZerusGlowPod;
import ga.scmc.lib.Library;
import ga.scmc.tileentity.TileEntityKaldirBrambles;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.util.ResourceLocation;

public class RendererKaldirBrambles extends TileEntitySpecialRenderer<TileEntityKaldirBrambles> {

	private static final ResourceLocation TEXTURE = new ResourceLocation(Library.MODID, "textures/models/block/kaldir_brambles.png");

	@Override
	public void renderTileEntityAt(TileEntityKaldirBrambles te, double x, double y, double z, float partialTicks, int destroyStage) {
		ModelZerusGlowPod model = new ModelZerusGlowPod();
		GlStateManager.pushMatrix();
		GlStateManager.translate(x + 0.5, y + 1.5, z + 0.5);
		GlStateManager.rotate(180, 0, 0, 1);
		// bindTexture(TEXTURE);
		model.render(0.0625f, te.getAge());
		GlStateManager.popMatrix();
	}
}