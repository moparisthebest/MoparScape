/*
 * Copyright (C) 2009-2013 moparisthebest
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Official forums are http://www.moparscape.org/smf/
 * Email me at admin@moparisthebest.com.
 */

public class NPCDrops {
	public int npcId;
	public int DropType;
	public int[] Items = new int[100];
	public int[] ItemsN = new int[100];
	
	public NPCDrops(int _npcId) {
		npcId = _npcId;
		for (int i = 0; i < Items.length; i++) {
			Items[i] = -1;
			ItemsN[i] = 0;
		}
	}
}
