package DavidScape.io.packets;


import DavidScape.players.Player;


public class Prayer {

    public void Prayer(Player p, int buttonId) {
        int x = 0;

        for (int i = 5; i < 59; i += 2) {
            if (buttonId == i && p.skillLvl[5] > 0) {
                if (p.getLevelForXP(5) >= prayerLevel[x]) {
                    switchPrayers(p, x);
                    p.prayOn[x] = !p.prayOn[x];
                    p.frames.setConfig(p, prayerConfig[x], p.prayOn[x] ? 1 : 0);
                    if (x >= 16 && x <= 18 || x >= 21 && x <= 24) {
                        if (p.prayOn[x]) {
                            getHeadIcon(p, x);
                        } else {
                            if (p.prayOn[p.praySummon]) {
                                p.prayerIcon = 7;
                            } else {
                                p.prayerIcon = -1;
                            }
                        }
                    }
                    if (p.prayOn[x]) {
                        p.drainRate += drainRate[x];
                    } else {
                        p.drainRate -= drainRate[x];
                    }
                    p.appearanceUpdateReq = true;
                    p.updateReq = true;
                } else {
                    p.frames.sendMessage(p,
                            "You need a prayer level of " + prayerLevel[x]
                                    + " to use this.");
                }
            }
            x++;
        }
    }

    public int prayerConfig[] = {
            83, 84, 85, 862, 863, 86, 87, 88, 89, 90, 91, 864, 865, 92, 93, 94, 95,
            96, 97, 866, 867, 98, 99, 100, 1168, 1052, 1053};

    public int prayerLevel[] = {
            1, 4, 7, 8, 9, 10, 13, 16, 19, 22, 25, 26, 27, 28, 31, 34, 37, 40, 43,
            44, 45, 46, 49, 52, 35, 60, 70};

    public int drainRate[] = {
            3, 4, 5, 6, 7, 8, 9, 10, 6, 7, 6, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21,
            22, 23, 24, 15, 26, 28};

    public void getHeadIcon(Player p, int i) {
        switch (i) {
            case 16://Magic
                p.prayerIcon = 2;
                break;

            case 17://range
                p.prayerIcon = 1;
                break;

            case 18://Melee

                p.prayerIcon = 0;
                break;

            case 21://Retribution
                p.prayerIcon = 3;
                break;

            case 22:
                p.prayerIcon = 5;
                break;

            case 23://redemption
                p.prayerIcon = 4;
                break;

            case 24://summoning
                p.prayerIcon = 7;
                break;
        }
    }

    public void switchPrayers(Player p, int i) {
        switch (i) {
            case 0:
                int[] off = {5, 13, 25, 26};

                prayerOff(p, off);
                break;

            case 1:
                int[] off2 = {3, 4, 6, 11, 12, 14, 19, 20, 25, 26};

                prayerOff(p, off2);
                break;

            case 2:
                int[] off3 = {3, 4, 7, 11, 12, 15, 19, 20, 25, 26};

                prayerOff(p, off3);
                break;

            case 3:
                int[] off4 = {1, 2, 4, 6, 7, 11, 12, 14, 15, 19, 20, 25, 26};

                prayerOff(p, off4);
                break;

            case 4:
                int[] off5 = {1, 2, 3, 6, 7, 11, 12, 14, 15, 19, 20, 25, 26};

                prayerOff(p, off5);
                break;

            case 5:
                int[] off6 = {0, 13, 25, 26};

                prayerOff(p, off6);
                break;

            case 6:
                int[] off7 = {1, 3, 4, 11, 12, 14, 19, 20, 25, 26};

                prayerOff(p, off7);
                break;

            case 7:
                int[] off8 = {2, 3, 4, 11, 12, 15, 19, 20, 25, 26};

                prayerOff(p, off8);
                break;

            case 8:
            case 9:
            case 10:
                break;

            case 11:
                int[] off9 = {1, 2, 3, 4, 6, 7, 12, 14, 15, 19, 20, 25, 26};

                prayerOff(p, off9);
                break;

            case 12:
                int[] off10 = {1, 2, 3, 4, 6, 7, 11, 14, 15, 19, 20, 25, 26};

                prayerOff(p, off10);
                break;

            case 13:
                int[] off11 = {0, 5, 25, 26};

                prayerOff(p, off11);
                break;

            case 14:
                int[] off12 = {1, 3, 4, 6, 11, 12, 19, 20, 25, 26};

                prayerOff(p, off12);
                break;

            case 15:
                int[] off13 = {2, 3, 4, 7, 11, 12, 19, 20, 25, 26};

                prayerOff(p, off13);
                break;

            case 16:
                int[] off14 = {17, 18, 21, 22, 23, 24};

                prayerOff(p, off14);
                break;

            case 17:
                int[] off15 = {16, 18, 21, 22, 23, 24};

                prayerOff(p, off15);
                break;

            case 18:
                int[] off16 = {16, 17, 21, 22, 23, 24};

                prayerOff(p, off16);
                break;

            case 19:
                int[] off17 = {1, 2, 3, 4, 6, 7, 11, 12, 14, 15, 20, 25, 26};

                prayerOff(p, off17);
                break;

            case 20:
                int[] off18 = {1, 2, 3, 4, 6, 7, 11, 12, 14, 15, 19, 25, 26};

                prayerOff(p, off18);
                break;

            case 21:
                int[] off19 = {16, 17, 18, 22, 23, 24};

                prayerOff(p, off19);
                break;

            case 22:
                int[] off20 = {16, 17, 18, 21, 23, 24};

                prayerOff(p, off20);
                break;

            case 23:
                int[] off21 = {16, 17, 18, 21, 22, 24};

                prayerOff(p, off21);
                break;

            case 24:
                int[] off22 = {16, 17, 18, 21, 22, 23};

                prayerOff(p, off22);
                break;

            case 25:
                int[] off23 = {
                        0, 1, 2, 3, 4, 5, 6, 7, 11, 12, 13, 14, 15, 19, 20, 26};

                prayerOff(p, off23);
                break;

            case 26:
                int[] off24 = {
                        0, 1, 2, 3, 4, 5, 6, 7, 11, 12, 13, 14, 15, 19, 20, 25};

                prayerOff(p, off24);
                break;
        }
    }

    public void prayerOff(Player p, int[] prayers) {
        for (int z = 0; z < prayers.length; z++) {
            if (p.prayOn[prayers[z]]) {
                p.prayOn[prayers[z]] = false;
                p.frames.setConfig(p, prayerConfig[prayers[z]], 0);
                p.drainRate -= drainRate[prayers[z]];
            }
        }
    }

    public void resetPrayers(Player p) {
        for (int i = 0; i < 21; i++) {
            if (p.prayOn[i]) {
                p.prayOn[i] = false;
                p.frames.setConfig(p, prayerConfig[i], 0);
            }
        }
        p.drainRate = 0;
        p.prayerIcon = -1;
        p.appearanceUpdateReq = true;
        p.updateReq = true;
    }
}
