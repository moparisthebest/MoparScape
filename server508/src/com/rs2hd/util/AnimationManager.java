package com.rs2hd.util;

import com.rs2hd.model.Equipment;
import com.rs2hd.model.NPC;
import com.rs2hd.model.Player;

public class AnimationManager {
	
	/*
	 * Prevents an instance of this class being created.
	 */
	private AnimationManager() {
	}

	public static int getDeathAnimation(Player Player) {
		return 0x900;
	}

	public static int getDeathAnimation(NPC npc) {
		switch (npc.getDefinition().getId()) {
		case 2745:
			return 2654;
		default:
			return 0x900;
		}
	}

	public static int getAttackAnimation(Player player) {
		int weapon = player.getEquipment().get(Equipment.SLOT_WEAPON).getId();
		switch (weapon) {
		case 4153:
			return 1665;
		case 3190:
		case 3192:
		case 3194:
		case 3196:
		case 3198:
		case 3200:
		case 3202:
		case 3204:
			return 440; // halberd
		case 4151:
			return 1658; // whip
		case 1215:
		case 1231:
		case 5680:
		case 5698:
			return 402; // dragon dagger
		case 1307:
		case 1309:
		case 1311:
		case 1313:
		case 1315:
		case 1317:
		case 1319:
			//if (Player.getFightType() == 2)
			//	return 406;
			return 407;
		case 1277:
		case 1279:
		case 1281:
		case 1283:
		case 1285:
		case 1287:
		case 1289:
		case 1291:
		case 1293:
		case 1295:
		case 1297:
		case 1299:
		case 1301:
		case 1303:
		case 1305:
		case 1321:
		case 1323:
		case 1325:
		case 1327:
		case 1329:
		case 1331:
		case 1333:
		case 4587:
			//if (Player.getFightType() != 3)
			//	return 451; // sword slash emote for scim, sword setc.
			return 412;
		case 1349:
		case 1351:
		case 1353:
		case 1355:
		case 1357:
		case 1359:
		case 1361:
		case 1363:
		case 1365:
		case 1367:
		case 1369:
		case 1371:
		case 1373:
		case 1375:
		case 1377:
		case 6739:
			return 1833;
		case 4214:
		case 6724:
		case 861:
		case 4212:
		case 839:
		case 841:
		case 843:
		case 845:
		case 847:
		case 849:
		case 851:
		case 853:
		case 855:
		case 857:
		case 4827:
			return 426; // bows
		case 4718:
			//if (Player.getFightType() != 3)
			//	return 2067;
			return 2066;
		default:			
			//if (Player.getFightType() == 2)
			//	return 423;
			return 422;
		}
	}

	public static int getDefendAnimation(Player player) {
		int weapon = player.getEquipment().get(Equipment.SLOT_WEAPON).getId();
		int shield = player.getEquipment().get(Equipment.SLOT_SHIELD).getId();
		if (shield != -1) {
			return 403;
		}
		switch (weapon) {
		case 1307:
		case 1309:
		case 1311:
		case 1313:
		case 1315:
		case 1317:
		case 1319:
			return 410;
		default:
			return 404;
		}
	}

	public static int getAttackAnimation(NPC npc) {
		switch (npc.getDefinition().getId()) {
		case 27:
			return 426;
		case 172:
			return 711;
		case 2475:
			return 2655;
		default:
			return 422;
		}
	}

	public static int getDefendAnimation(NPC npc) {
		switch (npc.getDefinition().getId()) {
		case 81:
		case 397:
		case 1766:
		case 1767:
		case 1768:
			return 0x03B;
		case 41:
			return 0x037;
		case 87:
			return 0x08A;
		case 27:
			return 426;
		case 172:
			return 711;
		case 2475:
			return 2653;
		default:
			return 404;
		}
	}

}
