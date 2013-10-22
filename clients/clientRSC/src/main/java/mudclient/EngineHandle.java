package mudclient;

import java.io.IOException;

public class EngineHandle {

    public void gjd(int k, int l, int i1) {
        int j1 = k / 12;
        int k1 = l / 12;
        int l1 = (k - 1) / 12;
        int i2 = (l - 1) / 12;
        glh(j1, k1, k, l, i1);
        if(j1 != l1)
            glh(l1, k1, k, l, i1);
        if(k1 != i2)
            glh(j1, i2, k, l, i1);
        if(j1 != l1 && k1 != i2)
            glh(l1, i2, k, l, i1);
    }

    public int gje(int arg0, int arg1) {
        if(arg0 < 0 || arg0 >= 96 || arg1 < 0 || arg1 >= 96)
            return 0;
        byte byte0 = 0;
        if(arg0 >= 48 && arg1 < 48) {
            byte0 = 1;
            arg0 -= 48;
        } else
        if(arg0 < 48 && arg1 >= 48) {
            byte0 = 2;
            arg1 -= 48;
        } else
        if(arg0 >= 48 && arg1 >= 48) {
            byte0 = 3;
            arg0 -= 48;
            arg1 -= 48;
        }
        return tileGroundTexture[byte0][arg0 * 48 + arg1] & 0xff;
    }

    public int getAveragedElevation(int arg0, int arg1) {
        int k = arg0 >> 7;
        int l = arg1 >> 7;
        int i1 = arg0 & 0x7f;
        int j1 = arg1 & 0x7f;
        if(k < 0 || l < 0 || k >= 95 || l >= 95)
            return 0;
        int k1;
        int l1;
        int i2;
        if(i1 <= 128 - j1) {
            k1 = gkn(k, l);
            l1 = gkn(k + 1, l) - k1;
            i2 = gkn(k, l + 1) - k1;
        } else {
            k1 = gkn(k + 1, l + 1);
            l1 = gkn(k, l + 1) - k1;
            i2 = gkn(k + 1, l) - k1;
            i1 = 128 - i1;
            j1 = 128 - j1;
        }
        int j2 = k1 + (l1 * i1) / 128 + (i2 * j1) / 128;
        return j2;
    }

    public void gjg(int k, int l, int i1) {
        tiles[k][l] |= i1;
    }

    public void loadSection(int sectionX, int sectionY, int height, int sector) {
        String filename = "m" + height + sectionX / 10 + sectionX % 10 + sectionY / 10 + sectionY % 10;
        try {
            if(landscapeFree != null) {
                byte data[] = DataOperations.loadData(filename + ".hei", 0, landscapeFree);
                if(data == null && landscapeMembers != null)
                    data = DataOperations.loadData(filename + ".hei", 0, landscapeMembers);
                if(data != null && data.length > 0) {
                    int off = 0;
                    int i2 = 0;
                    for(int tile = 0; tile < 2304;) {
                        int k3 = data[off++] & 0xff;
                        if(k3 < 128) {
                            tileGroundElevation[sector][tile++] = (byte)k3;
                            i2 = k3;
                        }
                        if(k3 >= 128) {
                            for(int k4 = 0; k4 < k3 - 128; k4++)
                                tileGroundElevation[sector][tile++] = (byte)i2;

                        }
                    }

                    i2 = 64;
                    for(int tile = 0; tile < 48; tile++) {
                        for(int l4 = 0; l4 < 48; l4++) {
                            i2 = tileGroundElevation[sector][l4 * 48 + tile] + i2 & 0x7f;
                            tileGroundElevation[sector][l4 * 48 + tile] = (byte)(i2 * 2);
                        }

                    }

                    i2 = 0;
                    for(int tile = 0; tile < 2304;) {
                        int l5 = data[off++] & 0xff;
                        if(l5 < 128) {
                            tileGroundTexture[sector][tile++] = (byte)l5;
                            i2 = l5;
                        }
                        if(l5 >= 128) {
                            for(int i7 = 0; i7 < l5 - 128; i7++)
                                tileGroundTexture[sector][tile++] = (byte)i2;

                        }
                    }

                    i2 = 35;
                    for(int i6 = 0; i6 < 48; i6++) {
                        for(int j7 = 0; j7 < 48; j7++) {
                            i2 = tileGroundTexture[sector][j7 * 48 + i6] + i2 & 0x7f;
                            tileGroundTexture[sector][j7 * 48 + i6] = (byte)(i2 * 2);
                        }

                    }

                } else {
                    for(int tile = 0; tile < 2304; tile++) {
                        tileGroundElevation[sector][tile] = 0;
                        tileGroundTexture[sector][tile] = 0;
                    }

                }
                data = DataOperations.loadData(filename + ".dat", 0, mapsFree);
                if(data == null && mapsMembers != null)
                    data = DataOperations.loadData(filename + ".dat", 0, mapsMembers);
                if(data == null || data.length == 0)
                    throw new IOException();
                int off = 0;
                for(int tile = 0; tile < 2304; tile++)
                    tileVerticalWall[sector][tile] = data[off++];

                for(int tile = 0; tile < 2304; tile++)
                    tileHorizontalWall[sector][tile] = data[off++];

                for(int tile = 0; tile < 2304; tile++)
                    tileDiagonalWall[sector][tile] = data[off++] & 0xff;

                for(int tile = 0; tile < 2304; tile++) {
                    int j6 = data[off++] & 0xff;
                    if(j6 > 0)
                        tileDiagonalWall[sector][tile] = j6 + 12000;
                }
                for(int tile = 0; tile < 2304;) {
                    int k7 = data[off++] & 0xff;
                    if(k7 < 128) {
                        tileRoofType[sector][tile++] = (byte)k7;
                    } else {
                        for(int j8 = 0; j8 < k7 - 128; j8++)
                            tileRoofType[sector][tile++] = 0;

                    }
                }

                int l7 = 0;
                for(int tile = 0; tile < 2304;) {
                    int i9 = data[off++] & 0xff;
                    if(i9 < 128) {
                        tileGroundOverlay[sector][tile++] = (byte)i9;
                        l7 = i9;
                    } else {
                        for(int l9 = 0; l9 < i9 - 128; l9++)
                            tileGroundOverlay[sector][tile++] = (byte)l7;

                    }
                }

                for(int j9 = 0; j9 < 2304;) {
                    int i10 = data[off++] & 0xff;
                    if(i10 < 128) {
                        tileObjectRotation[sector][j9++] = (byte)i10;
                    } else {
                        for(int l10 = 0; l10 < i10 - 128; l10++)
                            tileObjectRotation[sector][j9++] = 0;

                    }
                }

                data = DataOperations.loadData(filename + ".loc", 0, mapsFree);
                if(data != null && data.length > 0) {
                    int k1 = 0;
                    for(int j10 = 0; j10 < 2304;) {
                        int i11 = data[k1++] & 0xff;
                        if(i11 < 128)
                            tileDiagonalWall[sector][j10++] = i11 + 48000;
                        else
                            j10 += i11 - 128;
                    }

                    return;
                }
            } else {
                byte abyte1[] = new byte[20736];
                DataOperations.readFully("../gamedata/maps/" + filename + ".jm", abyte1, 20736);
                int l1 = 0;
                int k2 = 0;
                for(int j3 = 0; j3 < 2304; j3++) {
                    l1 = l1 + abyte1[k2++] & 0xff;
                    tileGroundElevation[sector][j3] = (byte)l1;
                }

                l1 = 0;
                for(int j4 = 0; j4 < 2304; j4++) {
                    l1 = l1 + abyte1[k2++] & 0xff;
                    tileGroundTexture[sector][j4] = (byte)l1;
                }

                for(int k5 = 0; k5 < 2304; k5++)
                    tileVerticalWall[sector][k5] = abyte1[k2++];

                for(int l6 = 0; l6 < 2304; l6++)
                    tileHorizontalWall[sector][l6] = abyte1[k2++];

                for(int i8 = 0; i8 < 2304; i8++) {
                    tileDiagonalWall[sector][i8] = (abyte1[k2] & 0xff) * 256 + (abyte1[k2 + 1] & 0xff);
                    k2 += 2;
                }

                for(int l8 = 0; l8 < 2304; l8++)
                    tileRoofType[sector][l8] = abyte1[k2++];

                for(int k9 = 0; k9 < 2304; k9++)
                    tileGroundOverlay[sector][k9] = abyte1[k2++];

                for(int k10 = 0; k10 < 2304; k10++)
                    tileObjectRotation[sector][k10] = abyte1[k2++];

            }
            return;
        }
        catch(IOException _ex) {
        }
        for(int k = 0; k < 2304; k++) {
            tileGroundElevation[sector][k] = 0;
            tileGroundTexture[sector][k] = 0;
            tileVerticalWall[sector][k] = 0;
            tileHorizontalWall[sector][k] = 0;
            tileDiagonalWall[sector][k] = 0;
            tileRoofType[sector][k] = 0;
            tileGroundOverlay[sector][k] = 0;
            if(height == 0)
                tileGroundOverlay[sector][k] = -6;
            if(height == 3)
                tileGroundOverlay[sector][k] = 8;
            tileObjectRotation[sector][k] = 0;
        }

    }

    public void gji(int arg0, int arg1, int arg2, boolean arg3) {
        int k = (arg0 + 24) / 48;
        int l = (arg1 + 24) / 48;
        loadSection(k - 1, l - 1, arg2, 0);
        loadSection(k, l - 1, arg2, 1);
        loadSection(k - 1, l, arg2, 2);
        loadSection(k, l, arg2, 3);
        gjk();
        if(gia == null)
            gia = new GameObject(18688, 18688, true, true, false, false, true);
        if(arg3) {
            ghi.clearScreen();
            for(int i1 = 0; i1 < 96; i1++) {
                for(int k1 = 0; k1 < 96; k1++)
                    tiles[i1][k1] = 0;

            }

            GameObject l1 = gia;
            l1.clk();
            for(int j2 = 0; j2 < 96; j2++) {
                for(int i3 = 0; i3 < 96; i3++) {
                    int i4 = -gkn(j2, i3);
                    if(gki(j2, i3, arg2) > 0 && Data.akh[gki(j2, i3, arg2) - 1] == 4)
                        i4 = 0;
                    if(gki(j2 - 1, i3, arg2) > 0 && Data.akh[gki(j2 - 1, i3, arg2) - 1] == 4)
                        i4 = 0;
                    if(gki(j2, i3 - 1, arg2) > 0 && Data.akh[gki(j2, i3 - 1, arg2) - 1] == 4)
                        i4 = 0;
                    if(gki(j2 - 1, i3 - 1, arg2) > 0 && Data.akh[gki(j2 - 1, i3 - 1, arg2) - 1] == 4)
                        i4 = 0;
                    int j5 = l1.cln(j2 * 128, i4, i3 * 128);
                    int j7 = (int)(Math.random() * 10D) - 5;
                    l1.cmh(j5, j7);
                }

            }

            for(int j3 = 0; j3 < 95; j3++) {
                for(int j4 = 0; j4 < 95; j4++) {
                    int k5 = gje(j3, j4);
                    int k7 = ghm[k5];
                    int i10 = k7;
                    int k12 = k7;
                    int l14 = 0;
                    if(arg2 == 1 || arg2 == 2) {
                        k7 = 0xbc614e;
                        i10 = 0xbc614e;
                        k12 = 0xbc614e;
                    }
                    if(gki(j3, j4, arg2) > 0) {
                        int l16 = gki(j3, j4, arg2);
                        int l5 = Data.akh[l16 - 1];
                        int i19 = gkd(j3, j4, arg2);
                        k7 = i10 = Data.akg[l16 - 1];
                        if(l5 == 4) {
                            k7 = 1;
                            i10 = 1;
                            if(l16 == 12) {
                                k7 = 31;
                                i10 = 31;
                            }
                        }
                        if(l5 == 5) {
                            if(glf(j3, j4) > 0 && glf(j3, j4) < 24000)
                                if(gjn(j3 - 1, j4, arg2, k12) != 0xbc614e && gjn(j3, j4 - 1, arg2, k12) != 0xbc614e) {
                                    k7 = gjn(j3 - 1, j4, arg2, k12);
                                    l14 = 0;
                                } else
                                if(gjn(j3 + 1, j4, arg2, k12) != 0xbc614e && gjn(j3, j4 + 1, arg2, k12) != 0xbc614e) {
                                    i10 = gjn(j3 + 1, j4, arg2, k12);
                                    l14 = 0;
                                } else
                                if(gjn(j3 + 1, j4, arg2, k12) != 0xbc614e && gjn(j3, j4 - 1, arg2, k12) != 0xbc614e) {
                                    i10 = gjn(j3 + 1, j4, arg2, k12);
                                    l14 = 1;
                                } else
                                if(gjn(j3 - 1, j4, arg2, k12) != 0xbc614e && gjn(j3, j4 + 1, arg2, k12) != 0xbc614e) {
                                    k7 = gjn(j3 - 1, j4, arg2, k12);
                                    l14 = 1;
                                }
                        } else
                        if(l5 != 2 || glf(j3, j4) > 0 && glf(j3, j4) < 24000)
                            if(gkd(j3 - 1, j4, arg2) != i19 && gkd(j3, j4 - 1, arg2) != i19) {
                                k7 = k12;
                                l14 = 0;
                            } else
                            if(gkd(j3 + 1, j4, arg2) != i19 && gkd(j3, j4 + 1, arg2) != i19) {
                                i10 = k12;
                                l14 = 0;
                            } else
                            if(gkd(j3 + 1, j4, arg2) != i19 && gkd(j3, j4 - 1, arg2) != i19) {
                                i10 = k12;
                                l14 = 1;
                            } else
                            if(gkd(j3 - 1, j4, arg2) != i19 && gkd(j3, j4 + 1, arg2) != i19) {
                                k7 = k12;
                                l14 = 1;
                            }
                        if(Data.aki[l16 - 1] != 0)
                            tiles[j3][j4] |= 0x40;
                        if(Data.akh[l16 - 1] == 2)
                            tiles[j3][j4] |= 0x80;
                    }
                    gkg(j3, j4, l14, k7, i10);
                    int i17 = ((gkn(j3 + 1, j4 + 1) - gkn(j3 + 1, j4)) + gkn(j3, j4 + 1)) - gkn(j3, j4);
                    if(k7 != i10 || i17 != 0) {
                        int ai[] = new int[3];
                        int ai7[] = new int[3];
                        if(l14 == 0) {
                            if(k7 != 0xbc614e) {
                                ai[0] = j4 + j3 * 96 + 96;
                                ai[1] = j4 + j3 * 96;
                                ai[2] = j4 + j3 * 96 + 1;
                                int l21 = l1.cmb(3, ai, 0xbc614e, k7);
                                selectedX[l21] = j3;
                                selectedY[l21] = j4;
                                l1.entityType[l21] = 0x30d40 + l21;
                            }
                            if(i10 != 0xbc614e) {
                                ai7[0] = j4 + j3 * 96 + 1;
                                ai7[1] = j4 + j3 * 96 + 96 + 1;
                                ai7[2] = j4 + j3 * 96 + 96;
                                int i22 = l1.cmb(3, ai7, 0xbc614e, i10);
                                selectedX[i22] = j3;
                                selectedY[i22] = j4;
                                l1.entityType[i22] = 0x30d40 + i22;
                            }
                        } else {
                            if(k7 != 0xbc614e) {
                                ai[0] = j4 + j3 * 96 + 1;
                                ai[1] = j4 + j3 * 96 + 96 + 1;
                                ai[2] = j4 + j3 * 96;
                                int j22 = l1.cmb(3, ai, 0xbc614e, k7);
                                selectedX[j22] = j3;
                                selectedY[j22] = j4;
                                l1.entityType[j22] = 0x30d40 + j22;
                            }
                            if(i10 != 0xbc614e) {
                                ai7[0] = j4 + j3 * 96 + 96;
                                ai7[1] = j4 + j3 * 96;
                                ai7[2] = j4 + j3 * 96 + 96 + 1;
                                int k22 = l1.cmb(3, ai7, 0xbc614e, i10);
                                selectedX[k22] = j3;
                                selectedY[k22] = j4;
                                l1.entityType[k22] = 0x30d40 + k22;
                            }
                        }
                    } else
                    if(k7 != 0xbc614e) {
                        int ai1[] = new int[4];
                        ai1[0] = j4 + j3 * 96 + 96;
                        ai1[1] = j4 + j3 * 96;
                        ai1[2] = j4 + j3 * 96 + 1;
                        ai1[3] = j4 + j3 * 96 + 96 + 1;
                        int l19 = l1.cmb(4, ai1, 0xbc614e, k7);
                        selectedX[l19] = j3;
                        selectedY[l19] = j4;
                        l1.entityType[l19] = 0x30d40 + l19;
                    }
                }

            }

            for(int k4 = 1; k4 < 95; k4++) {
                for(int i6 = 1; i6 < 95; i6++)
                    if(gki(k4, i6, arg2) > 0 && Data.akh[gki(k4, i6, arg2) - 1] == 4) {
                        int l7 = Data.akg[gki(k4, i6, arg2) - 1];
                        int j10 = l1.cln(k4 * 128, -gkn(k4, i6), i6 * 128);
                        int l12 = l1.cln((k4 + 1) * 128, -gkn(k4 + 1, i6), i6 * 128);
                        int i15 = l1.cln((k4 + 1) * 128, -gkn(k4 + 1, i6 + 1), (i6 + 1) * 128);
                        int j17 = l1.cln(k4 * 128, -gkn(k4, i6 + 1), (i6 + 1) * 128);
                        int ai2[] = {
                            j10, l12, i15, j17
                        };
                        int i20 = l1.cmb(4, ai2, l7, 0xbc614e);
                        selectedX[i20] = k4;
                        selectedY[i20] = i6;
                        l1.entityType[i20] = 0x30d40 + i20;
                        gkg(k4, i6, 0, l7, l7);
                    } else
                    if(gki(k4, i6, arg2) == 0 || Data.akh[gki(k4, i6, arg2) - 1] != 3) {
                        if(gki(k4, i6 + 1, arg2) > 0 && Data.akh[gki(k4, i6 + 1, arg2) - 1] == 4) {
                            int i8 = Data.akg[gki(k4, i6 + 1, arg2) - 1];
                            int k10 = l1.cln(k4 * 128, -gkn(k4, i6), i6 * 128);
                            int i13 = l1.cln((k4 + 1) * 128, -gkn(k4 + 1, i6), i6 * 128);
                            int j15 = l1.cln((k4 + 1) * 128, -gkn(k4 + 1, i6 + 1), (i6 + 1) * 128);
                            int k17 = l1.cln(k4 * 128, -gkn(k4, i6 + 1), (i6 + 1) * 128);
                            int ai3[] = {
                                k10, i13, j15, k17
                            };
                            int j20 = l1.cmb(4, ai3, i8, 0xbc614e);
                            selectedX[j20] = k4;
                            selectedY[j20] = i6;
                            l1.entityType[j20] = 0x30d40 + j20;
                            gkg(k4, i6, 0, i8, i8);
                        }
                        if(gki(k4, i6 - 1, arg2) > 0 && Data.akh[gki(k4, i6 - 1, arg2) - 1] == 4) {
                            int j8 = Data.akg[gki(k4, i6 - 1, arg2) - 1];
                            int l10 = l1.cln(k4 * 128, -gkn(k4, i6), i6 * 128);
                            int j13 = l1.cln((k4 + 1) * 128, -gkn(k4 + 1, i6), i6 * 128);
                            int k15 = l1.cln((k4 + 1) * 128, -gkn(k4 + 1, i6 + 1), (i6 + 1) * 128);
                            int l17 = l1.cln(k4 * 128, -gkn(k4, i6 + 1), (i6 + 1) * 128);
                            int ai4[] = {
                                l10, j13, k15, l17
                            };
                            int k20 = l1.cmb(4, ai4, j8, 0xbc614e);
                            selectedX[k20] = k4;
                            selectedY[k20] = i6;
                            l1.entityType[k20] = 0x30d40 + k20;
                            gkg(k4, i6, 0, j8, j8);
                        }
                        if(gki(k4 + 1, i6, arg2) > 0 && Data.akh[gki(k4 + 1, i6, arg2) - 1] == 4) {
                            int k8 = Data.akg[gki(k4 + 1, i6, arg2) - 1];
                            int i11 = l1.cln(k4 * 128, -gkn(k4, i6), i6 * 128);
                            int k13 = l1.cln((k4 + 1) * 128, -gkn(k4 + 1, i6), i6 * 128);
                            int l15 = l1.cln((k4 + 1) * 128, -gkn(k4 + 1, i6 + 1), (i6 + 1) * 128);
                            int i18 = l1.cln(k4 * 128, -gkn(k4, i6 + 1), (i6 + 1) * 128);
                            int ai5[] = {
                                i11, k13, l15, i18
                            };
                            int l20 = l1.cmb(4, ai5, k8, 0xbc614e);
                            selectedX[l20] = k4;
                            selectedY[l20] = i6;
                            l1.entityType[l20] = 0x30d40 + l20;
                            gkg(k4, i6, 0, k8, k8);
                        }
                        if(gki(k4 - 1, i6, arg2) > 0 && Data.akh[gki(k4 - 1, i6, arg2) - 1] == 4) {
                            int l8 = Data.akg[gki(k4 - 1, i6, arg2) - 1];
                            int j11 = l1.cln(k4 * 128, -gkn(k4, i6), i6 * 128);
                            int l13 = l1.cln((k4 + 1) * 128, -gkn(k4 + 1, i6), i6 * 128);
                            int i16 = l1.cln((k4 + 1) * 128, -gkn(k4 + 1, i6 + 1), (i6 + 1) * 128);
                            int j18 = l1.cln(k4 * 128, -gkn(k4, i6 + 1), (i6 + 1) * 128);
                            int ai6[] = {
                                j11, l13, i16, j18
                            };
                            int i21 = l1.cmb(4, ai6, l8, 0xbc614e);
                            selectedX[i21] = k4;
                            selectedY[i21] = i6;
                            l1.entityType[i21] = 0x30d40 + i21;
                            gkg(k4, i6, 0, l8, l8);
                        }
                    }

            }

            l1.cme(true, 40, 48, -50, -10, -50);
            ghn = gia.cmc(0, 0, 1536, 1536, 8, 64, 233, false);
            for(int j6 = 0; j6 < 64; j6++)
                ghj.addModel(ghn[j6]);

            for(int i9 = 0; i9 < 96; i9++) {
                for(int k11 = 0; k11 < 96; k11++)
                    gib[i9][k11] = gkn(i9, k11);

            }

        }
        gia.clk();
        int j1 = 0x606060;
        for(int i2 = 0; i2 < 95; i2++) {
            for(int k2 = 0; k2 < 95; k2++) {
                int k3 = gle(i2, k2);
                if(k3 > 0 && (Data.wallObjectUnknown[k3 - 1] == 0 || ghh)) {
                    gli(gia, k3 - 1, i2, k2, i2 + 1, k2);
                    if(arg3 && Data.wallObjectType[k3 - 1] != 0) {
                        tiles[i2][k2] |= 1;
                        if(k2 > 0)
                            gjg(i2, k2 - 1, 4);
                    }
                    if(arg3)
                        ghi.drawLineX(i2 * 3, k2 * 3, 3, j1);
                }
                k3 = gld(i2, k2);
                if(k3 > 0 && (Data.wallObjectUnknown[k3 - 1] == 0 || ghh)) {
                    gli(gia, k3 - 1, i2, k2, i2, k2 + 1);
                    if(arg3 && Data.wallObjectType[k3 - 1] != 0) {
                        tiles[i2][k2] |= 2;
                        if(i2 > 0)
                            gjg(i2 - 1, k2, 8);
                    }
                    if(arg3)
                        ghi.drawLineY(i2 * 3, k2 * 3, 3, j1);
                }
                k3 = glf(i2, k2);
                if(k3 > 0 && k3 < 12000 && (Data.wallObjectUnknown[k3 - 1] == 0 || ghh)) {
                    gli(gia, k3 - 1, i2, k2, i2 + 1, k2 + 1);
                    if(arg3 && Data.wallObjectType[k3 - 1] != 0)
                        tiles[i2][k2] |= 0x20;
                    if(arg3) {
                        ghi.drawMinimapPixel(i2 * 3, k2 * 3, j1);
                        ghi.drawMinimapPixel(i2 * 3 + 1, k2 * 3 + 1, j1);
                        ghi.drawMinimapPixel(i2 * 3 + 2, k2 * 3 + 2, j1);
                    }
                }
                if(k3 > 12000 && k3 < 24000 && (Data.wallObjectUnknown[k3 - 12001] == 0 || ghh)) {
                    gli(gia, k3 - 12001, i2 + 1, k2, i2, k2 + 1);
                    if(arg3 && Data.wallObjectType[k3 - 12001] != 0)
                        tiles[i2][k2] |= 0x10;
                    if(arg3) {
                        ghi.drawMinimapPixel(i2 * 3 + 2, k2 * 3, j1);
                        ghi.drawMinimapPixel(i2 * 3 + 1, k2 * 3 + 1, j1);
                        ghi.drawMinimapPixel(i2 * 3, k2 * 3 + 2, j1);
                    }
                }
            }

        }

        if(arg3)
            ghi.cbn(gjc - 1, 0, 0, 285, 285);
        gia.cme(false, 60, 24, -50, -10, -50);
        gim[arg2] = gia.cmc(0, 0, 1536, 1536, 8, 64, 338, true);
        for(int l2 = 0; l2 < 64; l2++)
            ghj.addModel(gim[arg2][l2]);

        for(int l3 = 0; l3 < 95; l3++) {
            for(int l4 = 0; l4 < 95; l4++) {
                int k6 = gle(l3, l4);
                if(k6 > 0)
                    gkh(k6 - 1, l3, l4, l3 + 1, l4);
                k6 = gld(l3, l4);
                if(k6 > 0)
                    gkh(k6 - 1, l3, l4, l3, l4 + 1);
                k6 = glf(l3, l4);
                if(k6 > 0 && k6 < 12000)
                    gkh(k6 - 1, l3, l4, l3 + 1, l4 + 1);
                if(k6 > 12000 && k6 < 24000)
                    gkh(k6 - 12001, l3 + 1, l4, l3, l4 + 1);
            }

        }

        for(int i5 = 1; i5 < 95; i5++) {
            for(int l6 = 1; l6 < 95; l6++) {
                int j9 = glb(i5, l6);
                if(j9 > 0) {
                    int l11 = i5;
                    int i14 = l6;
                    int j16 = i5 + 1;
                    int k18 = l6;
                    int j19 = i5 + 1;
                    int j21 = l6 + 1;
                    int l22 = i5;
                    int j23 = l6 + 1;
                    int l23 = 0;
                    int j24 = gib[l11][i14];
                    int l24 = gib[j16][k18];
                    int j25 = gib[j19][j21];
                    int l25 = gib[l22][j23];
                    if(j24 > 0x13880)
                        j24 -= 0x13880;
                    if(l24 > 0x13880)
                        l24 -= 0x13880;
                    if(j25 > 0x13880)
                        j25 -= 0x13880;
                    if(l25 > 0x13880)
                        l25 -= 0x13880;
                    if(j24 > l23)
                        l23 = j24;
                    if(l24 > l23)
                        l23 = l24;
                    if(j25 > l23)
                        l23 = j25;
                    if(l25 > l23)
                        l23 = l25;
                    if(l23 >= 0x13880)
                        l23 -= 0x13880;
                    if(j24 < 0x13880)
                        gib[l11][i14] = l23;
                    else
                        gib[l11][i14] -= 0x13880;
                    if(l24 < 0x13880)
                        gib[j16][k18] = l23;
                    else
                        gib[j16][k18] -= 0x13880;
                    if(j25 < 0x13880)
                        gib[j19][j21] = l23;
                    else
                        gib[j19][j21] -= 0x13880;
                    if(l25 < 0x13880)
                        gib[l22][j23] = l23;
                    else
                        gib[l22][j23] -= 0x13880;
                }
            }

        }

        gia.clk();
        for(int i7 = 1; i7 < 95; i7++) {
            for(int k9 = 1; k9 < 95; k9++) {
                int i12 = glb(i7, k9);
                if(i12 > 0) {
                    int j14 = i7;
                    int k16 = k9;
                    int l18 = i7 + 1;
                    int k19 = k9;
                    int k21 = i7 + 1;
                    int i23 = k9 + 1;
                    int k23 = i7;
                    int i24 = k9 + 1;
                    int k24 = i7 * 128;
                    int i25 = k9 * 128;
                    int k25 = k24 + 128;
                    int i26 = i25 + 128;
                    int j26 = k24;
                    int k26 = i25;
                    int l26 = k25;
                    int i27 = i26;
                    int j27 = gib[j14][k16];
                    int k27 = gib[l18][k19];
                    int l27 = gib[k21][i23];
                    int i28 = gib[k23][i24];
                    int j28 = Data.alm[i12 - 1];
                    if(gkm(j14, k16) && j27 < 0x13880) {
                        j27 += j28 + 0x13880;
                        gib[j14][k16] = j27;
                    }
                    if(gkm(l18, k19) && k27 < 0x13880) {
                        k27 += j28 + 0x13880;
                        gib[l18][k19] = k27;
                    }
                    if(gkm(k21, i23) && l27 < 0x13880) {
                        l27 += j28 + 0x13880;
                        gib[k21][i23] = l27;
                    }
                    if(gkm(k23, i24) && i28 < 0x13880) {
                        i28 += j28 + 0x13880;
                        gib[k23][i24] = i28;
                    }
                    if(j27 >= 0x13880)
                        j27 -= 0x13880;
                    if(k27 >= 0x13880)
                        k27 -= 0x13880;
                    if(l27 >= 0x13880)
                        l27 -= 0x13880;
                    if(i28 >= 0x13880)
                        i28 -= 0x13880;
                    byte byte0 = 16;
                    if(!gkl(j14 - 1, k16))
                        k24 -= byte0;
                    if(!gkl(j14 + 1, k16))
                        k24 += byte0;
                    if(!gkl(j14, k16 - 1))
                        i25 -= byte0;
                    if(!gkl(j14, k16 + 1))
                        i25 += byte0;
                    if(!gkl(l18 - 1, k19))
                        k25 -= byte0;
                    if(!gkl(l18 + 1, k19))
                        k25 += byte0;
                    if(!gkl(l18, k19 - 1))
                        k26 -= byte0;
                    if(!gkl(l18, k19 + 1))
                        k26 += byte0;
                    if(!gkl(k21 - 1, i23))
                        l26 -= byte0;
                    if(!gkl(k21 + 1, i23))
                        l26 += byte0;
                    if(!gkl(k21, i23 - 1))
                        i26 -= byte0;
                    if(!gkl(k21, i23 + 1))
                        i26 += byte0;
                    if(!gkl(k23 - 1, i24))
                        j26 -= byte0;
                    if(!gkl(k23 + 1, i24))
                        j26 += byte0;
                    if(!gkl(k23, i24 - 1))
                        i27 -= byte0;
                    if(!gkl(k23, i24 + 1))
                        i27 += byte0;
                    i12 = Data.aln[i12 - 1];
                    j27 = -j27;
                    k27 = -k27;
                    l27 = -l27;
                    i28 = -i28;
                    if(glf(i7, k9) > 12000 && glf(i7, k9) < 24000 && glb(i7 - 1, k9 - 1) == 0) {
                        int ai8[] = new int[3];
                        ai8[0] = gia.cln(l26, l27, i26);
                        ai8[1] = gia.cln(j26, i28, i27);
                        ai8[2] = gia.cln(k25, k27, k26);
                        gia.cmb(3, ai8, i12, 0xbc614e);
                    } else
                    if(glf(i7, k9) > 12000 && glf(i7, k9) < 24000 && glb(i7 + 1, k9 + 1) == 0) {
                        int ai9[] = new int[3];
                        ai9[0] = gia.cln(k24, j27, i25);
                        ai9[1] = gia.cln(k25, k27, k26);
                        ai9[2] = gia.cln(j26, i28, i27);
                        gia.cmb(3, ai9, i12, 0xbc614e);
                    } else
                    if(glf(i7, k9) > 0 && glf(i7, k9) < 12000 && glb(i7 + 1, k9 - 1) == 0) {
                        int ai10[] = new int[3];
                        ai10[0] = gia.cln(j26, i28, i27);
                        ai10[1] = gia.cln(k24, j27, i25);
                        ai10[2] = gia.cln(l26, l27, i26);
                        gia.cmb(3, ai10, i12, 0xbc614e);
                    } else
                    if(glf(i7, k9) > 0 && glf(i7, k9) < 12000 && glb(i7 - 1, k9 + 1) == 0) {
                        int ai11[] = new int[3];
                        ai11[0] = gia.cln(k25, k27, k26);
                        ai11[1] = gia.cln(l26, l27, i26);
                        ai11[2] = gia.cln(k24, j27, i25);
                        gia.cmb(3, ai11, i12, 0xbc614e);
                    } else
                    if(j27 == k27 && l27 == i28) {
                        int ai12[] = new int[4];
                        ai12[0] = gia.cln(k24, j27, i25);
                        ai12[1] = gia.cln(k25, k27, k26);
                        ai12[2] = gia.cln(l26, l27, i26);
                        ai12[3] = gia.cln(j26, i28, i27);
                        gia.cmb(4, ai12, i12, 0xbc614e);
                    } else
                    if(j27 == i28 && k27 == l27) {
                        int ai13[] = new int[4];
                        ai13[0] = gia.cln(j26, i28, i27);
                        ai13[1] = gia.cln(k24, j27, i25);
                        ai13[2] = gia.cln(k25, k27, k26);
                        ai13[3] = gia.cln(l26, l27, i26);
                        gia.cmb(4, ai13, i12, 0xbc614e);
                    } else {
                        boolean flag = true;
                        if(glb(i7 - 1, k9 - 1) > 0)
                            flag = false;
                        if(glb(i7 + 1, k9 + 1) > 0)
                            flag = false;
                        if(!flag) {
                            int ai14[] = new int[3];
                            ai14[0] = gia.cln(k25, k27, k26);
                            ai14[1] = gia.cln(l26, l27, i26);
                            ai14[2] = gia.cln(k24, j27, i25);
                            gia.cmb(3, ai14, i12, 0xbc614e);
                            int ai16[] = new int[3];
                            ai16[0] = gia.cln(j26, i28, i27);
                            ai16[1] = gia.cln(k24, j27, i25);
                            ai16[2] = gia.cln(l26, l27, i26);
                            gia.cmb(3, ai16, i12, 0xbc614e);
                        } else {
                            int ai15[] = new int[3];
                            ai15[0] = gia.cln(k24, j27, i25);
                            ai15[1] = gia.cln(k25, k27, k26);
                            ai15[2] = gia.cln(j26, i28, i27);
                            gia.cmb(3, ai15, i12, 0xbc614e);
                            int ai17[] = new int[3];
                            ai17[0] = gia.cln(l26, l27, i26);
                            ai17[1] = gia.cln(j26, i28, i27);
                            ai17[2] = gia.cln(k25, k27, k26);
                            gia.cmb(3, ai17, i12, 0xbc614e);
                        }
                    }
                }
            }

        }

        gia.cme(true, 50, 50, -50, -10, -50);
        gih[arg2] = gia.cmc(0, 0, 1536, 1536, 8, 64, 169, true);
        for(int l9 = 0; l9 < 64; l9++)
            ghj.addModel(gih[arg2][l9]);

        if(gih[arg2][0] == null)
            throw new RuntimeException("null roof!");
        for(int j12 = 0; j12 < 96; j12++) {
            for(int k14 = 0; k14 < 96; k14++)
                if(gib[j12][k14] >= 0x13880)
                    gib[j12][k14] -= 0x13880;

        }

    }

    public void loadSection(int k, int l, int i1) {
        gkk();
        int j1 = (k + 24) / 48;
        int k1 = (l + 24) / 48;
        gji(k, l, i1, true);
        if(i1 == 0) {
            gji(k, l, 1, false);
            gji(k, l, 2, false);
            loadSection(j1 - 1, k1 - 1, i1, 0);
            loadSection(j1, k1 - 1, i1, 1);
            loadSection(j1 - 1, k1, i1, 2);
            loadSection(j1, k1, i1, 3);
            gjk();
        }
    }

    public void gjk() {
        for(int k = 0; k < 96; k++) {
            for(int l = 0; l < 96; l++)
                if(gki(k, l, 0) == 250)
                    if(k == 47 && gki(k + 1, l, 0) != 250 && gki(k + 1, l, 0) != 2)
                        glc(k, l, 9);
                    else
                    if(l == 47 && gki(k, l + 1, 0) != 250 && gki(k, l + 1, 0) != 2)
                        glc(k, l, 9);
                    else
                        glc(k, l, 2);

        }

    }

    public int generatePath(int curX, int curY, int bottomDestX, int bottomDestY, int upperDestX, int upperDestY, int pathX[], 
            int pathY[], boolean checkForObjects) {
        for(int k = 0; k < 96; k++) {
            for(int l = 0; l < 96; l++)
                steps[k][l] = 0;

        }

        int requiredSteps = 0;
        int stepCount = 0;
        int x = curX;
        int y = curY;
        steps[curX][curY] = 99;
        pathX[requiredSteps] = curX;
        pathY[requiredSteps++] = curY;
        int i2 = pathX.length;
        boolean foundPath = false;
        while(stepCount != requiredSteps)  {
            x = pathX[stepCount];
            y = pathY[stepCount];
            stepCount = (stepCount + 1) % i2;
            if(x >= bottomDestX && x <= upperDestX && y >= bottomDestY && y <= upperDestY) {
                foundPath = true;
                break;
            }
            if(checkForObjects) {
                if(x > 0 && x - 1 >= bottomDestX && x - 1 <= upperDestX && y >= bottomDestY && y <= upperDestY && (tiles[x - 1][y] & 8) == 0) {
                    foundPath = true;
                    break;
                }
                if(x < 95 && x + 1 >= bottomDestX && x + 1 <= upperDestX && y >= bottomDestY && y <= upperDestY && (tiles[x + 1][y] & 2) == 0) {
                    foundPath = true;
                    break;
                }
                if(y > 0 && x >= bottomDestX && x <= upperDestX && y - 1 >= bottomDestY && y - 1 <= upperDestY && (tiles[x][y - 1] & 4) == 0) {
                    foundPath = true;
                    break;
                }
                if(y < 95 && x >= bottomDestX && x <= upperDestX && y + 1 >= bottomDestY && y + 1 <= upperDestY && (tiles[x][y + 1] & 1) == 0) {
                    foundPath = true;
                    break;
                }
            }
            if(x > 0 && steps[x - 1][y] == 0 && (tiles[x - 1][y] & 0x78) == 0) {
                pathX[requiredSteps] = x - 1;
                pathY[requiredSteps] = y;
                requiredSteps = (requiredSteps + 1) % i2;
                steps[x - 1][y] = 2;
            }
            if(x < 95 && steps[x + 1][y] == 0 && (tiles[x + 1][y] & 0x72) == 0) {
                pathX[requiredSteps] = x + 1;
                pathY[requiredSteps] = y;
                requiredSteps = (requiredSteps + 1) % i2;
                steps[x + 1][y] = 8;
            }
            if(y > 0 && steps[x][y - 1] == 0 && (tiles[x][y - 1] & 0x74) == 0) {
                pathX[requiredSteps] = x;
                pathY[requiredSteps] = y - 1;
                requiredSteps = (requiredSteps + 1) % i2;
                steps[x][y - 1] = 1;
            }
            if(y < 95 && steps[x][y + 1] == 0 && (tiles[x][y + 1] & 0x71) == 0) {
                pathX[requiredSteps] = x;
                pathY[requiredSteps] = y + 1;
                requiredSteps = (requiredSteps + 1) % i2;
                steps[x][y + 1] = 4;
            }
            if(x > 0 && y > 0 && (tiles[x][y - 1] & 0x74) == 0 && (tiles[x - 1][y] & 0x78) == 0 && (tiles[x - 1][y - 1] & 0x7c) == 0 && steps[x - 1][y - 1] == 0) {
                pathX[requiredSteps] = x - 1;
                pathY[requiredSteps] = y - 1;
                requiredSteps = (requiredSteps + 1) % i2;
                steps[x - 1][y - 1] = 3;
            }
            if(x < 95 && y > 0 && (tiles[x][y - 1] & 0x74) == 0 && (tiles[x + 1][y] & 0x72) == 0 && (tiles[x + 1][y - 1] & 0x76) == 0 && steps[x + 1][y - 1] == 0) {
                pathX[requiredSteps] = x + 1;
                pathY[requiredSteps] = y - 1;
                requiredSteps = (requiredSteps + 1) % i2;
                steps[x + 1][y - 1] = 9;
            }
            if(x > 0 && y < 95 && (tiles[x][y + 1] & 0x71) == 0 && (tiles[x - 1][y] & 0x78) == 0 && (tiles[x - 1][y + 1] & 0x79) == 0 && steps[x - 1][y + 1] == 0) {
                pathX[requiredSteps] = x - 1;
                pathY[requiredSteps] = y + 1;
                requiredSteps = (requiredSteps + 1) % i2;
                steps[x - 1][y + 1] = 6;
            }
            if(x < 95 && y < 95 && (tiles[x][y + 1] & 0x71) == 0 && (tiles[x + 1][y] & 0x72) == 0 && (tiles[x + 1][y + 1] & 0x73) == 0 && steps[x + 1][y + 1] == 0) {
                pathX[requiredSteps] = x + 1;
                pathY[requiredSteps] = y + 1;
                requiredSteps = (requiredSteps + 1) % i2;
                steps[x + 1][y + 1] = 12;
            }
        }
        if(!foundPath)
            return -1;
        stepCount = 0;
        pathX[stepCount] = x;
        pathY[stepCount++] = y;
        int k2;
        for(int j2 = k2 = steps[x][y]; x != curX || y != curY; j2 = steps[x][y]) {
            if(j2 != k2) {
                k2 = j2;
                pathX[stepCount] = x;
                pathY[stepCount++] = y;
            }
            if((j2 & 2) != 0)
                x++;
            else
            if((j2 & 8) != 0)
                x--;
            if((j2 & 1) != 0)
                y++;
            else
            if((j2 & 4) != 0)
                y--;
        }

        return stepCount;
    }

    public void gjm(int k, int l, int i1) {
        tiles[k][l] &= 65535 - i1;
    }

    public int gjn(int k, int l, int i1, int j1) {
        int k1 = gki(k, l, i1);
        if(k1 == 0)
            return j1;
        else
            return Data.akg[k1 - 1];
    }

    public void gka(int arg0, int arg1, int arg2, int arg3) {
        if(arg0 < 1 || arg1 < 1 || arg0 + arg2 >= 96 || arg1 + arg3 >= 96)
            return;
        for(int k = arg0; k <= arg0 + arg2; k++) {
            for(int l = arg1; l <= arg1 + arg3; l++)
                if((gkj(k, l) & 0x63) != 0 || (gkj(k - 1, l) & 0x59) != 0 || (gkj(k, l - 1) & 0x56) != 0 || (gkj(k - 1, l - 1) & 0x6c) != 0)
                    gjd(k, l, 35);
                else
                    gjd(k, l, 0);

        }

    }

    public void removeWallObject(int arg0, int arg1, int arg2, int arg3) {
        if(arg0 < 0 || arg1 < 0 || arg0 >= 95 || arg1 >= 95)
            return;
        if(Data.wallObjectType[arg3] == 1) {
            if(arg2 == 0) {
                tiles[arg0][arg1] &= 0xfffe;
                if(arg1 > 0)
                    gjm(arg0, arg1 - 1, 4);
            } else
            if(arg2 == 1) {
                tiles[arg0][arg1] &= 0xfffd;
                if(arg0 > 0)
                    gjm(arg0 - 1, arg1, 8);
            } else
            if(arg2 == 2)
                tiles[arg0][arg1] &= 0xffef;
            else
            if(arg2 == 3)
                tiles[arg0][arg1] &= 0xffdf;
            gka(arg0, arg1, 1, 1);
        }
    }

    public void gkc(int arg0, int arg1, int arg2, int arg3) {
        if(arg0 < 0 || arg1 < 0 || arg0 >= 95 || arg1 >= 95)
            return;
        if(Data.wallObjectType[arg3] == 1) {
            if(arg2 == 0) {
                tiles[arg0][arg1] |= 1;
                if(arg1 > 0)
                    gjg(arg0, arg1 - 1, 4);
            } else
            if(arg2 == 1) {
                tiles[arg0][arg1] |= 2;
                if(arg0 > 0)
                    gjg(arg0 - 1, arg1, 8);
            } else
            if(arg2 == 2)
                tiles[arg0][arg1] |= 0x10;
            else
            if(arg2 == 3)
                tiles[arg0][arg1] |= 0x20;
            gka(arg0, arg1, 1, 1);
        }
    }

    public int gkd(int k, int l, int i1) {
        int j1 = gki(k, l, i1);
        if(j1 == 0)
            return -1;
        int k1 = Data.akh[j1 - 1];
        return k1 != 2 ? 0 : 1;
    }

    public int getTileRotation(int arg0, int arg1) {
        if(arg0 < 0 || arg0 >= 96 || arg1 < 0 || arg1 >= 96)
            return 0;
        byte byte0 = 0;
        if(arg0 >= 48 && arg1 < 48) {
            byte0 = 1;
            arg0 -= 48;
        } else
        if(arg0 < 48 && arg1 >= 48) {
            byte0 = 2;
            arg1 -= 48;
        } else
        if(arg0 >= 48 && arg1 >= 48) {
            byte0 = 3;
            arg0 -= 48;
            arg1 -= 48;
        }
        return tileObjectRotation[byte0][arg0 * 48 + arg1];
    }
    
    public void registerObjectDir(int x, int y, int dir) {
        if(x < 0 || x >= 96 || y < 0 || y >= 96)
            return;
        objectDirs[x][y] = dir;
    }

    public void removeObject(int arg0, int arg1, int arg2, int k) {
        if(arg0 < 0 || arg1 < 0 || arg0 >= 95 || arg1 >= 95)
            return;
        if(Data.objectType[arg2] == 1 || Data.objectType[arg2] == 2) {
            //int k = getTileRotation(arg0, arg1);
            int l;
            int i1;
            if(k == 0 || k == 4) {
                l = Data.objectWidth[arg2];
                i1 = Data.objectHeight[arg2];
            } else {
                i1 = Data.objectWidth[arg2];
                l = Data.objectHeight[arg2];
            }
            for(int j1 = arg0; j1 < arg0 + l; j1++) {
                for(int k1 = arg1; k1 < arg1 + i1; k1++)
                    if(Data.objectType[arg2] == 1)
                        tiles[j1][k1] &= 0xffbf;
                    else
                    if(k == 0) {
                        tiles[j1][k1] &= 0xfffd;
                        if(j1 > 0)
                            gjm(j1 - 1, k1, 8);
                    } else
                    if(k == 2) {
                        tiles[j1][k1] &= 0xfffb;
                        if(k1 < 95)
                            gjm(j1, k1 + 1, 1);
                    } else
                    if(k == 4) {
                        tiles[j1][k1] &= 0xfff7;
                        if(j1 < 95)
                            gjm(j1 + 1, k1, 2);
                    } else
                    if(k == 6) {
                        tiles[j1][k1] &= 0xfffe;
                        if(k1 > 0)
                            gjm(j1, k1 - 1, 4);
                    }

            }

            gka(arg0, arg1, l, i1);
        }
    }

    public void gkg(int k, int l, int i1, int j1, int k1) {
        int l1 = k * 3;
        int i2 = l * 3;
        int j2 = ghj.bjj(j1);
        int k2 = ghj.bjj(k1);
        j2 = j2 >> 1 & 0x7f7f7f;
        k2 = k2 >> 1 & 0x7f7f7f;
        if(i1 == 0) {
            ghi.drawLineX(l1, i2, 3, j2);
            ghi.drawLineX(l1, i2 + 1, 2, j2);
            ghi.drawLineX(l1, i2 + 2, 1, j2);
            ghi.drawLineX(l1 + 2, i2 + 1, 1, k2);
            ghi.drawLineX(l1 + 1, i2 + 2, 2, k2);
            return;
        }
        if(i1 == 1) {
            ghi.drawLineX(l1, i2, 3, k2);
            ghi.drawLineX(l1 + 1, i2 + 1, 2, k2);
            ghi.drawLineX(l1 + 2, i2 + 2, 1, k2);
            ghi.drawLineX(l1, i2 + 1, 1, j2);
            ghi.drawLineX(l1, i2 + 2, 2, j2);
        }
    }

    public void gkh(int k, int l, int i1, int j1, int k1) {
        int l1 = Data.wallObjectModelVar1[k];
        if(gib[l][i1] < 0x13880)
            gib[l][i1] += 0x13880 + l1;
        if(gib[j1][k1] < 0x13880)
            gib[j1][k1] += 0x13880 + l1;
    }

    public int gki(int arg0, int arg1, int arg2) {
        if(arg0 < 0 || arg0 >= 96 || arg1 < 0 || arg1 >= 96)
            return 0;
        byte byte0 = 0;
        if(arg0 >= 48 && arg1 < 48) {
            byte0 = 1;
            arg0 -= 48;
        } else
        if(arg0 < 48 && arg1 >= 48) {
            byte0 = 2;
            arg1 -= 48;
        } else
        if(arg0 >= 48 && arg1 >= 48) {
            byte0 = 3;
            arg0 -= 48;
            arg1 -= 48;
        }
        return tileGroundOverlay[byte0][arg0 * 48 + arg1] & 0xff;
    }

    public int gkj(int k, int l) {
        if(k < 0 || l < 0 || k >= 96 || l >= 96)
            return 0;
        else
            return tiles[k][l];
    }

    public void gkk() {
        if(gjb)
            ghj.cleanUp();
        for(int k = 0; k < 64; k++) {
            ghn[k] = null;
            for(int l = 0; l < 4; l++)
                gim[l][k] = null;

            for(int i1 = 0; i1 < 4; i1++)
                gih[i1][k] = null;

        }

        System.gc();
    }

    public boolean gkl(int k, int l) {
        return glb(k, l) > 0 || glb(k - 1, l) > 0 || glb(k - 1, l - 1) > 0 || glb(k, l - 1) > 0;
    }

    public EngineHandle(Camera arg0, GameImage arg1) {
        tileHorizontalWall = new byte[4][2304];
        tileDiagonalWall = new int[4][2304];
        tileGroundOverlay = new byte[4][2304];
        tileObjectRotation = new byte[4][2304];
        ghh = false;
        selectedY = new int[18432];
        tileGroundTexture = new byte[4][2304];
        ghm = new int[256];
        ghn = new GameObject[64];
        gib = new int[96][96];
        tileVerticalWall = new byte[4][2304];
        steps = new int[96][96];
        tileGroundElevation = new byte[4][2304];
        gih = new GameObject[4][64];
        playerIsAlive = false;
        tiles = new int[96][96];
        gim = new GameObject[4][64];
        selectedX = new int[18432];
        tileRoofType = new byte[4][2304];
        gjb = true;
        gjc = 750;
        ghj = arg0;
        ghi = arg1;
        for(int k = 0; k < 64; k++)
            ghm[k] = Camera.bjm(255 - k * 4, 255 - (int)((double)k * 1.75D), 255 - k * 4);

        for(int l = 0; l < 64; l++)
            ghm[l + 64] = Camera.bjm(l * 3, 144, 0);

        for(int i1 = 0; i1 < 64; i1++)
            ghm[i1 + 128] = Camera.bjm(192 - (int)((double)i1 * 1.5D), 144 - (int)((double)i1 * 1.5D), 0);

        for(int j1 = 0; j1 < 64; j1++)
            ghm[j1 + 192] = Camera.bjm(96 - (int)((double)j1 * 1.5D), 48 + (int)((double)j1 * 1.5D), 0);
        
        objectDirs = new int[96][96];

    }

    public boolean gkm(int k, int l) {
        return glb(k, l) > 0 && glb(k - 1, l) > 0 && glb(k - 1, l - 1) > 0 && glb(k, l - 1) > 0;
    }

    public int gkn(int arg0, int arg1) {
        if(arg0 < 0 || arg0 >= 96 || arg1 < 0 || arg1 >= 96)
            return 0;
        byte byte0 = 0;
        if(arg0 >= 48 && arg1 < 48) {
            byte0 = 1;
            arg0 -= 48;
        } else
        if(arg0 < 48 && arg1 >= 48) {
            byte0 = 2;
            arg1 -= 48;
        } else
        if(arg0 >= 48 && arg1 >= 48) {
            byte0 = 3;
            arg0 -= 48;
            arg1 -= 48;
        }
        return (tileGroundElevation[byte0][arg0 * 48 + arg1] & 0xff) * 3;
    }

    public void gla(int arg0, int arg1, int arg2, int k) {
        if(arg0 < 0 || arg1 < 0 || arg0 >= 95 || arg1 >= 95)
            return;
        if(Data.objectType[arg2] == 1 || Data.objectType[arg2] == 2) {
            //int k = getTileRotation(arg0, arg1);
            int l;
            int i1;
            if(k == 0 || k == 4) {
                l = Data.objectWidth[arg2];
                i1 = Data.objectHeight[arg2];
            } else {
                i1 = Data.objectWidth[arg2];
                l = Data.objectHeight[arg2];
            }
            for(int j1 = arg0; j1 < arg0 + l; j1++) {
                for(int k1 = arg1; k1 < arg1 + i1; k1++)
                    if(Data.objectType[arg2] == 1)
                        tiles[j1][k1] |= 0x40;
                    else
                    if(k == 0) {
                        tiles[j1][k1] |= 2;
                        if(j1 > 0)
                            gjg(j1 - 1, k1, 8);
                    } else
                    if(k == 2) {
                        tiles[j1][k1] |= 4;
                        if(k1 < 95)
                            gjg(j1, k1 + 1, 1);
                    } else
                    if(k == 4) {
                        tiles[j1][k1] |= 8;
                        if(j1 < 95)
                            gjg(j1 + 1, k1, 2);
                    } else
                    if(k == 6) {
                        tiles[j1][k1] |= 1;
                        if(k1 > 0)
                            gjg(j1, k1 - 1, 4);
                    }

            }

            gka(arg0, arg1, l, i1);
        }
    }

    public int glb(int arg0, int arg1) {
        if(arg0 < 0 || arg0 >= 96 || arg1 < 0 || arg1 >= 96)
            return 0;
        byte byte0 = 0;
        if(arg0 >= 48 && arg1 < 48) {
            byte0 = 1;
            arg0 -= 48;
        } else
        if(arg0 < 48 && arg1 >= 48) {
            byte0 = 2;
            arg1 -= 48;
        } else
        if(arg0 >= 48 && arg1 >= 48) {
            byte0 = 3;
            arg0 -= 48;
            arg1 -= 48;
        }
        return tileRoofType[byte0][arg0 * 48 + arg1];
    }

    public void glc(int arg0, int arg1, int arg2) {
        if(arg0 < 0 || arg0 >= 96 || arg1 < 0 || arg1 >= 96)
            return;
        byte byte0 = 0;
        if(arg0 >= 48 && arg1 < 48) {
            byte0 = 1;
            arg0 -= 48;
        } else
        if(arg0 < 48 && arg1 >= 48) {
            byte0 = 2;
            arg1 -= 48;
        } else
        if(arg0 >= 48 && arg1 >= 48) {
            byte0 = 3;
            arg0 -= 48;
            arg1 -= 48;
        }
        tileGroundOverlay[byte0][arg0 * 48 + arg1] = (byte)arg2;
    }

    public int gld(int arg0, int arg1) {
        if(arg0 < 0 || arg0 >= 96 || arg1 < 0 || arg1 >= 96)
            return 0;
        byte byte0 = 0;
        if(arg0 >= 48 && arg1 < 48) {
            byte0 = 1;
            arg0 -= 48;
        } else
        if(arg0 < 48 && arg1 >= 48) {
            byte0 = 2;
            arg1 -= 48;
        } else
        if(arg0 >= 48 && arg1 >= 48) {
            byte0 = 3;
            arg0 -= 48;
            arg1 -= 48;
        }
        return tileVerticalWall[byte0][arg0 * 48 + arg1] & 0xff;
    }

    public int gle(int arg0, int arg1) {
        if(arg0 < 0 || arg0 >= 96 || arg1 < 0 || arg1 >= 96)
            return 0;
        byte byte0 = 0;
        if(arg0 >= 48 && arg1 < 48) {
            byte0 = 1;
            arg0 -= 48;
        } else
        if(arg0 < 48 && arg1 >= 48) {
            byte0 = 2;
            arg1 -= 48;
        } else
        if(arg0 >= 48 && arg1 >= 48) {
            byte0 = 3;
            arg0 -= 48;
            arg1 -= 48;
        }
        return tileHorizontalWall[byte0][arg0 * 48 + arg1] & 0xff;
    }

    public int glf(int arg0, int arg1) {
        if(arg0 < 0 || arg0 >= 96 || arg1 < 0 || arg1 >= 96)
            return 0;
        byte byte0 = 0;
        if(arg0 >= 48 && arg1 < 48) {
            byte0 = 1;
            arg0 -= 48;
        } else
        if(arg0 < 48 && arg1 >= 48) {
            byte0 = 2;
            arg1 -= 48;
        } else
        if(arg0 >= 48 && arg1 >= 48) {
            byte0 = 3;
            arg0 -= 48;
            arg1 -= 48;
        }
        return tileDiagonalWall[byte0][arg0 * 48 + arg1];
    }

    public void glg(GameObject arg0[]) {
        for(int k = 0; k < 94; k++) {
            for(int l = 0; l < 94; l++)
                if(glf(k, l) > 48000 && glf(k, l) < 60000) {
                    int i1 = glf(k, l) - 48001;
                    int j1 = objectDirs[k][l];//getTileRotation(k, l);
                    int k1;
                    int l1;
                    if(j1 == 0 || j1 == 4) {
                        k1 = Data.objectWidth[i1];
                        l1 = Data.objectHeight[i1];
                    } else {
                        l1 = Data.objectWidth[i1];
                        k1 = Data.objectHeight[i1];
                    }
                    gla(k, l, i1, j1);
                    GameObject i2 = arg0[Data.objectModelNumber[i1]].cnk(false, true, false, false);
                    int j2 = ((k + k + k1) * 128) / 2;
                    int l2 = ((l + l + l1) * 128) / 2;
                    i2.cmk(j2, -getAveragedElevation(j2, l2), l2);
                    //i2.cmj(0, getTileRotation(k, l) * 32, 0);
                    i2.cmj(0, j1 * 32, 0);
                    ghj.addModel(i2);
                    i2.cmf(48, 48, -50, -10, -50);
                    if(k1 > 1 || l1 > 1) {
                        for(int j3 = k; j3 < k + k1; j3++) {
                            for(int k3 = l; k3 < l + l1; k3++)
                                if((j3 > k || k3 > l) && glf(j3, k3) - 48001 == i1) {
                                    int k2 = j3;
                                    int i3 = k3;
                                    byte byte0 = 0;
                                    if(k2 >= 48 && i3 < 48) {
                                        byte0 = 1;
                                        k2 -= 48;
                                    } else
                                    if(k2 < 48 && i3 >= 48) {
                                        byte0 = 2;
                                        i3 -= 48;
                                    } else
                                    if(k2 >= 48 && i3 >= 48) {
                                        byte0 = 3;
                                        k2 -= 48;
                                        i3 -= 48;
                                    }
                                    tileDiagonalWall[byte0][k2 * 48 + i3] = 0;
                                }

                        }

                    }
                }

        }

    }

    public void glh(int arg0, int arg1, int arg2, int arg3, int arg4) {
        GameObject k = ghn[arg0 + arg1 * 8];
        for(int l = 0; l < k.cfh; l++)
            if(k.cil[l] == arg2 * 128 && k.cin[l] == arg3 * 128) {
                k.cmh(l, arg4);
                return;
            }

    }

    public void gli(GameObject k, int l, int i1, int j1, int k1, int l1) {
        gjd(i1, j1, 40);
        gjd(k1, l1, 40);
        int i2 = Data.wallObjectModelVar1[l];
        int j2 = Data.wallObjectModelVar2[l];
        int k2 = Data.wallObjectModelVar3[l];
        int l2 = i1 * 128;
        int i3 = j1 * 128;
        int j3 = k1 * 128;
        int k3 = l1 * 128;
        int l3 = k.cln(l2, -gib[i1][j1], i3);
        int i4 = k.cln(l2, -gib[i1][j1] - i2, i3);
        int j4 = k.cln(j3, -gib[k1][l1] - i2, k3);
        int k4 = k.cln(j3, -gib[k1][l1], k3);
        int ai[] = {
            l3, i4, j4, k4
        };
        int l4 = k.cmb(4, ai, j2, k2);
        if(Data.wallObjectUnknown[l] == 5) {
            k.entityType[l4] = 30000 + l;
            return;
        } else {
            k.entityType[l4] = 0;
            return;
        }
    }

    final int ggn = 96;
    final int gha = 96;
    byte tileHorizontalWall[][];
    final int ghc = 0xbc614e;
    final int ghd = 128;
    int tileDiagonalWall[][];
    byte tileGroundOverlay[][];
    byte tileObjectRotation[][];
    boolean ghh;
    GameImage ghi;
    Camera ghj;
    int selectedY[];
    byte tileGroundTexture[][];
    int ghm[];
    GameObject ghn[];
    GameObject gia;
    int gib[][];
    byte tileVerticalWall[][];
    int steps[][];
    byte landscapeFree[];
    byte mapsFree[];
    byte tileGroundElevation[][];
    GameObject gih[][];
    boolean playerIsAlive;
    int tiles[][];
    byte landscapeMembers[];
    byte mapsMembers[];
    GameObject gim[][];
    int selectedX[];
    byte tileRoofType[][];
    boolean gjb;
    int gjc;
    
    int objectDirs[][];
}
