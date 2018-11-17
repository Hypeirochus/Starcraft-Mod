package com.arpaesis.scmc.items;

import com.arpaesis.api.world.entity.player.inventory.Inventories;
import com.arpaesis.scmc.creativetabs.SCCreativeTabs;
import com.arpaesis.scmc.enums.MetaHandler;
import com.arpaesis.scmc.handlers.AccessHandler;
import com.arpaesis.scmc.handlers.ItemHandler;
import com.ocelot.api.utils.InventoryUtils;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class ItemFlamethrower extends ItemGun
{

	public ItemFlamethrower()
	{
		super("terran.flamethrower", 8, 15);
		setFull3D();
		setMaxStackSize(1);
		setCreativeTab(SCCreativeTabs.TERRAN);
	}

	@Override
	public void onFire(World world, EntityLivingBase entity, ItemStack heldItem)
	{
		world.playSound(null, entity.getPosition().getX(), entity.getPosition().getY(), entity.getPosition().getZ(), SoundEvents.BLOCK_LAVA_EXTINGUISH, SoundCategory.PLAYERS, 0.25f, 1f);
		Vec3d look = entity.getLook(AccessHandler.getPartialTicks());

		if (world.isRemote)
		{
			Minecraft.getMinecraft().addScheduledTask(() ->
			{
				for (int i = 0; i < this.getGunRange(heldItem); i++)
				{
					world.spawnParticle(EnumParticleTypes.FLAME, entity.posX + i * look.x, entity.posY + entity.getEyeHeight() + i * look.y, entity.posZ + i * look.z, 0, 0, 0, new int[0]);
				}
			});
		}
	}

	@Override
	public void hitEntity(World world, EntityLivingBase entity, Entity hitEntity, ItemStack heldItem)
	{
		hitEntity.setFire(5);
	}

	@Override
	public void hitBlock(World world, EntityLivingBase entity, BlockPos pos, EnumFacing facing, ItemStack heldItem)
	{
		if (!world.isRemote)
		{
			pos = pos.offset(facing);
			if (!(entity instanceof EntityPlayer) || entity instanceof EntityPlayer && ((EntityPlayer) entity).canPlayerEdit(pos, facing, heldItem))
			{
				if (world.isAirBlock(pos))
				{
					world.setBlockState(pos, Blocks.FIRE.getDefaultState(), 11);
				}
			}
		}
	}

	@Override
	public boolean hasAmmo(World world, EntityPlayer player, ItemStack stack)
	{
		if (Inventories.playerHas(getAmmo(), player))
		{
			ItemStack ammoStack = player.inventory.mainInventory.get(InventoryUtils.getItemSlot(player, getAmmo(), MetaHandler.BulletMagazineType.FLAMETHROWER.getID()));

			if (ammoStack != null && ammoStack.getItem() != null && ammoStack.getMetadata() == MetaHandler.BulletMagazineType.FLAMETHROWER.getID() && ammoStack.hasTagCompound())
			{
				NBTTagCompound nbt = ammoStack.getTagCompound();
				return nbt.getInteger("BulletCount") >= 1;
			}
		}
		return false;
	}

	@Override
	public void takeAmmo(World world, EntityPlayer player, ItemStack stack)
	{
		ItemStack ammoStack = player.inventory.mainInventory.get(InventoryUtils.getItemSlot(player, getAmmo(), MetaHandler.BulletMagazineType.FLAMETHROWER.getID()));

		if (ammoStack != null && ammoStack.getItem() != null && ammoStack.getMetadata() == MetaHandler.BulletMagazineType.FLAMETHROWER.getID() && ammoStack.hasTagCompound())
		{
			NBTTagCompound nbt = ammoStack.getTagCompound();
			if (nbt.getInteger("BulletCount") >= 1)
			{
				nbt.setInteger("BulletCount", nbt.getInteger("BulletCount") - 1);
			}
		}
	}

	public Item getAmmo()
	{
		return ItemHandler.BULLET_MAGAZINE;
	}
}