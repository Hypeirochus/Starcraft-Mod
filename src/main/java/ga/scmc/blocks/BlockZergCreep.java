package ga.scmc.blocks;

import java.util.Random;

import ga.scmc.creativetabs.StarcraftCreativeTabs;
import ga.scmc.entity.EntityZergMob;
import ga.scmc.entity.EntityZergPassive;
import ga.scmc.handlers.BlockHandler;
import ga.scmc.handlers.ConfigurationHandler;
import ga.scmc.handlers.ItemHandler;
import ga.scmc.handlers.MetaBlockHandler;
import ga.scmc.handlers.SoundHandler.SoundTypes;
import ga.scmc.items.armor.ArmorZergArmorT1;
import ga.scmc.items.armor.ArmorZergArmorT2;
import ga.scmc.items.armor.ArmorZergArmorT3;
import ga.scmc.lib.Library;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockZergCreep extends Block {

	public BlockZergCreep() {
		super(Material.GROUND, MapColor.BLACK);
		setUnlocalizedName("zergCreep");
		setRegistryName("zerg_creep");
		setSoundType(SoundTypes.ZERG_FLESH);
		setHardness(5.0F);
		setResistance(5.0F);
		setHarvestLevel("shovel", 2);
		setTickRandomly(true);
		setCreativeTab(StarcraftCreativeTabs.ZERG);
	}

	@Override
	protected boolean canSilkHarvest() {
		return true;
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return ItemHandler.CREEP_RESIN;
	}

	@Override
	public void onEntityWalk(World worldIn, BlockPos pos, Entity entityIn) {
		if (entityIn instanceof EntityZergMob || entityIn instanceof EntityZergPassive) {
			entityIn.motionX *= 1.2D;
			entityIn.motionZ *= 1.2D;
		}
		if (entityIn instanceof EntityPlayer) {
			EntityPlayer player = (EntityPlayer) entityIn;
			try {
				if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() instanceof ArmorZergArmorT1
						&& player.getItemStackFromSlot(EntityEquipmentSlot.CHEST).getItem() instanceof ArmorZergArmorT1
						&& player.getItemStackFromSlot(EntityEquipmentSlot.LEGS).getItem() instanceof ArmorZergArmorT1
						&& player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() instanceof ArmorZergArmorT1) {
					player.motionX *= 1.1D;
					player.motionZ *= 1.1D;
				}else if(player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() instanceof ArmorZergArmorT2
						&& player.getItemStackFromSlot(EntityEquipmentSlot.CHEST).getItem() instanceof ArmorZergArmorT2
						&& player.getItemStackFromSlot(EntityEquipmentSlot.LEGS).getItem() instanceof ArmorZergArmorT2
						&& player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() instanceof ArmorZergArmorT2){
					player.motionX *= 1.2D;
					player.motionZ *= 1.2D;
				}else if(player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() instanceof ArmorZergArmorT3
						&& player.getItemStackFromSlot(EntityEquipmentSlot.CHEST).getItem() instanceof ArmorZergArmorT3
						&& player.getItemStackFromSlot(EntityEquipmentSlot.LEGS).getItem() instanceof ArmorZergArmorT3
						&& player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() instanceof ArmorZergArmorT3) {
					player.motionX *= 1.3D;
					player.motionZ *= 1.3D;
				}else {
					
				}
			} catch (NullPointerException e) {
			}
		}
	}

	@Override
	public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand) {
		if (!worldIn.isRemote) {
			if (worldIn.getLightFromNeighbors(pos.up()) >= 9 && ConfigurationHandler.BOOL_CREEP_CAN_SPREAD) {
				for (int i = 0; i < 1000 * ConfigurationHandler.INT_CREEP_SPREAD_BASE_VALUE; ++i) {
					BlockPos blockpos = pos.add(rand.nextInt(3) - 1, rand.nextInt(5) - 3, rand.nextInt(3) - 1);

					if (blockpos.getY() >= 0 && blockpos.getY() < 256 && !worldIn.isBlockLoaded(blockpos)) {
						return;
					}

					IBlockState iblockstate = worldIn.getBlockState(blockpos);

					if (iblockstate.isOpaqueCube() && iblockstate.getBlock() != Blocks.BEDROCK
							&& iblockstate.getBlock() != BlockHandler.ZERG_CREEP
							&& iblockstate.getBlock() != MetaBlockHandler.ZERG_FLESH
							&& iblockstate.getBlock() != BlockHandler.KERATIN_CHUNK
							&& iblockstate.getBlock() != MetaBlockHandler.ZERG_CARAPACE_BLOCK
							&& iblockstate.getBlock() != MetaBlockHandler.PROTOSS_METAL_T1
							&& iblockstate.getBlock() != MetaBlockHandler.PROTOSS_METAL_T2
							&& iblockstate.getBlock() != MetaBlockHandler.PROTOSS_METAL_T3
							&& !Library.checkCube(worldIn, Blocks.AIR.getDefaultState(), blockpos, 3).isEmpty()) {
						worldIn.setBlockState(blockpos, BlockHandler.ZERG_CREEP.getDefaultState());
					}
				}
			}
		}
	}
}