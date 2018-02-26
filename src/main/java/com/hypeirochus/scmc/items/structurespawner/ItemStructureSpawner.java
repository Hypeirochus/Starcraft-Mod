package com.hypeirochus.scmc.items.structurespawner;

import java.util.Random;

import com.hypeirochus.scmc.items.IMetaRenderHandler;
import com.hypeirochus.scmc.items.StarcraftItem;
import com.hypeirochus.scmc.worldgen.structure.SCWorldGenerator;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.NonNullList;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

/**
 * <em><b>Copyright (c) 2018 The Starcraft Minecraft (SCMC) Mod Team.</b></em>
 * 
 * <br>
 * </br>
 * 
 * The base for all structure spawns for each race.
 * 
 * @author Ocelot5836
 */
public abstract class ItemStructureSpawner extends StarcraftItem implements IMetaRenderHandler {

	public ItemStructureSpawner(String name) {
		super(name);
		setHasSubtypes(true);
		setMaxStackSize(1);
	}

	@Override
	public EnumActionResult onItemUse(EntityPlayer player, World world, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
		ItemStack heldItem = player.getHeldItem(hand);
		SCWorldGenerator structure = this.getStructure(heldItem.getMetadata());
		Random rand = new Random();
		structure.generate(-1, -1, world, rand, 0, 0, 0, pos, false);
		if (this.getSpawnSound(heldItem.getMetadata()) != null)
			world.playSound(pos.getX(), pos.getY(), pos.getZ(), this.getSpawnSound(heldItem.getMetadata()), null, 0.7F, 1F, false);
		return super.onItemUse(player, world, pos, hand, facing, hitX, hitY, hitZ);
	}

	@Override
	public abstract void getSubItems(CreativeTabs tab, NonNullList<ItemStack> items);

	@Override
	public abstract String getUnlocalizedName(ItemStack stack);

	public abstract SCWorldGenerator getStructure(int meta);

	public SoundEvent getSpawnSound(int meta) {
		return null;
	}

	public SoundEvent getSpawnSound() {
		return this.getSpawnSound(0);
	}
}