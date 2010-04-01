package com.rs2hd.model;

/**
 * Manages equipment.
 * @author Graham
 *
 */
public class Equipment {
		
	public static final int SLOT_HAT = 0, SLOT_CAPE = 1, SLOT_AMULET = 2, SLOT_WEAPON = 3, SLOT_CHEST = 4, SLOT_SHIELD = 5, SLOT_LEGS = 7, SLOT_HANDS = 9, SLOT_FEET = 10, SLOT_RING = 12, SLOT_ARROWS = 13;
	public static final String[] BONUSES = { "Stab", "Slash", "Crush", "Magic", "Range", "Stab", "Slash", "Crush", "Magic", "Range", "Strength", "Prayer" };
	
	private Container<Item> equipment = new Container<Item>(SIZE, false);
	private transient boolean specialWeapon = false;
	
	public boolean isSpecialWeapon() {
		return specialWeapon;
	}
	
	public Equipment() {
	}
	
	private transient int tempWalkAnim;
	
	public void setTempWalkAnim(int i) {
		this.tempWalkAnim = i;
	}
	public void setNoTempWalkAnim() {
		this.tempWalkAnim = -1;
	}
	
	public Item get(int slot) {
		return equipment.get(slot);
	}
	
	public void set(int slot, Item item) {
		if(slot == 3) {
			player.setAttackStyle(1);
			player.getActionSender().sendConfig(43, 0);
		}
		equipment.set(slot, item);
		refresh();
	}
	
	public void clear() {
		equipment.clear();
		refresh();
	}
	
	public void setWeapon() {
		if(player.getEquipment().get(3) == null) {
			player.getActionSender().sendTab(73, 92);
			player.getActionSender().sendString("Unarmed", 92, 0);
			specialWeapon = false;
			return;
		}
		String weapon = player.getEquipment().get(3).getDefinition().getName();
		if(weapon.equals("Abyssal whip")) {
			player.getActionSender().sendTab(player.isHd() ? 87 : 73, 93);
			player.getActionSender().sendString(weapon, 93, 0);
		} else if(weapon.equals("Granite maul") || weapon.equals("Tzhaar-ket-om") || weapon.equals("Torags hammers")) {
			player.getActionSender().sendTab(player.isHd() ? 87 : 73, 76);
			player.getActionSender().sendString(weapon, 76, 0);
		} else if(weapon.equals("Veracs flail") || weapon.endsWith("mace")) {
			player.getActionSender().sendTab(player.isHd() ? 87 : 73, 88);
			player.getActionSender().sendString(weapon, 88, 0);
		} else if(weapon.endsWith("crossbow") || weapon.endsWith(" c'bow")) {
			player.getActionSender().sendTab(player.isHd() ? 87 : 73, 79);
			player.getActionSender().sendString(weapon, 79, 0);
		} else if(weapon.endsWith("bow") || weapon.endsWith("bow full") || weapon.equals("Seercull")) {
			player.getActionSender().sendTab(player.isHd() ? 87 : 73, 77);
			player.getActionSender().sendString(weapon, 77, 0);
		} else if(weapon.startsWith("Staff") || weapon.endsWith("staff") || weapon.equals("Toktz-mej-tal")) {
			player.getActionSender().sendTab(player.isHd() ? 87 : 73, 90);
			player.getActionSender().sendString(weapon, 90, 0);
		} else if(weapon.endsWith("dart") || weapon.endsWith("knife") || weapon.endsWith("javelin") || weapon.endsWith("thrownaxe") || weapon.equals("Toktz-xil-ul")) {
			player.getActionSender().sendTab(player.isHd() ? 87 : 73, 91);
			player.getActionSender().sendString(weapon, 91, 0);
		} else if(weapon.endsWith("dagger") || weapon.endsWith("dagger(s)") || weapon.endsWith("dagger(+)") || weapon.endsWith("dagger(p)")) {
			player.getActionSender().sendTab(player.isHd() ? 87 : 73, 89);
			player.getActionSender().sendString(weapon, 89, 0);
		} else if(weapon.endsWith("pickaxe")) {
			player.getActionSender().sendTab(player.isHd() ? 87 : 73, 83);
			player.getActionSender().sendString(weapon, 83, 0);
		} else if(weapon.endsWith("axe") || weapon.endsWith("battleaxe")) {
			player.getActionSender().sendTab(player.isHd() ? 87 : 73, 75);
			player.getActionSender().sendString(weapon, 75, 0);
		} else if(weapon.endsWith("halberd")) {
			player.getActionSender().sendTab(player.isHd() ? 87 : 73, 84);
			player.getActionSender().sendString(weapon, 84, 0);
		} else if(weapon.endsWith("spear") || weapon.equals("Guthans warspear")) {
			player.getActionSender().sendTab(player.isHd() ? 87 : 73, 85);
			player.getActionSender().sendString(weapon, 85, 0);
		} else if(weapon.endsWith("claws")) {
			player.getActionSender().sendTab(player.isHd() ? 87 : 73, 78);
			player.getActionSender().sendString(weapon, 78, 0);
		} else if(weapon.endsWith("2h sword") || weapon.endsWith("godsword") || weapon.equals("Saradomin sword")) {
			player.getActionSender().sendTab(player.isHd() ? 87 : 73, 81);
			player.getActionSender().sendString(weapon, 81, 0);
		} else {
			player.getActionSender().sendTab(player.isHd() ? 87 : 73, 82);
			player.getActionSender().sendString(weapon, 82, 0);
		}
		setSpecials();
	}
	
	private void setSpecials() {
		int weaponId = get(3).getId();
		specialWeapon = false;
		if (weaponId == 4151) {
			player.getActionSender().sendInterfaceConfig(93, 10, false);
			specialWeapon = true;
		} else if (weaponId == 1215 || weaponId == 1231 || weaponId == 5680
				|| weaponId == 5698 || weaponId == 8872 || weaponId == 8874
				|| weaponId == 8876 || weaponId == 8878) {
			player.getActionSender().sendInterfaceConfig(89, 12, false);
			specialWeapon = true;
		} else if (weaponId == 35 || weaponId == 1305 || weaponId == 4587
				|| weaponId == 6746 || weaponId == 11037) {
			player.getActionSender().sendInterfaceConfig(82, 12, false);
			specialWeapon = true;
		} else if (weaponId == 7158 || weaponId == 11694 || weaponId == 11696
				|| weaponId == 11698 || weaponId == 11700 || weaponId == 11730) {
			player.getActionSender().sendInterfaceConfig(81, 12, false);
			specialWeapon = true;
		} else if (weaponId == 859 || weaponId == 861 || weaponId == 6724
				|| weaponId == 10284 || weaponId == 859 || weaponId == 11235) {
			player.getActionSender().sendInterfaceConfig(77, 13, false);
			specialWeapon = true;
		} else if (weaponId == 8880) {
			player.getActionSender().sendInterfaceConfig(79, 10, false);
			specialWeapon = true;
		} else if (weaponId == 3101) {
			player.getActionSender().sendInterfaceConfig(78, 12, false);
			specialWeapon = true;
		} else if (weaponId == 1434 || weaponId == 11061 || weaponId == 10887) {
			player.getActionSender().sendInterfaceConfig(88, 12, false);
			specialWeapon = true;
		} else if (weaponId == 1377 || weaponId == 6739) {
			player.getActionSender().sendInterfaceConfig(75, 12, false);
			specialWeapon = true;
		} else if (weaponId == 4153) {
			player.getActionSender().sendInterfaceConfig(76, 10, false);
			specialWeapon = true;
		} else if (weaponId == 3204) {
			player.getActionSender().sendInterfaceConfig(84, 10, false);
			specialWeapon = true;
		}
	}
	public int getStandAnim() {
		if(get(3) == null) {
			return 0x328;
		}
		Item item = get(3);
		String weapon = item.getDefinition().getName();
		int id = item.getDefinition().getId();
		if (id == 4718) {
			return 2065;
		} else if (id == 4755) {
			return 2061;
		} else if (id == 4734) {
			return 2074;
		} else if (id == 6528 || id == 1319) {
			return 0x811;
		} else if (weapon.equals("Saradomin staff") || weapon.equals("Guthix staff") || weapon.equals("Zamorak staff")) {
			return 0x328;
		} else if (id == 4726 || weapon.endsWith("spear") || weapon.endsWith("halberd") || weapon.contains("Staff") || weapon.contains("staff") || id == 1305) {
			return 809;
		} else if (weapon.endsWith("2h sword") || weapon.endsWith("godsword") || weapon.equals("Saradomin sword")) {
			return 7047;
		} else if (weapon.equals("Abyssal whip")) {
			return 1832;
		} else if (id == 4153) {
			return 1662;
		}
		return 0x328;
	}
	
	public int getWalkAnim() {
		if(this.tempWalkAnim != -1) {
			return this.tempWalkAnim;
		}
		if(get(3) == null) {
			return 0x333;
		}
		Item item = get(3);
		String weapon = item.getDefinition().getName();
		int id = item.getDefinition().getId();
		if(weapon.equals("Saradomin staff") || weapon.equals("Guthix staff") || weapon.equals("Zamorak staff")) {
			return 0x333;
		} else if (id == 4755) {
		   return 2060;
		} else if (id == 4734) {
		   return 2076;
		} else if (id == 4153) {
			return 1663;
		} else if (weapon.equals("Abyssal whip")) {
		   return 1660;
		} else if (id == 4718 || weapon.endsWith("2h sword") || id == 6528 || weapon.endsWith("godsword") || weapon.equals("Saradomin sword")) {
		   return 7046;
		} else if (id == 4726 || weapon.contains("spear") || weapon.endsWith("halberd") || weapon.contains("Staff") || weapon.contains("staff")) {
		   return 1146;
		}
		return 0x333;
	}
	
	public int getRunAnim() {
		if(this.tempWalkAnim != -1) {
			return this.tempWalkAnim;
		}
		if(get(3) == null) {
			return 0x338;
		}
		Item item = get(3);
		String weapon = item.getDefinition().getName();
		int id = item.getDefinition().getId(); 
		if (id == 4718 || weapon.endsWith("2h sword") || id == 6528 || weapon.endsWith("godsword") || weapon.equals("Saradomin sword")) {
			return 7039;
		} else if (weapon.equals("Saradomin staff") || weapon.equals("Guthix staff") || weapon.equals("Zamorak staff")) {
			return 0x338;
		} else if (id == 4755) {
			return 1831;
		} else if (id == 4734) {
			return 2077;
		} else if (id == 4726 || weapon.contains("Spear") || weapon.endsWith("halberd") || weapon.contains("Staff") || weapon.contains("staff")) {
			return 1210;
		} else if (weapon.equals("Abyssal whip")) {
			return 1661;
		} else if (id == 4153) {
			return 1664;
		}
		return 0x338;
	}
	
	public static boolean isTwoHanded(ItemDefinition def) {
		String wepEquiped = def.getName();
		int itemId = def.getId();
		if (itemId == 4212)
			return true;
		else if (itemId == 4214)
			return true;
		else if (wepEquiped.endsWith("2h sword"))
			return true;
		else if (wepEquiped.endsWith("longbow"))
			return true;
		else if (wepEquiped.equals("Seercull"))
			return true;
		else if (wepEquiped.endsWith("shortbow"))
			return true;
		else if (wepEquiped.endsWith("Longbow"))
			return true;
		else if (wepEquiped.endsWith("Shortbow"))
			return true;
		else if (wepEquiped.endsWith("bow full"))
			return true;
		else if (wepEquiped.endsWith("halberd"))
			return true;
		else if (wepEquiped.equals("Granite maul"))
			return true;
		else if (wepEquiped.equals("Karils crossbow"))
			return true;
		else if (wepEquiped.equals("Torags hammers"))
			return true;
		else if (wepEquiped.equals("Veracs flail"))
			return true;
		else if (wepEquiped.equals("Dharoks greataxe"))
			return true;
		else if (wepEquiped.equals("Guthans warspear"))
			return true;
		else if (wepEquiped.equals("Tzhaar-ket-om"))
			return true;
		else if (wepEquiped.endsWith("godsword"))
			return true;
		else if (wepEquiped.equals("Saradomin sword"))
			return true;
		else
			return false;
	}

	public static boolean isFullBody(ItemDefinition def) {
		String weapon = def.getName();
		for (int i = 0; i < FULL_BODY.length; i++) {
			if (weapon.contains(FULL_BODY[i])) {
				return true;
			}
		}
		return false;
	}

 
	public static boolean isFullHat(ItemDefinition def) {
		String weapon = def.getName();
		for (int i = 0; i < FULL_HAT.length; i++) {
			if (weapon.endsWith(FULL_HAT[i])) {
				return true;
			}
		}
		return false;
	}

	public static boolean isFullMask(ItemDefinition def) {
		String weapon = def.getName();
		for (int i = 0; i < FULL_MASK.length; i++) {
			if (weapon.endsWith(FULL_MASK[i])) {
				return true;
			}
		}
		return false;
	}
	
	private static final String[] CAPES = {"cape","Cape"};
	private static final String[] HATS = {"helm","hood","coif","Coif","hat","partyhat","Hat","full helm (t)","full helm (g)","hat (t)","hat (g)","cav","boater","helmet","mask","Helm of neitiznot"};
	private static final String[] BOOTS = {"boots","Boots"};
	private static final String[] GLOVES = {"gloves","gauntlets","Gloves","vambraces","vamb","bracers"};
	private static final String[] SHIELDS = {"kiteshield","sq shield","Toktz-ket","books","book","kiteshield (t)","kiteshield (g)","kiteshield(h)","defender","shield"};
	private static final String[] AMULETS = {"amulet","necklace","Amulet of"};
	private static final String[] ARROWS = {"arrow","arrows","arrow(p)","arrow(+)","arrow(s)","bolt","Bolt rack","Opal bolts","Dragon bolts"};
	private static final String[] RINGS = {"ring"};
	private static final String[] BODY = {"platebody","chainbody","robetop","leathertop","platemail","top","brassard","Robe top","body","platebody (t)","platebody (g)","body(g)","body_(g)","chestplate","torso","shirt"};
	private static final String[] LEGS = {"platelegs","plateskirt","skirt","bottoms","chaps","platelegs (t)","platelegs (g)","bottom","skirt","skirt (g)","skirt (t)","chaps (g)","chaps (t)","tassets","legs"};
	private static final String[] WEAPONS = {"scimitar","longsword","sword","longbow","shortbow","dagger","mace","halberd","spear",
	"Abyssal whip","axe","flail","crossbow","Torags hammers","dagger(p)","dagger(+)","dagger(s)","spear(p)","spear(+)",
	"spear(s)","spear(kp)","maul","dart","dart(p)","javelin","javelin(p)","knife","knife(p)","Longbow","Shortbow",
	"Crossbow","Toktz-xil","Toktz-mej","Tzhaar-ket","staff","Staff","godsword","c'bow","Crystal bow","Dark bow"};
	/* Fullbody is an item that covers your arms. */
	private static final String[] FULL_BODY = {"top","shirt","platebody","Ahrims robetop","Karils leathertop","brassard","Robe top","robetop","platebody (t)","platebody (g)","chestplate","torso"};
	/* Fullhat covers your head but not your beard. */
	private static final String[] FULL_HAT = {"med helm","coif","Dharoks helm","hood","Initiate helm","Coif","Helm of neitiznot"};
	/* Fullmask covers your entire head. */
	private static final String[] FULL_MASK = {"full helm","mask","Veracs helm","Guthans helm","Torags helm","Karils coif","full helm (t)","full helm (g)","mask"};
	public static final int SIZE = 14;

	public static int getItemType(int wearId) {
		String weapon = ItemDefinition.forId(wearId).getName();
		for(int i = 0; i < CAPES.length; i++) {
			if(weapon.contains(CAPES[i]))
				return 1;
		}
		for(int i = 0; i < HATS.length; i++) {
			if(weapon.contains(HATS[i]))
				return 0;
		}
		for(int i = 0; i < BOOTS.length; i++) {
			if(weapon.endsWith(BOOTS[i]) || weapon.startsWith(BOOTS[i]))
				return 10;
		}
		for(int i = 0; i < GLOVES.length; i++) {
			if(weapon.endsWith(GLOVES[i]) || weapon.startsWith(GLOVES[i]))
				return 9;
		}
		for(int i = 0; i < SHIELDS.length; i++) {
			if(weapon.contains(SHIELDS[i]))
				return 5;
		}
		for(int i = 0; i < AMULETS.length; i++) {
			if(weapon.endsWith(AMULETS[i]) || weapon.startsWith(AMULETS[i]))
				return 2;
		}
		for(int i = 0; i < ARROWS.length; i++) {
			if(weapon.endsWith(ARROWS[i]) || weapon.startsWith(ARROWS[i]))
				return 13;
		}
		for(int i = 0; i < RINGS.length; i++) {
			if(weapon.endsWith(RINGS[i]) || weapon.startsWith(RINGS[i]))
				return 12;
		}
		for(int i = 0; i < BODY.length; i++) {
			if(weapon.contains(BODY[i]))
				return 4;
		}
		for(int i = 0; i < LEGS.length; i++) {
			if(weapon.contains(LEGS[i]))
				return 7;
		}
		for(int i = 0; i < WEAPONS.length; i++) {
			if(weapon.endsWith(WEAPONS[i]) || weapon.startsWith(WEAPONS[i]))
				return 3;
		}
		return -1;
	}
	
	private transient Player player;
	
	public void setPlayer(Player player) {
		this.player = player;
		this.tempWalkAnim = -1;
		this.specialWeapon = false;
	}

	public void refresh() {
		setWeapon();
		player.getUpdateFlags().setAppearanceUpdateRequired(true);
		player.getActionSender().sendItems(387, 28, 94, equipment);
		player.getBonuses().refresh();
	}

	public Container<Item> getContainer() {
		return equipment;
	}
	
	public int getAttackAnimation() {
		int weapon = this.get(Equipment.SLOT_WEAPON) != null ? this.get(Equipment.SLOT_WEAPON).getId() : -1;
		int fightStyle = this.player.getAttackStyle();
		switch(weapon) {
		case 4718:
			if(fightStyle != 2) {
				return 2067;
			} else {
				return 2066;
			}
		case 11696:
		case 11694:
		case 11698:
		case 11700:
		case 1307:
		case 1309:
		case 1311:
		case 1313:
		case 1315:
		case 1317:
		case 1319:
			return 7041;
		case 9174:
		case 9175:
		case 9176:
		case 9177:
		case 9178:
		case 9179:
		case 9180:
		case 9181:
		case 9182:
		case 9183:
		case 9184:
		case 9185:
		case 9186:
			return 4230;
		case 1265:
		case 1266:
		case 1267:
		case 1268:
		case 1269:
		case 1270:
		case 1271:
		case 1272:
		case 1273:
		case 1274:
		case 1275:
		case 1276:
			return 401;
		case 4755:
			return 2062;
		case 10887:
			return 5865;
		case 4151:
			return 1658;
		case 5698:
			return 402;
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
		default:
			if(fightStyle != 2) {
				return 422;
			} else {
				return 423;
			}
		}
	}

	public int getAttackSpeed() {
		int weapon = this.get(Equipment.SLOT_WEAPON) != null ? this.get(Equipment.SLOT_WEAPON).getId() : -1;
		switch(weapon) {
		case 5698:
			return 6;
		case 4151:
			return 5;
		case 4718:
		case 4755:
			return 9;
		case 1321:
		case 1322:
		case 1323:
		case 1324:
		case 1325:
		case 1326:
		case 1327:
		case 1328:
		case 1329:
		case 1330:
		case 1331:
		case 1332:
		case 1333:
		case 1334:
		case 4587:
			return 4;
		case 11696:
		case 11694:
		case 11698:
		case 11700:
		case 1307:
		case 1309:
		case 1311:
		case 1313:
		case 1315:
		case 1317:
		case 1319:
			return 8;
		default:
			return 7;
		}
	}

	public int getDefenceAnimation() {
		int weapon = this.get(Equipment.SLOT_WEAPON) != null ? this.get(Equipment.SLOT_WEAPON).getId() : -1;
		int shield = this.get(Equipment.SLOT_SHIELD) != null ? this.get(Equipment.SLOT_SHIELD).getId() : -1;
		if(weapon == -1 && shield == -1) {
			return 404;
		}
		return 404;
	}

	public boolean isWieldindBow() {
		int weapon = this.get(Equipment.SLOT_WEAPON) != null ? this.get(Equipment.SLOT_WEAPON).getId() : -1;
		if(weapon == -1) {
			return false;
		}
		for(int bow : BOWS) {
			if(weapon == bow) {
				return true;
			}
		}
		return false;
	}
	
	private static final int[] BOWS = new int[] { 4212, 4214, 4215, 4216, 4217, 4218, 4219, 4220, 4221, 4222, 4223, 837,
    767, 4734, 839, 841, 843, 845, 847, 849, 851, 853, 855, 857, 859, 861,
    2883, 4827, 6724, 11235, 9705 ,767, 837, 4734, 10156, 11165, 13081, 9174, 9176, 9177, 9179, 9181, 9183, 9185, 8880 };
	
	public int getDrawBackGraphics() {
		int id = this.get(Equipment.SLOT_ARROWS) != null ? this.get(Equipment.SLOT_ARROWS).getId() : -1;
		if(id == 882) {
			return 19;
		} else if(id == 877 || id == 878 || id == 879 || id == 880 || id == 881 || id == 4740 || id == 6061 || id == 6062 || id == 8882 || id == 9139 || id == 9140 || id == 9141 || id == 9142 || id == 9143 || id == 9144 || id == 9145 || id == 9236 || id == 9237 || id == 9238 || id == 9239 || id == 9240 || id == 9241 || id == 9242 || id == 9243 || id == 9244 || id == 9245 || id == 9286 || id == 9287 || id == 9288 || id == 9289 || id == 9290 || id == 9291 || id == 9292 || id == 9293 || id == 9294 || id == 9295 || id == 9296 || id == 9297 || id == 9298 || id == 9299 || id == 9300 || id == 9301 || id == 9302 || id == 9303 || id == 9304 || id == 9305 || id == 9306 || id == 9335 || id == 9335 || id == 9336 || id == 9337 || id == 9338 || id == 9339 || id == 9340 || id == 9341 || id == 9342 || id == 10158 || id == 10159 || id == 13083 || id == 13084 || id == 13085 || id == 13086 || id == 13280) {
			return 28;
		} else if(id == 884) {
			return 18;
		} else if(id == 886) {
			return 20;
		} else if(id == 9706) {
			return 25;
		} else if(id == 888) {
			return 21;
		} else if(id == 890) {
			return 22;
		} else if(id == 892) {
			return 24;
		} else if(id == 2532 || id == 2534 || id == 2536 || id == 2538 || id == 2540 || id == 598) {
			return 1120;
		} else if(id == 11212) {
			return 1116;
		} else if(id == 863) {
			return 213;
		} else if(id == 864) {
			return 212;
		} else if(id == 865) {
			return 214;
		} else if(id == 866) {
			return 216;
		} else if(id == 867) {
			return 217;
		} else if(id == 868) {
			return 218;
		} else if(id == 869) {
			return 215;
		} else if(id == 806) {
			return 226;
		} else if(id == 807) {
			return 227;
		} else if(id == 808) {
			return 228;
		} else if(id == 809) {
			return 229;
		} else if(id == 810) {
			return 230;
		} else if(id == 811) {
			return 231;
		} else if(id == 3093) {
			return 229;
		} else {
			return 19;
		}
	}

	public int getProjectileId() {
		int id = this.get(Equipment.SLOT_ARROWS) != null ? this.get(Equipment.SLOT_ARROWS).getId() : -1;
		if(id == 882) {
			return 10;
		} else if(id == 877 || id == 878 || id == 879 || id == 880 || id == 881 || id == 4740 || id == 6061 || id == 6062 || id == 8882 || id == 9139 || id == 9140 || id == 9141 || id == 9142 || id == 9143 || id == 9144 || id == 9145 || id == 9236 || id == 9237 || id == 9238 || id == 9239 || id == 9240 || id == 9241 || id == 9242 || id == 9243 || id == 9244 || id == 9245 || id == 9286 || id == 9287 || id == 9288 || id == 9289 || id == 9290 || id == 9291 || id == 9292 || id == 9293 || id == 9294 || id == 9295 || id == 9296 || id == 9297 || id == 9298 || id == 9299 || id == 9300 || id == 9301 || id == 9302 || id == 9303 || id == 9304 || id == 9305 || id == 9306 || id == 9335 || id == 9335 || id == 9336 || id == 9337 || id == 9338 || id == 9339 || id == 9340 || id == 9341 || id == 9342 || id == 10158 || id == 10159 || id == 13083 || id == 13084 || id == 13085 || id == 13086 || id == 13280) {
			return 28;
		} else if(id == 9706) {
			return 25;
		} else if(id == 884) {
			return 11;
		} else if(id == 886) {
			return 12;
		} else if(id == 888) {
			return 13;
		} else if(id == 890) {
			return 14;
		} else if(id == 892) {
			return 15;
		} else if(id == 2532 || id == 2534 || id == 2536 || id == 2538 || id == 2540 || id == 598) {
			return 1120;
		} else if(id == 11212) {
			return 1099;
		} else if(this.isWieldingKnives()) {
			return 249;
		} else {
			return 10;
		}
	}
	
	private static final int[] KNIVES = new int[] { 863, 864, 865, 866, 867, 868, 869,
		870, 871, 872, 873, 874, 875, 876 };

	public boolean isWieldingKnives() {
		int id = this.get(Equipment.SLOT_ARROWS) != null ? this.get(Equipment.SLOT_ARROWS).getId() : -1;
		if(id == -1) {
			return false;
		}
		for(int knife : KNIVES) {
			if(knife == id) {
				return true;
			}
		}
		return false;
	}

	public boolean hasAmmo() {
		int id = this.get(Equipment.SLOT_ARROWS) != null ? this.get(Equipment.SLOT_ARROWS).getId() : -1;
		if(id == -1) {
			return false;
		}
		if(this.get(Equipment.SLOT_ARROWS).getAmount() <= 0) {
			return false;
		}
		if(id == 882) {
			return true;
		} else if(id == 877 || id == 878 || id == 879 || id == 880 || id == 881 || id == 4740 || id == 6061 || id == 6062 || id == 8882 || id == 9139 || id == 9140 || id == 9141 || id == 9142 || id == 9143 || id == 9144 || id == 9145 || id == 9236 || id == 9237 || id == 9238 || id == 9239 || id == 9240 || id == 9241 || id == 9242 || id == 9243 || id == 9244 || id == 9245 || id == 9286 || id == 9287 || id == 9288 || id == 9289 || id == 9290 || id == 9291 || id == 9292 || id == 9293 || id == 9294 || id == 9295 || id == 9296 || id == 9297 || id == 9298 || id == 9299 || id == 9300 || id == 9301 || id == 9302 || id == 9303 || id == 9304 || id == 9305 || id == 9306 || id == 9335 || id == 9335 || id == 9336 || id == 9337 || id == 9338 || id == 9339 || id == 9340 || id == 9341 || id == 9342 || id == 10158 || id == 10159 || id == 13083 || id == 13084 || id == 13085 || id == 13086 || id == 13280) {
			return true;
		} else if(id == 9706) {
			return true;
		} else if(id == 884) {
			return true;
		} else if(id == 886) {
			return true;
		} else if(id == 888) {
			return true;
		} else if(id == 890) {
			return true;
		} else if(id == 892) {
			return true;
		} else if(id == 2532 || id == 2534 || id == 2536 || id == 2538 || id == 2540 || id == 598) {
			return true;
		} else if(id == 11212) {
			return true;
		} else if(this.isWieldingKnives()) {
			return true;
		} else {
			return false;
		}
	}

	public Item removeAmmo() {
		Item i = this.get(Equipment.SLOT_ARROWS);
		if(i != null) {
			int amt = i.getAmount() - 1;
			if(amt <= 0) {
				this.set(Equipment.SLOT_ARROWS, null);
			} else {
				this.set(Equipment.SLOT_ARROWS, new Item(i.getId(), amt));
			}
			refresh();
			return new Item(i.getId());
		} else {
			return null;
		}
	}
	
}
