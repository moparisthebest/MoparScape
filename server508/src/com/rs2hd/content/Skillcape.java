package com.rs2hd.content;

import com.rs2hd.model.Equipment;
import com.rs2hd.model.Item;
import com.rs2hd.model.Player;
import com.rs2hd.model.Skills;

/**
 * Handles skill cape emotes.
 * @author Graham
 *
 */
public class Skillcape {
	
	/**
	 * Handles a skill cape emote: checks appropriate levels,
	 * finds the correct animation + graphic, etc.
	 * @param player
	 */
	public static void emote(Player player) {
		int skill = -1, skillcapeAnimation = -1, skillcapeGraphic = -1;
		Item cape = player.getEquipment().get(Equipment.SLOT_CAPE);
		if(cape != null) {
			switch(cape.getId()) {
			/*
			 * Attack cape.
			 */
			case 9747:
			case 9748:
				skill = 0;
				skillcapeAnimation = 4959;
				skillcapeGraphic = 823;
				break;
			/*
			 * Defense cape.
			 */
			case 9753:
			case 9754:
				skill = 1;
				skillcapeAnimation = 4961;
				skillcapeGraphic = 824;
				break;	
			/*
			 * Strength cape.
		 	 */
			case 9750:
			case 9751:
				skill = 2;
				skillcapeAnimation = 4981;
				skillcapeGraphic = 828;
				break;
			/*
			 * Hitpoints cape.
			 */
			case 9768:
			case 9769:
				skill = 3;
				skillcapeAnimation = 4971;
				skillcapeGraphic = 833;
				break;
			/*
			 * Ranging cape.	
			 */
			case 9756:
			case 9757:
				skill = 4;
				skillcapeAnimation = 4973;
				skillcapeGraphic = 832;
				break;
			/*
			 * Prayer cape.
			 */
			case 9759:
			case 9760:
				skill = 5;
				skillcapeAnimation = 4979;
				skillcapeGraphic = 829;
				break;
			/*
			 * Magic cape.
			 */
			case 9762:
			case 9763:
				skill = 6;
				skillcapeAnimation = 4939;
				skillcapeGraphic = 813;
				break;
			/*
			 * Cooking cape.
			 */
			case 9801:
			case 9802:
				skill = 7;
				skillcapeAnimation = 4955;
				skillcapeGraphic = 821;
				break;
			/*
			 * Woodcutting cape.
			 */
			case 9807:
			case 9808:
				skill = 8;
				skillcapeAnimation = 4957;
				skillcapeGraphic = 822;
				break;
			/*
			 * Fletching cape.
			 */
			case 9783:
			case 9784:
				skill = 9;
				skillcapeAnimation = 4937;
				skillcapeGraphic = 812;
				break;
			/*
			 * Fishing cape.
			 */
			case 9798:
			case 9799:
				skill = 10;
				skillcapeAnimation = 4951;
				skillcapeGraphic = 819;
				break;
			/*
			 * Firemaking cape.
			 */
			case 9804:
			case 9805:
				skill = 11;
				skillcapeAnimation = 4975;
				skillcapeGraphic = 831;
				break;
			/*
			 * Crafting cape.
			 */
			case 9780:
			case 9781:
				skill = 12;
				skillcapeAnimation = 4949;
				skillcapeGraphic = 818;
				break;
			/*
			 * Smithing cape.
			 */
			case 9795:
			case 9796:
				skill = 13;
				skillcapeAnimation = 4943;
				skillcapeGraphic = 815;
				break;
			/*
			 * Mining cape.
			 */
			case 9792:
			case 9793:
				skill = 14;
				skillcapeAnimation = 4941;
				skillcapeGraphic = 814;
				break;
			/*
			 * Herblore cape.
			 */
			case 9774:
			case 9775:
				skill = 15;
				skillcapeAnimation = 4969;
				skillcapeGraphic = 835;
				break;
			/*
			 * Agility cape.
			 */
			case 9771:
			case 9772:
				skill = 16;
				skillcapeAnimation = 4977;
				skillcapeGraphic = 830;
				break;
			/*
			 * Thieving cape.
			 */
			case 9777:
			case 9778:
				skill = 17;
				skillcapeAnimation = 4965;
				skillcapeGraphic = 826;
				break;
			/*
			 * Slayer cape.
			 */
			case 9786:
			case 9787:
				skill = 18;
				skillcapeAnimation = 4937;//need animation
				skillcapeGraphic = 812;//need graphic
				break;
			/*
			 * Farming cape.
			 */
			case 9810:
			case 9811:
				skill = 19;
				skillcapeAnimation = 4963;
				skillcapeGraphic = 825;
				break;
			/*
			 * Runecraft cape.
			 */
			case 9765:
			case 9766:
				skill = 20;
				skillcapeAnimation = 4947;
				skillcapeGraphic = 817;
				break;
			/*
			 * Hunter's cape
			 */
			case 9948:
			case 9949:
				skill = 21;
				skillcapeAnimation = 5158;
				skillcapeGraphic = 907;
				break;
			/*
			 * Construct. cape.
			 */
			case 9789:
			case 9790:
				skill = 22;
				skillcapeAnimation = 4953;
				skillcapeGraphic = 820;
				break;
			/*
			 * Summoning cape.
			 */
			case 12169:
			case 12170:
				skill = 23;
				skillcapeAnimation = 8525;
				skillcapeGraphic = 1515;
				break;
			/*
			 * Quest cape.
			 */
			case 9813:
				skillcapeAnimation = 4945;
				skillcapeGraphic = 816;
				break;
			default:
				player.getActionSender().sendMessage("You need to be wearing a skillcape to do the skillcape emote.");
				break;
			}
			if(skill == -1 || player.getSkills().getLevelForXp(skill) == 99) {
				player.animate(skillcapeAnimation);
				player.graphics(skillcapeGraphic);
			} else {
				player.getActionSender().sendMessage("You need to be level 99 " + Skills.SKILL_NAME[skill] + " to do the " + cape.getDefinition().getName() + " emote.");
			}
		} else {
			player.getActionSender().sendMessage("You need to be wearing a skillcape to do the skillcape emote.");
		}
	}

}
