package matthewsworld04.colorablequartz.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {

	public static void init() {
		GameRegistry.addSmelting(ModBlocks.BLACK_QUARTZ_ORE, new ItemStack(ModItems.BLACK_QUARTZ, 1), 0.2f);
		GameRegistry.addSmelting(ModBlocks.BLUE_QUARTZ_ORE, new ItemStack(ModItems.BLUE_QUARTZ, 1), 0.2f);
		GameRegistry.addSmelting(ModBlocks.BROWN_QUARTZ_ORE, new ItemStack(ModItems.BROWN_QUARTZ, 1), 0.2f);
		GameRegistry.addSmelting(ModBlocks.CYAN_QUARTZ_ORE, new ItemStack(ModItems.CYAN_QUARTZ, 1), 0.2f);
		GameRegistry.addSmelting(ModBlocks.GRAY_QUARTZ_ORE, new ItemStack(ModItems.DARK_GRAY_QUARTZ, 1), 0.2f);
		GameRegistry.addSmelting(ModBlocks.GREEN_QUARTZ_ORE, new ItemStack(ModItems.GREEN_QUARTZ, 1), 0.2f);
		GameRegistry.addSmelting(ModBlocks.LIGHT_BLUE_QUARTZ_ORE, new ItemStack(ModItems.LIGHT_BLUE_QUARTZ, 1), 0.2f);
		GameRegistry.addSmelting(ModBlocks.LIGHT_GRAY_QUARTZ_ORE, new ItemStack(ModItems.LIGHT_GRAY_QUARTZ, 1), 0.2f);
		GameRegistry.addSmelting(ModBlocks.LIME_QUARTZ_ORE, new ItemStack(ModItems.LIME_QUARTZ, 1), 0.2f);
		GameRegistry.addSmelting(ModBlocks.MAGENTA_QUARTZ_ORE, new ItemStack(ModItems.MAGENTA_QUARTZ, 1), 0.2f);
		GameRegistry.addSmelting(ModBlocks.ORANGE_QUARTZ_ORE, new ItemStack(ModItems.ORANGE_QUARTZ, 1), 0.2f);
		GameRegistry.addSmelting(ModBlocks.PINK_QUARTZ_ORE, new ItemStack(ModItems.PINK_QUARTZ, 1), 0.2f);
		GameRegistry.addSmelting(ModBlocks.PURPLE_QUARTZ_ORE, new ItemStack(ModItems.PURPLE_QUARTZ, 1), 0.2f);
		GameRegistry.addSmelting(ModBlocks.RED_QUARTZ_ORE, new ItemStack(ModItems.RED_QUARTZ, 1), 0.2f);
		GameRegistry.addSmelting(ModBlocks.YELLOW_QUARTZ_ORE, new ItemStack(ModItems.YELLOW_QUARTZ, 1), 0.2f);
	}
}
