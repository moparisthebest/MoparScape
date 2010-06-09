package DavidScape.Skills;

import DavidScape.players.Player;
import DavidScape.players.items.PlayerItems;


public class Smithing {
    public int xprate = 100;
    public int type = -1;
    PlayerItems pi = new PlayerItems();


    public void smithing(Player p, int Type) {

        p.frames.showInterface(p, 300);
        smithtab(p, Type);
        Iof(p, Type);
        amoutofbars(p, Type);
        LvlReq(p, Type);
        type = Type;
    }

    public void Iof(Player p, int Type) {
        p.frames.itemOnInterface(p, 300, 19, -1, Dagger(Type));  //dagger           1
        p.frames.itemOnInterface(p, 300, 27, -1, WcAxe(Type));  //axe               1
        p.frames.itemOnInterface(p, 300, 35, -1, Mace(Type));  //mace               1
        p.frames.itemOnInterface(p, 300, 43, -1, MedHelm(Type));  //medium helm       1
        p.frames.itemOnInterface(p, 300, 51, 10, Bolts(Type));  //crossbowbolt        1
        p.frames.itemOnInterface(p, 300, 59, -1, Sword(Type));  // sword              1
        p.frames.itemOnInterface(p, 300, 67, 15, DartTips(Type));  // dart tips       1
        p.frames.itemOnInterface(p, 300, 75, -1, Nails(Type));  // nails               1
        p.frames.itemOnInterface(p, 300, 91, -1, Items1(Type));  // iron spilt         1
        p.frames.itemOnInterface(p, 300, 107, 15, ArrowTips(Type));    // arrow tips    1
        p.frames.itemOnInterface(p, 300, 115, -1, Scimater(Type));  // scimitar         2
        p.frames.itemOnInterface(p, 300, 123, -1, CbowLimbs(Type));  // crosbowlimbs    1
        p.frames.itemOnInterface(p, 300, 131, -1, LongSword(Type));  // longsowrd       2
        p.frames.itemOnInterface(p, 300, 139, 5, TrowingKnife(Type));    // trowing knife  1
        p.frames.itemOnInterface(p, 300, 147, -1, FullHelm(Type));  // full helm          2
        p.frames.itemOnInterface(p, 300, 155, -1, SQShield(Type));  // square shield      2
        p.frames.itemOnInterface(p, 300, 163, -1, Lantarn(Type));  // oil lantern         1
        p.frames.itemOnInterface(p, 300, 171, -1, GrapleHook(Type));  // graple tip      1
        p.frames.itemOnInterface(p, 300, 179, -1, Warhammer(Type));  // warhammer        3
        p.frames.itemOnInterface(p, 300, 187, -1, BattleAxe(Type));  // battle axe       3
        p.frames.itemOnInterface(p, 300, 195, -1, ChainBody(Type));  // chainbody       3
        p.frames.itemOnInterface(p, 300, 203, -1, KiteShield(Type));  //kite shield     3
        p.frames.itemOnInterface(p, 300, 211, -1, Claws(Type));  // clwas               2
        p.frames.itemOnInterface(p, 300, 219, -1, TwoHandedSword(Type));  // 2 handed sword   3
        p.frames.itemOnInterface(p, 300, 227, -1, PlateSkirt(Type));  //  plate skirt         3
        p.frames.itemOnInterface(p, 300, 235, -1, PlateLegs(Type));  // plate legs             3
        p.frames.itemOnInterface(p, 300, 243, -1, PlateBody(Type));  //plate body              5
        p.frames.itemOnInterface(p, 300, 268, -1, PickAxe(Type));  //pickaxe                  2

    }

    public void amoutofbars(Player p, int Type) {
        if (pi.invItemCount(p, Bar(Type)) >= 1) {
            p.frames.setString(p, "<col=00FF00>1 Bar", 300, 21);
            p.frames.setString(p, "<col=00FF00>1 Bar", 300, 29);
            p.frames.setString(p, "<col=00FF00>1 Bar", 300, 37);
            p.frames.setString(p, "<col=00FF00>1 Bar", 300, 45);
            p.frames.setString(p, "<col=00FF00>1 Bar", 300, 53);
            p.frames.setString(p, "<col=00FF00>1 Bar", 300, 61);
            p.frames.setString(p, "<col=00FF00>1 Bar", 300, 69);
            p.frames.setString(p, "<col=00FF00>1 Bar", 300, 77);
            p.frames.setString(p, "<col=00FF00>1 Bar", 300, 93);
            p.frames.setString(p, "<col=00FF00>1 Bar", 300, 109);
            p.frames.setString(p, "<col=00FF00>1 Bar", 300, 125);
            p.frames.setString(p, "<col=00FF00>1 Bar", 300, 141);
        } else {
        }
        if (pi.invItemCount(p, Bar(Type)) >= 2) {
            p.frames.setString(p, "<col=00FF00>2 Bars", 300, 117);
            p.frames.setString(p, "<col=00FF00>2 Bars", 300, 133);
            p.frames.setString(p, "<col=00FF00>2 Bars", 300, 149);
            p.frames.setString(p, "<col=00FF00>2 Bars", 300, 157);
            p.frames.setString(p, "<col=00FF00>2 Bars", 300, 213);
            p.frames.setString(p, "<col=00FF00>2 Bars", 300, 270);
        } else {
        }
        if (pi.invItemCount(p, Bar(Type)) >= 3) {
            p.frames.setString(p, "<col=00FF00>3 Bars", 300, 181);
            p.frames.setString(p, "<col=00FF00>3 Bars", 300, 189);
            p.frames.setString(p, "<col=00FF00>3 Bars", 300, 197);
            p.frames.setString(p, "<col=00FF00>3 Bars", 300, 205);
            p.frames.setString(p, "<col=00FF00>3 Bars", 300, 221);
            p.frames.setString(p, "<col=00FF00>3 Bars", 300, 229);
            p.frames.setString(p, "<col=00FF00>3 Bars", 300, 237);
        } else {
        }
        if (pi.invItemCount(p, Bar(Type)) >= 5) {
            p.frames.setString(p, "<col=00FF00> Bars", 300, 245);
        } else {

        }
    }


    public int LvlReq(Player p, int Type) {
        switch (Type) {
            case 1:
                if (p.skillLvl[13] >= 1) {
                    p.frames.setString(p, "<col=ffffff>Dagger", 300, 20);
                    p.frames.setString(p, "<col=ffffff>Axe", 300, 28);
                }
                if (p.skillLvl[13] >= 2) {
                    p.frames.setString(p, "<col=ffffff>Mace", 300, 36);
                }
                if (p.skillLvl[13] >= 3) {
                    p.frames.setString(p, "<col=ffffff>Medium helm", 300, 44);
                    p.frames.setString(p, "<col=ffffff>Crosbow bolts", 300, 52);
                }
                if (p.skillLvl[13] >= 4) {
                    p.frames.setString(p, "<col=ffffff>Sword", 300, 60);
                    p.frames.setString(p, "<col=ffffff>Bronze wire", 300, 92);
                    p.frames.setString(p, "<col=ffffff>Dart tips", 300, 68);
                    p.frames.setString(p, "<col=ffffff>Nails", 300, 76);
                }
                if (p.skillLvl[13] >= 5) {
                    p.frames.setString(p, "<col=ffffff>Arrow heads", 300, 108);
                    p.frames.setString(p, "<col=ffffff>Scimater", 300, 116);
                    p.frames.setString(p, "<col=ffffff>Pick axe", 300, 269);

                }
                if (p.skillLvl[13] >= 6) {
                    p.frames.setString(p, "<col=ffffff>Limbs", 300, 124);
                    p.frames.setString(p, "<col=ffffff>Long sword", 300, 132);
                }
                if (p.skillLvl[13] >= 7) {
                    p.frames.setString(p, "<col=ffffff>Full helm", 300, 148);
                    p.frames.setString(p, "<col=ffffff>Trowing knife", 300, 140);
                }
                if (p.skillLvl[13] >= 8) {
                    p.frames.setString(p, "<col=ffffff>Square Shield", 300, 156);
                }
                if (p.skillLvl[13] >= 9) {
                    p.frames.setString(p, "<col=ffffff>Warhammer", 300, 180);
                }
                if (p.skillLvl[13] >= 10) {
                    p.frames.setString(p, "<col=ffffff>Battleaxe", 300, 188);
                }
                if (p.skillLvl[13] >= 11) {
                    p.frames.setString(p, "<col=ffffff>Chainbody", 300, 196);
                }
                if (p.skillLvl[13] >= 12) {
                    p.frames.setString(p, "<col=ffffff>Kite shield", 300, 204);
                }
                if (p.skillLvl[13] >= 13) {
                    p.frames.setString(p, "<col=ffffff>Claws", 300, 212);
                }
                if (p.skillLvl[13] >= 14) {
                    p.frames.setString(p, "<col=ffffff>2 hand sword", 300, 220);
                }
                if (p.skillLvl[13] >= 16) {
                    p.frames.setString(p, "<col=ffffff>Plate legs", 300, 236);
                    p.frames.setString(p, "<col=ffffff>Plate skirt", 300, 228);
                }
                if (p.skillLvl[13] >= 18) {
                    p.frames.setString(p, "<col=ffffff>Plate Body", 300, 244);
                } else {

                }
                return 1;
            case 2:

                if (p.skillLvl[13] >= 15) {
                    p.frames.setString(p, "<col=ffffff>Dagger", 300, 20);
                }
                if (p.skillLvl[13] >= 16) {
                    p.frames.setString(p, "<col=ffffff>Axe", 300, 28);
                }
                if (p.skillLvl[13] >= 17) {
                    p.frames.setString(p, "<col=ffffff>Mace", 300, 36);
                    p.frames.setString(p, "<col=ffffff>Iron split", 300, 20);
                }
                if (p.skillLvl[13] >= 18) {
                    p.frames.setString(p, "<col=ffffff>Medium helm", 300, 44);
                    p.frames.setString(p, "<col=ffffff>Crosbow bolts", 300, 52);
                }
                if (p.skillLvl[13] >= 19) {
                    p.frames.setString(p, "<col=ffffff>Sword", 300, 60);
                    p.frames.setString(p, "<col=ffffff>Dart tips", 300, 68);
                    p.frames.setString(p, "<col=ffffff>Nails", 300, 76);
                }
                if (p.skillLvl[13] >= 20) {
                    p.frames.setString(p, "<col=ffffff>Arrow heads", 300, 108);
                    p.frames.setString(p, "<col=ffffff>Scimater", 300, 116);
                    p.frames.setString(p, "<col=ffffff>Pick axe", 300, 269);
                }
                if (p.skillLvl[13] >= 21) {
                    p.frames.setString(p, "<col=ffffff>Long sword", 300, 132);
                }
                if (p.skillLvl[13] >= 22) {
                    p.frames.setString(p, "<col=ffffff>Full helm", 300, 148);
                    p.frames.setString(p, "<col=ffffff>Trowing knife", 300, 140);
                }
                if (p.skillLvl[13] >= 23) {
                    p.frames.setString(p, "<col=ffffff>Limbs", 300, 124);
                    p.frames.setString(p, "<col=ffffff>Square Shield", 300, 156);
                }
                if (p.skillLvl[13] >= 24) {
                    p.frames.setString(p, "<col=ffffff>Warhammer", 300, 180);
                }
                if (p.skillLvl[13] >= 25) {
                    p.frames.setString(p, "<col=ffffff>Battleaxe", 300, 188);
                }
                if (p.skillLvl[13] >= 26) {
                    p.frames.setString(p, "<col=ffffff>Chainbody", 300, 196);
                    p.frames.setString(p, "<col=ffffff>Oil lantern frame", 300, 20);
                }
                if (p.skillLvl[13] >= 27) {
                    p.frames.setString(p, "<col=ffffff>Kite shield", 300, 204);
                }
                if (p.skillLvl[13] >= 28) {
                    p.frames.setString(p, "<col=ffffff>Claws", 300, 212);
                }
                if (p.skillLvl[13] >= 29) {
                    p.frames.setString(p, "<col=ffffff>2 hand sword", 300, 220);
                }
                if (p.skillLvl[13] >= 31) {
                    p.frames.setString(p, "<col=ffffff>Plate legs", 300, 236);
                    p.frames.setString(p, "<col=ffffff>Plate skirt", 300, 228);
                }
                if (p.skillLvl[13] >= 33) {
                    p.frames.setString(p, "<col=ffffff>Plate Body", 300, 244);
                }
                if (p.skillLvl[13] >= 45) {
                    p.frames.setString(p, "<col=ffffff>Sheet", 300, 20);
                }
                return 2;
            case 3:

                if (p.skillLvl[13] >= 30) {
                    p.frames.setString(p, "<col=ffffff>Dagger", 300, 20);
                }
                if (p.skillLvl[13] >= 31) {
                    p.frames.setString(p, "<col=ffffff>Axe", 300, 28);
                }
                if (p.skillLvl[13] >= 32) {
                    p.frames.setString(p, "<col=ffffff>Mace", 300, 36);
                }
                if (p.skillLvl[13] >= 33) {
                    p.frames.setString(p, "<col=ffffff>Medium helm", 300, 44);
                    p.frames.setString(p, "<col=ffffff>Crosbow bolts", 300, 52);
                }
                if (p.skillLvl[13] >= 34) {
                    p.frames.setString(p, "<col=ffffff>Dart tips", 300, 68);
                    p.frames.setString(p, "<col=ffffff>Sword", 300, 60);
                    p.frames.setString(p, "<col=ffffff>Nails", 300, 76);
                }
                if (p.skillLvl[13] >= 35) {
                    p.frames.setString(p, "<col=ffffff>Arrow heads", 300, 108);
                    p.frames.setString(p, "<col=ffffff>Scimater", 300, 116);
                    p.frames.setString(p, "<col=ffffff>Pick axe", 300, 269);
                }
                if (p.skillLvl[13] >= 36) {
                    p.frames.setString(p, "<col=ffffff>Long sword", 300, 132);
                    p.frames.setString(p, "<col=ffffff>Limbs", 300, 124);
                    p.frames.setString(p, "<col=ffffff>Studs", 300, 20);
                }
                if (p.skillLvl[13] >= 37) {
                    p.frames.setString(p, "<col=ffffff>Full helm", 300, 148);
                    p.frames.setString(p, "<col=ffffff>Trowing knife", 300, 140);
                }
                if (p.skillLvl[13] >= 38) {
                    p.frames.setString(p, "<col=ffffff>Square Shield", 300, 156);
                }
                if (p.skillLvl[13] >= 39) {
                    p.frames.setString(p, "<col=ffffff>Warhammer", 300, 180);
                }
                if (p.skillLvl[13] >= 40) {
                    p.frames.setString(p, "<col=ffffff>Battleaxe", 300, 188);
                }
                if (p.skillLvl[13] >= 41) {
                    p.frames.setString(p, "<col=ffffff>Chainbody", 300, 196);
                }
                if (p.skillLvl[13] >= 42) {
                    p.frames.setString(p, "<col=ffffff>Kite shield", 300, 204);
                }
                if (p.skillLvl[13] >= 43) {
                    p.frames.setString(p, "<col=ffffff>Claws", 300, 212);
                }
                if (p.skillLvl[13] >= 44) {
                    p.frames.setString(p, "<col=ffffff>2 hand sword", 300, 220);
                }
                if (p.skillLvl[13] >= 46) {
                    p.frames.setString(p, "<col=ffffff>Plate legs", 300, 236);
                    p.frames.setString(p, "<col=ffffff>Plate skirt", 300, 228);
                }
                if (p.skillLvl[13] >= 48) {
                    p.frames.setString(p, "<col=ffffff>Plate Body", 300, 244);
                }
                if (p.skillLvl[13] >= 49) {
                    p.frames.setString(p, "<col=ffffff>Bullseye lantern", 300, 20);
                }
                return 3;
            case 4:

                if (p.skillLvl[13] >= 50) {
                    p.frames.setString(p, "<col=ffffff>Dagger", 300, 20);
                }
                if (p.skillLvl[13] >= 51) {
                    p.frames.setString(p, "<col=ffffff>Axe", 300, 28);
                }
                if (p.skillLvl[13] >= 52) {
                    p.frames.setString(p, "<col=ffffff>Mace", 300, 36);
                }
                if (p.skillLvl[13] >= 53) {
                    p.frames.setString(p, "<col=ffffff>Medium helm", 300, 44);
                    p.frames.setString(p, "<col=ffffff>Crosbow bolts", 300, 52);
                }
                if (p.skillLvl[13] >= 54) {
                    p.frames.setString(p, "<col=ffffff>Sword", 300, 60);
                    p.frames.setString(p, "<col=ffffff>Dart tips", 300, 68);
                    p.frames.setString(p, "<col=ffffff>Nails", 300, 76);
                }
                if (p.skillLvl[13] >= 55) {
                    p.frames.setString(p, "<col=ffffff>Arrow heads", 300, 108);
                    p.frames.setString(p, "<col=ffffff>Scimater", 300, 116);
                    p.frames.setString(p, "<col=ffffff>Pick axe", 300, 269);
                }
                if (p.skillLvl[13] >= 56) {
                    p.frames.setString(p, "<col=ffffff>Long sword", 300, 132);
                    p.frames.setString(p, "<col=ffffff>Limbs", 300, 124);
                }
                if (p.skillLvl[13] >= 57) {
                    p.frames.setString(p, "<col=ffffff>Full helm", 300, 148);
                    p.frames.setString(p, "<col=ffffff>Trowing knife", 300, 140);
                }
                if (p.skillLvl[13] >= 58) {

                    p.frames.setString(p, "<col=ffffff>Square Shield", 300, 156);
                }
                if (p.skillLvl[13] >= 59) {
                    p.frames.setString(p, "<col=ffffff>Grapple tips", 300, 20);
                    p.frames.setString(p, "<col=ffffff>Warhammer", 300, 180);
                }
                if (p.skillLvl[13] >= 60) {
                    p.frames.setString(p, "<col=ffffff>Battleaxe", 300, 188);
                }
                if (p.skillLvl[13] >= 61) {
                    p.frames.setString(p, "<col=ffffff>Chainbody", 300, 196);
                }
                if (p.skillLvl[13] >= 62) {
                    p.frames.setString(p, "<col=ffffff>Kite shield", 300, 204);
                }
                if (p.skillLvl[13] >= 63) {
                    p.frames.setString(p, "<col=ffffff>Claws", 300, 212);
                }
                if (p.skillLvl[13] >= 64) {
                    p.frames.setString(p, "<col=ffffff>2 hand sword", 300, 220);
                }
                if (p.skillLvl[13] >= 66) {
                    p.frames.setString(p, "<col=ffffff>Plate legs", 300, 236);
                    p.frames.setString(p, "<col=ffffff>Plate skirt", 300, 228);
                }
                if (p.skillLvl[13] >= 68) {
                    p.frames.setString(p, "<col=ffffff>Plate Body", 300, 244);
                }

                return 4;
            case 5:

                if (p.skillLvl[13] >= 70) {
                    p.frames.setString(p, "<col=ffffff>Dagger", 300, 20);
                }
                if (p.skillLvl[13] >= 71) {
                    p.frames.setString(p, "<col=ffffff>Axe", 300, 28);
                }
                if (p.skillLvl[13] >= 72) {
                    p.frames.setString(p, "<col=ffffff>Mace", 300, 36);
                }
                if (p.skillLvl[13] >= 73) {
                    p.frames.setString(p, "<col=ffffff>Medium helm", 300, 44);
                    p.frames.setString(p, "<col=ffffff>Crosbow bolts", 300, 52);
                }
                if (p.skillLvl[13] >= 74) {
                    p.frames.setString(p, "<col=ffffff>Sword", 300, 60);
                    p.frames.setString(p, "<col=ffffff>Dart tips", 300, 68);
                    p.frames.setString(p, "<col=ffffff>Nails", 300, 76);
                }
                if (p.skillLvl[13] >= 75) {
                    p.frames.setString(p, "<col=ffffff>Arrow heads", 300, 108);
                    p.frames.setString(p, "<col=ffffff>Scimater", 300, 116);
                    p.frames.setString(p, "<col=ffffff>Pick axe", 300, 269);
                }
                if (p.skillLvl[13] >= 76) {
                    p.frames.setString(p, "<col=ffffff>Long sword", 300, 132);
                    p.frames.setString(p, "<col=ffffff>Limbs", 300, 124);
                }
                if (p.skillLvl[13] >= 77) {
                    p.frames.setString(p, "<col=ffffff>Full helm", 300, 148);
                    p.frames.setString(p, "<col=ffffff>Trowing knife", 300, 140);
                }
                if (p.skillLvl[13] >= 78) {
                    p.frames.setString(p, "<col=ffffff>Square Shield", 300, 156);
                }
                if (p.skillLvl[13] >= 79) {
                    p.frames.setString(p, "<col=ffffff>Warhammer", 300, 180);
                }
                if (p.skillLvl[13] >= 80) {
                    p.frames.setString(p, "<col=ffffff>Battleaxe", 300, 188);
                }
                if (p.skillLvl[13] >= 81) {
                    p.frames.setString(p, "<col=ffffff>Chainbody", 300, 196);
                }
                if (p.skillLvl[13] >= 82) {
                    p.frames.setString(p, "<col=ffffff>Kite shield", 300, 204);
                }
                if (p.skillLvl[13] >= 83) {
                    p.frames.setString(p, "<col=ffffff>Claws", 300, 212);
                }
                if (p.skillLvl[13] >= 84) {
                    p.frames.setString(p, "<col=ffffff>2 hand sword", 300, 220);
                }
                if (p.skillLvl[13] >= 86) {
                    p.frames.setString(p, "<col=ffffff>Plate legs", 300, 236);
                    p.frames.setString(p, "<col=ffffff>Plate skirt", 300, 228);
                }
                if (p.skillLvl[13] >= 88) {
                    p.frames.setString(p, "<col=ffffff>Plate Body", 300, 244);
                }
                return 5;
            case 6:

                if (p.skillLvl[13] >= 85) {
                    p.frames.setString(p, "<col=ffffff>Dagger", 300, 20);
                }
                if (p.skillLvl[13] >= 86) {
                    p.frames.setString(p, "<col=ffffff>Axe", 300, 28);
                }
                if (p.skillLvl[13] >= 87) {
                    p.frames.setString(p, "<col=ffffff>Mace", 300, 36);
                    p.frames.setString(p, "<col=ffffff>Iron split", 300, 20);
                }
                if (p.skillLvl[13] >= 88) {
                    p.frames.setString(p, "<col=ffffff>Medium helm", 300, 44);
                    p.frames.setString(p, "<col=ffffff>Crosbow bolts", 300, 52);
                }
                if (p.skillLvl[13] >= 89) {
                    p.frames.setString(p, "<col=ffffff>Sword", 300, 60);
                    p.frames.setString(p, "<col=ffffff>Dart tips", 300, 68);
                    p.frames.setString(p, "<col=ffffff>Nails", 300, 76);
                }
                if (p.skillLvl[13] >= 90) {
                    p.frames.setString(p, "<col=ffffff>Arrow heads", 300, 108);
                    p.frames.setString(p, "<col=ffffff>Scimater", 300, 116);
                    p.frames.setString(p, "<col=ffffff>Pick axe", 300, 269);
                }
                if (p.skillLvl[13] >= 91) {
                    p.frames.setString(p, "<col=ffffff>Long sword", 300, 132);
                    p.frames.setString(p, "<col=ffffff>Limbs", 300, 124);
                }
                if (p.skillLvl[13] >= 92) {
                    p.frames.setString(p, "<col=ffffff>Full helm", 300, 148);
                    p.frames.setString(p, "<col=ffffff>Trowing knife", 300, 140);
                }
                if (p.skillLvl[13] >= 93) {
                    p.frames.setString(p, "<col=ffffff>Square Shield", 300, 156);
                }
                if (p.skillLvl[13] >= 94) {
                    p.frames.setString(p, "<col=ffffff>Warhammer", 300, 180);
                }
                if (p.skillLvl[13] >= 95) {
                    p.frames.setString(p, "<col=ffffff>Battleaxe", 300, 188);
                }
                if (p.skillLvl[13] >= 96) {
                    p.frames.setString(p, "<col=ffffff>Chainbody", 300, 196);
                }
                if (p.skillLvl[13] >= 97) {
                    p.frames.setString(p, "<col=ffffff>Kite shield", 300, 204);
                }
                if (p.skillLvl[13] >= 98) {
                    p.frames.setString(p, "<col=ffffff>Claws", 300, 212);
                }
                if (p.skillLvl[13] >= 29) {
                    p.frames.setString(p, "<col=ffffff>2 hand sword", 300, 220);
                    p.frames.setString(p, "<col=ffffff>Plate legs", 300, 236);
                    p.frames.setString(p, "<col=ffffff>Plate skirt", 300, 228);
                    p.frames.setString(p, "<col=ffffff>Plate Body", 300, 244);
                }
                return 6;
        }
        return -1;
    }


    public int smithtab(Player p, int Type) {
        switch (Type) {
            case 1:
                p.frames.setString(p, "Bronze Smithing", 300, 15);//Bronze
                return 1;
            case 2:
                p.frames.setString(p, "Iron Smithing", 300, 15);//iron
                return 2;
            case 3:
                p.frames.setString(p, "Steel Smithing", 300, 15);//steel
                return 3;
            case 4:
                p.frames.setString(p, "Mithril Smithing", 300, 15);//mithril
                return 4;
            case 5:
                p.frames.setString(p, "Adamant Smithing", 300, 15);//addmant
                return 5;
            case 6:
                p.frames.setString(p, "Rune Smithing", 300, 15);//rune
                return 6;
        }
        return -1;
    }

    public int Dagger(int type) {
        switch (type) {
            case 1://Bronze
                return 1205;
            case 2://iron
                return 1813;
            case 3://steel
                return 1207;
            case 4://mithril
                return 1209;
            case 5://addmant
                return 1211;
            case 6://rune
                return 1213;
        }
        return -1;
    }

    public int AmoutOfBars(int Button2) {
        switch (Button2) {
            case 25:
            case 24:
            case 23:
            case 22:
            case 57:
            case 56:
            case 55:
            case 54:
            case 33:
            case 32:
            case 31:
            case 30:
            case 65:
            case 64:
            case 63:
            case 62:
            case 113:
            case 112:
            case 111:
            case 110:
            case 145:
            case 144:
            case 143:
            case 142:
            case 41:
            case 40:
            case 39:
            case 38:
            case 49:
            case 48:
            case 47:
            case 46:
            case 81:
            case 80:
            case 79:
            case 78:
            case 129:
            case 128:
            case 127:
            case 126:
                return 1;
            case 121:
            case 120:
            case 119:
            case 118:
            case 137:
            case 136:
            case 135:
            case 134:
            case 153:
            case 152:
            case 151:
            case 150:
            case 161:
            case 160:
            case 159:
            case 158:
                return 2;
            case 185:
            case 184:
            case 183:
            case 182:
            case 193:
            case 192:
            case 191:
            case 190:
            case 225:
            case 224:
            case 223:
            case 222:
            case 209:
            case 208:
            case 207:
            case 206:
            case 201:
            case 200:
            case 199:
            case 198:
            case 233:
            case 232:
            case 231:
            case 230:
            case 241:
            case 240:
            case 239:
            case 238:
                return 3;
            case 249:
            case 248:
            case 247:
            case 246:
                return 5;
        }
        return -1;
    }

    public int lvlreq(int Type, int button2) {
        switch (Type) {
            case 1:
                switch (button2) {
                    case 25:
                    case 24:
                    case 23:
                    case 22:
                    case 33:
                    case 32:
                    case 31:
                    case 30:
                        return 1;
                    case 41:
                    case 40:
                    case 39:
                    case 38:
                        return 2;
                    case 49:
                    case 48:
                    case 47:
                    case 46:
                    case 57:
                    case 56:
                    case 55:
                    case 54:
                        return 3;
                    case 65:
                    case 64:
                    case 63:
                    case 62:
                    case 81:
                    case 80:
                    case 79:
                    case 78:
                        return 4;
                    case 121:
                    case 120:
                    case 119:
                    case 118:
                    case 113:
                    case 112:
                    case 111:
                    case 110:
                        return 5;
                    case 129:
                    case 128:
                    case 127:
                    case 126:
                    case 137:
                    case 136:
                    case 135:
                    case 134:
                        return 6;
                    case 153:
                    case 152:
                    case 151:
                    case 150:
                    case 145:
                    case 144:
                    case 143:
                    case 142:
                        return 7;
                    case 161:
                    case 160:
                    case 159:
                    case 158:
                        return 8;
                    case 185:
                    case 184:
                    case 183:
                    case 182:
                        return 9;
                    case 193:
                    case 192:
                    case 191:
                    case 190:
                        return 10;
                    case 201:
                    case 200:
                    case 199:
                    case 198:
                        return 11;
                    case 209:
                    case 208:
                    case 207:
                    case 206:
                        return 12;
                    case 225:
                    case 224:
                    case 223:
                    case 222:
                        return 14;
                    case 233:
                    case 232:
                    case 231:
                    case 230:
                    case 241:
                    case 240:
                    case 239:
                    case 238:
                        return 16;
                    case 249:
                    case 248:
                    case 247:
                    case 246:
                        return 18;
                }
                return -1;
            case 2:
                switch (button2) {
                    case 25:
                    case 24:
                    case 23:
                    case 22:
                        return 15;
                    case 33:
                    case 32:
                    case 31:
                    case 30:
                        return 16;
                    case 41:
                    case 40:
                    case 39:
                    case 38:
                        return 17;
                    case 49:
                    case 48:
                    case 47:
                    case 46:
                    case 57:
                    case 56:
                    case 55:
                    case 54:
                        return 18;
                    case 65:
                    case 64:
                    case 63:
                    case 62:
                    case 81:
                    case 80:
                    case 79:
                    case 78:
                        return 19;
                    case 113:
                    case 112:
                    case 111:
                    case 110:
                    case 121:
                    case 120:
                    case 119:
                    case 118:
                        return 20;
                    case 137:
                    case 136:
                    case 135:
                    case 134:
                        return 21;
                    case 145:
                    case 144:
                    case 143:
                    case 142:
                    case 153:
                    case 152:
                    case 151:
                    case 150:
                        return 22;
                    case 129:
                    case 128:
                    case 127:
                    case 126:
                    case 161:
                    case 160:
                    case 159:
                    case 158:
                        return 23;
                    case 185:
                    case 184:
                    case 183:
                    case 182:
                        return 24;
                    case 193:
                    case 192:
                    case 191:
                    case 190:
                        return 25;
                    case 201:
                    case 200:
                    case 199:
                    case 198:
                        return 26;
                    case 209:
                    case 208:
                    case 207:
                    case 206:
                        return 27;
                    case 225:
                    case 224:
                    case 223:
                    case 222:
                        return 29;
                    case 233:
                    case 232:
                    case 231:
                    case 230:
                    case 241:
                    case 240:
                    case 239:
                    case 238:
                        return 31;
                    case 249:
                    case 248:
                    case 247:
                    case 246:
                        return 33;

                }

                return -1;
            case 3:
                switch (button2) {
                    case 25:
                    case 24:
                    case 23:
                    case 22:
                        return 30;
                    case 33:
                    case 32:
                    case 31:
                    case 30:
                        return 31;
                    case 41:
                    case 40:
                    case 39:
                    case 38:
                        return 32;
                    case 49:
                    case 48:
                    case 47:
                    case 46:
                    case 57:
                    case 56:
                    case 55:
                    case 54:
                        return 33;
                    case 65:
                    case 64:
                    case 63:
                    case 62:
                    case 81:
                    case 80:
                    case 79:
                    case 78:
                        return 34;
                    case 113:
                    case 112:
                    case 111:
                    case 110:
                    case 121:
                    case 120:
                    case 119:
                    case 118:
                        return 35;
                    case 129:
                    case 128:
                    case 127:
                    case 126:
                    case 137:
                    case 136:
                    case 135:
                    case 134:
                        return 36;
                    case 145:
                    case 144:
                    case 143:
                    case 142:
                    case 153:
                    case 152:
                    case 151:
                    case 150:
                        return 37;
                    case 161:
                    case 160:
                    case 159:
                    case 158:
                        return 38;
                    case 185:
                    case 184:
                    case 183:
                    case 182:
                        return 39;
                    case 193:
                    case 192:
                    case 191:
                    case 190:
                        return 40;
                    case 201:
                    case 200:
                    case 199:
                    case 198:
                        return 41;
                    case 209:
                    case 208:
                    case 207:
                    case 206:
                        return 42;
                    case 225:
                    case 224:
                    case 223:
                    case 222:
                        return 44;
                    case 233:
                    case 232:
                    case 231:
                    case 230:
                    case 241:
                    case 240:
                    case 239:
                    case 238:
                        return 46;
                    case 249:
                    case 248:
                    case 247:
                    case 246:
                        return 48;
                }
                return -1;
            case 4:
                switch (button2) {
                    case 25:
                    case 24:
                    case 23:
                    case 22:
                        return 50;
                    case 33:
                    case 32:
                    case 31:
                    case 30:
                        return 51;
                    case 41:
                    case 40:
                    case 39:
                    case 38:
                        return 52;
                    case 49:
                    case 48:
                    case 47:
                    case 46:
                    case 57:
                    case 56:
                    case 55:
                    case 54:
                        return 53;
                    case 65:
                    case 64:
                    case 63:
                    case 62:
                    case 81:
                    case 80:
                    case 79:
                    case 78:
                        return 54;
                    case 113:
                    case 112:
                    case 111:
                    case 110:
                    case 121:
                    case 120:
                    case 119:
                    case 118:
                        return 55;
                    case 129:
                    case 128:
                    case 127:
                    case 126:
                    case 137:
                    case 136:
                    case 135:
                    case 134:
                        return 56;
                    case 145:
                    case 144:
                    case 143:
                    case 142:
                    case 153:
                    case 152:
                    case 151:
                    case 150:
                        return 57;
                    case 161:
                    case 160:
                    case 159:
                    case 158:
                        return 58;
                    case 185:
                    case 184:
                    case 183:
                    case 182:
                        return 59;
                    case 193:
                    case 192:
                    case 191:
                    case 190:
                        return 60;
                    case 201:
                    case 200:
                    case 199:
                    case 198:
                        return 61;
                    case 209:
                    case 208:
                    case 207:
                    case 206:
                        return 62;
                    case 225:
                    case 224:
                    case 223:
                    case 222:
                        return 64;
                    case 233:
                    case 232:
                    case 231:
                    case 230:
                    case 241:
                    case 240:
                    case 239:
                    case 238:
                        return 66;
                    case 249:
                    case 248:
                    case 247:
                    case 246:
                        return 68;
                }
                return -1;
            case 5:
                switch (button2) {
                    case 25:
                    case 24:
                    case 23:
                    case 22:
                        return 70;
                    case 33:
                    case 32:
                    case 31:
                    case 30:
                        return 71;
                    case 41:
                    case 40:
                    case 39:
                    case 38:
                        return 72;
                    case 49:
                    case 48:
                    case 47:
                    case 46:
                    case 57:
                    case 56:
                    case 55:
                    case 54:
                        return 73;
                    case 65:
                    case 64:
                    case 63:
                    case 62:
                    case 81:
                    case 80:
                    case 79:
                    case 78:
                        return 74;
                    case 113:
                    case 112:
                    case 111:
                    case 110:
                    case 121:
                    case 120:
                    case 119:
                    case 118:
                        return 75;
                    case 129:
                    case 128:
                    case 127:
                    case 126:
                    case 137:
                    case 136:
                    case 135:
                    case 134:
                        return 76;
                    case 145:
                    case 144:
                    case 143:
                    case 142:
                    case 153:
                    case 152:
                    case 151:
                    case 150:
                        return 77;
                    case 161:
                    case 160:
                    case 159:
                    case 158:
                        return 78;
                    case 185:
                    case 184:
                    case 183:
                    case 182:
                        return 79;
                    case 193:
                    case 192:
                    case 191:
                    case 190:
                        return 80;
                    case 201:
                    case 200:
                    case 199:
                    case 198:
                        return 81;
                    case 209:
                    case 208:
                    case 207:
                    case 206:
                        return 82;
                    case 225:
                    case 224:
                    case 223:
                    case 222:
                        return 84;
                    case 233:
                    case 232:
                    case 231:
                    case 230:
                    case 241:
                    case 240:
                    case 239:
                    case 238:
                        return 86;
                    case 249:
                    case 248:
                    case 247:
                    case 246:
                        return 88;
                }
                return -1;
            case 6:
                switch (button2) {
                    case 25:
                    case 24:
                    case 23:
                    case 22:
                        return 85;
                    case 33:
                    case 32:
                    case 31:
                    case 30:
                        return 86;
                    case 41:
                    case 40:
                    case 39:
                    case 38:
                        return 87;
                    case 49:
                    case 48:
                    case 47:
                    case 46:
                    case 57:
                    case 56:
                    case 55:
                    case 54:
                        return 88;
                    case 65:
                    case 64:
                    case 63:
                    case 62:
                    case 81:
                    case 80:
                    case 79:
                    case 78:
                        return 89;
                    case 113:
                    case 112:
                    case 111:
                    case 110:
                    case 121:
                    case 120:
                    case 119:
                    case 118:
                        return 90;
                    case 129:
                    case 128:
                    case 127:
                    case 126:
                    case 137:
                    case 136:
                    case 135:
                    case 134:
                        return 91;
                    case 145:
                    case 144:
                    case 143:
                    case 142:
                    case 153:
                    case 152:
                    case 151:
                    case 150:
                        return 92;
                    case 161:
                    case 160:
                    case 159:
                    case 158:
                        return 93;
                    case 185:
                    case 184:
                    case 183:
                    case 182:
                        return 94;
                    case 193:
                    case 192:
                    case 191:
                    case 190:
                        return 95;
                    case 201:
                    case 200:
                    case 199:
                    case 198:
                        return 96;
                    case 209:
                    case 208:
                    case 207:
                    case 206:
                        return 97;
                    case 225:
                    case 224:
                    case 223:
                    case 222:
                    case 233:
                    case 232:
                    case 231:
                    case 230:
                    case 241:
                    case 240:
                    case 239:
                    case 249:
                    case 248:
                    case 247:
                    case 246:
                    case 238:
                        return 99;

                }
        }
        return -1;
    }

    public int WcAxe(int type) {
        switch (type) {
            case 1://Bronze
                return 1351;
            case 2://iron
                return 1349;
            case 3://steel
                return 1353;
            case 4://mithril
                return 1355;
            case 5://addmant
                return 1357;
            case 6://rune
                return 1359;
        }
        return -1;
    }

    public int Mace(int type) {
        switch (type) {
            case 1://Bronze
                return 1422;
            case 2://iron
                return 1420;
            case 3://steel
                return 1424;
            case 4://mithril
                return 1428;
            case 5://addmant
                return 1430;
            case 6://rune
                return 1432;
        }
        return -1;
    }

    public int MedHelm(int type) {
        switch (type) {
            case 1://Bronze
                return 1139;
            case 2://iron
                return 1137;
            case 3://steel
                return 1141;
            case 4://mithril
                return 1143;
            case 5://addmant
                return 1145;
            case 6://rune
                return 1147;
        }
        return -1;
    }

    public int Bolts(int type) {
        switch (type) {
            case 1://Bronze
                return 877;
            case 2://iron
                return 9377;
            case 3://steel
                return 9378;
            case 4://mithril
                return 9379;
            case 5://addmant
                return 9380;
            case 6://rune
                return 9381;
        }
        return -1;
    }

    public int Sword(int type) {
        switch (type) {
            case 1://Bronze
                return 1277;
            case 2://iron
                return 1279;
            case 3://steel
                return 1281;
            case 4://mithril
                return 1285;
            case 5://addmant
                return 1287;
            case 6://rune
                return 1289;
        }
        return -1;
    }

    public int DartTips(int type) {
        switch (type) {
            case 1://Bronze
                return 819;
            case 2://iron
                return 820;
            case 3://steel
                return 821;
            case 4://mithril
                return 822;
            case 5://addmant
                return 823;
            case 6://rune
                return 824;
        }
        return -1;
    }

    public int Nails(int type) {
        switch (type) {
            case 1://Bronze
                return 4819;
            case 2://iron
                return 4820;
            case 3://steel
                return 1539;
            case 4://mithril
                return 4822;
            case 5://addmant
                return 4823;
            case 6://rune
                return 4824;
        }
        return -1;
    }

    public int Items1(int type) {
        switch (type) {
            case 1://Bronze
                return 1794;
            case 2://iron
                return 7225;
            case 3://steel
                return 2370;
            case 4://mithril
                return -1;
            case 5://addmant
                return -1;
            case 6://rune
                return -1;
        }
        return -1;
    }

    public int ArrowTips(int type) {
        switch (type) {
            case 1://Bronze
                return 39;
            case 2://iron
                return 40;
            case 3://steel
                return 41;
            case 4://mithril
                return 42;
            case 5://addmant
                return 43;
            case 6://rune
                return 44;
        }
        return -1;
    }

    public int Scimater(int type) {
        switch (type) {
            case 1://Bronze
                return 1321;
            case 2://iron
                return 1323;
            case 3://steel
                return 1325;
            case 4://mithril
                return 1329;
            case 5://addmant
                return 1331;
            case 6://rune
                return 1333;
        }
        return -1;
    }

    public int CbowLimbs(int type) {
        switch (type) {
            case 1://Bronze
                return 9420;
            case 2://iron
                return 9423;
            case 3://steel
                return 9425;
            case 4://mithril
                return 9427;
            case 5://addmant
                return 9429;
            case 6://rune
                return 9431;
        }
        return -1;
    }

    public int LongSword(int type) {
        switch (type) {
            case 1://Bronze
                return 1291;
            case 2://iron
                return 1293;
            case 3://steel
                return 1295;
            case 4://mithril
                return 1299;
            case 5://addmant
                return 1301;
            case 6://rune
                return 1303;
        }
        return -1;
    }

    public int TrowingKnife(int type) {
        switch (type) {
            case 1://Bronze
                return 864;
            case 2://iron
                return 863;
            case 3://steel
                return 865;
            case 4://mithril
                return 866;
            case 5://addmant
                return 867;
            case 6://rune
                return 868;
        }
        return -1;
    }

    public int FullHelm(int type) {
        switch (type) {
            case 1://Bronze
                return 1155;
            case 2://iron
                return 1153;
            case 3://steel
                return 1157;
            case 4://mithril
                return 1159;
            case 5://addmant
                return 1161;
            case 6://rune
                return 1163;
        }
        return -1;
    }

    public int SQShield(int type) {
        switch (type) {
            case 1://Bronze
                return 1173;
            case 2://iron
                return 1175;
            case 3://steel
                return 1177;
            case 4://mithril
                return 1181;
            case 5://addmant
                return 1183;
            case 6://rune
                return 1185;
        }
        return -1;
    }

    public int Lantarn(int type) {
        switch (type) {
            case 1://Bronze
                return 1794;
            case 2://iron
                return 7225;
            case 3://steel
                return 2370;
            case 4://mithril
                return -1;
            case 5://addmant
                return -1;
            case 6://rune
                return -1;
        }
        return -1;
    }

    public int GrapleHook(int type) {
        switch (type) {
            case 1://Bronze
                return 1794;
            case 2://iron
                return 7225;
            case 3://steel
                return 2370;
            case 4://mithril
                return -1;
            case 5://addmant
                return -1;
            case 6://rune
                return -1;
        }
        return -1;
    }

    public int Warhammer(int type) {
        switch (type) {
            case 1://Bronze
                return 2347;
            case 2://iron
                return 1335;
            case 3://steel
                return 1339;
            case 4://mithril
                return 1343;
            case 5://addmant
                return 1345;
            case 6://rune
                return 1347;
        }
        return -1;
    }

    public int BattleAxe(int type) {
        switch (type) {
            case 1://Bronze
                return 1375;
            case 2://iron
                return 1363;
            case 3://steel
                return 1365;
            case 4://mithril
                return 1369;
            case 5://addmant
                return 1371;
            case 6://rune
                return 1373;
        }
        return -1;
    }

    public int ChainBody(int type) {
        switch (type) {
            case 1://Bronze
                return 1103;
            case 2://iron
                return 1101;
            case 3://steel
                return 1105;
            case 4://mithril
                return 1109;
            case 5://addmant
                return 1111;
            case 6://rune
                return 1113;
        }
        return -1;
    }

    public int KiteShield(int type) {
        switch (type) {
            case 1://Bronze
                return 1189;
            case 2://iron
                return 1191;
            case 3://steel
                return 1193;
            case 4://mithril
                return 1197;
            case 5://addmant
                return 1199;
            case 6://rune
                return 1201;
        }
        return -1;
    }

    public int Claws(int type) {
        switch (type) {
            case 1://Bronze
                return 3095;
            case 2://iron
                return 3096;
            case 3://steel
                return 3097;
            case 4://mithril
                return 3099;
            case 5://addmant
                return 3100;
            case 6://rune
                return 3101;
        }
        return -1;
    }

    public int TwoHandedSword(int type) {
        switch (type) {
            case 1://Bronze
                return 1307;
            case 2://iron
                return 1309;
            case 3://steel
                return 1311;
            case 4://mithril
                return 1315;
            case 5://addmant
                return 1317;
            case 6://rune
                return 1319;
        }
        return -1;
    }

    public int PlateSkirt(int type) {
        switch (type) {
            case 1://Bronze
                return 1087;
            case 2://iron
                return 1081;
            case 3://steel
                return 1083;
            case 4://mithril
                return 1085;
            case 5://addmant
                return 1091;
            case 6://rune
                return 1093;
        }
        return -1;
    }

    public int PlateLegs(int type) {
        switch (type) {
            case 1://Bronze
                return 1075;
            case 2://iron
                return 1067;
            case 3://steel
                return 1069;
            case 4://mithril
                return 1071;
            case 5://addmant
                return 1073;
            case 6://rune
                return 1079;
        }
        return -1;
    }

    public int PlateBody(int type) {
        switch (type) {
            case 1://Bronze
                return 1117;
            case 2://iron
                return 1115;
            case 3://steel
                return 1119;
            case 4://mithril
                return 1121;
            case 5://addmant
                return 1123;
            case 6://rune
                return 1127;
        }
        return -1;
    }

    public int PickAxe(int type) {
        switch (type) {
            case 1://Bronze
                return 1265;
            case 2://iron
                return 1267;
            case 3://steel
                return 1269;
            case 4://mithril
                return 1273;
            case 5://addmant
                return 1271;
            case 6://rune
                return 1275;
        }
        return -1;
    }

    public int Bar(int Type) {
        switch (Type) {
            case 1:
                return 2349;
            case 2:
                return 2351;
            case 3:
                return 2353;
            case 4:
                return 2359;
            case 5:
                return 2361;
            case 6:
                return 2363;
        }
        return -1;
    }

    public void additem(Player p, int Type, int Button2) {
        switch (Button2) {
            case 22:
            case 23:
            case 24:
            case 25:
                pi.addItem(p, Dagger(Type), 1);
                break;

            case 30:
            case 31:
            case 32:
            case 33:
                pi.addItem(p, WcAxe(Type), 1);
                break;
            case 38:
            case 39:
            case 40:
            case 41:
                pi.addItem(p, Mace(Type), 1);
                break;
            case 46:
            case 47:
            case 48:
            case 49:
                pi.addItem(p, MedHelm(Type), 1);
                break;
            case 54:
            case 55:
            case 56:
            case 57:
                pi.addItem(p, Bolts(Type), 1);
                break;
            case 62:
            case 63:
            case 64:
            case 65:
                pi.addItem(p, Sword(Type), 1);
                break;
            case 78:
            case 79:
            case 80:
            case 81:
                pi.addItem(p, Nails(Type), 1);
                break;
            case 110:
            case 111:
            case 112:
            case 113:
                pi.addItem(p, ArrowTips(Type), 1);
                break;
            case 118:
            case 119:
            case 120:
            case 121:
                pi.addItem(p, Scimater(Type), 1);
                break;
            case 126:
            case 127:
            case 128:
            case 129:
                pi.addItem(p, CbowLimbs(Type), 1);
                break;
            case 134:
            case 135:
            case 136:
            case 137:
                pi.addItem(p, LongSword(Type), 1);
                break;
            case 142:
            case 143:
            case 144:
            case 145:
                pi.addItem(p, TrowingKnife(Type), 1);
                break;
            case 150:
            case 151:
            case 152:
            case 153:
                pi.addItem(p, FullHelm(Type), 1);
                break;
            case 158:
            case 159:
            case 160:
            case 161:
                pi.addItem(p, SQShield(Type), 1);
                break;
            case 182:
            case 183:
            case 184:
            case 185:
                pi.addItem(p, Warhammer(Type), 1);
                break;
            case 190:
            case 191:
            case 192:
            case 193:
                pi.addItem(p, BattleAxe(Type), 1);
                break;
            case 198:
            case 199:
            case 200:
            case 201:
                pi.addItem(p, ChainBody(Type), 1);
                break;
            case 206:
            case 207:
            case 208:
            case 209:
                pi.addItem(p, KiteShield(Type), 1);
                break;
            case 225:
            case 224:
            case 223:
            case 222:
                pi.addItem(p, TwoHandedSword(Type), 1);
                break;
            case 230:
            case 231:
            case 232:
            case 233:
                pi.addItem(p, PlateSkirt(Type), 1);
                break;
            case 238:
            case 239:
            case 240:
            case 241:
                pi.addItem(p, PlateLegs(Type), 1);
                break;
            case 246:
            case 247:
            case 248:
            case 249:
                pi.addItem(p, Nails(Type), 1);
                break;

        }
    }

    public int findItemSlot(Player p, int item) {
        for (int i = 0; i < p.items.length; i++)
            if (item == p.items[i]) return i;
        return -1;
    }

    public int XpBar(int Type) {
        switch (Type) {
            case 1:
                return 125;
            case 2:
                return 250;
            case 3:
                return 375;
            case 4:
                return 500;
            case 5:
                return 625;
            case 6:
                return 750;
        }
        return -1;
    }

    public void EarnedXp(Player p, int Type, int button2) {
        int s5 = XpBar(Type) / 10;
        int s1 = (AmoutOfBars(button2) * s5);
        p.addSkillXP(s1 * xprate / 4, 13);
    }

    public void smith(Player p, int Type, int amout, int button2) {
        boolean log = false;
        for (int i = 0; i < amout; i++) {
            if (p.skillLvl[13] >= lvlreq(Type, button2)) {
                if (pi.invItemCount(p, Bar(Type)) >= AmoutOfBars(button2)) {
                    p.frames.removeShownInterface(p);
                    pi.deleteItem(p, Bar(Type), findItemSlot(p, Bar(Type)), AmoutOfBars(button2));
                    additem(p, Type, button2);
                    EarnedXp(p, Type, button2);
                    p.requestAnim(898, 0);
                    if (pi.invItemCount(p, Bar(Type)) < AmoutOfBars(button2)) {
                        log = true;
                        p.frames.sendMessage(p, "You have run out of bars.");
                        return;
                    } else {
                        p.frames.sendMessage(p, "You used " + AmoutOfBars(button2) + " bars!");
                    }
                } else {
                    p.frames.sendMessage(p, "You do not have enough bars to make this item!");
                }
            }
        }
    }

}

