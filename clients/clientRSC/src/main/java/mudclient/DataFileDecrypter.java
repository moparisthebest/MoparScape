package mudclient;

public class DataFileDecrypter {

    public static int unpackData(byte abyte0[], int i, byte abyte1[], int j, int k) {
        DataFileVariables o1 = new DataFileVariables();
        o1.aee = abyte1;
        o1.aef = k;
        o1.aej = abyte0;
        o1.aek = 0;
        o1.aeg = j;
        o1.ael = i;
        o1.afe = 0;
        o1.afd = 0;
        o1.aeh = 0;
        o1.aei = 0;
        o1.aem = 0;
        o1.aen = 0;
        o1.afg = 0;
        gll(o1);
        i -= o1.ael;
        return i;
    }

    private static void glk(DataFileVariables arg0) {
        byte byte4 = arg0.afa;
        int i = arg0.afb;
        int j = arg0.afl;
        int k = arg0.afj;
        int ai[] = DataFileVariables.aga;
        int l = arg0.afi;
        byte abyte0[] = arg0.aej;
        int i1 = arg0.aek;
        int j1 = arg0.ael;
        int k1 = j1;
        int l1 = arg0.aha + 1;
label0:
        do {
            if(i > 0) {
                do {
                    if(j1 == 0)
                        break label0;
                    if(i == 1)
                        break;
                    abyte0[i1] = byte4;
                    i--;
                    i1++;
                    j1--;
                } while(true);
                if(j1 == 0) {
                    i = 1;
                    break;
                }
                abyte0[i1] = byte4;
                i1++;
                j1--;
            }
            boolean flag = true;
            while(flag)  {
                flag = false;
                if(j == l1) {
                    i = 0;
                    break label0;
                }
                byte4 = (byte)k;
                l = ai[l];
                byte byte0 = (byte)(l & 0xff);
                l >>= 8;
                j++;
                if(byte0 != k) {
                    k = byte0;
                    if(j1 == 0) {
                        i = 1;
                    } else {
                        abyte0[i1] = byte4;
                        i1++;
                        j1--;
                        flag = true;
                        continue;
                    }
                    break label0;
                }
                if(j != l1)
                    continue;
                if(j1 == 0) {
                    i = 1;
                    break label0;
                }
                abyte0[i1] = byte4;
                i1++;
                j1--;
                flag = true;
            }
            i = 2;
            l = ai[l];
            byte byte1 = (byte)(l & 0xff);
            l >>= 8;
            if(++j != l1)
                if(byte1 != k) {
                    k = byte1;
                } else {
                    i = 3;
                    l = ai[l];
                    byte byte2 = (byte)(l & 0xff);
                    l >>= 8;
                    if(++j != l1)
                        if(byte2 != k) {
                            k = byte2;
                        } else {
                            l = ai[l];
                            byte byte3 = (byte)(l & 0xff);
                            l >>= 8;
                            j++;
                            i = (byte3 & 0xff) + 4;
                            l = ai[l];
                            k = (byte)(l & 0xff);
                            l >>= 8;
                            j++;
                        }
                }
        } while(true);
        int i2 = arg0.aem;
        arg0.aem += k1 - j1;
        if(arg0.aem < i2)
            arg0.aen++;
        arg0.afa = byte4;
        arg0.afb = i;
        arg0.afl = j;
        arg0.afj = k;
        DataFileVariables.aga = ai;
        arg0.afi = l;
        arg0.aej = abyte0;
        arg0.aek = i1;
        arg0.ael = j1;
    }

    private static void gll(DataFileVariables arg0) {
        int k8 = 0;
        int ai[] = null;
        int ai1[] = null;
        int ai2[] = null;
        arg0.aff = 1;
        if(DataFileVariables.aga == null)
            DataFileVariables.aga = new int[arg0.aff * 0x186a0];
        boolean flag19 = true;
        while(flag19)  {
            byte byte0 = glm(arg0);
            if(byte0 == 23)
                return;
            byte0 = glm(arg0);
            byte0 = glm(arg0);
            byte0 = glm(arg0);
            byte0 = glm(arg0);
            byte0 = glm(arg0);
            arg0.afg++;
            byte0 = glm(arg0);
            byte0 = glm(arg0);
            byte0 = glm(arg0);
            byte0 = glm(arg0);
            byte0 = gln(arg0);
            if(byte0 != 0)
                arg0.afc = true;
            else
                arg0.afc = false;
            if(arg0.afc)
                System.out.println("PANIC! RANDOMISED BLOCK!");
            arg0.afh = 0;
            byte0 = glm(arg0);
            arg0.afh = arg0.afh << 8 | byte0 & 0xff;
            byte0 = glm(arg0);
            arg0.afh = arg0.afh << 8 | byte0 & 0xff;
            byte0 = glm(arg0);
            arg0.afh = arg0.afh << 8 | byte0 & 0xff;
            for(int j = 0; j < 16; j++) {
                byte byte1 = gln(arg0);
                if(byte1 == 1)
                    arg0.agd[j] = true;
                else
                    arg0.agd[j] = false;
            }

            for(int k = 0; k < 256; k++)
                arg0.agc[k] = false;

            for(int l = 0; l < 16; l++)
                if(arg0.agd[l]) {
                    for(int i3 = 0; i3 < 16; i3++) {
                        byte byte2 = gln(arg0);
                        if(byte2 == 1)
                            arg0.agc[l * 16 + i3] = true;
                    }

                }

            gmb(arg0);
            int i4 = arg0.agb + 2;
            int j4 = gma(3, arg0);
            int k4 = gma(15, arg0);
            for(int i1 = 0; i1 < k4; i1++) {
                int j3 = 0;
                do {
                    byte byte3 = gln(arg0);
                    if(byte3 == 0)
                        break;
                    j3++;
                } while(true);
                arg0.agi[i1] = (byte)j3;
            }

            byte abyte0[] = new byte[6];
            for(byte byte16 = 0; byte16 < j4; byte16++)
                abyte0[byte16] = byte16;

            for(int j1 = 0; j1 < k4; j1++) {
                byte byte17 = arg0.agi[j1];
                byte byte15 = abyte0[byte17];
                for(; byte17 > 0; byte17--)
                    abyte0[byte17] = abyte0[byte17 - 1];

                abyte0[0] = byte15;
                arg0.agh[j1] = byte15;
            }

            for(int k3 = 0; k3 < j4; k3++) {
                int l6 = gma(5, arg0);
                for(int k1 = 0; k1 < i4; k1++) {
                    do {
                        byte byte4 = gln(arg0);
                        if(byte4 == 0)
                            break;
                        byte4 = gln(arg0);
                        if(byte4 == 0)
                            l6++;
                        else
                            l6--;
                    } while(true);
                    arg0.agj[k3][k1] = (byte)l6;
                }

            }

            for(int l3 = 0; l3 < j4; l3++) {
                byte byte8 = 32;
                int i = 0;
                for(int l1 = 0; l1 < i4; l1++) {
                    if(arg0.agj[l3][l1] > i)
                        i = arg0.agj[l3][l1];
                    if(arg0.agj[l3][l1] < byte8)
                        byte8 = arg0.agj[l3][l1];
                }

                gmc(arg0.agk[l3], arg0.agl[l3], arg0.agm[l3], arg0.agj[l3], byte8, i, i4);
                arg0.agn[l3] = byte8;
            }

            int l4 = arg0.agb + 1;
            int i5 = -1;
            int j5 = 0;
            for(int i2 = 0; i2 <= 255; i2++)
                arg0.afk[i2] = 0;

            int j9 = 4095;
            for(int l8 = 15; l8 >= 0; l8--) {
                for(int i9 = 15; i9 >= 0; i9--) {
                    arg0.agf[j9] = (byte)(l8 * 16 + i9);
                    j9--;
                }

                arg0.agg[l8] = j9 + 1;
            }

            int i6 = 0;
            if(j5 == 0) {
                i5++;
                j5 = 50;
                byte byte12 = arg0.agh[i5];
                k8 = arg0.agn[byte12];
                ai = arg0.agk[byte12];
                ai2 = arg0.agm[byte12];
                ai1 = arg0.agl[byte12];
            }
            j5--;
            int i7 = k8;
            int l7;
            byte byte9;
            for(l7 = gma(i7, arg0); l7 > ai[i7]; l7 = l7 << 1 | byte9) {
                i7++;
                byte9 = gln(arg0);
            }

            for(int k5 = ai2[l7 - ai1[i7]]; k5 != l4;)
                if(k5 == 0 || k5 == 1) {
                    int j6 = -1;
                    int k6 = 1;
                    do {
                        if(k5 == 0)
                            j6 += k6;
                        else
                        if(k5 == 1)
                            j6 += 2 * k6;
                        k6 *= 2;
                        if(j5 == 0) {
                            i5++;
                            j5 = 50;
                            byte byte13 = arg0.agh[i5];
                            k8 = arg0.agn[byte13];
                            ai = arg0.agk[byte13];
                            ai2 = arg0.agm[byte13];
                            ai1 = arg0.agl[byte13];
                        }
                        j5--;
                        int j7 = k8;
                        int i8;
                        byte byte10;
                        for(i8 = gma(j7, arg0); i8 > ai[j7]; i8 = i8 << 1 | byte10) {
                            j7++;
                            byte10 = gln(arg0);
                        }

                        k5 = ai2[i8 - ai1[j7]];
                    } while(k5 == 0 || k5 == 1);
                    j6++;
                    byte byte5 = arg0.age[arg0.agf[arg0.agg[0]] & 0xff];
                    arg0.afk[byte5 & 0xff] += j6;
                    for(; j6 > 0; j6--) {
                        DataFileVariables.aga[i6] = byte5 & 0xff;
                        i6++;
                    }

                } else {
                    int j11 = k5 - 1;
                    byte byte6;
                    if(j11 < 16) {
                        int j10 = arg0.agg[0];
                        byte6 = arg0.agf[j10 + j11];
                        for(; j11 > 3; j11 -= 4) {
                            int k11 = j10 + j11;
                            arg0.agf[k11] = arg0.agf[k11 - 1];
                            arg0.agf[k11 - 1] = arg0.agf[k11 - 2];
                            arg0.agf[k11 - 2] = arg0.agf[k11 - 3];
                            arg0.agf[k11 - 3] = arg0.agf[k11 - 4];
                        }

                        for(; j11 > 0; j11--)
                            arg0.agf[j10 + j11] = arg0.agf[(j10 + j11) - 1];

                        arg0.agf[j10] = byte6;
                    } else {
                        int l10 = j11 / 16;
                        int i11 = j11 % 16;
                        int k10 = arg0.agg[l10] + i11;
                        byte6 = arg0.agf[k10];
                        for(; k10 > arg0.agg[l10]; k10--)
                            arg0.agf[k10] = arg0.agf[k10 - 1];

                        arg0.agg[l10]++;
                        for(; l10 > 0; l10--) {
                            arg0.agg[l10]--;
                            arg0.agf[arg0.agg[l10]] = arg0.agf[(arg0.agg[l10 - 1] + 16) - 1];
                        }

                        arg0.agg[0]--;
                        arg0.agf[arg0.agg[0]] = byte6;
                        if(arg0.agg[0] == 0) {
                            int i10 = 4095;
                            for(int k9 = 15; k9 >= 0; k9--) {
                                for(int l9 = 15; l9 >= 0; l9--) {
                                    arg0.agf[i10] = arg0.agf[arg0.agg[k9] + l9];
                                    i10--;
                                }

                                arg0.agg[k9] = i10 + 1;
                            }

                        }
                    }
                    arg0.afk[arg0.age[byte6 & 0xff] & 0xff]++;
                    DataFileVariables.aga[i6] = arg0.age[byte6 & 0xff] & 0xff;
                    i6++;
                    if(j5 == 0) {
                        i5++;
                        j5 = 50;
                        byte byte14 = arg0.agh[i5];
                        k8 = arg0.agn[byte14];
                        ai = arg0.agk[byte14];
                        ai2 = arg0.agm[byte14];
                        ai1 = arg0.agl[byte14];
                    }
                    j5--;
                    int k7 = k8;
                    int j8;
                    byte byte11;
                    for(j8 = gma(k7, arg0); j8 > ai[k7]; j8 = j8 << 1 | byte11) {
                        k7++;
                        byte11 = gln(arg0);
                    }

                    k5 = ai2[j8 - ai1[k7]];
                }

            arg0.afb = 0;
            arg0.afa = 0;
            arg0.afm[0] = 0;
            for(int j2 = 1; j2 <= 256; j2++)
                arg0.afm[j2] = arg0.afk[j2 - 1];

            for(int k2 = 1; k2 <= 256; k2++)
                arg0.afm[k2] += arg0.afm[k2 - 1];

            for(int l2 = 0; l2 < i6; l2++) {
                byte byte7 = (byte)(DataFileVariables.aga[l2] & 0xff);
                DataFileVariables.aga[arg0.afm[byte7 & 0xff]] |= l2 << 8;
                arg0.afm[byte7 & 0xff]++;
            }

            arg0.afi = DataFileVariables.aga[arg0.afh] >> 8;
            arg0.afl = 0;
            arg0.afi = DataFileVariables.aga[arg0.afi];
            arg0.afj = (byte)(arg0.afi & 0xff);
            arg0.afi >>= 8;
            arg0.afl++;
            arg0.aha = i6;
            glk(arg0);
            if(arg0.afl == arg0.aha + 1 && arg0.afb == 0)
                flag19 = true;
            else
                flag19 = false;
        }
    }

    private static byte glm(DataFileVariables o1) {
        return (byte)gma(8, o1);
    }

    private static byte gln(DataFileVariables o1) {
        return (byte)gma(1, o1);
    }

    private static int gma(int arg0, DataFileVariables arg1) {
        int i;
        do {
            if(arg1.afe >= arg0) {
                int j = arg1.afd >> arg1.afe - arg0 & (1 << arg0) - 1;
                arg1.afe -= arg0;
                i = j;
                break;
            }
            arg1.afd = arg1.afd << 8 | arg1.aee[arg1.aef] & 0xff;
            arg1.afe += 8;
            arg1.aef++;
            arg1.aeg--;
            arg1.aeh++;
            if(arg1.aeh == 0)
                arg1.aei++;
        } while(true);
        return i;
    }

    private static void gmb(DataFileVariables arg0) {
        arg0.agb = 0;
        for(int i = 0; i < 256; i++)
            if(arg0.agc[i]) {
                arg0.age[arg0.agb] = (byte)i;
                arg0.agb++;
            }

    }

    private static void gmc(int arg0[], int arg1[], int arg2[], byte arg3[], int arg4, int arg5, int arg6) {
        int i = 0;
        for(int j = arg4; j <= arg5; j++) {
            for(int i2 = 0; i2 < arg6; i2++)
                if(arg3[i2] == j) {
                    arg2[i] = i2;
                    i++;
                }

        }

        for(int k = 0; k < 23; k++)
            arg1[k] = 0;

        for(int l = 0; l < arg6; l++)
            arg1[arg3[l] + 1]++;

        for(int i1 = 1; i1 < 23; i1++)
            arg1[i1] += arg1[i1 - 1];

        for(int j1 = 0; j1 < 23; j1++)
            arg0[j1] = 0;

        int j2 = 0;
        for(int k1 = arg4; k1 <= arg5; k1++) {
            j2 += arg1[k1 + 1] - arg1[k1];
            arg0[k1] = j2 - 1;
            j2 <<= 1;
        }

        for(int l1 = arg4 + 1; l1 <= arg5; l1++)
            arg1[l1] = (arg0[l1 - 1] + 1 << 1) - arg1[l1];

    }
}
