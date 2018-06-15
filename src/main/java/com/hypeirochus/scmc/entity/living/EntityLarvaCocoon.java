package com.hypeirochus.scmc.entity.living;

import com.hypeirochus.scmc.Starcraft;
import com.hypeirochus.scmc.client.gui.GuiLarvaProgress;
import com.hypeirochus.scmc.enums.EnumColors;
import com.hypeirochus.scmc.enums.EnumFactionTypes;
import com.hypeirochus.scmc.enums.EnumTypeAttributes;
import com.hypeirochus.scmc.handlers.GuiHandler;
import com.hypeirochus.scmc.handlers.SoundHandler;
import com.hypeirochus.scmc.lib.Library;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.passive.EntityOcelot;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class EntityLarvaCocoon extends EntityZergPassive {

	/**
	 * This is the entity that this guy will hatch into. It's saved in a byte id because we only need about 15
	 */
	private int transformId;

	protected IMorphResult outEntity;

	public EntityLarvaCocoon(World world) {
		this(world, 0);
	}

	public EntityLarvaCocoon(World world, int id) {
		super(world);
		this.setSize(1.0F, 1.0F);
		this.transformId = id;
		this.setColor(EnumColors.PURPLE);
		this.setFactions(EnumFactionTypes.SWARM);
		this.setTypes(EnumTypeAttributes.BIOLOGICAL, EnumTypeAttributes.GROUND);

		outEntity = getEntityById(world, id);
	}

	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(133.0D);
		getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0);
		getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(20.0D);
	}

	@Override
	public EntityAgeable createChild(EntityAgeable entity) {
		return null;
	}

	@Override
	public SoundEvent getAmbientSound() {
		return SoundHandler.ENTITY_ZERGCOCOON_LIVE1;
	}

	@Override
	public SoundEvent getDeathSound() {
		return SoundHandler.ENTITY_ZERGCOCOON_DEATH;
	}

	@Override
	public SoundEvent getHurtSound(DamageSource source) {
		return SoundHandler.ENTITY_ZERGCOCOON_HURT;
	}

	@Override
	public int getTalkInterval() {
		return 160;
	}

	@Override
	public boolean isPushedByWater() {
		return false;
	}

	@Override
	protected void updateAITasks() {
		if (ticksExisted > getTransformTime()) {
			if (outEntity instanceof EntityStarcraftMob) {
				Library.replaceEntity(true, this, ((EntityStarcraftMob) outEntity).setColor(teamColor));
			} else if (outEntity instanceof EntityStarcraftPassive) {
				Library.replaceEntity(true, this, ((EntityStarcraftPassive) outEntity).setColor(teamColor));
			} else {
				Library.replaceEntity(true, this, (Entity) outEntity);
			}
			// TODO add a hatchind sound right here
		}
	}

	@Override
	public boolean processInteract(EntityPlayer player, EnumHand hand) {
		ItemStack stack = player.getHeldItem(hand);
		boolean flag = stack.getItem() == Items.SPAWN_EGG;

		if (!flag && this.isEntityAlive() && !this.isChild() && !player.isSneaking()) {
			if (this.world.isRemote) {
				GuiLarvaProgress.INSTANCE.openGUI(player, Starcraft.instance, GuiHandler.LARVA_PROGRESS_ID, world, (int) player.posX, (int) player.posY, (int) player.posZ, this);
			}
			return true;
		} else {
			return super.processInteract(player, hand);
		}
	}

	// @Override
	// public void move(double x, double y, double z) {
	// if (noClip) {
	// setEntityBoundingBox(getEntityBoundingBox().offset(x, y, z));
	// resetPositionToBB();
	// } else {
	// world.profiler.startSection("move");
	// if (isInWeb) {
	// isInWeb = false;
	// x *= 0.25D;
	// y *= 0.05000000074505806D;
	// z *= 0.25D;
	// motionX = 0.0D;
	// motionY = 0.0D;
	// motionZ = 0.0D;
	// }
	//
	// double d3 = x;
	// double d4 = y;
	// double d5 = z;
	//
	// List<AxisAlignedBB> list1 = world.getCollisionBoxes(this, getEntityBoundingBox().addCoord(x, y, z));
	// AxisAlignedBB axisalignedbb = getEntityBoundingBox();
	// int i = 0;
	//
	// for (int j = list1.size(); i < j; ++i) {
	// y = list1.get(i).calculateYOffset(getEntityBoundingBox(), y);
	// }
	//
	// setEntityBoundingBox(getEntityBoundingBox().offset(0.0D, y, 0.0D));
	// boolean i_ = onGround || d4 != y && d4 < 0.0D;
	// int j4 = 0;
	//
	// for (int k = list1.size(); j4 < k; ++j4) {
	// x = list1.get(j4).calculateXOffset(getEntityBoundingBox(), x);
	// }
	//
	// setEntityBoundingBox(getEntityBoundingBox().offset(x, 0.0D, 0.0D));
	// j4 = 0;
	//
	// for (int k4 = list1.size(); j4 < k4; ++j4) {
	// z = list1.get(j4).calculateZOffset(getEntityBoundingBox(), z);
	// }
	//
	// setEntityBoundingBox(getEntityBoundingBox().offset(0.0D, 0.0D, z));
	//
	// if (stepHeight > 0.0F && i_ && (d3 != x || d5 != z)) {
	// double d11 = x;
	// double d7 = y;
	// double d8 = z;
	// AxisAlignedBB axisalignedbb1 = getEntityBoundingBox();
	// setEntityBoundingBox(axisalignedbb);
	// y = stepHeight;
	// List<AxisAlignedBB> list = world.getCollisionBoxes(this, getEntityBoundingBox().addCoord(d3, y, d5));
	// AxisAlignedBB axisalignedbb2 = getEntityBoundingBox();
	// AxisAlignedBB axisalignedbb3 = axisalignedbb2.addCoord(d3, 0.0D, d5);
	// double d9 = y;
	// int l = 0;
	//
	// for (int i1 = list.size(); l < i1; ++l) {
	// d9 = list.get(l).calculateYOffset(axisalignedbb3, d9);
	// }
	//
	// axisalignedbb2 = axisalignedbb2.offset(0.0D, d9, 0.0D);
	// double d15 = d3;
	// int j1 = 0;
	//
	// for (int k1 = list.size(); j1 < k1; ++j1) {
	// d15 = list.get(j1).calculateXOffset(axisalignedbb2, d15);
	// }
	//
	// axisalignedbb2 = axisalignedbb2.offset(d15, 0.0D, 0.0D);
	// double d16 = d5;
	// int l1 = 0;
	//
	// for (int i2 = list.size(); l1 < i2; ++l1) {
	// d16 = list.get(l1).calculateZOffset(axisalignedbb2, d16);
	// }
	//
	// axisalignedbb2 = axisalignedbb2.offset(0.0D, 0.0D, d16);
	// AxisAlignedBB axisalignedbb4 = getEntityBoundingBox();
	// double d17 = y;
	// int j2 = 0;
	//
	// for (int k2 = list.size(); j2 < k2; ++j2) {
	// d17 = list.get(j2).calculateYOffset(axisalignedbb4, d17);
	// }
	//
	// axisalignedbb4 = axisalignedbb4.offset(0.0D, d17, 0.0D);
	// double d18 = d3;
	// int l2 = 0;
	//
	// for (int i3 = list.size(); l2 < i3; ++l2) {
	// d18 = list.get(l2).calculateXOffset(axisalignedbb4, d18);
	// }
	//
	// axisalignedbb4 = axisalignedbb4.offset(d18, 0.0D, 0.0D);
	// double d19 = d5;
	// int j3 = 0;
	//
	// for (int k3 = list.size(); j3 < k3; ++j3) {
	// d19 = list.get(j3).calculateZOffset(axisalignedbb4, d19);
	// }
	//
	// axisalignedbb4 = axisalignedbb4.offset(0.0D, 0.0D, d19);
	// double d20 = d15 * d15 + d16 * d16;
	// double d10 = d18 * d18 + d19 * d19;
	//
	// if (d20 > d10) {
	// x = d15;
	// z = d16;
	// y = -d9;
	// setEntityBoundingBox(axisalignedbb2);
	// } else {
	// x = d18;
	// z = d19;
	// y = -d17;
	// setEntityBoundingBox(axisalignedbb4);
	// }
	//
	// int l3 = 0;
	//
	// for (int i4 = list.size(); l3 < i4; ++l3) {
	// y = list.get(l3).calculateYOffset(getEntityBoundingBox(), y);
	// }
	//
	// setEntityBoundingBox(getEntityBoundingBox().offset(0.0D, y, 0.0D));
	//
	// if (d11 * d11 + d8 * d8 >= x * x + z * z) {
	// x = d11;
	// y = d7;
	// z = d8;
	// setEntityBoundingBox(axisalignedbb1);
	// }
	// }
	//
	// world.profiler.endSection();
	// world.profiler.startSection("rest");
	// resetPositionToBB();
	// isCollidedHorizontally = d3 != x || d5 != z;
	// isCollidedVertically = d4 != y;
	// onGround = isCollidedVertically && d4 < 0.0D;
	// isCollided = isCollidedHorizontally || isCollidedVertically;
	// j4 = MathHelper.floor(posX);
	// int l4 = MathHelper.floor(posY - 0.20000000298023224D);
	// int i5 = MathHelper.floor(posZ);
	// BlockPos blockpos = new BlockPos(j4, l4, i5);
	// IBlockState iblockstate = world.getBlockState(blockpos);
	//
	// if (iblockstate.getMaterial() == Material.AIR) {
	// BlockPos blockpos1 = blockpos.down();
	// IBlockState iblockstate1 = world.getBlockState(blockpos1);
	// Block block1 = iblockstate1.getBlock();
	//
	// if (block1 instanceof BlockFence || block1 instanceof BlockWall || block1 instanceof BlockFenceGate) {
	// iblockstate = iblockstate1;
	// blockpos = blockpos1;
	// }
	// }
	//
	// updateFallState(y, onGround, iblockstate, blockpos);
	//
	// if (d3 != x) {
	// motionX = 0.0D;
	// }
	//
	// if (d5 != z) {
	// motionZ = 0.0D;
	// }
	//
	// Block block = iblockstate.getBlock();
	//
	// if (d4 != y) {
	// block.onLanded(world, this);
	// }
	//
	// try {
	// doBlockCollisions();
	// } catch (Throwable throwable) {
	// CrashReport crashreport = CrashReport.makeCrashReport(throwable, "Checking entity block collision");
	// CrashReportCategory crashreportcategory = crashreport.makeCategory("Entity being checked for collision");
	// addEntityCrashInfo(crashreportcategory);
	// throw new ReportedException(crashreport);
	// }
	//
	// world.profiler.endSection();
	// }
	// }

	@Override
	protected void setRotation(float par1, float par2) {
		rotationYaw = 0;
		rotationPitch = 0;
	}

	public int getTransformId() {
		return transformId;
	}

	public int getTransformTime() {
		return outEntity.getMorphTime();
	}

	public static IMorphResult getEntityById(World world, int id) {
		switch (id) {
		default:
		case 0:
		//	return new EntityOcelot(world);
		case 2:
			return new EntityZergling(world);
		case 3:
			return new EntityZerglingSwarmling(world);
		case 4:
			return new EntityZerglingRaptor(world);
		case 9:
			return new EntityHydralisk(world);
		}
	}
}