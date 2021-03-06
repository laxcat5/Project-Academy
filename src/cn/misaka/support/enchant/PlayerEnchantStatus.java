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
package cn.misaka.support.enchant;

import net.minecraft.item.ItemStack;

/**
 * @author WeAthFolD
 *
 */
public class PlayerEnchantStatus {

	/**
	 * 玩家当前是否在进行临时附魔。
	 */
	public boolean isEnchanting;
	
	public int enchatSlotID;
	
	public ItemStack itemBeforeEnchant;
	
	public int enchantID;
	
	public APEnchantType getEnchantment() {
		return APEnchantment.getEnchantment(enchantID);
	}

}
