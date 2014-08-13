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
package cn.misaka.ability.category.electromaster;

import net.minecraft.util.ResourceLocation;
import cn.liutils.api.util.Pair;
import cn.misaka.ability.api.ability.AbilityCategory;

/**
 * @author WeAthFolD
 *
 */
public class CatElectroMaster extends AbilityCategory {

	public CatElectroMaster(int id) {
		super("category.railgun", id);
	}

	@Override
	public Pair<ResourceLocation, ResourceLocation> getHudTextureOverride() {
		return null;
	}

}
