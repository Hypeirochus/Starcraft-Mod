package ga.scmc.worldgen.dimchar;

import ga.scmc.handlers.BiomeHandler;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.IntCache;

public class GenLayerCharMix extends GenLayer {

	private final GenLayer biomePatternGeneratorChain;
	private final GenLayer riverPatternGeneratorChain;

	public GenLayerCharMix(long p_i2129_1_, GenLayer p_i2129_3_, GenLayer p_i2129_4_) {
		super(p_i2129_1_);
		biomePatternGeneratorChain = p_i2129_3_;
		riverPatternGeneratorChain = p_i2129_4_;
	}

	/**
	 * Returns a list of integer values generated by this layer. These may be
	 * interpreted as temperatures, rainfall amounts, or biomeList[] indices
	 * based on the particular GenLayer subclass.
	 */
	@Override
	public int[] getInts(int areaX, int areaY, int areaWidth, int areaHeight) {
		int[] aint = biomePatternGeneratorChain.getInts(areaX, areaY, areaWidth, areaHeight);
		int[] aint1 = riverPatternGeneratorChain.getInts(areaX, areaY, areaWidth, areaHeight);
		int[] aint2 = IntCache.getIntCache(areaWidth * areaHeight);

		for(int i = 0; i < areaWidth * areaHeight; ++i) {
			if(aint1[i] == Biome.getIdForBiome(BiomeHandler.biomeCharScars)) {
				aint2[i] = aint1[i] & 255;
			} else {
				aint2[i] = aint[i];
			}
		}

		return aint2;
	}

	/**
	 * Initialize layer's local worldGenSeed based on its own baseSeed and the
	 * world's global seed (passed in as an argument).
	 */
	@Override
	public void initWorldGenSeed(long seed) {
		biomePatternGeneratorChain.initWorldGenSeed(seed);
		riverPatternGeneratorChain.initWorldGenSeed(seed);
		super.initWorldGenSeed(seed);
	}
}
