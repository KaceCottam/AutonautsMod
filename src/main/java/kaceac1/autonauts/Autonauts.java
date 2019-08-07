package kaceac1.autonauts;

import org.apache.logging.log4j.Logger;

import kaceac1.autonauts.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Autonauts.MODID, name = Autonauts.MODNAME, version = Autonauts.MODVERSION, dependencies = "required-after:forge@[14.23.5.2768,)", useMetadata = true)
public class Autonauts {

  public static final String MODID = "autonauts";
  public static final String MODNAME = "Autonauts";
  public static final String MODVERSION = "0.0.1";

  @SidedProxy(clientSide = "kaceac1.autonauts.proxy.ClientProxy", serverSide = "kaceac1.autonauts.proxy.ServerProxy")
  public static CommonProxy proxy;

  @Mod.Instance
  public static Autonauts instance;

  public static Logger logger;

  @Mod.EventHandler
  public void preInit(FMLPreInitializationEvent event) {
    logger = event.getModLog();
    proxy.preInit(event);
  }

  @Mod.EventHandler
  public void init(FMLInitializationEvent e) {
    proxy.init(e);
  }

  @Mod.EventHandler
  public void postInit(FMLPostInitializationEvent e) {
    proxy.postInit(e);
  }
}