package com.ryakra.mod;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class SiliconArmor extends ItemArmor {
	private String [] armorTypes = new String [] {"helmetSilicon", "chestplateSilicon", "legsSilicon", "bootsSilicon"};
	
	public SiliconArmor(ArmorMaterial armorMaterial, int renderIndex, int armorType){
		super(armorMaterial, renderIndex, armorType);
	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String layer){
		if(stack.getItem().equals(ryakra.helmetSilicon)|| stack.getItem().equals(ryakra.chestplateSilicon)|| stack.getItem().equals(ryakra.bootsSilicon)){
			return "ryakra:textures/armor/silicon_1.png";
			
		}
		
		if(stack.getItem().equals(ryakra.legsSilicon)){
			return "ryakra:textures/armor/silicon_2.png";
		}
		
		else return null;
	}
	
	@Override
	public void registerIcons(IIconRegister reg){
		if(this == ryakra.helmetSilicon)
			this.itemIcon = reg.registerIcon("ryakra:helmetSilicon");
		if(this == ryakra.chestplateSilicon)
			this.itemIcon = reg.registerIcon("ryakra:chestplateSilicon");
		if(this == ryakra.legsSilicon)
			this.itemIcon = reg.registerIcon("ryakra:legsSilicon");
		if(this == ryakra.bootsSilicon)
			this.itemIcon = reg.registerIcon("ryakra:bootsSilicon");
	}
}
