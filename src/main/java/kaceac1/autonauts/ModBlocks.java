package kaceac1.autonauts;

import kaceac1.autonauts.partworkshop.BlockWorkshop;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModBlocks {

  @GameRegistry.ObjectHolder("autonauts:workshop")
  public static BlockWorkshop blockWorkshop;

  @SideOnly(Side.CLIENT)
  public static void initModels() {
    blockWorkshop.initModel();
  }
}