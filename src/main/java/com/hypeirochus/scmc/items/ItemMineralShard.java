package com.hypeirochus.scmc.items;

import com.hypeirochus.scmc.creativetabs.StarcraftCreativeTabs;
import com.hypeirochus.scmc.enums.MetaHandler.MineralType;
import com.hypeirochus.scmc.handlers.IMetaRenderHandler;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

public class ItemMineralShard extends StarcraftItem implements IMetaRenderHandler {

	public ItemMineralShard() {
		super("mineral");
		setCreativeTab(StarcraftCreativeTabs.MISC);
		setHasSubtypes(true);
	}

	@Override
	public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> items) {
		if (this.isInCreativeTab(tab)) {
			for (int i = 0; i < MineralType.values().length; i++) {
				items.add(new ItemStack(this, 1, i));
			}
		}
	}

	@Override
	public String getUnlocalizedName(ItemStack stack) {
		for (int i = 0; i < MineralType.values().length; i++) {
			if (stack.getItemDamage() == i) {
				return getUnlocalizedName() + "." + MineralType.values()[i].getName();
			} else {
				continue;
			}
		}
		return getUnlocalizedName() + "." + MineralType.BLUE.getName();
	}

	@Override
	public int getItemCount() {
		return MineralType.values().length;
	}

	@Override
	public String getName(int meta) {
		return "mineral." + MineralType.values()[meta].getName();
	}
}