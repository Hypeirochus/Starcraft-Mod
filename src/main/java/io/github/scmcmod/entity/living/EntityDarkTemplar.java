package io.github.scmcmod.entity.living;

import com.google.common.base.Predicate;


import io.github.scmcmod.entity.IShieldEntity;
import io.github.scmcmod.enums.EnumColors;
import io.github.scmcmod.enums.EnumFactionTypes;
import io.github.scmcmod.enums.EnumTypeAttributes;
import io.github.scmcmod.enums.MetaHandler;
import io.github.scmcmod.handlers.ItemHandler;
import io.github.scmcmod.handlers.SoundHandler;
import io.github.scmcmod.handlers.WeaponHandler;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackMelee;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class EntityDarkTemplar extends EntityProtossMob implements IMob, Predicate<EntityLivingBase>, IShieldEntity
{

	private static final DataParameter<Boolean> SHEATH = EntityDataManager.createKey(EntityDarkTemplar.class, DataSerializers.BOOLEAN);

	public EntityDarkTemplar(World world)
	{
		super(world);
		setSize(1.0F, 2.9F);
		this.setColor(EnumColors.LIGHT_BLUE);
		this.setFactions(EnumFactionTypes.DAELAAM);
		setAttributes(EnumTypeAttributes.LIGHT, EnumTypeAttributes.BIOLOGICAL, EnumTypeAttributes.GROUND, EnumTypeAttributes.PSIONIC);
		this.initEntityAI();
	}

	@Override
	protected void initEntityAI()
	{
		tasks.addTask(0, new EntityAISwimming(this));
		tasks.addTask(1, new EntityAIAttackMelee(this, 1.0D, false));
		tasks.addTask(2, new EntityAIWander(this, 1.0D));
		tasks.addTask(3, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
		tasks.addTask(4, new EntityAILookIdle(this));
		targetTasks.addTask(1, new EntityAIHurtByTarget(this, true));
		targetTasks.addTask(2, new EntityAINearestAttackableTarget<EntityLivingBase>(this, EntityLivingBase.class, 0, false, false, this));
		super.initEntityAI();
	}

	@Override
	protected void entityInit()
	{
		super.entityInit();

		this.getDataManager().register(SHEATH, false);
	}

	public boolean canSheathBlades()
	{
		return this.getDataManager().get(SHEATH);
	}

	protected void setSheathed(boolean bool)
	{
		this.getDataManager().set(SHEATH, bool);
	}

	/**
	 * The method where this entity handles checks to make sure it can attack the
	 * target.
	 */
	@Override
	public boolean apply(EntityLivingBase entity)
	{
		return checkTarget(entity, EnumFactionTypes.DAELAAM);
	}

	@Override
	protected void applyEntityAttributes()
	{
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(27.0D);
		getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.39000000417232513);
		getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(16.0D);
		getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(25.0D);
		getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(2.0D);
	}

	@Override
	public boolean attackEntityAsMob(Entity entityIn)
	{
		this.playSound(SoundHandler.FX_WARPBLADE_ATTACK, 1.0F, 1.0F);
		return super.attackEntityAsMob(entityIn);
	}

	@Override
	protected void dropFewItems(boolean recentlyHit, int looting)
	{
		ItemDrop drop = new ItemDrop(50, new ItemStack(ItemHandler.ENERGY, 1 + this.rand.nextInt(2), MetaHandler.EnergyType.CORRUPTED.getID()));
		ItemDrop drop2 = new ItemDrop(1, new ItemStack(WeaponHandler.DARK_WARP_BLADE));
		drop.tryDrop(this);
		drop2.tryDrop(this);
	}

	@Override
	public SoundEvent getAmbientSound()
	{
		if (rand.nextInt(1) == 0)
			return SoundHandler.ENTITY_DARKTEMPLAR_LIVE1;

		return SoundHandler.ENTITY_DARKTEMPLAR_LIVE2;
	}

	@Override
	public SoundEvent getDeathSound()
	{
		return SoundHandler.ENTITY_DARKTEMPLAR_DEATH;
	}

	@Override
	public SoundEvent getHurtSound(DamageSource source)
	{
		return SoundHandler.ENTITY_DARKTEMPLAR_HURT;
	}

	@Override
	public int getTalkInterval()
	{
		return 160;
	}

	@Override
	public void onUpdate()
	{
		if (!world.isRemote)
		{
			if (this.getAttackTarget() != null)
			{
				this.setSheathed(true);
			} else if (this.getAttackTarget() == null)
			{
				this.setSheathed(false);
			}
		}
		super.onUpdate();
	}

	@Override
	public void setAttackTarget(EntityLivingBase entitylivingbaseIn)
	{
		if (entitylivingbaseIn != null && (int) this.getDistance(entitylivingbaseIn) < 16)
		{
			this.setSheathed(true);
		}
		super.setAttackTarget(entitylivingbaseIn);
	}

	@Override
	public boolean attackEntityFrom(DamageSource source, float amount)
	{
		this.setSheathed(true);
		return super.attackEntityFrom(source, amount);
	}

	@Override
	public float getMaxShields()
	{
		return 53.0F;
	}
}
