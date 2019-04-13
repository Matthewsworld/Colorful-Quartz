package matthewsworld04.colorablequartz.world.gen;

import java.util.Random;

import matthewsworld04.colorablequartz.init.ModBlocks;
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
	
	public ModWorldGen()
	{
		black_quartz_ore = new WorldGenMinable(ModBlocks.BLACK_QUARTZ_ORE.getDefaultState(), 4, BlockMatcher.forBlock(Blocks.NETHERRACK));
		
	}
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		{
			
			switch(world.provider.getDimension())
			{
			case -1:
				
				runGenerator(black_quartz_ore, world, random, chunkX, chunkZ, 30, 15, 120);	
				
				
			}
		}
		
	}
	
	private void runGenerator(WorldGenerator gen, World world, Random rand, int chunkX, int chunkZ, int chance, int minHeight, int maxHeight)
	{
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