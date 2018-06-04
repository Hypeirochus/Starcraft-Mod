package com.hypeirochus.scmc.handlers;

import java.util.Random;

import com.hypeirochus.scmc.worldgen.StarcraftWorldGenMinable;
import com.hypeirochus.scmc.worldgen.StarcraftWorldGenMinableRandomized;
import com.hypeirochus.scmc.worldgen.structure.IGenericStructure;
import com.hypeirochus.scmc.worldgen.structure.INBTStructure;
import com.hypeirochus.scmc.worldgen.structure.SCWorldGenerator;
import com.hypeirochus.scmc.worldgen.structure.StructureTerranBarracksTemplate;
import com.hypeirochus.scmc.worldgen.structure.StructureTerranBunkerTemplate;
import com.hypeirochus.scmc.worldgen.structure.StructureTerranCommandCenterTemplate;
import com.hypeirochus.scmc.worldgen.structure.StructureZergHydraliskDenTemplate;
import com.hypeirochus.scmc.worldgen.structure.StructureZergSpawningPoolTemplate;
import com.hypeirochus.scmc.worldgen.structure.StructureZergSpireTemplate;

import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;

public class StarcraftGenerator {

	protected Random rand = new Random();
	public static final StarcraftGenerator INSTANCE = new StarcraftGenerator();

	protected WorldGenerator TITANIUM_CHAR = new StarcraftWorldGenMinable(BlockHandler.STONE_CHAR, BlockHandler.ORE_TITANIUM_CHAR.getDefaultState(), 8);
	protected WorldGenerator URANIUM_CHAR = new StarcraftWorldGenMinable(BlockHandler.STONE_CHAR, BlockHandler.ORE_URANIUM_CHAR.getDefaultState(), 1);
	protected WorldGenerator COAL_CHAR = new StarcraftWorldGenMinable(BlockHandler.STONE_CHAR, BlockHandler.ORE_COAL_CHAR.getDefaultState(), 16);
	protected WorldGenerator COPPER_CHAR = new StarcraftWorldGenMinable(BlockHandler.STONE_CHAR, BlockHandler.ORE_COPPER_CHAR.getDefaultState(), 8);
	protected WorldGenerator DIAMOND_CHAR = new StarcraftWorldGenMinable(BlockHandler.STONE_CHAR, BlockHandler.ORE_DIAMOND_CHAR.getDefaultState(), 8);
	protected WorldGenerator GOLD_CHAR = new StarcraftWorldGenMinable(BlockHandler.STONE_CHAR, BlockHandler.ORE_GOLD_CHAR.getDefaultState(), 8);
	protected WorldGenerator IRON_CHAR = new StarcraftWorldGenMinable(BlockHandler.STONE_CHAR, BlockHandler.ORE_IRON_CHAR.getDefaultState(), 8);
	protected WorldGenerator LAPIS_CHAR = new StarcraftWorldGenMinable(BlockHandler.STONE_CHAR, BlockHandler.ORE_LAPIS_CHAR.getDefaultState(), 8);
	protected WorldGenerator MINERAL_CHAR = new StarcraftWorldGenMinable(BlockHandler.STONE_CHAR, BlockHandler.ORE_MINERAL_CHAR.getDefaultState(), 8);
	protected WorldGenerator REDSTONE_CHAR = new StarcraftWorldGenMinable(BlockHandler.STONE_CHAR, BlockHandler.ORE_REDSTONE_CHAR.getDefaultState(), 8);
	protected WorldGenerator RICHMINERAL_CHAR = new StarcraftWorldGenMinable(BlockHandler.STONE_CHAR, BlockHandler.ORE_RICHMINERAL_CHAR.getDefaultState(), 8);
	protected WorldGenerator PHOSPHORUS_CHAR = new StarcraftWorldGenMinable(BlockHandler.STONE_CHAR, BlockHandler.ORE_PHOSPHORUS_CHAR.getDefaultState(), 8);
	protected WorldGenerator MAGMA_CHAR = new StarcraftWorldGenMinable(BlockHandler.STONE_CHAR, BlockHandler.MAGMA_CHAR.getDefaultState(), 16);
	protected WorldGenerator DIRT_CHAR = new StarcraftWorldGenMinable(BlockHandler.STONE_CHAR, BlockHandler.DIRT_CHAR.getDefaultState(), 33);
	protected WorldGenerator GRAVEL_CHAR = new StarcraftWorldGenMinable(BlockHandler.STONE_CHAR, BlockHandler.GRAVEL_CHAR.getDefaultState(), 33);

	protected WorldGenerator TITANIUM_SHAKURAS = new StarcraftWorldGenMinable(BlockHandler.STONE_SHAKURAS, BlockHandler.ORE_TITANIUM_SHAKURAS.getDefaultState(), 8);
	protected WorldGenerator URANIUM_SHAKURAS = new StarcraftWorldGenMinable(BlockHandler.STONE_SHAKURAS, BlockHandler.ORE_URANIUM_SHAKURAS.getDefaultState(), 1);
	protected WorldGenerator COAL_SHAKURAS = new StarcraftWorldGenMinable(BlockHandler.STONE_SHAKURAS, BlockHandler.ORE_COAL_SHAKURAS.getDefaultState(), 16);
	protected WorldGenerator COPPER_SHAKURAS = new StarcraftWorldGenMinable(BlockHandler.STONE_SHAKURAS, BlockHandler.ORE_COPPER_SHAKURAS.getDefaultState(), 8);
	protected WorldGenerator DIAMOND_SHAKURAS = new StarcraftWorldGenMinable(BlockHandler.STONE_SHAKURAS, BlockHandler.ORE_DIAMOND_SHAKURAS.getDefaultState(), 8);
	protected WorldGenerator GOLD_SHAKURAS = new StarcraftWorldGenMinable(BlockHandler.STONE_SHAKURAS, BlockHandler.ORE_GOLD_SHAKURAS.getDefaultState(), 8);
	protected WorldGenerator IRON_SHAKURAS = new StarcraftWorldGenMinable(BlockHandler.STONE_SHAKURAS, BlockHandler.ORE_IRON_SHAKURAS.getDefaultState(), 8);
	protected WorldGenerator LAPIS_SHAKURAS = new StarcraftWorldGenMinable(BlockHandler.STONE_SHAKURAS, BlockHandler.ORE_LAPIS_SHAKURAS.getDefaultState(), 8);
	protected WorldGenerator MINERAL_SHAKURAS = new StarcraftWorldGenMinable(BlockHandler.STONE_SHAKURAS, BlockHandler.ORE_MINERAL_SHAKURAS.getDefaultState(), 8);
	protected WorldGenerator REDSTONE_SHAKURAS = new StarcraftWorldGenMinable(BlockHandler.STONE_SHAKURAS, BlockHandler.ORE_REDSTONE_SHAKURAS.getDefaultState(), 8);
	protected WorldGenerator RICHMINERAL_SHAKURAS = new StarcraftWorldGenMinable(BlockHandler.STONE_SHAKURAS, BlockHandler.ORE_RICHMINERAL_SHAKURAS.getDefaultState(), 8);
	protected WorldGenerator PHOSPHORUS_SHAKURAS = new StarcraftWorldGenMinable(BlockHandler.STONE_SHAKURAS, BlockHandler.ORE_PHOSPHORUS_SHAKURAS.getDefaultState(), 8);
	protected WorldGenerator DIRT_SHAKURAS = new StarcraftWorldGenMinable(BlockHandler.STONE_SHAKURAS, BlockHandler.DIRT_SHAKURAS.getDefaultState(), 33);
	protected WorldGenerator GRAVEL_SHAKURAS = new StarcraftWorldGenMinable(BlockHandler.STONE_SHAKURAS, BlockHandler.GRAVEL_SHAKURAS.getDefaultState(), 33);

	protected WorldGenerator TITANIUM_ZERUS = new StarcraftWorldGenMinable(BlockHandler.STONE_ZERUS, BlockHandler.ORE_TITANIUM_ZERUS.getDefaultState(), 8);
	protected WorldGenerator URANIUM_ZERUS = new StarcraftWorldGenMinable(BlockHandler.STONE_ZERUS, BlockHandler.ORE_URANIUM_ZERUS.getDefaultState(), 1);
	protected WorldGenerator COAL_ZERUS = new StarcraftWorldGenMinable(BlockHandler.STONE_ZERUS, BlockHandler.ORE_COAL_ZERUS.getDefaultState(), 16);
	protected WorldGenerator COPPER_ZERUS = new StarcraftWorldGenMinable(BlockHandler.STONE_ZERUS, BlockHandler.ORE_COPPER_ZERUS.getDefaultState(), 8);
	protected WorldGenerator DIAMOND_ZERUS = new StarcraftWorldGenMinable(BlockHandler.STONE_ZERUS, BlockHandler.ORE_DIAMOND_ZERUS.getDefaultState(), 8);
	protected WorldGenerator GOLD_ZERUS = new StarcraftWorldGenMinable(BlockHandler.STONE_ZERUS, BlockHandler.ORE_GOLD_ZERUS.getDefaultState(), 8);
	protected WorldGenerator IRON_ZERUS = new StarcraftWorldGenMinable(BlockHandler.STONE_ZERUS, BlockHandler.ORE_IRON_ZERUS.getDefaultState(), 8);
	protected WorldGenerator LAPIS_ZERUS = new StarcraftWorldGenMinable(BlockHandler.STONE_ZERUS, BlockHandler.ORE_LAPIS_ZERUS.getDefaultState(), 8);
	protected WorldGenerator MINERAL_ZERUS = new StarcraftWorldGenMinable(BlockHandler.STONE_ZERUS, BlockHandler.ORE_MINERAL_ZERUS.getDefaultState(), 8);
	protected WorldGenerator REDSTONE_ZERUS = new StarcraftWorldGenMinable(BlockHandler.STONE_ZERUS, BlockHandler.ORE_REDSTONE_ZERUS.getDefaultState(), 8);
	protected WorldGenerator RICHMINERAL_ZERUS = new StarcraftWorldGenMinable(BlockHandler.STONE_ZERUS, BlockHandler.ORE_RICHMINERAL_ZERUS.getDefaultState(), 8);
	protected WorldGenerator PHOSPHORUS_ZERUS = new StarcraftWorldGenMinable(BlockHandler.STONE_ZERUS, BlockHandler.ORE_PHOSPHORUS_ZERUS.getDefaultState(), 8);
	protected WorldGenerator DIRT_ZERUS = new StarcraftWorldGenMinable(BlockHandler.STONE_ZERUS, BlockHandler.DIRT_ZERUS.getDefaultState(), 33);
	protected WorldGenerator GRAVEL_ZERUS = new StarcraftWorldGenMinable(BlockHandler.STONE_ZERUS, BlockHandler.GRAVEL_ZERUS.getDefaultState(), 33);

	protected WorldGenerator TITANIUM_SLAYN = new StarcraftWorldGenMinable(BlockHandler.STONE_SLAYN, BlockHandler.ORE_TITANIUM_SLAYN.getDefaultState(), 8);
	protected WorldGenerator URANIUM_SLAYN = new StarcraftWorldGenMinable(BlockHandler.STONE_SLAYN, BlockHandler.ORE_URANIUM_SLAYN.getDefaultState(), 1);
	protected WorldGenerator COAL_SLAYN = new StarcraftWorldGenMinable(BlockHandler.STONE_SLAYN, BlockHandler.ORE_COAL_SLAYN.getDefaultState(), 16);
	protected WorldGenerator COPPER_SLAYN = new StarcraftWorldGenMinable(BlockHandler.STONE_SLAYN, BlockHandler.ORE_COPPER_SLAYN.getDefaultState(), 8);
	protected WorldGenerator DIAMOND_SLAYN = new StarcraftWorldGenMinable(BlockHandler.STONE_SLAYN, BlockHandler.ORE_DIAMOND_SLAYN.getDefaultState(), 8);
	protected WorldGenerator GOLD_SLAYN = new StarcraftWorldGenMinable(BlockHandler.STONE_SLAYN, BlockHandler.ORE_GOLD_SLAYN.getDefaultState(), 8);
	protected WorldGenerator IRON_SLAYN = new StarcraftWorldGenMinable(BlockHandler.STONE_SLAYN, BlockHandler.ORE_IRON_SLAYN.getDefaultState(), 8);
	protected WorldGenerator LAPIS_SLAYN = new StarcraftWorldGenMinable(BlockHandler.STONE_SLAYN, BlockHandler.ORE_LAPIS_SLAYN.getDefaultState(), 8);
	protected WorldGenerator MINERAL_SLAYN = new StarcraftWorldGenMinable(BlockHandler.STONE_SLAYN, BlockHandler.ORE_MINERAL_SLAYN.getDefaultState(), 8);
	protected WorldGenerator REDSTONE_SLAYN = new StarcraftWorldGenMinable(BlockHandler.STONE_SLAYN, BlockHandler.ORE_REDSTONE_SLAYN.getDefaultState(), 8);
	protected WorldGenerator RICHMINERAL_SLAYN = new StarcraftWorldGenMinable(BlockHandler.STONE_SLAYN, BlockHandler.ORE_RICHMINERAL_SLAYN.getDefaultState(), 8);
	protected WorldGenerator PHOSPHORUS_SLAYN = new StarcraftWorldGenMinable(BlockHandler.STONE_SLAYN, BlockHandler.ORE_PHOSPHORUS_SLAYN.getDefaultState(), 8);
	protected WorldGenerator DIRT_SLAYN = new StarcraftWorldGenMinable(BlockHandler.STONE_SLAYN, BlockHandler.DIRT_SLAYN.getDefaultState(), 33);
	protected WorldGenerator GRAVEL_SLAYN = new StarcraftWorldGenMinable(BlockHandler.STONE_SLAYN, BlockHandler.GRAVEL_SLAYN.getDefaultState(), 33);

	protected WorldGenerator COAL_SPACE = new StarcraftWorldGenMinableRandomized(Blocks.AIR, Blocks.STONE.getDefaultState(), Blocks.COAL_ORE.getDefaultState(), rand.nextInt(32) + 16, 30);
	protected WorldGenerator DIAMOND_SPACE = new StarcraftWorldGenMinableRandomized(Blocks.AIR, Blocks.STONE.getDefaultState(), Blocks.DIAMOND_ORE.getDefaultState(), rand.nextInt(32) + 16, 10);
	protected WorldGenerator GOLD_SPACE = new StarcraftWorldGenMinableRandomized(Blocks.AIR, Blocks.STONE.getDefaultState(), Blocks.GOLD_ORE.getDefaultState(), rand.nextInt(32) + 16, 15);
	protected WorldGenerator IRON_SPACE = new StarcraftWorldGenMinableRandomized(Blocks.AIR, Blocks.STONE.getDefaultState(), Blocks.IRON_ORE.getDefaultState(), rand.nextInt(32) + 16, 20);
	protected WorldGenerator COPPER_SPACE = new StarcraftWorldGenMinableRandomized(Blocks.AIR, Blocks.STONE.getDefaultState(), BlockHandler.ORE_COPPER_OW.getDefaultState(), rand.nextInt(32) + 16, 30);
	protected WorldGenerator TITANIUM_SPACE = new StarcraftWorldGenMinableRandomized(Blocks.AIR, Blocks.STONE.getDefaultState(), BlockHandler.ORE_TITANIUM_OW.getDefaultState(), rand.nextInt(32) + 16, 10);
	protected WorldGenerator URANIUM_SPACE = new StarcraftWorldGenMinableRandomized(Blocks.AIR, Blocks.STONE.getDefaultState(), BlockHandler.ORE_URANIUM_OW.getDefaultState(), rand.nextInt(32) + 16, 5);
	protected WorldGenerator MINERAL_SPACE = new StarcraftWorldGenMinableRandomized(Blocks.AIR, Blocks.STONE.getDefaultState(), BlockHandler.ORE_MINERAL_OW.getDefaultState(), rand.nextInt(32) + 16, 25);
	protected WorldGenerator RICHMINERAL_SPACE = new StarcraftWorldGenMinableRandomized(Blocks.AIR, Blocks.STONE.getDefaultState(), BlockHandler.ORE_RICHMINERAL_OW.getDefaultState(), rand.nextInt(32) + 16, 15);
	protected WorldGenerator STONE_SPACE = new StarcraftWorldGenMinableRandomized(Blocks.AIR, Blocks.STONE.getDefaultState(), Blocks.STONE.getDefaultState(), rand.nextInt(32) + 16, 50);
	protected WorldGenerator ICE_SPACE = new StarcraftWorldGenMinableRandomized(Blocks.AIR, Blocks.STONE.getDefaultState(), Blocks.ICE.getDefaultState(), rand.nextInt(32) + 16, 70);

	protected WorldGenerator TITANIUM_GENERIC = new WorldGenMinable(BlockHandler.ORE_TITANIUM_OW.getDefaultState(), 8);
	protected WorldGenerator COAL_GENERIC = new WorldGenMinable(Blocks.COAL_ORE.getDefaultState(), 16);
	protected WorldGenerator COPPER_GENERIC = new WorldGenMinable(BlockHandler.ORE_COPPER_OW.getDefaultState(), 8);
	protected WorldGenerator DIAMOND_GENERIC = new WorldGenMinable(Blocks.DIAMOND_ORE.getDefaultState(), 8);
	protected WorldGenerator GOLD_GENERIC = new WorldGenMinable(Blocks.GOLD_ORE.getDefaultState(), 8);
	protected WorldGenerator IRON_GENERIC = new WorldGenMinable(Blocks.IRON_ORE.getDefaultState(), 8);
	protected WorldGenerator LAPIS_GENERIC = new WorldGenMinable(BlockHandler.ORE_LAPIS_SHAKURAS.getDefaultState(), 8);
	protected WorldGenerator REDSTONE_GENERIC = new WorldGenMinable(Blocks.REDSTONE_ORE.getDefaultState(), 8);
	protected WorldGenerator PHOSPHORUS_GENERIC = new WorldGenMinable(BlockHandler.ORE_PHOSPHORUS_OW.getDefaultState(), 8);
	protected WorldGenerator DIRT_GENERIC = new WorldGenMinable(Blocks.DIRT.getDefaultState(), 33);
	protected WorldGenerator GRAVEL_GENERIC = new WorldGenMinable(Blocks.GRAVEL.getDefaultState(), 33);
	protected WorldGenerator MINERAL_GENERIC = new WorldGenMinable(BlockHandler.ORE_MINERAL_OW.getDefaultState(), 8);
	protected WorldGenerator URANIUM_GENERIC = new WorldGenMinable(BlockHandler.ORE_URANIUM_OW.getDefaultState(), 1);
	protected WorldGenerator RICHMINERAL_GENERIC = new WorldGenMinable(BlockHandler.ORE_RICHMINERAL_OW.getDefaultState(), 8);

	protected INBTStructure SPAWNING_POOL = new StructureZergSpawningPoolTemplate();
	protected INBTStructure ZERG_HYDRALISK_DEN = new StructureZergHydraliskDenTemplate();
	protected INBTStructure ZERG_SPIRE = new StructureZergSpireTemplate();

	protected INBTStructure TERRAN_BUNKER = new StructureTerranBunkerTemplate();
	protected INBTStructure TERRAN_BARRACKS = new StructureTerranBarracksTemplate();
	protected INBTStructure TERRAN_COMMAND_CENTER = new StructureTerranCommandCenterTemplate();

	// protected INBTStructure PROTOSS_PYLON = new StructureProtossPylonTemplate();
	// protected INBTStructure PROTOSS_WARPGATE = new StructureProtossWarpGateTemplate();
	// protected INBTStructure PROTOSS_CYBERNETICS_CORE = new StructureProtossCyberneticsCoreTemplate();

	// protected INBTStructure GEYSER = new StructureGeyserTemplate();
	// protected IGenericStructure MINERAL_PATCH = new StructureMineralPatchTemplate();

	// protected IGenericStructure MULTISURFACE_PLANET_TEMPLATE = new StructureMultisurfacePlanetTemplate();
	// protected IGenericStructure MOON_TEMPLATE = new StructureMoonTemplate();
	// protected IGenericStructure PLANET_TEMPLATE = new StructurePlanetTemplate();
	// protected IGenericStructure STAR_TEMPLATE = new StructureStarTemplate();

	// protected IGenericStructure BOSS_SPAWNER = new BossSpawner();
	// protected IGenericStructure TILEENTITY_SPAWNER = new StructureSingleBlockTemplate();

	private static void checkHeight(int minHeight, int maxHeight) {
		if (minHeight < 0 || maxHeight > 256 || minHeight > maxHeight) {
			throw new IllegalArgumentException("Illegal Height Arguments for WorldGenerator");
		}
	}

	/**
	 * Runs any SCMC world generator.
	 * 
	 * @param structure
	 *            The structure to generate
	 * @param world
	 *            The world to generate in
	 * @param rand
	 *            The randomness used to determine exact position
	 * @param chunk_X
	 *            The x chunk
	 * @param chunk_Z
	 *            Thez chunk
	 * @param offsetX
	 *            The x offset
	 * @param offsetY
	 *            The y offset
	 * @param offsetZ
	 *            The x offset
	 * @param chancesToSpawn
	 *            The chances this has to spawn
	 * @param minHeight
	 *            The minimum height of this structure's spawn zone
	 * @param maxHeight
	 *            The maximum height of the structure spawn zone
	 * @param flags
	 *            The flags that are passed in
	 */
	public static void runGenerator(IGenericStructure structure, World world, Random rand, int chunk_X, int chunk_Z, int offsetX, int offsetY, int offsetZ, int chancesToSpawn, int minHeight, int maxHeight, Object... flags) {
		checkHeight(minHeight, maxHeight);

		int heightDiff = maxHeight - minHeight + 1;

		for (int i = 0; i < chancesToSpawn; i++) {
			structure.setFlags(flags);
			structure.generate(world, new BlockPos(chunk_X * 16 + 8, minHeight + rand.nextInt(heightDiff), chunk_Z * 16 + 8).add(offsetX, offsetY, offsetZ));
		}
	}

	public static void runOreGenerator(WorldGenerator generator, World world, Random rand, int chunk_X, int chunk_Z, int chancesToSpawn, int minHeight, int maxHeight) {
		checkHeight(minHeight, maxHeight);

		int heightDiff = maxHeight - minHeight + 1;

		for (int i = 0; i < chancesToSpawn; i++) {
			generator.generate(world, rand, new BlockPos(chunk_X * 16 + 8, minHeight + rand.nextInt(heightDiff), chunk_Z * 16 + 8));
		}
	}

	// protected static void runDualBlockStateGenerator(SCWorldGenerator generator, IBlockState state, IBlockState state2, World world, Random rand, int chunk_X, int chunk_Z, int offsetX, int offsetY, int offsetZ, int chancesToSpawn, int minHeight, int maxHeight, boolean flag) {
	//
	// checkHeight(minHeight, maxHeight);
	//
	// int heightDiff = maxHeight - minHeight + 1;
	//
	// for (int i = 0; i < chancesToSpawn; i++) {
	// generator.generate(state, state2, world, rand, offsetX, offsetY, offsetZ, new BlockPos(chunk_X * 16 + 8, minHeight + rand.nextInt(heightDiff), chunk_Z * 16 + 8), flag);
	// }
	// }
	//
	// protected static void runBossGenerator(SCWorldGenerator generator, int range, Entity entityToSpawn, TextFormatting color, World world, Random rand, int chunk_X, int chunk_Z, int offsetX, int offsetY, int offsetZ, int chancesToSpawn, int minHeight, int maxHeight, boolean flag) {
	//
	// checkHeight(minHeight, maxHeight);
	//
	// int heightDiff = maxHeight - minHeight + 1;
	//
	// for (int i = 0; i < chancesToSpawn; i++) {
	// generator.generate(range, entityToSpawn, color, world, rand, offsetX, offsetY, offsetZ, new BlockPos(chunk_X * 16 + 8, minHeight + rand.nextInt(heightDiff), chunk_Z * 16 + 8), flag);
	// }
	// }
	//
	// protected static void runTeamColorGenerator(SCWorldGenerator generator, int metaColor, int metaSecColor, World world, Random rand, int chunk_X, int chunk_Z, int offsetX, int offsetY, int offsetZ, int chancesToSpawn, int minHeight, int maxHeight, boolean flag) {
	//
	// checkHeight(minHeight, maxHeight);
	//
	// int heightDiff = maxHeight - minHeight + 1;
	//
	// for (int i = 0; i < chancesToSpawn; i++) {
	// generator.generate(metaColor, metaSecColor, world, rand, offsetX, offsetY, offsetZ, new BlockPos(chunk_X * 16 + 8, minHeight + rand.nextInt(heightDiff), chunk_Z * 16 + 8), flag);
	// }
	// }
	//
	// protected static void runGenericFlagGenerator(SCWorldGenerator generator, World world, Random rand, int chunk_X, int chunk_Z, int offsetX, int offsetY, int offsetZ, int chancesToSpawn, int minHeight, int maxHeight, boolean flag) {
	//
	// checkHeight(minHeight, maxHeight);
	//
	// int heightDiff = maxHeight - minHeight + 1;
	//
	// for (int i = 0; i < chancesToSpawn; i++) {
	// generator.generate(world, rand, offsetX, offsetY, offsetZ, new BlockPos(chunk_X * 16 + 8, minHeight + rand.nextInt(heightDiff), chunk_Z * 16 + 8), flag);
	// }
	// }
	//
	// protected static void runGenericGenerator(SCWorldGenerator generator, World world, Random rand, int chunk_X, int chunk_Z, int offsetX, int offsetY, int offsetZ, int chancesToSpawn, int minHeight, int maxHeight) {
	//
	// checkHeight(minHeight, maxHeight);
	//
	// int heightDiff = maxHeight - minHeight + 1;
	//
	// for (int i = 0; i < chancesToSpawn; i++) {
	// generator.generate(world, rand, offsetX, offsetY, offsetZ, new BlockPos(chunk_X * 16 + 8, minHeight + rand.nextInt(heightDiff), chunk_Z * 16 + 8));
	// }
	// }
	//
	protected static void runPlanetGenerator(SCWorldGenerator generator, int id, int planetSize, int range, IBlockState block, World world, Random rand, int offsetX, int offsetY, int offsetZ, BlockPos pos) {
		generator.generatePlanet(id, planetSize, range, block, world, rand, offsetX, offsetY, offsetZ, pos);
	}

	protected static void runMultisurfacePlanetGenerator(SCWorldGenerator generator, int id, int planetSize, int range, IBlockState block1, IBlockState block2, World world, Random rand, int offsetX, int offsetY, int offsetZ, BlockPos pos) {
		generator.generateMultisurfacePlanet(id, planetSize, range, block1, block2, world, rand, offsetX, offsetY, offsetZ, pos);
	}

	protected static void runMoonGenerator(SCWorldGenerator generator, int planetSize, IBlockState block1, IBlockState block2, World world, Random rand, int offsetX, int offsetY, int offsetZ, BlockPos pos) {
		generator.generateMoon(planetSize, block1, block2, world, rand, offsetX, offsetY, offsetZ, pos);
	}

	protected static void runStarGenerator(SCWorldGenerator generator, int starSize, int range, IBlockState block, World world, Random rand, int offsetX, int offsetY, int offsetZ, BlockPos pos) {
		generator.generateStar(starSize, range, block, world, rand, offsetX, offsetY, offsetZ, pos);
	}

	protected static void runRandomStarGenerator(SCWorldGenerator generator, int starSize, World world, Random rand, int chunk_X, int chunk_Z, int offsetX, int offsetY, int offsetZ, int chancesToSpawn, int minHeight, int maxHeight) {
		checkHeight(minHeight, maxHeight);

		int heightDiff = maxHeight - minHeight + 1;

		for (int i = 0; i < chancesToSpawn; i++) {
			generator.generateRandomStar(starSize, world, rand, offsetX, offsetY, offsetZ, new BlockPos(chunk_X * 16 + 8, minHeight + rand.nextInt(heightDiff), chunk_Z * 16 + 8));
		}
	}
	//
	// protected static void runMetaGenerator(SCWorldGenerator generator, int meta, World world, Random rand, int chunk_X, int chunk_Z, int offsetX, int offsetY, int offsetZ, int chancesToSpawn, int minHeight, int maxHeight) {
	//
	// checkHeight(minHeight, maxHeight);
	//
	// int heightDiff = maxHeight - minHeight + 1;
	//
	// for (int i = 0; i < chancesToSpawn; i++) {
	// generator.generate(meta, world, rand, offsetX, offsetY, offsetZ, new BlockPos(chunk_X * 16 + 8, minHeight + rand.nextInt(heightDiff), chunk_Z * 16 + 8));
	// }
	// }
	//
	// protected static void runTileEntityGenerator(SCWorldGenerator generator, TileEntity entity, Block block, World world, Random rand, int chunk_X, int chunk_Z, int chancesToSpawn, int minHeight, int maxHeight) {
	//
	// checkHeight(minHeight, maxHeight);
	//
	// int heightDiff = maxHeight - minHeight + 1;
	//
	// for (int i = 0; i < chancesToSpawn; i++) {
	// generator.generateTileEntity(entity, block, world, rand, new BlockPos(chunk_X * 16 + 8, minHeight + rand.nextInt(heightDiff), chunk_Z * 16 + 8));
	// }
	// }
}
