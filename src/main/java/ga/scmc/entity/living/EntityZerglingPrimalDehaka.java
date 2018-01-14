package ga.scmc.entity.living;

import java.util.Random;

import com.arisux.mdx.lib.world.entity.ItemDrop;
import com.google.common.base.Predicate;

import ga.scmc.capabilities.ColorProvider;
import ga.scmc.capabilities.IColor;
import ga.scmc.enums.EnumFactionTypes;
import ga.scmc.enums.EnumMetaItem;
import ga.scmc.enums.EnumTeamColors;
import ga.scmc.enums.EnumTypeAttributes;
import ga.scmc.handlers.ItemHandler;
import ga.scmc.handlers.SoundHandler;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureType;
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
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

/**
 * @author Hypeirochus
 */
public class EntityZerglingPrimalDehaka extends EntityZergMob implements IMob, Predicate<EntityLivingBase> {

	public EntityZerglingPrimalDehaka(World world) {
		super(world);
		setSize(1.0F, 1.0F);
		this.setTeamColor(EnumTeamColors.CYAN);
		this.setFactions(EnumFactionTypes.PRIMALZERG);
		this.setTypes(EnumTypeAttributes.LIGHT, EnumTypeAttributes.BIOLOGICAL, EnumTypeAttributes.GROUND);
		experienceValue = 23;
		this.baseHealth = 25;
		tasks.addTask(0, new EntityAISwimming(this));
		tasks.addTask(1, new EntityAIAttackMelee(this, 1.0D, false));
		tasks.addTask(2, new EntityAIWander(this, 1.0D));
		tasks.addTask(3, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
		tasks.addTask(4, new EntityAILookIdle(this));
		targetTasks.addTask(1, new EntityAIHurtByTarget(this, true));
		targetTasks.addTask(2, new EntityAINearestAttackableTarget<EntityLivingBase>(this, EntityLivingBase.class, 0,
				false, false, this));
	}

	@Override
	public boolean apply(EntityLivingBase entity) {
		if (!entity.isInvisible()) {
			if (entity instanceof EntityStarcraftMob) {
				if (entity.isCreatureType(EnumCreatureType.MONSTER, false)) {
					if (!((EntityStarcraftMob) entity).isFaction(EnumFactionTypes.PRIMALZERG)) {
						if (((EntityStarcraftMob) entity).getTeamColor() != this.getTeamColor()) {
							return true;
						} else {
							return false;
						}
					} else if (((EntityStarcraftMob) entity).getTeamColor() != this.getTeamColor()) {
						return true;
					}
				}
			} else if (entity instanceof EntityStarcraftPassive) {
				if (entity.isCreatureType(EnumCreatureType.CREATURE, false)) {
					if (!((EntityStarcraftPassive) entity).isFaction(EnumFactionTypes.PRIMALZERG)) {
						if (((EntityStarcraftPassive) entity).getTeamColor() != this.getTeamColor()) {
							return true;
						} else {
							return false;
						}
					} else if (((EntityStarcraftPassive) entity).getTeamColor() != this.getTeamColor()) {
						return true;
					}
				}
			}else if(entity instanceof EntityPlayer) {
				IColor color = ((EntityPlayer) entity).getCapability(ColorProvider.COLOR, null);
				if(color.getColor() == this.getTeamColor().getId()) {
					return false;
				}else {
					return true;
				}
			} else {
				return true;
			}
		} else if (entity.isInvisible() && this.isType(EnumTypeAttributes.DETECTOR)) {
			return true;
		} else {
			return false;
		}
		return false;
	}

	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(25.0D);
		getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.3304D);
		getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(16.0D);
		getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(5.0D);
	}

	@Override
	protected void dropFewItems(boolean recentlyHit, int looting) {
		ItemDrop drop = new ItemDrop(10, new ItemStack(ItemHandler.ZERG_CARAPACE, 1 + this.rand.nextInt(2),
				EnumMetaItem.CarapaceType.T1.getID()));
		drop.tryDrop(this);
	}

	@Override
	public SoundEvent getAmbientSound() {
		Random rand = new Random();

		switch (rand.nextInt(3)) {
		case 0:
			return SoundHandler.ENTITY_ZERGLING_LIVE1;
		case 1:
			return SoundHandler.ENTITY_ZERGLING_LIVE2;
		case 2:
			return SoundHandler.ENTITY_ZERGLING_LIVE3;
		default:
			return SoundHandler.ENTITY_ZERGLING_LIVE4;
		}
	}

	@Override
	public SoundEvent getDeathSound() {
		return SoundHandler.ENTITY_ZERGLING_DEATH;
	}

	@Override
	public SoundEvent getHurtSound() {
		return SoundHandler.ENTITY_ZERGLING_HURT;
	}

	@Override
	public int getTalkInterval() {
		return 160;
	}
}