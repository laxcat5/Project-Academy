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
package cn.misaka.ability.item;

import cn.liutils.core.LIUtilsMod;
import cn.misaka.core.AcademyCraft;
import net.minecraft.item.Item;

/**
 * @author KSkun
 * 硬币什么的功能之后再加吧
 */
public class ItemCoin extends Item {
	
	public ItemCoin() {
		setUnlocalizedName("ap_coin");
		setTextureName("academy:coin-front");
		setCreativeTab(AcademyCraft.cct);
	}

}