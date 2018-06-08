package com.hypeirochus.scmc.entity.living;

import com.hypeirochus.scmc.entity.IShieldEntity;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class EntityProtossPassive extends EntityStarcraftPassive implements IShieldEntity {

	public static final DataParameter<Float> SHIELDS = EntityDataManager.createKey(EntityProtossPassive.class, DataSerializers.FLOAT);
	public int timeSinceHurt = 0;
	
	public EntityProtossPassive(World world) {
		super(world);
	}

	@Override
	protected void entityInit() {
		this.getDataManager().register(SHIELDS, this.getMaxShields());
		super.entityInit();
	}
	
	@Override
	public EntityAgeable createChild(EntityAgeable entity) {
		return null;
	}

	@Override
	public boolean getCanSpawnHere() {
		return true;
	}
	
	public float getShields() {
		return this.getDataManager().get(SHIELDS);
	}

	protected void setShields(float shield) {
		this.getDataManager().set(SHIELDS, shield);
	}
	
	@Override
	public boolean attackEntityFrom(DamageSource source, float amount) {
		if(this.getShields() > 0) {
			this.setShields(this.getShields() - amount);
			this.timeSinceHurt = this.ticksExisted;
			if(this.getShields() < 0) {
				amount = -this.getShields();
				this.setShields(0);
				return super.attackEntityFrom(source, amount);
			}
			return false;
		}
		return super.attackEntityFrom(source, amount);
	}
	
	@Override
	public void onLivingUpdate() {
		if(!this.world.isRemote) {
			if(this.getShields() < this.getMaxShields() && this.ticksExisted % 20 == 0 && (this.ticksExisted - this.timeSinceHurt)/20 > 10) {
				
				this.setShields(this.getShields() + 2);
				
				if(this.getShields() > this.getMaxShields()) {
					
					this.setShields(this.getMaxShields());
				}
			}
		}
		super.onLivingUpdate();
	}
	
	@Override
	protected void damageEntity(DamageSource damageSrc, float damageAmount) {
		timeSinceHurt = this.ticksExisted;
		super.damageEntity(damageSrc, damageAmount);
	}

	@Override
	public float getMaxShields() {
		return 0;
	}
}