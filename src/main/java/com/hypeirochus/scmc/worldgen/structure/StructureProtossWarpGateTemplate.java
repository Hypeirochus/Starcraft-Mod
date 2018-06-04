package com.hypeirochus.scmc.worldgen.structure;

import java.util.Random;

import com.hypeirochus.scmc.config.StarcraftConfig;
import com.hypeirochus.scmc.handlers.BlockHandler;

import com.hypeirochus.scmc.handlers.DimensionHandler;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class StructureProtossWarpGateTemplate extends SCWorldGenerator {
	
	private Block chanBlock;
	private Block dimBlock;
	private int metaDim;
	private int metaPrimColor;
	private int metaSecColor;
	private Block stabBlock;

	public StructureProtossWarpGateTemplate() {

	}

	public StructureProtossWarpGateTemplate(int metaPrimColor, int metaSecColor) {
		this.metaPrimColor = metaPrimColor;
		this.metaSecColor = metaSecColor;
	}

	@Override
	public boolean generate(int metaPrimColor, int metaSecColor, World world, Random rand, int offsetX, int offsetY, int offsetZ, BlockPos pos, boolean flag) {
		if (metaPrimColor < 0)
			metaPrimColor = this.metaPrimColor;
		if (metaSecColor < 0)
			metaSecColor = this.metaSecColor;
		this.metaDim = rand.nextInt(100);
		if (world.provider.getDimension() == 0) {
			if (metaDim <= 14) {
				dimBlock = BlockHandler.DIM_PORTAL_CHAR;
			} else if (metaDim >= 15 && metaDim <= 29) {
				dimBlock = BlockHandler.DIM_PORTAL_SHAKURAS;
			} else if (metaDim >= 30 && metaDim <= 44) {
				dimBlock = BlockHandler.DIM_PORTAL_KORHAL;
			} else if (metaDim >= 45 && metaDim <= 59) {
				dimBlock = BlockHandler.DIM_PORTAL_KALDIR;
			} else if (metaDim >= 60 && metaDim <= 74) {
				dimBlock = BlockHandler.DIM_PORTAL_SLAYN;
			} else if (metaDim >= 75 && metaDim <= 89) {
				dimBlock = BlockHandler.DIM_PORTAL_AIUR;
			} else if (metaDim >= 90 && metaDim <= 100) {
				dimBlock = BlockHandler.DIM_PORTAL_ZERUS;
			}
		} else if (world.provider.getDimension() == 1) {
			if (metaDim <= 14) {
				dimBlock = BlockHandler.DIM_PORTAL_CHAR;
			} else if (metaDim >= 15 && metaDim <= 29) {
				dimBlock = BlockHandler.DIM_PORTAL_SHAKURAS;
			} else if (metaDim >= 30 && metaDim <= 44) {
				dimBlock = BlockHandler.DIM_PORTAL_KORHAL;
			} else if (metaDim >= 45 && metaDim <= 59) {
				dimBlock = BlockHandler.DIM_PORTAL_KALDIR;
			} else if (metaDim >= 60 && metaDim <= 74) {
				dimBlock = BlockHandler.DIM_PORTAL_SLAYN;
			} else if (metaDim >= 75 && metaDim <= 89) {
				dimBlock = BlockHandler.DIM_PORTAL_AIUR;
			} else if (metaDim >= 90 && metaDim <= 100) {
				dimBlock = BlockHandler.DIM_PORTAL_ZERUS;
			}
		} else if (world.provider.getDimension() == DimensionHandler.char_dt.getId()) {
			if (metaDim <= 14) {
				dimBlock = BlockHandler.DIM_PORTAL_OVERWORLD;
			} else if (metaDim >= 15 && metaDim <= 29) {
				dimBlock = BlockHandler.DIM_PORTAL_SHAKURAS;
			} else if (metaDim >= 30 && metaDim <= 44) {
				dimBlock = BlockHandler.DIM_PORTAL_KORHAL;
			} else if (metaDim >= 45 && metaDim <= 59) {
				dimBlock = BlockHandler.DIM_PORTAL_KALDIR;
			} else if (metaDim >= 60 && metaDim <= 74) {
				dimBlock = BlockHandler.DIM_PORTAL_SLAYN;
			} else if (metaDim >= 75 && metaDim <= 89) {
				dimBlock = BlockHandler.DIM_PORTAL_AIUR;
			} else if (metaDim >= 90 && metaDim <= 100) {
				dimBlock = BlockHandler.DIM_PORTAL_ZERUS;
			}
		} else if (world.provider.getDimension() == DimensionHandler.shakuras_dt.getId()) {
			if (metaDim <= 14) {
				dimBlock = BlockHandler.DIM_PORTAL_CHAR;
			} else if (metaDim >= 15 && metaDim <= 29) {
				dimBlock = BlockHandler.DIM_PORTAL_OVERWORLD;
			} else if (metaDim >= 30 && metaDim <= 44) {
				dimBlock = BlockHandler.DIM_PORTAL_KORHAL;
			} else if (metaDim >= 45 && metaDim <= 59) {
				dimBlock = BlockHandler.DIM_PORTAL_KALDIR;
			} else if (metaDim >= 60 && metaDim <= 74) {
				dimBlock = BlockHandler.DIM_PORTAL_SLAYN;
			} else if (metaDim >= 75 && metaDim <= 89) {
				dimBlock = BlockHandler.DIM_PORTAL_AIUR;
			} else if (metaDim >= 90 && metaDim <= 100) {
				dimBlock = BlockHandler.DIM_PORTAL_ZERUS;
			}
		} else if (world.provider.getDimension() == DimensionHandler.korhal_dt.getId()) {
			if (metaDim <= 14) {
				dimBlock = BlockHandler.DIM_PORTAL_CHAR;
			} else if (metaDim >= 15 && metaDim <= 29) {
				dimBlock = BlockHandler.DIM_PORTAL_SHAKURAS;
			} else if (metaDim >= 30 && metaDim <= 44) {
				dimBlock = BlockHandler.DIM_PORTAL_OVERWORLD;
			} else if (metaDim >= 45 && metaDim <= 59) {
				dimBlock = BlockHandler.DIM_PORTAL_KALDIR;
			} else if (metaDim >= 60 && metaDim <= 74) {
				dimBlock = BlockHandler.DIM_PORTAL_SLAYN;
			} else if (metaDim >= 75 && metaDim <= 89) {
				dimBlock = BlockHandler.DIM_PORTAL_AIUR;
			} else if (metaDim >= 90 && metaDim <= 100) {
				dimBlock = BlockHandler.DIM_PORTAL_ZERUS;
			}
		} else if (world.provider.getDimension() == DimensionHandler.kaldir_dt.getId()) {
			if (metaDim <= 14) {
				dimBlock = BlockHandler.DIM_PORTAL_CHAR;
			} else if (metaDim >= 15 && metaDim <= 29) {
				dimBlock = BlockHandler.DIM_PORTAL_SHAKURAS;
			} else if (metaDim >= 30 && metaDim <= 44) {
				dimBlock = BlockHandler.DIM_PORTAL_KORHAL;
			} else if (metaDim >= 45 && metaDim <= 59) {
				dimBlock = BlockHandler.DIM_PORTAL_OVERWORLD;
			} else if (metaDim >= 60 && metaDim <= 74) {
				dimBlock = BlockHandler.DIM_PORTAL_SLAYN;
			} else if (metaDim >= 75 && metaDim <= 89) {
				dimBlock = BlockHandler.DIM_PORTAL_AIUR;
			} else if (metaDim >= 90 && metaDim <= 100) {
				dimBlock = BlockHandler.DIM_PORTAL_ZERUS;
			}
		} else if (world.provider.getDimension() == DimensionHandler.slayn_dt.getId()) {
			if (metaDim <= 14) {
				dimBlock = BlockHandler.DIM_PORTAL_CHAR;
			} else if (metaDim >= 15 && metaDim <= 29) {
				dimBlock = BlockHandler.DIM_PORTAL_SHAKURAS;
			} else if (metaDim >= 30 && metaDim <= 44) {
				dimBlock = BlockHandler.DIM_PORTAL_KORHAL;
			} else if (metaDim >= 45 && metaDim <= 59) {
				dimBlock = BlockHandler.DIM_PORTAL_OVERWORLD;
			} else if (metaDim >= 60 && metaDim <= 74) {
				dimBlock = BlockHandler.DIM_PORTAL_KALDIR;
			} else if (metaDim >= 75 && metaDim <= 89) {
				dimBlock = BlockHandler.DIM_PORTAL_AIUR;
			} else if (metaDim >= 90 && metaDim <= 100) {
				dimBlock = BlockHandler.DIM_PORTAL_ZERUS;
			}
		} else if (world.provider.getDimension() == DimensionHandler.aiur_dt.getId()) {
			if (metaDim <= 14) {
				dimBlock = BlockHandler.DIM_PORTAL_CHAR;
			} else if (metaDim >= 15 && metaDim <= 29) {
				dimBlock = BlockHandler.DIM_PORTAL_SHAKURAS;
			} else if (metaDim >= 30 && metaDim <= 44) {
				dimBlock = BlockHandler.DIM_PORTAL_KORHAL;
			} else if (metaDim >= 45 && metaDim <= 59) {
				dimBlock = BlockHandler.DIM_PORTAL_OVERWORLD;
			} else if (metaDim >= 60 && metaDim <= 74) {
				dimBlock = BlockHandler.DIM_PORTAL_SLAYN;
			} else if (metaDim >= 75 && metaDim <= 89) {
				dimBlock = BlockHandler.DIM_PORTAL_KALDIR;
			} else if (metaDim >= 90 && metaDim <= 100) {
				dimBlock = BlockHandler.DIM_PORTAL_ZERUS;
			}
		} else if (world.provider.getDimension() == DimensionHandler.zerus_dt.getId()) {
			if (metaDim <= 14) {
				dimBlock = BlockHandler.DIM_PORTAL_CHAR;
			} else if (metaDim >= 15 && metaDim <= 29) {
				dimBlock = BlockHandler.DIM_PORTAL_SHAKURAS;
			} else if (metaDim >= 30 && metaDim <= 44) {
				dimBlock = BlockHandler.DIM_PORTAL_KORHAL;
			} else if (metaDim >= 45 && metaDim <= 59) {
				dimBlock = BlockHandler.DIM_PORTAL_OVERWORLD;
			} else if (metaDim >= 60 && metaDim <= 74) {
				dimBlock = BlockHandler.DIM_PORTAL_SLAYN;
			} else if (metaDim >= 75 && metaDim <= 89) {
				dimBlock = BlockHandler.DIM_PORTAL_AIUR;
			} else if (metaDim >= 90 && metaDim <= 100) {
				dimBlock = BlockHandler.DIM_PORTAL_KALDIR;
			}
		} else {
			dimBlock = BlockHandler.DIM_PORTAL_OVERWORLD;
		}

		if (metaSecColor == 0) {
			stabBlock = BlockHandler.PROTOSS_ENERGY_STABILIZER;
			chanBlock = BlockHandler.PROTOSS_ENERGY_CHANNEL;
		} else if (metaSecColor == 4) {
			stabBlock = BlockHandler.PROTOSS_DARK_ENERGY_STABILIZER;
			chanBlock = BlockHandler.PROTOSS_DARK_ENERGY_CHANNEL;
		} else if (metaSecColor == 2) {
			stabBlock = BlockHandler.PROTOSS_VOID_ENERGY_STABILIZER;
			chanBlock = BlockHandler.PROTOSS_VOID_ENERGY_CHANNEL;
		} else if (metaSecColor == 3) {
			stabBlock = BlockHandler.PROTOSS_ENERGY_STABILIZER;
			chanBlock = BlockHandler.PROTOSS_ENERGY_CHANNEL;
		}
		generate_r0(metaPrimColor, metaSecColor, world, offsetY, pos, flag);

		return true;

	}

	public boolean generate_r0(int metaPrimColor, int metaSecColor, World world, int offsetY, BlockPos pos, boolean flag) {
		if (flag) {
			if (!LocationIsValidSpawn(world, pos) || !LocationIsValidSpawn(world, pos.add(14, 0, 0)) || !LocationIsValidSpawn(world, pos.add(14, 0, 14)) || !LocationIsValidSpawn(world, pos.add(0, 0, 14))) {
				return false;
			}
		}
		world.setBlockState(pos.add(1, 1 + offsetY, 1), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(2, 1 + offsetY, 1), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(4, 1 + offsetY, 1), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(5, 1 + offsetY, 1), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(7, 1 + offsetY, 1), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(8, 1 + offsetY, 1), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(10, 1 + offsetY, 1), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(11, 1 + offsetY, 1), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(12, 1 + offsetY, 1), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(13, 1 + offsetY, 1), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(1, 1 + offsetY, 2), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(2, 1 + offsetY, 2), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(3, 1 + offsetY, 2), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(4, 1 + offsetY, 2), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(5, 1 + offsetY, 2), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(6, 1 + offsetY, 2), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(7, 1 + offsetY, 2), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(8, 1 + offsetY, 2), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(9, 1 + offsetY, 2), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(10, 1 + offsetY, 2), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(11, 1 + offsetY, 2), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(12, 1 + offsetY, 2), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(13, 1 + offsetY, 2), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(2, 1 + offsetY, 3), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(3, 1 + offsetY, 3), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(4, 1 + offsetY, 3), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(5, 1 + offsetY, 3), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(6, 1 + offsetY, 3), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(7, 1 + offsetY, 3), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(8, 1 + offsetY, 3), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(9, 1 + offsetY, 3), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(10, 1 + offsetY, 3), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(11, 1 + offsetY, 3), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(12, 1 + offsetY, 3), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(13, 1 + offsetY, 3), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(1, 1 + offsetY, 4), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(2, 1 + offsetY, 4), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(3, 1 + offsetY, 4), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(4, 1 + offsetY, 4), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(5, 1 + offsetY, 4), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(6, 1 + offsetY, 4), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(7, 1 + offsetY, 4), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(8, 1 + offsetY, 4), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(9, 1 + offsetY, 4), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(10, 1 + offsetY, 4), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(11, 1 + offsetY, 4), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(12, 1 + offsetY, 4), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(13, 1 + offsetY, 4), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(1, 1 + offsetY, 5), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(2, 1 + offsetY, 5), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(3, 1 + offsetY, 5), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(4, 1 + offsetY, 5), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(5, 1 + offsetY, 5), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(6, 1 + offsetY, 5), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(7, 1 + offsetY, 5), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(8, 1 + offsetY, 5), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(9, 1 + offsetY, 5), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(10, 1 + offsetY, 5), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(11, 1 + offsetY, 5), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(12, 1 + offsetY, 5), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(2, 1 + offsetY, 6), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(3, 1 + offsetY, 6), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(4, 1 + offsetY, 6), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(5, 1 + offsetY, 6), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(6, 1 + offsetY, 6), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(7, 1 + offsetY, 6), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(8, 1 + offsetY, 6), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(9, 1 + offsetY, 6), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(10, 1 + offsetY, 6), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(11, 1 + offsetY, 6), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(12, 1 + offsetY, 6), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(13, 1 + offsetY, 6), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(1, 1 + offsetY, 7), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(2, 1 + offsetY, 7), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(3, 1 + offsetY, 7), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(4, 1 + offsetY, 7), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(5, 1 + offsetY, 7), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(6, 1 + offsetY, 7), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(7, 1 + offsetY, 7), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(8, 1 + offsetY, 7), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(9, 1 + offsetY, 7), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(10, 1 + offsetY, 7), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(11, 1 + offsetY, 7), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(12, 1 + offsetY, 7), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(13, 1 + offsetY, 7), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(1, 1 + offsetY, 8), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(2, 1 + offsetY, 8), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(3, 1 + offsetY, 8), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(4, 1 + offsetY, 8), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(5, 1 + offsetY, 8), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(6, 1 + offsetY, 8), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(7, 1 + offsetY, 8), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(8, 1 + offsetY, 8), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(9, 1 + offsetY, 8), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(10, 1 + offsetY, 8), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(11, 1 + offsetY, 8), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(12, 1 + offsetY, 8), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(2, 1 + offsetY, 9), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(3, 1 + offsetY, 9), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(4, 1 + offsetY, 9), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(5, 1 + offsetY, 9), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(6, 1 + offsetY, 9), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(7, 1 + offsetY, 9), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(8, 1 + offsetY, 9), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(9, 1 + offsetY, 9), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(10, 1 + offsetY, 9), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(11, 1 + offsetY, 9), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(12, 1 + offsetY, 9), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(13, 1 + offsetY, 9), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(1, 1 + offsetY, 10), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(2, 1 + offsetY, 10), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(3, 1 + offsetY, 10), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(4, 1 + offsetY, 10), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(5, 1 + offsetY, 10), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(6, 1 + offsetY, 10), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(7, 1 + offsetY, 10), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(8, 1 + offsetY, 10), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(9, 1 + offsetY, 10), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(10, 1 + offsetY, 10), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(11, 1 + offsetY, 10), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(12, 1 + offsetY, 10), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(13, 1 + offsetY, 10), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(1, 1 + offsetY, 11), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(2, 1 + offsetY, 11), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(3, 1 + offsetY, 11), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(4, 1 + offsetY, 11), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(5, 1 + offsetY, 11), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(6, 1 + offsetY, 11), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(7, 1 + offsetY, 11), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(8, 1 + offsetY, 11), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(9, 1 + offsetY, 11), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(10, 1 + offsetY, 11), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(11, 1 + offsetY, 11), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(12, 1 + offsetY, 11), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(1, 1 + offsetY, 12), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(2, 1 + offsetY, 12), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(3, 1 + offsetY, 12), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(4, 1 + offsetY, 12), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(5, 1 + offsetY, 12), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(6, 1 + offsetY, 12), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(7, 1 + offsetY, 12), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(8, 1 + offsetY, 12), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(9, 1 + offsetY, 12), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(10, 1 + offsetY, 12), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(11, 1 + offsetY, 12), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(12, 1 + offsetY, 12), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(13, 1 + offsetY, 12), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(1, 1 + offsetY, 13), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(2, 1 + offsetY, 13), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(3, 1 + offsetY, 13), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(4, 1 + offsetY, 13), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(6, 1 + offsetY, 13), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(7, 1 + offsetY, 13), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(9, 1 + offsetY, 13), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(10, 1 + offsetY, 13), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(12, 1 + offsetY, 13), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(13, 1 + offsetY, 13), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(1, 2 + offsetY, 1), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(2, 2 + offsetY, 1), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(4, 2 + offsetY, 1), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(5, 2 + offsetY, 1), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(7, 2 + offsetY, 1), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(8, 2 + offsetY, 1), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(10, 2 + offsetY, 1), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(11, 2 + offsetY, 1), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(12, 2 + offsetY, 1), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(1, 2 + offsetY, 2), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(2, 2 + offsetY, 2), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(3, 2 + offsetY, 2), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(4, 2 + offsetY, 2), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(5, 2 + offsetY, 2), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(6, 2 + offsetY, 2), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(7, 2 + offsetY, 2), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(8, 2 + offsetY, 2), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(9, 2 + offsetY, 2), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(10, 2 + offsetY, 2), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(11, 2 + offsetY, 2), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(12, 2 + offsetY, 2), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(13, 2 + offsetY, 2), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(2, 2 + offsetY, 3), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(3, 2 + offsetY, 3), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(4, 2 + offsetY, 3), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(5, 2 + offsetY, 3), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(6, 2 + offsetY, 3), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(7, 2 + offsetY, 3), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(8, 2 + offsetY, 3), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(9, 2 + offsetY, 3), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(10, 2 + offsetY, 3), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(11, 2 + offsetY, 3), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(12, 2 + offsetY, 3), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(13, 2 + offsetY, 3), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(1, 2 + offsetY, 4), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(2, 2 + offsetY, 4), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(3, 2 + offsetY, 4), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(4, 2 + offsetY, 4), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(5, 2 + offsetY, 4), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(6, 2 + offsetY, 4), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(7, 2 + offsetY, 4), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(8, 2 + offsetY, 4), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(9, 2 + offsetY, 4), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(10, 2 + offsetY, 4), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(11, 2 + offsetY, 4), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(12, 2 + offsetY, 4), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(13, 2 + offsetY, 4), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(1, 2 + offsetY, 5), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(2, 2 + offsetY, 5), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(3, 2 + offsetY, 5), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(4, 2 + offsetY, 5), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(5, 2 + offsetY, 5), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(6, 2 + offsetY, 5), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(7, 2 + offsetY, 5), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(8, 2 + offsetY, 5), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(9, 2 + offsetY, 5), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(10, 2 + offsetY, 5), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(11, 2 + offsetY, 5), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(12, 2 + offsetY, 5), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(2, 2 + offsetY, 6), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(3, 2 + offsetY, 6), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(4, 2 + offsetY, 6), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(5, 2 + offsetY, 6), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(6, 2 + offsetY, 6), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(7, 2 + offsetY, 6), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(8, 2 + offsetY, 6), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(9, 2 + offsetY, 6), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(10, 2 + offsetY, 6), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(11, 2 + offsetY, 6), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(12, 2 + offsetY, 6), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(13, 2 + offsetY, 6), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(1, 2 + offsetY, 7), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(2, 2 + offsetY, 7), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(3, 2 + offsetY, 7), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(4, 2 + offsetY, 7), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(5, 2 + offsetY, 7), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(6, 2 + offsetY, 7), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(7, 2 + offsetY, 7), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(8, 2 + offsetY, 7), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(9, 2 + offsetY, 7), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(10, 2 + offsetY, 7), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(11, 2 + offsetY, 7), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(12, 2 + offsetY, 7), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(13, 2 + offsetY, 7), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(1, 2 + offsetY, 8), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(2, 2 + offsetY, 8), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(3, 2 + offsetY, 8), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(4, 2 + offsetY, 8), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(5, 2 + offsetY, 8), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(6, 2 + offsetY, 8), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(7, 2 + offsetY, 8), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(8, 2 + offsetY, 8), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(9, 2 + offsetY, 8), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(10, 2 + offsetY, 8), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(11, 2 + offsetY, 8), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(12, 2 + offsetY, 8), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(2, 2 + offsetY, 9), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(3, 2 + offsetY, 9), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(4, 2 + offsetY, 9), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(5, 2 + offsetY, 9), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(6, 2 + offsetY, 9), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(7, 2 + offsetY, 9), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(8, 2 + offsetY, 9), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(9, 2 + offsetY, 9), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(10, 2 + offsetY, 9), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(11, 2 + offsetY, 9), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(12, 2 + offsetY, 9), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(13, 2 + offsetY, 9), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(1, 2 + offsetY, 10), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(2, 2 + offsetY, 10), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(3, 2 + offsetY, 10), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(4, 2 + offsetY, 10), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(5, 2 + offsetY, 10), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(6, 2 + offsetY, 10), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(7, 2 + offsetY, 10), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(8, 2 + offsetY, 10), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(9, 2 + offsetY, 10), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(10, 2 + offsetY, 10), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(11, 2 + offsetY, 10), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(12, 2 + offsetY, 10), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(13, 2 + offsetY, 10), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(1, 2 + offsetY, 11), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(2, 2 + offsetY, 11), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(3, 2 + offsetY, 11), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(4, 2 + offsetY, 11), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(5, 2 + offsetY, 11), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(6, 2 + offsetY, 11), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(7, 2 + offsetY, 11), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(8, 2 + offsetY, 11), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(9, 2 + offsetY, 11), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(10, 2 + offsetY, 11), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(11, 2 + offsetY, 11), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(12, 2 + offsetY, 11), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(1, 2 + offsetY, 12), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(2, 2 + offsetY, 12), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(3, 2 + offsetY, 12), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(4, 2 + offsetY, 12), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(5, 2 + offsetY, 12), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(6, 2 + offsetY, 12), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(7, 2 + offsetY, 12), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(8, 2 + offsetY, 12), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(9, 2 + offsetY, 12), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(10, 2 + offsetY, 12), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(11, 2 + offsetY, 12), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(12, 2 + offsetY, 12), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(13, 2 + offsetY, 12), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(2, 2 + offsetY, 13), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(3, 2 + offsetY, 13), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(4, 2 + offsetY, 13), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(6, 2 + offsetY, 13), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(7, 2 + offsetY, 13), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(9, 2 + offsetY, 13), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(10, 2 + offsetY, 13), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(12, 2 + offsetY, 13), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(13, 2 + offsetY, 13), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(0, 3 + offsetY, 0), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(1, 3 + offsetY, 0), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(0, 3 + offsetY, 1), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(1, 3 + offsetY, 1), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(2, 3 + offsetY, 1), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(10, 3 + offsetY, 1), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(1, 3 + offsetY, 2), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(2, 3 + offsetY, 2), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(3, 3 + offsetY, 2), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(4, 3 + offsetY, 2), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(5, 3 + offsetY, 2), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(6, 3 + offsetY, 2), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(7, 3 + offsetY, 2), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(8, 3 + offsetY, 2), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(9, 3 + offsetY, 2), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(10, 3 + offsetY, 2), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(11, 3 + offsetY, 2), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(2, 3 + offsetY, 3), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(3, 3 + offsetY, 3), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(4, 3 + offsetY, 3), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(5, 3 + offsetY, 3), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(6, 3 + offsetY, 3), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(7, 3 + offsetY, 3), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(8, 3 + offsetY, 3), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(9, 3 + offsetY, 3), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(10, 3 + offsetY, 3), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(11, 3 + offsetY, 3), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(12, 3 + offsetY, 3), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(2, 3 + offsetY, 4), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(3, 3 + offsetY, 4), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(4, 3 + offsetY, 4), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(5, 3 + offsetY, 4), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(6, 3 + offsetY, 4), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(7, 3 + offsetY, 4), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(8, 3 + offsetY, 4), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(9, 3 + offsetY, 4), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(10, 3 + offsetY, 4), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(11, 3 + offsetY, 4), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(12, 3 + offsetY, 4), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(13, 3 + offsetY, 4), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(2, 3 + offsetY, 5), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(3, 3 + offsetY, 5), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(4, 3 + offsetY, 5), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(5, 3 + offsetY, 5), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(6, 3 + offsetY, 5), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(7, 3 + offsetY, 5), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(8, 3 + offsetY, 5), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(9, 3 + offsetY, 5), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(10, 3 + offsetY, 5), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(11, 3 + offsetY, 5), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(12, 3 + offsetY, 5), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(2, 3 + offsetY, 6), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(3, 3 + offsetY, 6), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(4, 3 + offsetY, 6), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(5, 3 + offsetY, 6), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(6, 3 + offsetY, 6), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(7, 3 + offsetY, 6), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(8, 3 + offsetY, 6), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(9, 3 + offsetY, 6), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(10, 3 + offsetY, 6), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(11, 3 + offsetY, 6), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(12, 3 + offsetY, 6), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(2, 3 + offsetY, 7), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(3, 3 + offsetY, 7), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(4, 3 + offsetY, 7), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(5, 3 + offsetY, 7), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(6, 3 + offsetY, 7), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(8, 3 + offsetY, 7), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(9, 3 + offsetY, 7), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(10, 3 + offsetY, 7), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(11, 3 + offsetY, 7), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(12, 3 + offsetY, 7), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(2, 3 + offsetY, 8), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(3, 3 + offsetY, 8), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(4, 3 + offsetY, 8), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(5, 3 + offsetY, 8), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(6, 3 + offsetY, 8), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(7, 3 + offsetY, 8), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(8, 3 + offsetY, 8), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(9, 3 + offsetY, 8), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(10, 3 + offsetY, 8), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(11, 3 + offsetY, 8), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(12, 3 + offsetY, 8), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(2, 3 + offsetY, 9), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(3, 3 + offsetY, 9), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(4, 3 + offsetY, 9), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(5, 3 + offsetY, 9), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(6, 3 + offsetY, 9), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(7, 3 + offsetY, 9), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(8, 3 + offsetY, 9), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(9, 3 + offsetY, 9), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(10, 3 + offsetY, 9), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(11, 3 + offsetY, 9), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(12, 3 + offsetY, 9), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(1, 3 + offsetY, 10), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(2, 3 + offsetY, 10), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(3, 3 + offsetY, 10), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(4, 3 + offsetY, 10), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(5, 3 + offsetY, 10), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(6, 3 + offsetY, 10), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(7, 3 + offsetY, 10), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(8, 3 + offsetY, 10), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(9, 3 + offsetY, 10), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(10, 3 + offsetY, 10), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(11, 3 + offsetY, 10), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(12, 3 + offsetY, 10), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(2, 3 + offsetY, 11), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(3, 3 + offsetY, 11), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(4, 3 + offsetY, 11), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(5, 3 + offsetY, 11), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(6, 3 + offsetY, 11), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(7, 3 + offsetY, 11), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(8, 3 + offsetY, 11), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(9, 3 + offsetY, 11), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(10, 3 + offsetY, 11), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(11, 3 + offsetY, 11), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(12, 3 + offsetY, 11), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(3, 3 + offsetY, 12), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(4, 3 + offsetY, 12), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(5, 3 + offsetY, 12), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(6, 3 + offsetY, 12), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(7, 3 + offsetY, 12), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(8, 3 + offsetY, 12), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(9, 3 + offsetY, 12), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(10, 3 + offsetY, 12), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(11, 3 + offsetY, 12), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(12, 3 + offsetY, 12), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(13, 3 + offsetY, 12), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(4, 3 + offsetY, 13), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(12, 3 + offsetY, 13), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(13, 3 + offsetY, 13), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(14, 3 + offsetY, 13), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(13, 3 + offsetY, 14), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(14, 3 + offsetY, 14), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(2, 4 + offsetY, 2), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(3, 4 + offsetY, 2), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(4, 4 + offsetY, 2), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(5, 4 + offsetY, 2), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(10, 4 + offsetY, 2), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(2, 4 + offsetY, 3), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(3, 4 + offsetY, 3), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(4, 4 + offsetY, 3), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(5, 4 + offsetY, 3), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(6, 4 + offsetY, 3), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(7, 4 + offsetY, 3), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(8, 4 + offsetY, 3), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(9, 4 + offsetY, 3), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(10, 4 + offsetY, 3), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(11, 4 + offsetY, 3), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(2, 4 + offsetY, 4), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(3, 4 + offsetY, 4), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(4, 4 + offsetY, 4), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(5, 4 + offsetY, 4), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(6, 4 + offsetY, 4), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(7, 4 + offsetY, 4), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(8, 4 + offsetY, 4), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(9, 4 + offsetY, 4), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(10, 4 + offsetY, 4), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(11, 4 + offsetY, 4), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(12, 4 + offsetY, 4), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(2, 4 + offsetY, 5), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(3, 4 + offsetY, 5), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(4, 4 + offsetY, 5), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(5, 4 + offsetY, 5), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(6, 4 + offsetY, 5), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(7, 4 + offsetY, 5), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(8, 4 + offsetY, 5), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(9, 4 + offsetY, 5), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(10, 4 + offsetY, 5), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(11, 4 + offsetY, 5), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(3, 4 + offsetY, 6), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(4, 4 + offsetY, 6), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(5, 4 + offsetY, 6), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(6, 4 + offsetY, 6), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(7, 4 + offsetY, 6), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(8, 4 + offsetY, 6), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(9, 4 + offsetY, 6), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(10, 4 + offsetY, 6), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(11, 4 + offsetY, 6), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(3, 4 + offsetY, 7), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(4, 4 + offsetY, 7), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(5, 4 + offsetY, 7), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(6, 4 + offsetY, 7), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(7, 4 + offsetY, 7), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(8, 4 + offsetY, 7), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(9, 4 + offsetY, 7), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(10, 4 + offsetY, 7), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(11, 4 + offsetY, 7), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(3, 4 + offsetY, 8), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(4, 4 + offsetY, 8), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(5, 4 + offsetY, 8), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(6, 4 + offsetY, 8), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(7, 4 + offsetY, 8), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(8, 4 + offsetY, 8), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(9, 4 + offsetY, 8), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(10, 4 + offsetY, 8), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(11, 4 + offsetY, 8), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(3, 4 + offsetY, 9), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(4, 4 + offsetY, 9), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(5, 4 + offsetY, 9), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(6, 4 + offsetY, 9), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(7, 4 + offsetY, 9), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(8, 4 + offsetY, 9), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(9, 4 + offsetY, 9), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(10, 4 + offsetY, 9), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(11, 4 + offsetY, 9), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(12, 4 + offsetY, 9), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(2, 4 + offsetY, 10), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(3, 4 + offsetY, 10), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(4, 4 + offsetY, 10), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(5, 4 + offsetY, 10), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(6, 4 + offsetY, 10), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(7, 4 + offsetY, 10), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(8, 4 + offsetY, 10), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(9, 4 + offsetY, 10), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(10, 4 + offsetY, 10), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(11, 4 + offsetY, 10), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(12, 4 + offsetY, 10), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(3, 4 + offsetY, 11), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(4, 4 + offsetY, 11), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(5, 4 + offsetY, 11), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(6, 4 + offsetY, 11), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(7, 4 + offsetY, 11), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(8, 4 + offsetY, 11), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(9, 4 + offsetY, 11), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(10, 4 + offsetY, 11), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(11, 4 + offsetY, 11), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(12, 4 + offsetY, 11), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(4, 4 + offsetY, 12), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(9, 4 + offsetY, 12), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(10, 4 + offsetY, 12), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(11, 4 + offsetY, 12), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(12, 4 + offsetY, 12), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(2, 5 + offsetY, 1), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(3, 5 + offsetY, 1), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(1, 5 + offsetY, 2), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(2, 5 + offsetY, 2), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(3, 5 + offsetY, 2), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(4, 5 + offsetY, 2), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(1, 5 + offsetY, 3), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(2, 5 + offsetY, 3), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(3, 5 + offsetY, 3), chanBlock.getDefaultState());
		world.setBlockState(pos.add(2, 5 + offsetY, 4), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(7, 5 + offsetY, 4), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(8, 5 + offsetY, 4), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(9, 5 + offsetY, 4), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(5, 5 + offsetY, 5), stabBlock.getDefaultState());
		world.setBlockState(pos.add(6, 5 + offsetY, 5), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(7, 5 + offsetY, 5), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(8, 5 + offsetY, 5), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(9, 5 + offsetY, 5), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(10, 5 + offsetY, 5), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(5, 5 + offsetY, 6), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(6, 5 + offsetY, 6), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(7, 5 + offsetY, 6), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(8, 5 + offsetY, 6), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(9, 5 + offsetY, 6), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(10, 5 + offsetY, 6), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(4, 5 + offsetY, 7), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(5, 5 + offsetY, 7), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(6, 5 + offsetY, 7), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(7, 5 + offsetY, 7), stabBlock.getDefaultState());
		world.setBlockState(pos.add(8, 5 + offsetY, 7), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(9, 5 + offsetY, 7), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(10, 5 + offsetY, 7), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(4, 5 + offsetY, 8), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(5, 5 + offsetY, 8), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(6, 5 + offsetY, 8), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(7, 5 + offsetY, 8), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(8, 5 + offsetY, 8), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(9, 5 + offsetY, 8), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(4, 5 + offsetY, 9), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(5, 5 + offsetY, 9), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(6, 5 + offsetY, 9), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(7, 5 + offsetY, 9), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(8, 5 + offsetY, 9), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(9, 5 + offsetY, 9), stabBlock.getDefaultState());
		world.setBlockState(pos.add(5, 5 + offsetY, 10), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(6, 5 + offsetY, 10), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(7, 5 + offsetY, 10), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(12, 5 + offsetY, 10), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(11, 5 + offsetY, 11), chanBlock.getDefaultState());
		world.setBlockState(pos.add(12, 5 + offsetY, 11), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(13, 5 + offsetY, 11), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(10, 5 + offsetY, 12), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(11, 5 + offsetY, 12), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(12, 5 + offsetY, 12), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(13, 5 + offsetY, 12), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(11, 5 + offsetY, 13), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(12, 5 + offsetY, 13), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(2, 6 + offsetY, 1), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(3, 6 + offsetY, 1), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(1, 6 + offsetY, 2), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(2, 6 + offsetY, 2), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(3, 6 + offsetY, 2), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(1, 6 + offsetY, 3), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(2, 6 + offsetY, 3), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(3, 6 + offsetY, 3), chanBlock.getDefaultState());

		generate_r02(world, offsetY, pos);
		return true;

	}

	public boolean generate_r02(World world, int offsetY, BlockPos pos) {

		world.setBlockState(pos.add(11, 6 + offsetY, 11), chanBlock.getDefaultState());
		world.setBlockState(pos.add(12, 6 + offsetY, 11), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(13, 6 + offsetY, 11), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(11, 6 + offsetY, 12), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(12, 6 + offsetY, 12), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(13, 6 + offsetY, 12), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(11, 6 + offsetY, 13), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(12, 6 + offsetY, 13), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(2, 7 + offsetY, 1), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(3, 7 + offsetY, 1), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(1, 7 + offsetY, 2), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(2, 7 + offsetY, 2), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(3, 7 + offsetY, 2), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(1, 7 + offsetY, 3), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(2, 7 + offsetY, 3), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(3, 7 + offsetY, 3), chanBlock.getDefaultState());
		world.setBlockState(pos.add(11, 7 + offsetY, 11), chanBlock.getDefaultState());
		world.setBlockState(pos.add(12, 7 + offsetY, 11), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(13, 7 + offsetY, 11), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(11, 7 + offsetY, 12), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(12, 7 + offsetY, 12), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(13, 7 + offsetY, 12), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(11, 7 + offsetY, 13), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(12, 7 + offsetY, 13), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(2, 8 + offsetY, 1), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(3, 8 + offsetY, 1), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(1, 8 + offsetY, 2), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(3, 8 + offsetY, 2), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(1, 8 + offsetY, 3), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(2, 8 + offsetY, 3), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(3, 8 + offsetY, 3), chanBlock.getDefaultState());

		//////

		world.setBlockState(pos.add(6, 7 + offsetY, 8), dimBlock.getDefaultState());
		world.setBlockState(pos.add(7, 7 + offsetY, 8), dimBlock.getDefaultState());
		world.setBlockState(pos.add(8, 7 + offsetY, 8), dimBlock.getDefaultState());

		world.setBlockState(pos.add(6, 7 + offsetY, 7), dimBlock.getDefaultState());
		world.setBlockState(pos.add(7, 7 + offsetY, 7), dimBlock.getDefaultState());
		world.setBlockState(pos.add(8, 7 + offsetY, 7), dimBlock.getDefaultState());

		world.setBlockState(pos.add(6, 7 + offsetY, 6), dimBlock.getDefaultState());
		world.setBlockState(pos.add(7, 7 + offsetY, 6), dimBlock.getDefaultState());
		world.setBlockState(pos.add(8, 7 + offsetY, 6), dimBlock.getDefaultState());

		//////

		world.setBlockState(pos.add(6, 8 + offsetY, 8), dimBlock.getDefaultState());
		world.setBlockState(pos.add(7, 8 + offsetY, 8), dimBlock.getDefaultState());
		world.setBlockState(pos.add(8, 8 + offsetY, 8), dimBlock.getDefaultState());

		world.setBlockState(pos.add(6, 8 + offsetY, 7), dimBlock.getDefaultState());
		world.setBlockState(pos.add(7, 8 + offsetY, 7), BlockHandler.PROTOSS_WORMHOLE.getDefaultState());
		world.setBlockState(pos.add(8, 8 + offsetY, 7), dimBlock.getDefaultState());

		world.setBlockState(pos.add(6, 8 + offsetY, 6), dimBlock.getDefaultState());
		world.setBlockState(pos.add(7, 8 + offsetY, 6), dimBlock.getDefaultState());
		world.setBlockState(pos.add(8, 8 + offsetY, 6), dimBlock.getDefaultState());

		//////

		world.setBlockState(pos.add(6, 9 + offsetY, 8), dimBlock.getDefaultState());
		world.setBlockState(pos.add(7, 9 + offsetY, 8), dimBlock.getDefaultState());
		world.setBlockState(pos.add(8, 9 + offsetY, 8), dimBlock.getDefaultState());

		world.setBlockState(pos.add(6, 9 + offsetY, 7), dimBlock.getDefaultState());
		world.setBlockState(pos.add(7, 9 + offsetY, 7), dimBlock.getDefaultState());
		world.setBlockState(pos.add(8, 9 + offsetY, 7), dimBlock.getDefaultState());

		world.setBlockState(pos.add(6, 9 + offsetY, 6), dimBlock.getDefaultState());
		world.setBlockState(pos.add(7, 9 + offsetY, 6), dimBlock.getDefaultState());
		world.setBlockState(pos.add(8, 9 + offsetY, 6), dimBlock.getDefaultState());

		//////

		world.setBlockState(pos.add(11, 8 + offsetY, 11), chanBlock.getDefaultState());
		world.setBlockState(pos.add(12, 8 + offsetY, 11), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(13, 8 + offsetY, 11), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(11, 8 + offsetY, 12), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(12, 8 + offsetY, 12), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(13, 8 + offsetY, 12), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(11, 8 + offsetY, 13), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(12, 8 + offsetY, 13), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(2, 9 + offsetY, 2), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(3, 9 + offsetY, 2), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(4, 9 + offsetY, 2), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(2, 9 + offsetY, 3), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(3, 9 + offsetY, 3), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(2, 9 + offsetY, 4), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(12, 9 + offsetY, 10), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(11, 9 + offsetY, 11), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(12, 9 + offsetY, 11), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(10, 9 + offsetY, 12), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(11, 9 + offsetY, 12), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(12, 9 + offsetY, 12), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(3, 10 + offsetY, 2), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(4, 10 + offsetY, 2), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(2, 10 + offsetY, 3), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(3, 10 + offsetY, 3), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(4, 10 + offsetY, 3), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(2, 10 + offsetY, 4), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(3, 10 + offsetY, 4), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(11, 10 + offsetY, 10), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(12, 10 + offsetY, 10), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(10, 10 + offsetY, 11), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(11, 10 + offsetY, 11), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(12, 10 + offsetY, 11), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(10, 10 + offsetY, 12), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(11, 10 + offsetY, 12), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(3, 11 + offsetY, 2), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(4, 11 + offsetY, 2), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(2, 11 + offsetY, 3), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(3, 11 + offsetY, 3), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(4, 11 + offsetY, 3), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(2, 11 + offsetY, 4), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(3, 11 + offsetY, 4), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(11, 11 + offsetY, 10), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(12, 11 + offsetY, 10), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(10, 11 + offsetY, 11), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(11, 11 + offsetY, 11), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(12, 11 + offsetY, 11), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(10, 11 + offsetY, 12), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(11, 11 + offsetY, 12), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(3, 12 + offsetY, 3), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(4, 12 + offsetY, 3), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(3, 12 + offsetY, 4), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(11, 12 + offsetY, 10), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(10, 12 + offsetY, 11), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(11, 12 + offsetY, 11), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		if (metaSecColor == 0 || metaSecColor == 3) {
			world.setBlockState(pos.add(7, 3 + offsetY, 7), BlockHandler.CORE_WARPGATE_KHALAI.getDefaultState(), 2);
		} else if (metaSecColor == 2) {
			world.setBlockState(pos.add(7, 3 + offsetY, 7), BlockHandler.CORE_WARPGATE_VOID.getDefaultState(), 2);
		} else if (metaSecColor == 4) {
			world.setBlockState(pos.add(7, 3 + offsetY, 7), BlockHandler.CORE_WARPGATE_DARK.getDefaultState(), 2);
		}
		return true;
	}

	protected Block[] getValidSpawnBlocks() {
		return new Block[] { Blocks.GRASS, Blocks.DIRT, Blocks.STONE, BlockHandler.ASH_CHAR, BlockHandler.STONE_CHAR, BlockHandler.PROTOSS_METAL_T1, BlockHandler.SAND_SHAKURAS, BlockHandler.STONE_SHAKURAS, BlockHandler.DIRT_SHAKURAS, BlockHandler.DIRT_CHAR, Blocks.SAND, Blocks.SNOW_LAYER, Blocks.SNOW };
	}

	public boolean LocationIsValidSpawn(World world, BlockPos pos) {
		Block checkBlock = world.getBlockState(pos).getBlock();
		Material m = checkBlock.getBlockState().getBaseState().getMaterial();
		Block blockAbove = world.getBlockState(pos.up()).getBlock();
		Block blockBelow = world.getBlockState(pos.down()).getBlock();

		for (Block i : getValidSpawnBlocks()) {
			if (blockAbove != Blocks.AIR) {
				return false;
			}
			if (checkBlock == i) {
				return true;
			} else if (checkBlock == Blocks.SNOW_LAYER && blockBelow == i) {
				return true;
			} else if (m == Material.PLANTS && blockBelow == i) {
				world.getBlockState(pos).getMaterial();
				return true;
			}
		}
		return false;
	}
}