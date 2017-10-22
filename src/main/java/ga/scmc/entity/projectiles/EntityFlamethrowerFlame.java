package ga.scmc.entity.projectiles;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.datafix.DataFixer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class EntityFlamethrowerFlame extends EntityThrowable {

	public EntityFlamethrowerFlame(World worldIn) {
		super(worldIn);
		float size = 1.0f;
		this.setSize(size, size);
		this.isInvisible();
	}

	public EntityFlamethrowerFlame(World worldIn, EntityLivingBase throwerIn) {
		super(worldIn, throwerIn);
		this.setLocationAndAngles(throwerIn.posX, throwerIn.posY + throwerIn.getEyeHeight(), throwerIn.posZ, throwerIn.rotationYaw, throwerIn.rotationPitch);
		this.setPosition(this.posX, this.posY, this.posZ);
		this.motionX = -MathHelper.sin((rotationYaw / 180F) * 3.141593F) * MathHelper.cos((rotationPitch / 180F) * 3.141593F);
		this.motionY = -MathHelper.sin((rotationPitch / 180F) * 3.141593F);
		this.motionZ = MathHelper.cos((rotationYaw / 180F) * 3.141593F) * MathHelper.cos((rotationPitch / 180F) * 3.141593F);
		this.setThrowableHeading(motionX, motionY, motionZ, getSpeed(), 1.0F);
	}

	@Override
	public void onEntityUpdate() {
		super.onEntityUpdate();

		world.spawnParticle(EnumParticleTypes.FLAME, posX, posY, posZ, 0, 0.1, 0, new int[0]);
		world.spawnParticle(EnumParticleTypes.SMOKE_LARGE, posX, posY, posZ, 0, 0.1, 0, new int[0]);
	}

	public static void registerFixes(DataFixer fixer) {
		EntityThrowable.registerFixesThrowable(fixer, "FlamethrowerFlame");
	}

	@Override
	protected float getGravityVelocity() {
		return 0.3f;
	}

	protected float getSpeed() {
		return 0.00001f;
	}

	/**
	 * Called when this EntityThrowable hits a block or entity.
	 */
	@Override
	protected void onImpact(RayTraceResult result) {
		if (!world.isRemote) {
			if (result.entityHit != null && result.entityHit != this.getThrower()) {
				if (result.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.getThrower()), 3)) {
					result.entityHit.setFire(5);
					setDead();
				}
			}

			if (result.getBlockPos() != null) {
				for (int x = -getFireSize() / 2; x < getFireSize(); x++) {
					for (int z = -getFireSize() / 2; z < getFireSize(); z++) {
						BlockPos pos = new BlockPos(result.getBlockPos().getX() + x, result.getBlockPos().up().getY(), result.getBlockPos().getZ() + z);
						pos = pos.offset(result.sideHit);
						if (world.isAirBlock(pos)) {
							world.playSound((EntityPlayer) null, pos, SoundEvents.ITEM_FLINTANDSTEEL_USE, SoundCategory.BLOCKS, 1.0F, 0.8F);
							world.setBlockState(pos, Blocks.FIRE.getDefaultState(), 11);
						}
					}
				}
				setDead();
			}
		}
	}

	public int getFireSize() {
		return 1;
	}
}