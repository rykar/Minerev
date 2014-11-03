package com.Minerev.MinerevMod;



import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

public class SiliconDust extends Item{
	

	public SiliconDust(int id) {
		super();
		this.setCreativeTab(Minerev.SiliconTab);
		this.setMaxStackSize(64);
	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister reg){
		this.itemIcon = reg.registerIcon("Minerev:SiliconDust");
	}
	
}



