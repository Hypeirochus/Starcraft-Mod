package com.arpaesis.scmc.items;

import com.arpaesis.scmc.blocks.metablocks.BlockKhaydarinCrystal;
import com.arpaesis.scmc.blocks.metablocks.BlockKhaydarinCrystal.PylonCrystalType;
import com.arpaesis.scmc.creativetabs.SCCreativeTabs;
import com.arpaesis.scmc.handlers.IMetaRenderHandler;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

/**
 * <em><b>Copyright (c) 2018 The Starcraft Minecraft (SCMC) Mod Team.</b></em>
 * <br>
 * </br>
 * 
 * @author Ocelot5836
 */
public class ItemKhaydarinCrystal extends SCItem implements IMetaRenderHandler
{

	public ItemKhaydarinCrystal()
	{
		super("protoss.khaydarincrystal");
		setHasSubtypes(true);
		setCreativeTab(SCCreativeTabs.PROTOSS);
	}

	@Override
	public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> items)
	{
		if (this.isInCreativeTab(tab))
		{
			for (int i = 0; i < BlockKhaydarinCrystal.PylonCrystalType.values().length; i++)
			{
				items.add(new ItemStack(this, 1, i));
			}
		}
	}

	@Override
	public String getTranslationKey(ItemStack stack)
	{
		for (int i = 0; i < BlockKhaydarinCrystal.PylonCrystalType.values().length; i++)
		{
			if (stack.getItemDamage() == i)
			{
				return getTranslationKey() + "." + BlockKhaydarinCrystal.PylonCrystalType.values()[i].getName();
			} else
			{
				continue;
			}
		}
		return getTranslationKey() + "." + PylonCrystalType.PURE.getName();
	}

	@Override
	public int getItemCount()
	{
		return BlockKhaydarinCrystal.PylonCrystalType.values().length;
	}

	@Override
	public String getName(int meta)
	{
		return "protoss.khaydarincrystal." + BlockKhaydarinCrystal.PylonCrystalType.values()[meta].getName();
	}
}