package com.Minerev.MinerevMod;




import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Metadata;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = Minerev.MODID, version = Minerev.VERSION)
public class Minerev
{
    public static final String MODID = "minerev";
    public static final String VERSION = "0.01";
    
    public static Block SiliconOre;
    int SiliconOreID = 500;
    public static Item SiliconIngot;
    int SiliconIngotID = 501;
    public static Item SiliconDust;
    int SiliconDustID = 511;
    
    
    public static CreativeTabs SiliconTab = new CreativeTabs("Silicon"){
    	public Item getTabIconItem(){
    		return SiliconIngot;
    	}
    };
    @EventHandler
    public void init(FMLPreInitializationEvent event)
    {
    	SiliconIngot = new SiliconIngot(SiliconIngotID).setUnlocalizedName("SiliconIngot");
    	SiliconDust = new SiliconDust(SiliconDustID).setUnlocalizedName("SiliconDust");
    	SiliconOre = new SiliconOre(SiliconOreID, Material.rock).setHardness(1.5F).setBlockName("SiliconOre");
    	
    	
    	GameRegistry.registerBlock(SiliconOre, "SiliconOre");
    	GameRegistry.registerItem(SiliconIngot, "SiliconIngot");
    	GameRegistry.registerItem(SiliconDust, "SiliconDust");
    }
    @EventHandler
    public void load(FMLInitializationEvent event)
    {
    	GameRegistry.registerWorldGenerator(new WorldGenSilicon(), 1); 
    }
}
