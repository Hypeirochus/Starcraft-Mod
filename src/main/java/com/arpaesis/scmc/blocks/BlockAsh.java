package com.arpaesis.scmc.blocks;

import com.arpaesis.scmc.creativetabs.SCCreativeTabs;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

/**
 * Ash block. Thin layer of ash that generates commonly on Char.<br>
 * Copyright 2017 the Starcraft Minecraft mod team
 * 
 * @author Hypeirochus
 */
public class BlockAsh extends SCBlockLayered
{

	public BlockAsh()
	{
		super("char.ash", Material.CARPET, MapColor.BLACK);
		setSoundType(SoundType.SAND);
		setHardness(0.2F);
		setResistance(0.16f);
		setHarvestLevel("shovel", -1);
		setCreativeTab(SCCreativeTabs.MISC);
	}
}