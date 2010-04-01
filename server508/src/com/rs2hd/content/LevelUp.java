package com.rs2hd.content;

import com.rs2hd.model.Player;
import com.rs2hd.model.Skills;

/**
 * Level up class.
 * @author Graham
 *
 */
public class LevelUp {
	
	public static final int[] SKILL_ICON = {
		100000000, 400000000, 200000000, 450000000, 250000000, 500000000,
		300000000, 1100000000, 1250000000, 1300000000, 1050000000, 1200000000,
		800000000, 1000000000, 900000000, 650000000, 600000000, 700000000,
		1400000000, 1450000000, 850000000, 1500000000, 1600000000, 1650000000, 0,
	};
	
	public static final int[] SKILL_FLASH = {
		1, 4, 2, 64, 8, 16, 32, 32768, 131072, 2048, 16384, 65536, 1024, 8192, 4096, 256, 128,
		512, 524288, 1048576, 262144, 2097152, 4194304, 8388608, 0,
	};

	public static void levelUp(Player player, int skill) {
		player.setTemporaryAttribute("leveledUp", skill);
		player.setTemporaryAttribute("leveledUp["+skill+"]", Boolean.TRUE);
		player.graphics(199, 100);
		player.getActionSender().sendMessage("You've just advanced a " + Skills.SKILL_NAME[skill] + " level! You have reached level " + player.getSkills().getLevelForXp(skill) + ".");
		player.getActionSender().sendString("Congratulations, you have just advanced a " + Skills.SKILL_NAME[skill] + " level!", 740, 0);
		player.getActionSender().sendString("You have now reached level " + player.getSkills().getLevelForXp(skill) + ".", 740, 1);
		player.getActionSender().sendConfig(1179, SKILL_ICON[skill]);
		player.getActionSender().sendChatboxInterface(740);
	}

}
