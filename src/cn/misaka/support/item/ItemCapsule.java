/**
 * Copyright (C) Lambda-Innovation, 2013-2014
 * This code is open-source. Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer. 
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 */
package cn.misaka.support.item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import cn.misaka.core.AcademyCraft;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

/**
 * @author KSkun
 * 狼狼记得重写吃药的动作，我们要每天萌萌哒
 */
public class ItemCapsule extends Item {
	
	int capsuleID;
	
	/**
	 * 
	 * @param subID
	 * metadata
	 * 
	 * @param capsuleID
	 * metadata2
	 */
	
	public ItemCapsule(int subID) {
		setCreativeTab(AcademyCraft.cct);
		capsuleID = subID;
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister par1IconRegister) {
		this.itemIcon = par1IconRegister.registerIcon("academy:capsule" + capsuleID);
	}
	
}
