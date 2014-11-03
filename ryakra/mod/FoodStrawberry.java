package com.ryakra.mod;

import net.minecraft.item.ItemFood;

public class FoodStrawberry extends ItemFood{

	public FoodStrawberry(int i, int j, boolean b){
		super(j, b);
		this.setCreativeTab(ryakra.siliconTab);
		this.setTextureName("ryakra:Strawberry");
	}
	
}
