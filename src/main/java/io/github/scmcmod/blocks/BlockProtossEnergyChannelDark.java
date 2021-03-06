package io.github.scmcmod.blocks;

import java.util.Random;

import io.github.scmcmod.creativetabs.SCCreativeTabs;
import io.github.scmcmod.handlers.ItemHandler;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.rom.block.BlockGeneric;
import net.rom.block.RegistryType;

/**
 * Dark Protoss Energy Channel block.<br>
 * Copyright 2017 the Starcraft Minecraft (SCMC) mod team
 * 
 * @author Hypeirochus
 */
public class BlockProtossEnergyChannelDark extends BlockGeneric
{

	public BlockProtossEnergyChannelDark()
	{
		super(Material.IRON, MapColor.BLACK);
		setSoundType(SoundType.METAL);
		setHardness(15.0F);
		setLightLevel(1.0F);
		setResistance(15.0F);
		setTickRandomly(true);
		setHarvestLevel("pickaxe", 3);
		setCreativeTab(SCCreativeTabs.PROTOSS);
	}

	/**
	 * Gets the state of the block being dropped
	 * 
	 * @param state the state of the block
	 */
	@Override
	public int damageDropped(IBlockState state)
	{
		return 2;
	}

	/**
	 * Returns the item dropped by this block
	 * 
	 * @param state the state of the block
	 * @param rand an object of the Random class
	 * @param fortune the magnitude of the fortune enchantment effect
	 */
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
	{
		return ItemHandler.ENERGY;
	}
}
