package ga.scmc.blocks;

import ga.scmc.handlers.FluidHandler;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fluids.BlockFluidClassic;

/**
 * Blood fluid.<br>
 * Copyright 2017 the Starcraft Minecraft mod team
 * 
 * @author Hypeirochus
 */
public class BlockBloodFluid extends BlockFluidClassic {

	public BlockBloodFluid() {
		super(FluidHandler.blood, Material.WATER);
		setUnlocalizedName("fluidBlood");
		setRegistryName("fluid_blood");
		setCreativeTab(null);
	}

	@Override
	public MapColor getMapColor(IBlockState state) {
		return MapColor.RED;
	}

	/**
	 * Checks if other fluids can override this fluid?
	 * 
	 * @param world
	 *            allows to get block states based on their position
	 * @param pos
	 *            the position of the block
	 */
	@Override
	public boolean canDisplace(IBlockAccess world, BlockPos pos) {
		if (world.getBlockState(pos).getMaterial().isLiquid()) {
			return false;
		}

		return super.canDisplace(world, pos);
	}

	/**
	 * Allows other fluids to displace this fluid if possible
	 * 
	 * @param world
	 *            the world
	 * @param the
	 *            position of the block
	 */
	@Override
	public boolean displaceIfPossible(World world, BlockPos pos) {
		if (world.getBlockState(pos).getMaterial().isLiquid()) {
			return false;
		}

		return super.displaceIfPossible(world, pos);
	}
}