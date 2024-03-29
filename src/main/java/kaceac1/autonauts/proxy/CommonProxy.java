package kaceac1.autonauts.proxy;

import kaceac1.autonauts.Autonauts;
import kaceac1.autonauts.ModBlocks;
import kaceac1.autonauts.partworkshop.BlockWorkshop;
import kaceac1.autonauts.partworkshop.TileWorkshop;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod.EventBusSubscriber
public class CommonProxy {
    public void preInit(FMLPreInitializationEvent e) {
    }

    public void init(FMLInitializationEvent e) {
    }

    public void postInit(FMLPostInitializationEvent e) {
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
      event.getRegistry().register(new BlockWorkshop());
      GameRegistry.registerTileEntity(TileWorkshop.class, Autonauts.MODID + "_workshop");
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
      event.getRegistry().register(new ItemBlock(ModBlocks.blockWorkshop).setRegistryName(BlockWorkshop.WORKSHOP));
    }
}