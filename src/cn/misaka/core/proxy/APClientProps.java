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
package cn.misaka.core.proxy;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;

/**
 * @author WeAthFolD
 *
 */
public class APClientProps {

	//Textures
	public static final ResourceLocation
		TEX_MDL_ABILITY_DEVELOPER = src("academy:textures/models/ability_developer.png"),
		TEX_GUI_ABILITY_DEVELOPER = src("academy:textures/guis/ability_dev.png");
		
	//OBJ models
	public static final
		IModelCustom MDL_ABILITY_DEVELOPER = AdvancedModelLoader.loadModel(src("academy:models/ability_developer.obj"));
	
	//GUI IDs
	public static final int
		GUI_ID_ABILITY_DEV = 0;
	
	
	private static ResourceLocation src(String s) {
		return new ResourceLocation(s);
	}
}
