package com.Minerev.MinerevMod;

import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.registry.GameRegistry;

public class SiliconWorld {

	public static void initWorldGen(){
		registerWorldGen(new WorldGenSilicon(), 1);
	}
	
	public static void registerWorldGen(IWorldGenerator worldGenClass, int weightedProabability){
		GameRegistry.registerWorldGenerator(worldGenClass, weightedProabability);
	}
	
}
