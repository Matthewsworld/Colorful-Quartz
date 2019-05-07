package matthewsworld04.colorablequartz.util;

import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.Config.Comment;
import net.minecraftforge.common.config.Config.Name;
import net.minecraftforge.common.config.Config.RequiresWorldRestart;
import net.minecraftforge.common.config.Config.Type;

@Config(modid = Reference.MOD_ID, name = "colorfulquartz", type = Type.INSTANCE)
public class Configs
{
	
	@Name("Ore Generation")
	@Comment("Nothing as of right now. [VALUES = true / false] Default = true")
	@RequiresWorldRestart
	public static boolean ore_gen = true;
	
	@Name("Paints as Dyes")
	@Comment("Nothing as of right now. [VALUES = true / fasle] Default = true")
	public static boolean paints_as_dyes = true;

	
}