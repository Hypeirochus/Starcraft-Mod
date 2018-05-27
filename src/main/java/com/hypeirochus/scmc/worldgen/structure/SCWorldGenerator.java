package com.hypeirochus.scmc.worldgen.structure;

import java.util.Random;

import javax.annotation.Nullable;

import com.hypeirochus.scmc.Starcraft;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.server.MinecraftServer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityLockableLoot;
import net.minecraft.util.Mirror;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraft.world.gen.structure.template.PlacementSettings;
import net.minecraft.world.gen.structure.template.Template;
import net.minecraft.world.gen.structure.template.TemplateManager;

/**
 * <em><b>Copyright (c) 2018 The Starcraft Minecraft (SCMC) Mod Team.</b></em>
 * 
 * <br>
 * </br>
 */
@Deprecated
public abstract class SCWorldGenerator {

	/**
	 * Sets whether or not the generator should notify blocks of blocks it changes. When the world is first generated, this is false, when saplings grow, this is true.
	 */
	private final boolean doBlockNotify;

	public SCWorldGenerator() {
		this(false);
	}

	public SCWorldGenerator(boolean notify) {
		doBlockNotify = notify;
	}

	public boolean generateTileEntity(TileEntity entity, Block block, World worldIn, Random rand, BlockPos position) {
		return true;
	}

	public boolean generateSingleBlock(IBlockState state, World worldIn, Random rand, int offsetX, int offsetY, int offsetZ, BlockPos position) {
		return true;
	}

	public boolean generateDoubleBlock(IBlockState state, IBlockState state2, World worldIn, Random rand, int offsetX, int offsetY, int offsetZ, BlockPos position) {
		return true;
	}

	public boolean generate(int metaDim, int metaPrimColor, int metaSecColor, World world, Random rand, int offsetX, int offsetY, int offsetZ, BlockPos pos) {
		return true;
	}

	public boolean generate(int metaColor, int metaSecColor, World worldIn, Random rand, int offsetX, int offsetY, int offsetZ, BlockPos position) {
		return true;
	}

	public boolean generate(int metaColor, int metaSecColor, World worldIn, Random rand, int offsetX, int offsetY, int offsetZ, BlockPos position, boolean useSpawnReqs) {
		return true;
	}

	public boolean generate(World worldIn, Random rand, int offsetX, int offsetY, int offsetZ, BlockPos position) {
		return true;
	}

	public boolean generate(int Meta, World worldIn, Random rand, int offsetX, int offsetY, int offsetZ, BlockPos position) {
		return true;
	}

	public boolean generatePlanet(int dim, int planetSize, int range, IBlockState surface, World worldIn, Random rand, int offsetX, int offsetY, int offsetZ, BlockPos position) {
		return true;
	}

	public boolean generateMultisurfacePlanet(int dim, int planetSize, int range, IBlockState surface1, IBlockState surface2, World worldIn, Random rand, int offsetX, int offsetY, int offsetZ, BlockPos position) {
		return true;
	}

	public boolean generateMoon(int planetSize, IBlockState surface1, IBlockState surface2, World worldIn, Random rand, int offsetX, int offsetY, int offsetZ, BlockPos position) {
		return true;
	}

	public boolean generateStar(int planetSize, int range, IBlockState surface, World worldIn, Random rand, int offsetX, int offsetY, int offsetZ, BlockPos position) {
		return true;
	}

	public boolean generateRandomStar(int planetSize, World worldIn, Random rand, int offsetX, int offsetY, int offsetZ, BlockPos position) {
		return true;
	}

	public boolean generate(World worldIn, Random rand, int offsetX, int offsetY, int offsetZ, BlockPos position, boolean useSpawnReqs) {
		return true;
	}

	public boolean generate(IBlockState state, IBlockState state2, World world, Random rand, int offsetX, int offsetY, int offsetZ, BlockPos blockPos, boolean useSpawnReqs) {
		return true;
	}

	public boolean generate(int range, Entity entityToSpawn, TextFormatting color, World world, Random rand, int offsetX, int offsetY, int offsetZ, BlockPos blockPos, boolean useSpawnReqs) {
		return true;
	}

	protected void setBlockAndNotifyAdequately(World worldIn, BlockPos pos, IBlockState state) {
		if (doBlockNotify) {
			worldIn.setBlockState(pos, state, 3);
		} else {
			worldIn.setBlockState(pos, state, 2);
		}
	}

	public void setDecorationDefaults() {
	}

	public void clear(World world, Random rand, int offsetX, int offsetY, int offsetZ, BlockPos position) {
	}

	protected void setTileEntityBlock(World world, BlockPos pos, IBlockState state, TileEntity te) {
		world.setBlockState(pos, state);
		te.validate();
		world.setTileEntity(pos, te);
	}

	protected void setLockableLoot(World world, BlockPos pos, ResourceLocation lootTable) {
		if (world.getTileEntity(pos) instanceof TileEntityLockableLoot) {
			TileEntityLockableLoot te = (TileEntityLockableLoot) world.getTileEntity(pos);
			te.setLootTable(lootTable, 0);
		}
	}
}
