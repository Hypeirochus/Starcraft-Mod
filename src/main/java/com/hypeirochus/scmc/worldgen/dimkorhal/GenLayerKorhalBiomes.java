package com.hypeirochus.scmc.worldgen.dimkorhal;

import com.hypeirochus.scmc.handlers.BiomeHandler;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.IntCache;

public class GenLayerKorhalBiomes extends GenLayer
{

	public Biome[] dimBiomes =
	{ BiomeHandler.biomeKorhalDesert, BiomeHandler.biomeKorhalDesertHills, BiomeHandler.biomeKorhalTerranCity };

	public GenLayerKorhalBiomes(long par1)
	{
		super(par1);
	}

	@Override
	public int[] getInts(int x, int z, int width, int depth)
	{
		int[] dest = IntCache.getIntCache(width * depth);
		for (int dz = 0; dz < depth; dz++)
		{
			for (int dx = 0; dx < width; dx++)
			{
				initChunkSeed(dx + x, dz + z);
				// dest[(dx + dz * width)] =
				// dimBiomes[nextInt(dimBiomes.length)].getIdForBiome(dimBiomes[dz]);
				dest[(dx + dz * width)] = Biome.getIdForBiome(/* dimBiomes[dz] */dimBiomes[nextInt(dimBiomes.length)]);
			}
		}

		return dest;
	}
}