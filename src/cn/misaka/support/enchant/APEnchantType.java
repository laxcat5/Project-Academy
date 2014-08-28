package cn.misaka.support.enchant;

import cn.misaka.support.client.render.APEnchantRender;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public abstract class APEnchantType {
	
	public float 
		damage,
		endure,
		repel;
	
	public int
		fire;
	
	@SideOnly(Side.CLIENT)
	public abstract APEnchantRender getEnchantRender();
}
