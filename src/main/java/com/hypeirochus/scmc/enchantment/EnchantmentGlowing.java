package com.hypeirochus.scmc.enchantment;

import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.inventory.EntityEquipmentSlot;

public class EnchantmentGlowing extends StarcraftEnchantment {

	public EnchantmentGlowing() {
		super("glowing", Rarity.RARE, EnumEnchantmentType.ALL, EntityEquipmentSlot.values());
	}
}