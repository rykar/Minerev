package com.ryakra.mod;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSword;

public class siliconSword extends ItemSword{
	
	public siliconSword(int siliconSwordID, Item.ToolMaterial mat) {
		super(mat);
	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister reg){
		this.itemIcon = reg.registerIcon("ryakra:swordSilicon");
	}
}
