package cn.misaka.ability.api.ability;

import cn.misaka.ability.api.control.PlayerControlData;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

/**
 * 能力等级。主要提供当前技能的可学习信息。
 * @author WeAthFolD
 *
 */
public abstract class AbilityLevel {
	
	public final int levelid;

	public AbilityLevel(int id) {
		levelid = id;
	}
	
	/**
	 * 在本级别某能力是否可以被学习？
	 * @param skill
	 * @param id
	 * @return
	 */
	public abstract boolean canStudySkill(AbilitySkill skill, int id);
	
	/**
	 * 在本级别某能力是否默认被激活？
	 * @param skill
	 * @param id
	 * @return
	 */
	public abstract boolean isSkillDefaultActivated(AbilitySkill skill, int id);
	
	public void onPlayerUpdate(World world, EntityPlayer player, PlayerControlData ctrl) {
		//DO NOTHING BY DEFAULT
	}

}
