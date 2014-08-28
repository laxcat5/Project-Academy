package cn.misaka.ability.api.control.preset;

import net.minecraft.entity.player.EntityPlayer;
import cn.misaka.ability.api.data.PlayerData;

public interface IPresetModifier {
	void applyModification(EntityPlayer player, PlayerData data, ControlPreset preset);
}
