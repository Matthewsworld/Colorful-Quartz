package matthewsworld04.colorablequartz.blocks;

import java.util.Random;

import matthewsworld04.colorablequartz.init.ModItems;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class GrayOre extends BlockBase
{

	public GrayOre(String name, Material material) {
		super(name, material);
		setSoundType(SoundType.STONE);
		setHardness(3.0F);
		setResistance(15.0F);
		setHarvestLevel("pickaxe", 0);
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return ModItems.DARK_GRAY_QUARTZ;
	}
	
}
