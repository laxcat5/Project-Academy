package cn.misaka.ability.api.enchant;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import cn.misaka.ability.api.client.render.enchant.APEnchantRender;

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