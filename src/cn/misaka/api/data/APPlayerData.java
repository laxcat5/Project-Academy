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
package cn.misaka.api.data;

import net.minecraft.entity.player.EntityPlayer;

/**
 * 单个玩家的能力信息。（基类）
 * @author WeAthFolD
 *
 */
public abstract class APPlayerData {
	
	public int 
		classid,
		level,
		max_cp;
		
	public int
		current_cp;
	
	
	/**
	 * MAJOR：最大CP、等级、能力class、
	 * CONTROL：技能操作状态（当前预设id和四个预设）（CLIENT ONLY）
	 * REALTIME：
	 * ALL：所有
	 * 注意可以用flag位运算进行叠加。
	 */
	public enum EnumPlayerData {
		MAJOR(1), CONTROL(1 << 1), REALTIME(1 << 2),
		ALL(MAJOR.flag | CONTROL.flag | REALTIME.flag);
		
		public int flag = 0x00;
		EnumPlayerData(int bin) {
			flag = bin;
		}
	}

	public APPlayerData(EntityPlayer player) {
		// TODO Auto-generated constructor stub
	}
	
	public void onUpdate() {
	}

	/**
	 * 返回当前数据是否（总体上）处于良好情况
	 */
	public abstract boolean isDataStateGood();
	
	/**
	 * 返回某几类数据是否处于良好情况
	 * @param flag 参照 @EnumPlayerData 的flag进行计算。
	 */
	public abstract boolean isDataStateGood(int flag);
	
}