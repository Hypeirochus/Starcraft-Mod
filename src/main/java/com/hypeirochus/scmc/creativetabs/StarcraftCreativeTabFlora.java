package com.hypeirochus.scmc.creativetabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class StarcraftCreativeTabFlora extends CreativeTabs {

	public StarcraftCreativeTabFlora() {
		super("flora");
		// setBackgroundImageName("item_search.png");
	}

	@Override
	public ItemStack getTabIconItem() {
		// return ItemHandler.FLORA_ZERUS_GLOW_POD;
		return ItemStack.EMPTY;
	}
}