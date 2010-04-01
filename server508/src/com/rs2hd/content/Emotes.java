package com.rs2hd.content;

import com.rs2hd.model.Player;

/**
 * Emotes helper class.
 * @author Graham
 *
 */
public class Emotes {
	
	/**
	 * Handles a player emote: does the appropriate animation.
	 * @param player
	 * @param buttonId
	 * @return
	 */
	public static boolean emote(Player player, int buttonId) {
		if (buttonId == 2) {
			player.animate(855, 0);
		} else if (buttonId == 3) {
			player.animate(856, 0);
		} else if (buttonId == 4) {
			player.animate(858, 0);
		} else if (buttonId == 5) {
			player.animate(859, 0);
		} else if (buttonId == 6) {
			player.animate(857, 0);
		} else if (buttonId == 7) {
			player.animate(863, 0);
		} else if (buttonId == 8) {
			player.animate(2113, 0);
		} else if (buttonId == 9) {
			player.animate(862, 0);
		} else if (buttonId == 10) {
			player.animate(864, 0);
		} else if (buttonId == 11) {
			player.animate(861, 0);
		} else if (buttonId == 12) {
			player.animate(2109, 0);
		} else if (buttonId == 13) {
			player.animate(2111, 0);
		} else if (buttonId == 14) {
			player.animate(866, 0);
		} else if (buttonId == 15) {
			player.animate(2106, 0);
		} else if (buttonId == 16) {
			player.animate(2107, 0);
		} else if (buttonId == 17) {
			player.animate(2108, 0);
		} else if (buttonId == 18) {
			player.animate(860, 0);
		} else if (buttonId == 19) {
			player.animate(0x558, 0);
			player.graphics(574, 0);
		} else if (buttonId == 20) {
			player.animate(2105, 0);
		} else if (buttonId == 21) {
			player.animate(2110, 0);
		} else if (buttonId == 22) {
			player.animate(865, 0);
		} else if (buttonId == 23) {
			player.animate(2112, 0);
		} else if (buttonId == 24) {
			player.animate(0x84F, 0);
		} else if (buttonId == 25) {
			player.animate(0x850, 0);
		} else if (buttonId == 26) {
			player.animate(1131, 0);
		} else if (buttonId == 27) {
			player.animate(1130, 0);
		} else if (buttonId == 28) {
			player.animate(1129, 0);
		} else if (buttonId == 29) {
			player.animate(1128, 0);
		} else if (buttonId == 30) {
			player.animate(4275, 0);
		} else if (buttonId == 31) {
			player.animate(1745, 0);
		} else if (buttonId == 32) {
			player.animate(4280, 0);
		} else if (buttonId == 33) {
			player.animate(4276, 0);
		} else if (buttonId == 34) {
			player.animate(3544, 0);
		} else if (buttonId == 35) {
			player.animate(3543, 0);
		} else if (buttonId == 36) {
			player.animate(7272, 0);
			player.graphics(1244, 0);
		} else if (buttonId == 37) {
			player.animate(2836, 0);
		} else if (buttonId == 38) {
			player.animate(6111, 0);
		} else if (buttonId == 39) {
			Skillcape.emote(player);
		} else if (buttonId == 40) {
			player.animate(7531, 0); 
		} else if (buttonId == 41) {
			player.animate(2414, 0);
			player.graphics(1537, 0);
		} else if (buttonId == 42)  {
			player.animate(8770, 0); 
			player.graphics(1553, 0);
		} else if (buttonId == 43) {
			player.animate(9990, 0);
			player.graphics(1734, 0);
		} else {
			return false;
		}
		return true;
	}

}
