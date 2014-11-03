package com.ryakra.mod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemFood;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Metadata;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = ryakra.MODID, version = ryakra.VERSION)
public class ryakra
{
    public static final String MODID = "ryakra";
    public static final String VERSION = "0.01";

    public static ToolMaterial enumToolMaterialSilicon = EnumHelper.addToolMaterial("SILICON", 3, 1000, 5.0F, 4.0F, 10);
    public static ArmorMaterial enumArmorMaterialSilicon = EnumHelper.addArmorMaterial("SILICON", 15, new int[]{5, 8, 3, 4}, 13);
    
    
    @Metadata
    public static ModMetadata meta;
    
    public static Block siliconOre;
    int siliconOreID = 500;
    
    public static Item siliconIngot;
    int siliconIngotID = 501;
    
    public static Item siliconSword;
    int siliconSwordID = 502;
    
    public static Item siliconShovel;
    int siliconShovelID = 503;
    
    public static Item siliconPickaxe;
    int siliconPickaxeID = 504;
    
    public static Item siliconAxe;
    int siliconAxeID = 505;
    
    public static Item siliconHoe;
    int siliconHoeID = 506;
    
    public static Item helmetSilicon;
    int helmetSiliconID = 507;
    
    public static Item chestplateSilicon;
    int chestplateSiliconID = 508;
    
    public static Item legsSilicon;
    int legsSiliconID = 509;
    
    public static Item bootsSilicon;
    int bootsSiliconID = 510;
    
    public static Item SiliconDust;
    int SiliconDustID = 511;
    
    public static Item SiliconDustPile;
    int SiliconDustPileID = 512;
    
    public static Item Strawberry = new ItemFood(32, 10, false);
    
    public static CreativeTabs siliconTab = new CreativeTabs("Silicon"){
    	public Item getTabIconItem(){
    		return siliconIngot;
    	}
    };


    
    
    @EventHandler
    public void init(FMLPreInitializationEvent event)
    {
    	
    	RenderingRegistry.addNewArmourRendererPrefix("5");
    	
    	siliconOre = new siliconOre(siliconOreID, Material.rock).setHardness(1.5F).setBlockName("siliconOre");
    	siliconIngot = new siliconIngot(siliconIngotID).setUnlocalizedName("siliconIngot");
    	SiliconDust = new SiliconDust(SiliconDustID).setUnlocalizedName("SiliconDust");
    	SiliconDustPile = new SiliconDustPile(SiliconDustPileID).setUnlocalizedName("SiliconDustPile");
    	siliconSword = new siliconSword(siliconSwordID, ryakra.enumToolMaterialSilicon).setUnlocalizedName("siliconSword").setCreativeTab(CreativeTabs.tabCombat);
    	siliconAxe = new siliconAxe(siliconAxeID, ryakra.enumToolMaterialSilicon).setUnlocalizedName("siliconAxe").setCreativeTab(ryakra.siliconTab);
    	siliconHoe = new siliconHoe(siliconHoeID, ryakra.enumToolMaterialSilicon).setUnlocalizedName("siliconHoe").setCreativeTab(ryakra.siliconTab);
    	siliconShovel = new siliconShovel(siliconShovelID, ryakra.enumToolMaterialSilicon).setUnlocalizedName("siliconShovel").setCreativeTab(ryakra.siliconTab);
    	siliconPickaxe = new siliconPickaxe(siliconPickaxeID, ryakra.enumToolMaterialSilicon).setUnlocalizedName("siliconPickaxe").setCreativeTab(ryakra.siliconTab);
    	helmetSilicon = new SiliconArmor(ryakra.enumArmorMaterialSilicon, 5, 0).setUnlocalizedName("helmetSilicon").setCreativeTab(ryakra.siliconTab);
    	chestplateSilicon = new SiliconArmor(ryakra.enumArmorMaterialSilicon, 5, 1).setUnlocalizedName("chestplateSilicon").setCreativeTab(ryakra.siliconTab);
    	legsSilicon = new SiliconArmor(ryakra.enumArmorMaterialSilicon, 5, 2).setUnlocalizedName("legsSilicon").setCreativeTab(ryakra.siliconTab);
    	bootsSilicon = new SiliconArmor(ryakra.enumArmorMaterialSilicon, 5, 3).setUnlocalizedName("bootsSilicon").setCreativeTab(ryakra.siliconTab);
    	Strawberry = new FoodStrawberry(5015, 10, false).setUnlocalizedName("Strawberry");
    	
    	
    	GameRegistry.registerBlock(siliconOre, "siliconOre");
    	GameRegistry.registerItem(siliconIngot, "siliconIngot");
    	GameRegistry.registerItem(siliconSword, "siliconSword");
    	GameRegistry.registerItem(siliconAxe, "siliconAxe");
    	GameRegistry.registerItem(siliconHoe, "siliconHoe");
    	GameRegistry.registerItem(siliconShovel, "siliconShovel");
    	GameRegistry.registerItem(siliconPickaxe, "siliconPickaxe");
    	GameRegistry.registerItem(helmetSilicon, "helmetSilicon");
    	GameRegistry.registerItem(chestplateSilicon, "chestplateSilicon");
    	GameRegistry.registerItem(legsSilicon, "legsSilicon");
    	GameRegistry.registerItem(bootsSilicon, "bootsSilicon");
    	GameRegistry.registerItem(Strawberry, "Strawberry");
    }
    @EventHandler
    public void load(FMLInitializationEvent event)
    {
    	GameRegistry.registerWorldGenerator(new WorldGenSilicon(), 1); 
    }
}
