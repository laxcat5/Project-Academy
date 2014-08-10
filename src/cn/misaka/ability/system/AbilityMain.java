package cn.misaka.ability.system;

import java.util.ArrayList;
import java.util.List;

import cn.liutils.api.util.GenericUtils;
import cn.misaka.ability.api.ability.AbilityClass;
import cn.misaka.ability.system.classes.AbilityClassVoid;

public class AbilityMain {

	private static List<AbilityClass> classes = new ArrayList<AbilityClass>();
	static {
		classes.add(new AbilityClassVoid(0));
	}
	
	public static int registerAbility(AbilityClass ab) {
		if(classes.add(ab))
			return classes.size() - 1;
		return -1;
	}
	
	public static AbilityClass getAbility(int id) {
		return GenericUtils.safeFetchFrom(classes, id);
	}

}
