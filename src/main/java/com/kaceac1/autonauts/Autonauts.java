package com.kaceac1.autonauts;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = Autonauts.MODID, name = Autonauts.NAME, version = Autonauts.VERSION)
public class Autonauts {
  public static final String MODID = "autonauts";
  public static final String NAME = "Autonauts";
  public static final String VERSION = "0.1.0";

  private static Logger logger;

  @EventHandler
  public void preInit(FMLPreInitializationEvent event) {
    logger = event.getModLog();
  }

  @EventHandler
  public void init(FMLInitializationEvent event) {
    // some example code
    logger.info("Autonauts Mod Loaded.");
  }
}
