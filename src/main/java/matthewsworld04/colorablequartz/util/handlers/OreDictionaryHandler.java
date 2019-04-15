package matthewsworld04.colorablequartz.util.handlers;

import matthewsworld04.colorablequartz.init.ModBlocks;
import matthewsworld04.colorablequartz.init.ModItems;
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
		
	}
	
}
