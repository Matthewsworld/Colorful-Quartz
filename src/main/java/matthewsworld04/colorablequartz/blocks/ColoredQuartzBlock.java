package matthewsworld04.colorablequartz.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class ColoredQuartzBlock extends BlockBase {

	public ColoredQuartzBlock(String name, Material material) 
	{
		super(name, material);
		
		setSoundType(SoundType.STONE);
		setHardness(0.8F);
		setResistance(4.0F);
		setHarvestLevel("pickaxe", 0);
		
	}

}
