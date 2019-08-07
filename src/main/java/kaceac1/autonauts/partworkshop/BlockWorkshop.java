package kaceac1.autonauts.partworkshop;

import kaceac1.autonauts.Autonauts;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockWorkshop extends Block {

  public static final PropertyDirection FACING = PropertyDirection.create("facing");

  public static final ResourceLocation WORKSHOP = new ResourceLocation(Autonauts.MODID, "workshop");

  public BlockWorkshop() {
    super(Material.WOOD);
    setRegistryName(WORKSHOP);
    setUnlocalizedName(Autonauts.MODID + ".workshop");
    setHarvestLevel("pickaxe", 1);
    setCreativeTab(Autonauts.creativeTab);

    setDefaultState(blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));
  }

  @SideOnly(Side.CLIENT)
  public void initModel() {
    ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(getRegistryName(), "inventory"));;
  }

  @Override
  public IBlockState getStateForPlacement(World world, BlockPos pos, EnumFacing facing, float hitX, float hitY,
      float hitZ, int meta, EntityLivingBase placer, EnumHand hand) {
        return this.getDefaultState().withProperty(FACING, EnumFacing.getDirectionFromEntityLiving(pos, placer));
  }

  @Override
  public IBlockState getStateFromMeta(int meta) {
    return this.getDefaultState().withProperty(FACING,EnumFacing.getFront(meta & 7));
  }

  @Override
  public int getMetaFromState(IBlockState state) {
    return state.getValue(FACING).getIndex();
  }

  @Override
  protected BlockStateContainer createBlockState() {
    return new BlockStateContainer(this, FACING);
  }
}