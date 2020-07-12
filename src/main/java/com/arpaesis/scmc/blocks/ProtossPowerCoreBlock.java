package com.arpaesis.scmc.blocks;

import com.arpaesis.scmc.tileentity.TileEntityProtossPowerCore;

import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.rom.block.RegistryType;

public class ProtossPowerCoreBlock extends SCProtossCoreBlock implements ITileEntityProvider
{

	public ProtossPowerCoreBlock(String name, Material material, MapColor color)
	{
		super(name, RegistryType.FULL, material, color);
	}

	@Override
	public TileEntity createNewTileEntity(World world, int meta)
	{
		return new TileEntityProtossPowerCore();
	}
}