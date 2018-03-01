package com.hypeirochus.scmc.blocks;

import com.hypeirochus.scmc.creativetabs.StarcraftCreativeTabs;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

/**
 * Dark Protoss Energy Stabilizer block.<br>
 * Copyright 2017 the Starcraft Minecraft mod team
 * 
 * @author Hypeirochus
 */
public class BlockProtossEnergyStabilizerDark extends StarcraftBlock {

	public BlockProtossEnergyStabilizerDark() {
		super("protoss.stabilizer.dark",RegistryType.FULL,Material.IRON, MapColor.BLACK);
		setSoundType(SoundType.METAL);
		setHardness(15.0F);
		setLightLevel(1.0F);
		setResistance(15.0F);
		setTickRandomly(true);
		setHarvestLevel("pickaxe", 3);
		setCreativeTab(StarcraftCreativeTabs.PROTOSS);
	}
}
