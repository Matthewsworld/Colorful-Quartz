package matthewsworld04.colorablequartz.util;

import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.Config.Comment;
import net.minecraftforge.common.config.Config.Name;
import net.minecraftforge.common.config.Config.RequiresMcRestart;
import net.minecraftforge.common.config.Config.Type;

@Config(modid = Reference.MOD_ID, name = "colorfulquartz", type = Type.INSTANCE)
public class Configs
{
	
	@Name("Ore Generation")
	@Comment("Toggles ore generation. [VALUES = true / false] [Default = false]")
	@RequiresMcRestart
	public static boolean ore_gen = true;
	

}