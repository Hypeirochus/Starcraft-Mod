package io.github.scmcmod.worldgen.dimchar;

import io.github.scmcmod.handlers.BiomeHandler;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.IntCache;

public class GenLayerCharScars extends GenLayer
{
	/**
	 * What the hell is this
	 *
	 * @param p_151630_1_ wot
	 * @return wat
	 */
	private static int riverFilter(int p_151630_1_)
	{
		return p_151630_1_ >= 2 ? 2 + (p_151630_1_ & 1) : p_151630_1_;
	}

	public GenLayerCharScars(long seed, GenLayer parentLayer)
	{
		super(seed);
		super.parent = parentLayer;
	}

	/**
	 * Returns a list of integer values generated by this layer. These may be
	 * interpreted as temperatures, rainfall amounts, or biomeList[] indices based
	 * on the particular GenLayer subclass.
	 */
	@Override
	public int[] getInts(int areaX, int areaY, int areaWidth, int areaHeight)
	{
		int i = areaX - 1;
		int j = areaY - 1;
		int k = areaWidth + 2;
		int l = areaHeight + 2;
		int[] aint = parent.getInts(i, j, k, l);
		int[] aint1 = IntCache.getIntCache(areaWidth * areaHeight);

		for (int i1 = 0; i1 < areaHeight; ++i1)
		{
			for (int j1 = 0; j1 < areaWidth; ++j1)
			{
				int k1 = riverFilter(aint[j1 + 0 + (i1 + 1) * k]);
				int l1 = riverFilter(aint[j1 + 2 + (i1 + 1) * k]);
				int i2 = riverFilter(aint[j1 + 1 + (i1 + 0) * k]);
				int j2 = riverFilter(aint[j1 + 1 + (i1 + 2) * k]);
				int k2 = riverFilter(aint[j1 + 1 + (i1 + 1) * k]);

				if (k2 == k1 && k2 == i2 && k2 == l1 && k2 == j2)
				{
					aint1[j1 + i1 * areaWidth] = -1;
				} else
				{
					aint1[j1 + i1 * areaWidth] = Biome.getIdForBiome(BiomeHandler.biomeCharScars);
				}
			}
		}

		return aint1;
	}
}
