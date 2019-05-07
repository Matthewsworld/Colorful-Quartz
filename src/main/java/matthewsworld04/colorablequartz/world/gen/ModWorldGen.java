package matthewsworld04.colorablequartz.world.gen;

import java.util.Random;

import matthewsworld04.colorablequartz.init.ModBlocks;
import matthewsworld04.colorablequartz.util.Configs;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class ModWorldGen implements IWorldGenerator
{


	private WorldGenerator black_quartz_ore;
	private WorldGenerator blue_quartz_ore;
	private WorldGenerator brown_quartz_ore;
	private WorldGenerator cyan_quartz_ore;
	private WorldGenerator dark_grey_quartz_ore;
	private WorldGenerator green_quartz_ore;
	private WorldGenerator light_blue_quartz_ore;
	private WorldGenerator light_grey_quartz_ore;
	private WorldGenerator lime_quartz_ore;
	private WorldGenerator magenta_quartz_ore;
	private WorldGenerator orange_quartz_ore;
	private WorldGenerator pink_quartz_ore;
	private WorldGenerator purple_quartz_ore;
	private WorldGenerator red_quartz_ore;
	private WorldGenerator yellow_quartz_ore;
	
	public ModWorldGen()
	{
		
		black_quartz_ore = new WorldGenMinable(ModBlocks.BLACK_QUARTZ_ORE.getDefaultState(), 4, BlockMatcher.forBlock(Blocks.NETHERRACK));
		blue_quartz_ore = new WorldGenMinable(ModBlocks.BLUE_QUARTZ_ORE.getDefaultState(), 4, BlockMatcher.forBlock(Blocks.NETHERRACK));
		brown_quartz_ore = new WorldGenMinable(ModBlocks.BROWN_QUARTZ_ORE.getDefaultState(), 4, BlockMatcher.forBlock(Blocks.NETHERRACK));
		cyan_quartz_ore = new WorldGenMinable(ModBlocks.CYAN_QUARTZ_ORE.getDefaultState(), 4, BlockMatcher.forBlock(Blocks.NETHERRACK));
		dark_grey_quartz_ore = new WorldGenMinable(ModBlocks.GRAY_QUARTZ_ORE.getDefaultState(), 4, BlockMatcher.forBlock(Blocks.NETHERRACK));
		green_quartz_ore = new WorldGenMinable(ModBlocks.GREEN_QUARTZ_ORE.getDefaultState(), 4, BlockMatcher.forBlock(Blocks.NETHERRACK));
		light_blue_quartz_ore = new WorldGenMinable(ModBlocks.LIGHT_BLUE_QUARTZ_ORE.getDefaultState(), 4, BlockMatcher.forBlock(Blocks.NETHERRACK));
		light_grey_quartz_ore = new WorldGenMinable(ModBlocks.LIGHT_GRAY_QUARTZ_ORE.getDefaultState(), 4, BlockMatcher.forBlock(Blocks.NETHERRACK));
		lime_quartz_ore = new WorldGenMinable(ModBlocks.LIME_QUARTZ_ORE.getDefaultState(), 4, BlockMatcher.forBlock(Blocks.NETHERRACK));
		magenta_quartz_ore = new WorldGenMinable(ModBlocks.MAGENTA_QUARTZ_ORE.getDefaultState(), 4, BlockMatcher.forBlock(Blocks.NETHERRACK));
		orange_quartz_ore = new WorldGenMinable(ModBlocks.ORANGE_QUARTZ_ORE.getDefaultState(), 4, BlockMatcher.forBlock(Blocks.NETHERRACK));
		pink_quartz_ore = new WorldGenMinable(ModBlocks.PINK_QUARTZ_ORE.getDefaultState(), 4, BlockMatcher.forBlock(Blocks.NETHERRACK));
		purple_quartz_ore = new WorldGenMinable(ModBlocks.PURPLE_QUARTZ_ORE.getDefaultState(), 4, BlockMatcher.forBlock(Blocks.NETHERRACK));
		red_quartz_ore = new WorldGenMinable(ModBlocks.RED_QUARTZ_ORE.getDefaultState(), 4, BlockMatcher.forBlock(Blocks.NETHERRACK));
		yellow_quartz_ore = new WorldGenMinable(ModBlocks.YELLOW_QUARTZ_ORE.getDefaultState(), 4, BlockMatcher.forBlock(Blocks.NETHERRACK));
	}
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		{
			if(!Configs.ore_gen) return;
			switch(world.provider.getDimension())
			{
			case -1:
				
				runGenerator(black_quartz_ore, world, random, chunkX, chunkZ, 30, 15, 120);	
				runGenerator(blue_quartz_ore, world, random, chunkX, chunkZ, 30, 15, 120);	
				runGenerator(brown_quartz_ore, world, random, chunkX, chunkZ, 30, 15, 120);	
				runGenerator(cyan_quartz_ore, world, random, chunkX, chunkZ, 30, 15, 120);	
				runGenerator(dark_grey_quartz_ore, world, random, chunkX, chunkZ, 30, 15, 120);	
				runGenerator(green_quartz_ore, world, random, chunkX, chunkZ, 30, 15, 120);	
				runGenerator(light_blue_quartz_ore, world, random, chunkX, chunkZ, 30, 15, 120);	
				runGenerator(light_grey_quartz_ore, world, random, chunkX, chunkZ, 30, 15, 120);	
				runGenerator(lime_quartz_ore, world, random, chunkX, chunkZ, 30, 15, 120);	
				runGenerator(magenta_quartz_ore, world, random, chunkX, chunkZ, 30, 15, 120);	
				runGenerator(orange_quartz_ore, world, random, chunkX, chunkZ, 30, 15, 120);	
				runGenerator(pink_quartz_ore, world, random, chunkX, chunkZ, 30, 15, 120);	
				runGenerator(purple_quartz_ore, world, random, chunkX, chunkZ, 30, 15, 120);	
				runGenerator(red_quartz_ore, world, random, chunkX, chunkZ, 30, 15, 120);	
				runGenerator(yellow_quartz_ore, world, random, chunkX, chunkZ, 30, 15, 120);	
			}
		}
		
	}
	
	private void runGenerator(WorldGenerator gen, World world, Random rand, int chunkX, int chunkZ, int chance, int minHeight, int maxHeight)
	{
		if(!Configs.ore_gen) return;
		if(minHeight > maxHeight || minHeight < 0 || maxHeight > 256) throw new IllegalArgumentException("Whoops, that wasn't meant to happen. (Ore generated out of bounds)");
		
		int heightDiff = maxHeight - minHeight + 1;
		for(int i = 0; i < chance; i++)
		{
			int x = chunkX * 16 + rand.nextInt(16);
			int y = minHeight + rand.nextInt(heightDiff);
			int z = chunkZ * 16 + rand.nextInt(16);
			
			gen.generate(world, rand, new BlockPos(x,y,z));
		}
	}
}