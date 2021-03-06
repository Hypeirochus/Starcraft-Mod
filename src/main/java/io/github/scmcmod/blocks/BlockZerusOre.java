package io.github.scmcmod.blocks;

import java.util.Random;

import javax.annotation.Nullable;

import io.github.scmcmod.creativetabs.SCCreativeTabs;
import io.github.scmcmod.handlers.ItemHandler;
import io.github.scmcmod.init.StarCraftBlocks;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Items;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.rom.block.BlockGeneric;

public class BlockZerusOre extends BlockGeneric
{

	public BlockZerusOre(Material material, int harvestLevel)
	{
		this(material, material.getMaterialMapColor(), harvestLevel);
	}

	public BlockZerusOre(Material material, MapColor color, int harvestLevel)
	{
		super(material, color);
		this.setHardness(3.0F);
		this.setResistance(5.0F);
		this.setHarvestLevel("pickaxe", harvestLevel);
		this.setCreativeTab(SCCreativeTabs.MISC);
		this.setSoundType(SoundType.STONE);
	}

	@Override
	@Nullable
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
	{
		return this == StarCraftBlocks.ORE_COAL_ZERUS ? Items.COAL
				: (this == StarCraftBlocks.ORE_DIAMOND_ZERUS ? Items.DIAMOND
						: this == StarCraftBlocks.ORE_PHOSPHORUS_ZERUS ? ItemHandler.PHOSPHORUS : (this == StarCraftBlocks.ORE_LAPIS_ZERUS ? Items.DYE : (this == StarCraftBlocks.ORE_RICHMINERAL_ZERUS || this == StarCraftBlocks.ORE_MINERAL_ZERUS ? ItemHandler.MINERAL_SHARD : Item.getItemFromBlock(this))));
	}

	@Override
	public int quantityDropped(Random random)
	{
		if (this == StarCraftBlocks.ORE_LAPIS_ZERUS)
		{
			return 4 + random.nextInt(5);
		} else if (this == StarCraftBlocks.ORE_RICHMINERAL_ZERUS || this == StarCraftBlocks.ORE_MINERAL_ZERUS)
		{
			return 4 + random.nextInt(4);
		} else
		{
			return 1;
		}
	}

	@Override
	public int quantityDroppedWithBonus(int fortune, Random random)
	{
		if (fortune > 0 && Item.getItemFromBlock(this) != getItemDropped((IBlockState) getBlockState().getValidStates().iterator().next(), random, fortune))
		{
			int i = random.nextInt(fortune + 2) - 1;

			if (i < 0)
			{
				i = 0;
			}

			return quantityDropped(random) * (i + 1);
		} else
		{
			return quantityDropped(random);
		}
	}

	@Override
	public void dropBlockAsItemWithChance(World worldIn, BlockPos pos, IBlockState state, float chance, int fortune)
	{
		super.dropBlockAsItemWithChance(worldIn, pos, state, chance, fortune);
	}

	@Override
	public int getExpDrop(IBlockState state, net.minecraft.world.IBlockAccess world, BlockPos pos, int fortune)
	{
		Random rand = world instanceof World ? ((World) world).rand : new Random();
		if (getItemDropped(state, rand, fortune) != Item.getItemFromBlock(this))
		{
			int i = 0;

			if (this == StarCraftBlocks.ORE_COAL_ZERUS)
			{
				i = MathHelper.getInt(rand, 0, 2);
			} else if (this == StarCraftBlocks.ORE_DIAMOND_ZERUS)
			{
				i = MathHelper.getInt(rand, 3, 7);
			} else if (this == StarCraftBlocks.ORE_RICHMINERAL_ZERUS || this == StarCraftBlocks.ORE_MINERAL_ZERUS)
			{
				i = MathHelper.getInt(rand, 0, 2);
			} else if (this == StarCraftBlocks.ORE_LAPIS_ZERUS)
			{
				i = MathHelper.getInt(rand, 2, 5);
			}

			return i;
		}
		return 0;
	}

	@Override
	public ItemStack getItem(World worldIn, BlockPos pos, IBlockState state)
	{
		return new ItemStack(this);
	}

	@Override
	public int damageDropped(IBlockState state)
	{
		if (this == StarCraftBlocks.ORE_LAPIS_ZERUS)
		{
			return EnumDyeColor.BLUE.getDyeDamage();
		} else if (this == StarCraftBlocks.ORE_MINERAL_ZERUS)
		{
			return 0;
		} else if (this == StarCraftBlocks.ORE_RICHMINERAL_ZERUS)
		{
			return 1;
		} else
		{
			return 0;
		}
	}
}