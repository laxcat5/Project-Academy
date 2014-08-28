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
import cn.misaka.ability.api.ability.AbilityLevel;
import cn.misaka.ability.api.ability.AbilitySkill;
import cn.misaka.core.proxy.APClientProps;

/**
 * 喜闻乐见的电气使~炮姐板载！
 * @author WeAthFolD
 */
public class CatElectroMaster extends AbilityCategory {

	public CatElectroMaster(int id) {
		super("category.elecmaster", id);
	}
	
	@Override
	protected void initClass() {
		this.ability_levels = new AbilityLevel[] {
				new ElectroMasterLevels.Level1(),
				new ElectroMasterLevels.Level2(),
				new ElectroMasterLevels.Level3(),
				new ElectroMasterLevels.Level4(),
				new ElectroMasterLevels.Level5()
		};
		
		this.ability_skills = new AbilitySkill[] {
			new SkillArcGenerate(0),
			new SkillItemCharge(1),
			new SkillElectricAttraction(2),
			new SkillMoving(3),
			new SkillElectroAttack(4),
			new SkillSwordGen(5),
			new SkillRailgun(6),
			new SkillMineInf(7)
		};
	}

	private Pair<ResourceLocation, ResourceLocation> override = new Pair<ResourceLocation, ResourceLocation>(null, APClientProps.TEX_GUI_RAILGUN_DEC);
	@Override
	public Pair<ResourceLocation, ResourceLocation> getHudTextureOverride() {
		return override;
	}

	@Override
	public ResourceLocation getLogo() {
		return APClientProps.ELEC_LOGO;
	}

}
