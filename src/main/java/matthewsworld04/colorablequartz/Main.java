package matthewsworld04.colorablequartz;

import matthewsworld04.colorablequartz.init.ModRecipes;
import matthewsworld04.colorablequartz.proxy.CommonProxy;
import matthewsworld04.colorablequartz.util.Reference;
import matthewsworld04.colorablequartz.util.handlers.OreDictionaryHandler;
import matthewsworld04.colorablequartz.util.handlers.RegistryHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class Main {

	@Instance
	public static Main instance;
	
	//poxy proxy
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event){RegistryHandler.otherRegistries();}
	
	@EventHandler
	public static void init(FMLInitializationEvent event)
	{
		OreDictionaryHandler.registerOreDictionary();	
		ModRecipes.init();
	}
	
	@EventHandler
	public static void Postinit(FMLPostInitializationEvent event)
	{
		
	}
	
}
