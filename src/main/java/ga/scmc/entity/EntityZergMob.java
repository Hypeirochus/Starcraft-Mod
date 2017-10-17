package ga.scmc.entity;

import java.util.ArrayList;

import ga.scmc.entity.living.EntityZerglingSC2;
import ga.scmc.handlers.ConfigurationHandler;
import ga.scmc.handlers.ItemHandler;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.world.World;

public class EntityZergMob extends EntityStarcraftMob {

	private static final DataParameter<Integer> BIOMASS = EntityDataManager.createKey(EntityZerglingSC2.class,
			DataSerializers.VARINT);
	public int baseHealth;
	
	public EntityZergMob(World world) {
		super(world);
	}
	
	@Override
	public boolean getCanSpawnHere() {
		if(this.world.provider.getDimension() == ConfigurationHandler.INT_DIMENSION_CHAR) {
			return true;
		}
		return false;
	}
	
	@Override
	protected void entityInit() {
		super.entityInit();
		this.getDataManager().register(BIOMASS, 0);
	}

	@Override
	public void writeEntityToNBT(NBTTagCompound nbt) {
		super.writeEntityToNBT(nbt);

		nbt.setInteger("Biomass", this.getColor());
	}

	@Override
	public void readEntityFromNBT(NBTTagCompound nbt) {
		super.readEntityFromNBT(nbt);

		this.setColor(nbt.getInteger("Biomass"));
	}

	public int getColor() {
		return this.getDataManager().get(BIOMASS);
	}

	public void setColor(int amount) {
		this.getDataManager().set(BIOMASS, amount);
	}
	
	protected void findBiomass() {
		if (!this.world.isRemote && this.world.getWorldTime() % 40 == 0) {
			ArrayList<EntityItem> entityItemList = (ArrayList<EntityItem>) world.getEntitiesWithinAABB(EntityItem.class,
					this.getEntityBoundingBox().expand(8, 8, 8));

			for (EntityItem entityItem : entityItemList) {
				if (!entityItem.cannotPickup()) {
					ItemStack stack = entityItem.getEntityItem();

					if (stack.getItem() == ItemHandler.BIOMASS) {
						this.getNavigator().setPath(this.getNavigator().getPathToEntityLiving(entityItem), 1);
					}

					if (this.getDistanceToEntity(entityItem) <= 2) {
						this.onPickupBiomass(entityItem);
					}
					break;
				}
			}

			entityItemList.clear();
			entityItemList = null;
		}
	}

	protected void onPickupBiomass(EntityItem entityItem) {
			this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(this.getMaxHealth() + (entityItem.getEntityItem().stackSize));
			this.setHealth(this.getHealth() + (entityItem.getEntityItem().stackSize));
			this.setColor(this.getColor() + (entityItem.getEntityItem().stackSize));
		entityItem.setDead();
	}
	
	@Override
	public void onUpdate() {
		super.onUpdate();
		if(this.getColor() <= 100) {
			this.findBiomass();
		}
		if(this.getColor() > 100) {
			this.setColor(100);
			this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(this.baseHealth + this.getColor());
		}
	}
	
	@Override
	public void onLivingUpdate() {
		super.onLivingUpdate();
		if (ticksExisted % 20 == 0 && !(this.getHealth() == this.getMaxHealth() + this.getColor())) {
			this.heal(0.27F);
		}
	}
}
