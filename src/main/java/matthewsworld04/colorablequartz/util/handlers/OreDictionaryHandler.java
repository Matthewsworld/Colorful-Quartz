package matthewsworld04.colorablequartz.util.handlers;

import matthewsworld04.colorablequartz.init.ModBlocks;
import matthewsworld04.colorablequartz.init.ModItems;
import matthewsworld04.colorablequartz.util.Configs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class OreDictionaryHandler
{

	public static void registerOreDictionary()
	{
		
		//Blocks
		OreDictionary.registerOre("blockQuartz", ModBlocks.BLACK_QUARTZ_BLOCK);	
		OreDictionary.registerOre("blockQuartz", ModBlocks.BLUE_QUARTZ_BLOCK);
		OreDictionary.registerOre("blockQuartz", ModBlocks.BROWN_QUARTZ_BLOCK);	
		OreDictionary.registerOre("blockQuartz", ModBlocks.CYAN_QUARTZ_BLOCK);
		OreDictionary.registerOre("blockQuartz", ModBlocks.DARK_GRAY_QUARTZ_BLOCK);
		OreDictionary.registerOre("blockQuartz", ModBlocks.GREEN_QUARTZ_BLOCK);
		OreDictionary.registerOre("blockQuartz", ModBlocks.LIGHT_BLUE_QUARTZ_BLOCK);
		OreDictionary.registerOre("blockQuartz", ModBlocks.LIGHT_GRAY_QUARTZ_BLOCK);	
		OreDictionary.registerOre("blockQuartz", ModBlocks.LIME_QUARTZ_BLOCK);	
		OreDictionary.registerOre("blockQuartz", ModBlocks.MAGENTA_QUARTZ_BLOCK);
		OreDictionary.registerOre("blockQuartz", ModBlocks.ORANGE_QUARTZ_BLOCK);
		OreDictionary.registerOre("blockQuartz", ModBlocks.PINK_QUARTZ_BLOCK);
		OreDictionary.registerOre("blockQuartz", ModBlocks.PURPLE_QUARTZ_BLOCK);	
		OreDictionary.registerOre("blockQuartz", ModBlocks.RED_QUARTZ_BLOCK);	
		OreDictionary.registerOre("blockQuartz", ModBlocks.YELLOW_QUARTZ_BLOCK);	
		//Pillars
		OreDictionary.registerOre("blockQuartzPillar", new ItemStack(Blocks.QUARTZ_BLOCK, 1, 2));
		OreDictionary.registerOre("blockQuartzPillar", ModBlocks.BLACK_QUARTZ_PILLAR);
		OreDictionary.registerOre("blockQuartzPillar", ModBlocks.BLUE_QUARTZ_PILLAR);
		OreDictionary.registerOre("blockQuartzPillar", ModBlocks.BROWN_QUARTZ_PILLAR);
		OreDictionary.registerOre("blockQuartzPillar", ModBlocks.CYAN_QUARTZ_PILLAR);
		OreDictionary.registerOre("blockQuartzPillar", ModBlocks.GRAY_QUARTZ_PILLAR);
		OreDictionary.registerOre("blockQuartzPillar", ModBlocks.GREEN_QUARTZ_PILLAR);
		OreDictionary.registerOre("blockQuartzPillar", ModBlocks.LIGHT_BLUE_QUARTZ_PILLAR);
		OreDictionary.registerOre("blockQuartzPillar", ModBlocks.LIGHT_GRAY_QUARTZ_PILLAR);
		OreDictionary.registerOre("blockQuartzPillar", ModBlocks.LIME_QUARTZ_PILLAR);
		OreDictionary.registerOre("blockQuartzPillar", ModBlocks.MAGENTA_QUARTZ_PILLAR);
		OreDictionary.registerOre("blockQuartzPillar", ModBlocks.ORANGE_QUARTZ_PILLAR);
		OreDictionary.registerOre("blockQuartzPillar", ModBlocks.PINK_QUARTZ_PILLAR);
		OreDictionary.registerOre("blockQuartzPillar", ModBlocks.PURPLE_QUARTZ_PILLAR);
		OreDictionary.registerOre("blockQuartzPillar", ModBlocks.RED_QUARTZ_PILLAR);
		OreDictionary.registerOre("blockQuartzPillar", ModBlocks.YELLOW_QUARTZ_PILLAR);
		//Chiseled
		OreDictionary.registerOre("blockQuartzChiseled", new ItemStack(Blocks.QUARTZ_BLOCK, 1, 1));
		OreDictionary.registerOre("blockQuartzChiseled", ModBlocks.BLACK_QUARTZ_CHISELED);
		OreDictionary.registerOre("blockQuartzChiseled", ModBlocks.BLUE_QUARTZ_CHISELED);
		OreDictionary.registerOre("blockQuartzChiseled", ModBlocks.BROWN_QUARTZ_CHISELED);
		OreDictionary.registerOre("blockQuartzChiseled", ModBlocks.CYAN_QUARTZ_CHISELED);
		OreDictionary.registerOre("blockQuartzChiseled", ModBlocks.GRAY_QUARTZ_CHISELED);
		OreDictionary.registerOre("blockQuartzChiseled", ModBlocks.GREEN_QUARTZ_CHISELED);
		OreDictionary.registerOre("blockQuartzChiseled", ModBlocks.LIGHT_BLUE_QUARTZ_CHISELED);
		OreDictionary.registerOre("blockQuartzChiseled", ModBlocks.LIGHT_GRAY_QUARTZ_CHISELED);
		OreDictionary.registerOre("blockQuartzChiseled", ModBlocks.LIME_QUARTZ_CHISELED);
		OreDictionary.registerOre("blockQuartzChiseled", ModBlocks.MAGENTA_QUARTZ_CHISELED);
		OreDictionary.registerOre("blockQuartzChiseled", ModBlocks.ORANGE_QUARTZ_CHISELED);
		OreDictionary.registerOre("blockQuartzChiseled", ModBlocks.PINK_QUARTZ_CHISELED);
		OreDictionary.registerOre("blockQuartzChiseled", ModBlocks.PURPLE_QUARTZ_CHISELED);
		OreDictionary.registerOre("blockQuartzChiseled", ModBlocks.RED_QUARTZ_CHISELED);
		OreDictionary.registerOre("blockQuartzChiseled", ModBlocks.YELLOW_QUARTZ_CHISELED);
		//Gems
		OreDictionary.registerOre("gemQuartz", ModItems.BLACK_QUARTZ);
		OreDictionary.registerOre("gemQuartz", ModItems.BLUE_QUARTZ);
		OreDictionary.registerOre("gemQuartz", ModItems.BROWN_QUARTZ);
		OreDictionary.registerOre("gemQuartz", ModItems.CYAN_QUARTZ);
		OreDictionary.registerOre("gemQuartz", ModItems.DARK_GRAY_QUARTZ);
		OreDictionary.registerOre("gemQuartz", ModItems.GREEN_QUARTZ);
		OreDictionary.registerOre("gemQuartz", ModItems.LIGHT_BLUE_QUARTZ);
		OreDictionary.registerOre("gemQuartz", ModItems.LIGHT_GRAY_QUARTZ);
		OreDictionary.registerOre("gemQuartz", ModItems.LIME_QUARTZ);
		OreDictionary.registerOre("gemQuartz", ModItems.MAGENTA_QUARTZ);
		OreDictionary.registerOre("gemQuartz", ModItems.ORANGE_QUARTZ);
		OreDictionary.registerOre("gemQuartz", ModItems.PINK_QUARTZ);
		OreDictionary.registerOre("gemQuartz", ModItems.PURPLE_QUARTZ);
		OreDictionary.registerOre("gemQuartz", ModItems.RED_QUARTZ);
		OreDictionary.registerOre("gemQuartz", ModItems.YELLOW_QUARTZ);
		//Paints
		OreDictionary.registerOre("paintBlack", new ItemStack(ModItems.BLACK_PAINT, 1, OreDictionary.WILDCARD_VALUE));
		OreDictionary.registerOre("paintBlue", new ItemStack(ModItems.BLUE_PAINT, 1, OreDictionary.WILDCARD_VALUE));
		OreDictionary.registerOre("paintBrown", new ItemStack(ModItems.BROWN_PAINT, 1, OreDictionary.WILDCARD_VALUE));
		OreDictionary.registerOre("paintCyan", new ItemStack(ModItems.CYAN_PAINT, 1, OreDictionary.WILDCARD_VALUE));
		OreDictionary.registerOre("paintGrey", new ItemStack(ModItems.GRAY_PAINT, 1, OreDictionary.WILDCARD_VALUE));
		OreDictionary.registerOre("paintGreen", new ItemStack(ModItems.GREEN_PAINT, 1, OreDictionary.WILDCARD_VALUE));
		OreDictionary.registerOre("paintLightBlue", new ItemStack(ModItems.LIGHT_BLUE_PAINT, 1, OreDictionary.WILDCARD_VALUE));
		OreDictionary.registerOre("paintLightGrey", new ItemStack(ModItems.LIGHT_GRAY_PAINT, 1, OreDictionary.WILDCARD_VALUE));
		OreDictionary.registerOre("paintLime", new ItemStack(ModItems.LIME_PAINT, 1, OreDictionary.WILDCARD_VALUE));
		OreDictionary.registerOre("paintMagenta", new ItemStack(ModItems.MAGENTA_PAINT, 1, OreDictionary.WILDCARD_VALUE));
		OreDictionary.registerOre("paintOrange", new ItemStack(ModItems.ORANGE_PAINT, 1, OreDictionary.WILDCARD_VALUE));
		OreDictionary.registerOre("paintPink", new ItemStack(ModItems.PINK_PAINT, 1, OreDictionary.WILDCARD_VALUE));
		OreDictionary.registerOre("paintPurple", new ItemStack(ModItems.PURPLE_PAINT, 1, OreDictionary.WILDCARD_VALUE));
		OreDictionary.registerOre("paintRed", new ItemStack(ModItems.RED_PAINT, 1, OreDictionary.WILDCARD_VALUE));
		OreDictionary.registerOre("paintWhite", new ItemStack(ModItems.WHITE_PAINT, 1, OreDictionary.WILDCARD_VALUE));
		OreDictionary.registerOre("paintYellow", new ItemStack(ModItems.YELLOW_PAINT, 1, OreDictionary.WILDCARD_VALUE));
		//Ores
		OreDictionary.registerOre("oreQuartz", ModBlocks.BLACK_QUARTZ_ORE);
		OreDictionary.registerOre("oreQuartz", ModBlocks.BLUE_QUARTZ_ORE);
		OreDictionary.registerOre("oreQuartz", ModBlocks.BROWN_QUARTZ_ORE);
		OreDictionary.registerOre("oreQuartz", ModBlocks.CYAN_QUARTZ_ORE);
		OreDictionary.registerOre("oreQuartz", ModBlocks.GRAY_QUARTZ_ORE);
		OreDictionary.registerOre("oreQuartz", ModBlocks.GREEN_QUARTZ_ORE);
		OreDictionary.registerOre("oreQuartz", ModBlocks.LIGHT_BLUE_QUARTZ_ORE);
		OreDictionary.registerOre("oreQuartz", ModBlocks.LIGHT_GRAY_QUARTZ_ORE);
		OreDictionary.registerOre("oreQuartz", ModBlocks.LIME_QUARTZ_ORE);
		OreDictionary.registerOre("oreQuartz", ModBlocks.MAGENTA_QUARTZ_ORE);
		OreDictionary.registerOre("oreQuartz", ModBlocks.ORANGE_QUARTZ_ORE);
		OreDictionary.registerOre("oreQuartz", ModBlocks.PINK_QUARTZ_ORE);
		OreDictionary.registerOre("oreQuartz", ModBlocks.PURPLE_QUARTZ_ORE);
		OreDictionary.registerOre("oreQuartz", ModBlocks.RED_QUARTZ_ORE);
		OreDictionary.registerOre("oreQuartz", ModBlocks.YELLOW_QUARTZ_ORE);
		//Paints as Dyes
		if(Configs.paints_as_dyes) {
		OreDictionary.registerOre("dyeBlack", ModItems.BLACK_PAINT);
		OreDictionary.registerOre("dyeBlue", ModItems.BLUE_PAINT);
		OreDictionary.registerOre("dyeBrown", ModItems.BROWN_PAINT);
		OreDictionary.registerOre("dyeCyan", ModItems.CYAN_PAINT);
		OreDictionary.registerOre("dyeGray", ModItems.GRAY_PAINT);
		OreDictionary.registerOre("dyeGreen", ModItems.GREEN_PAINT);
		OreDictionary.registerOre("dyeLightBlue", ModItems.LIGHT_BLUE_PAINT);
		OreDictionary.registerOre("dyeLightGray", ModItems.LIGHT_GRAY_PAINT);
		OreDictionary.registerOre("dyeLime", ModItems.LIME_PAINT);
		OreDictionary.registerOre("dyeMagenta", ModItems.MAGENTA_PAINT);
		OreDictionary.registerOre("dyeOrange", ModItems.ORANGE_PAINT);
		OreDictionary.registerOre("dyePink", ModItems.PINK_PAINT);
		OreDictionary.registerOre("dyePurple", ModItems.PURPLE_PAINT);
		OreDictionary.registerOre("dyeRed", ModItems.RED_PAINT);
		OreDictionary.registerOre("dyeWhite", ModItems.WHITE_PAINT);
		OreDictionary.registerOre("dyeYellow", ModItems.YELLOW_PAINT);
		}
	}
		
}
	
