package mudclient;

import java.io.*;

public class GameObject {

    public GameObject(int arg0, int arg1) {
        cgn = 1;
        cha = true;
        chh = true;
        chi = false;
        isGiantCrystal = false;
        index = -1;
        chn = false;
        cia = false;
        cib = false;
        cic = false;
        cid = false;
        cij = 0xbc614e;
        ckn = 0xbc614e;
        cla = 180;
        clb = 155;
        clc = 95;
        cld = 256;
        cle = 512;
        clf = 32;
        cli(arg0, arg1);
        cje = new int[arg1][1];
        for(int j = 0; j < arg1; j++)
            cje[j][0] = j;

    }

    public GameObject(int j, int k, boolean flag, boolean flag1, boolean flag2, boolean flag3, boolean flag4) {
        cgn = 1;
        cha = true;
        chh = true;
        chi = false;
        isGiantCrystal = false;
        index = -1;
        chn = false;
        cia = false;
        cib = false;
        cic = false;
        cid = false;
        cij = 0xbc614e;
        ckn = 0xbc614e;
        cla = 180;
        clb = 155;
        clc = 95;
        cld = 256;
        cle = 512;
        clf = 32;
        chn = flag;
        cia = flag1;
        cib = flag2;
        cic = flag3;
        cid = flag4;
        cli(j, k);
    }

    private void cli(int arg0, int arg1) {
        cil = new int[arg0];
        cim = new int[arg0];
        cin = new int[arg0];
        cfn = new int[arg0];
        cga = new byte[arg0];
        cgc = new int[arg1];
        cgd = new int[arg1][];
        cge = new int[arg1];
        cgf = new int[arg1];
        cgi = new int[arg1];
        cgh = new int[arg1];
        cgg = new int[arg1];
        if(!cid) {
            cfi = new int[arg0];
            cfj = new int[arg0];
            cfk = new int[arg0];
            cfl = new int[arg0];
            cfm = new int[arg0];
        }
        if(!cic) {
            chm = new byte[arg1];
            entityType = new int[arg1];
        }
        if(chn) {
            cja = cil;
            cjb = cim;
            cjc = cin;
        } else {
            cja = new int[arg0];
            cjb = new int[arg0];
            cjc = new int[arg0];
        }
        if(!cib || !cia) {
            cgj = new int[arg1];
            cgk = new int[arg1];
            cgl = new int[arg1];
        }
        if(!cia) {
            cjf = new int[arg1];
            cjg = new int[arg1];
            cjh = new int[arg1];
            cji = new int[arg1];
            cjj = new int[arg1];
            cjk = new int[arg1];
        }
        cgb = 0;
        cfh = 0;
        cik = arg0;
        cjd = arg1;
        cjl = cjm = cjn = 0;
        cka = ckb = ckc = 0;
        ckd = cke = ckf = 256;
        ckg = ckh = cki = ckj = ckk = ckl = 256;
        ckm = 0;
    }

    public void clj() {
        cfi = new int[cfh];
        cfj = new int[cfh];
        cfk = new int[cfh];
        cfl = new int[cfh];
        cfm = new int[cfh];
    }

    public void clk() {
        cgb = 0;
        cfh = 0;
    }

    public void cll(int j, int k) {
        cgb -= j;
        if(cgb < 0)
            cgb = 0;
        cfh -= k;
        if(cfh < 0)
            cfh = 0;
    }

    public GameObject(byte arg0[], int arg1, boolean arg2) {
        cgn = 1;
        cha = true;
        chh = true;
        chi = false;
        isGiantCrystal = false;
        index = -1;
        chn = false;
        cia = false;
        cib = false;
        cic = false;
        cid = false;
        cij = 0xbc614e;
        ckn = 0xbc614e;
        cla = 180;
        clb = 155;
        clc = 95;
        cld = 256;
        cle = 512;
        clf = 32;
        int j = DataOperations.getShort(arg0, arg1);
        arg1 += 2;
        int k = DataOperations.getShort(arg0, arg1);
        arg1 += 2;
        cli(j, k);
        cje = new int[k][1];
        for(int l = 0; l < j; l++) {
            cil[l] = DataOperations.getShort2(arg0, arg1);
            arg1 += 2;
        }

        for(int i1 = 0; i1 < j; i1++) {
            cim[i1] = DataOperations.getShort2(arg0, arg1);
            arg1 += 2;
        }

        for(int j1 = 0; j1 < j; j1++) {
            cin[j1] = DataOperations.getShort2(arg0, arg1);
            arg1 += 2;
        }

        cfh = j;
        for(int k1 = 0; k1 < k; k1++)
            cgc[k1] = arg0[arg1++] & 0xff;

        for(int l1 = 0; l1 < k; l1++) {
            cge[l1] = DataOperations.getShort2(arg0, arg1);
            arg1 += 2;
            if(cge[l1] == 32767)
                cge[l1] = cij;
        }

        for(int i2 = 0; i2 < k; i2++) {
            cgf[i2] = DataOperations.getShort2(arg0, arg1);
            arg1 += 2;
            if(cgf[i2] == 32767)
                cgf[i2] = cij;
        }

        for(int j2 = 0; j2 < k; j2++) {
            int k2 = arg0[arg1++] & 0xff;
            if(k2 == 0)
                cgi[j2] = 0;
            else
                cgi[j2] = cij;
        }

        for(int l2 = 0; l2 < k; l2++) {
            cgd[l2] = new int[cgc[l2]];
            for(int i3 = 0; i3 < cgc[l2]; i3++)
                if(j < 256) {
                    cgd[l2][i3] = arg0[arg1++] & 0xff;
                } else {
                    cgd[l2][i3] = DataOperations.getShort(arg0, arg1);
                    arg1 += 2;
                }

        }

        cgb = k;
        cgn = 1;
    }

    public GameObject(String arg0) {
        cgn = 1;
        cha = true;
        chh = true;
        chi = false;
        isGiantCrystal = false;
        index = -1;
        chn = false;
        cia = false;
        cib = false;
        cic = false;
        cid = false;
        cij = 0xbc614e;
        ckn = 0xbc614e;
        cla = 180;
        clb = 155;
        clc = 95;
        cld = 256;
        cle = 512;
        clf = 32;
        byte abyte0[] = null;
        try {
            java.io.InputStream inputstream = DataOperations.openInputStream(arg0);
            DataInputStream datainputstream = new DataInputStream(inputstream);
            abyte0 = new byte[3];
            clg = 0;
            for(int j = 0; j < 3; j += datainputstream.read(abyte0, j, 3 - j));
            int l = cnm(abyte0);
            abyte0 = new byte[l];
            clg = 0;
            for(int k = 0; k < l; k += datainputstream.read(abyte0, k, l - k));
            datainputstream.close();
        }
        catch(IOException _ex) {
            cfh = 0;
            cgb = 0;
            return;
        }
        int i1 = cnm(abyte0);
        int j1 = cnm(abyte0);
        cli(i1, j1);
        cje = new int[j1][];
        for(int k3 = 0; k3 < i1; k3++) {
            int k1 = cnm(abyte0);
            int l1 = cnm(abyte0);
            int i2 = cnm(abyte0);
            cln(k1, l1, i2);
        }

        for(int l3 = 0; l3 < j1; l3++) {
            int j2 = cnm(abyte0);
            int k2 = cnm(abyte0);
            int l2 = cnm(abyte0);
            int i3 = cnm(abyte0);
            cle = cnm(abyte0);
            clf = cnm(abyte0);
            int j3 = cnm(abyte0);
            int ai[] = new int[j2];
            for(int i4 = 0; i4 < j2; i4++)
                ai[i4] = cnm(abyte0);

            int ai1[] = new int[i3];
            for(int j4 = 0; j4 < i3; j4++)
                ai1[j4] = cnm(abyte0);

            int k4 = cmb(j2, ai, k2, l2);
            cje[l3] = ai1;
            if(j3 == 0)
                cgi[k4] = 0;
            else
                cgi[k4] = cij;
        }

        cgn = 1;
    }

    public GameObject(GameObject ai[], int j, boolean flag, boolean flag1, boolean flag2, boolean flag3) {
        cgn = 1;
        cha = true;
        chh = true;
        chi = false;
        isGiantCrystal = false;
        index = -1;
        chn = false;
        cia = false;
        cib = false;
        cic = false;
        cid = false;
        cij = 0xbc614e;
        ckn = 0xbc614e;
        cla = 180;
        clb = 155;
        clc = 95;
        cld = 256;
        cle = 512;
        clf = 32;
        chn = flag;
        cia = flag1;
        cib = flag2;
        cic = flag3;
        clm(ai, j, false);
    }

    public GameObject(GameObject ai[], int j) {
        cgn = 1;
        cha = true;
        chh = true;
        chi = false;
        isGiantCrystal = false;
        index = -1;
        chn = false;
        cia = false;
        cib = false;
        cic = false;
        cid = false;
        cij = 0xbc614e;
        ckn = 0xbc614e;
        cla = 180;
        clb = 155;
        clc = 95;
        cld = 256;
        cle = 512;
        clf = 32;
        clm(ai, j, true);
    }

    public void clm(GameObject arg0[], int arg1, boolean arg2) {
        int j = 0;
        int k = 0;
        for(int l = 0; l < arg1; l++) {
            j += arg0[l].cgb;
            k += arg0[l].cfh;
        }

        cli(k, j);
        if(arg2)
            cje = new int[j][];
        for(int i1 = 0; i1 < arg1; i1++) {
            GameObject j1 = arg0[i1];
            j1.cni();
            clf = j1.clf;
            cle = j1.cle;
            cla = j1.cla;
            clb = j1.clb;
            clc = j1.clc;
            cld = j1.cld;
            for(int k1 = 0; k1 < j1.cgb; k1++) {
                int ai[] = new int[j1.cgc[k1]];
                int ai1[] = j1.cgd[k1];
                for(int l1 = 0; l1 < j1.cgc[k1]; l1++)
                    ai[l1] = cln(j1.cil[ai1[l1]], j1.cim[ai1[l1]], j1.cin[ai1[l1]]);

                int i2 = cmb(j1.cgc[k1], ai, j1.cge[k1], j1.cgf[k1]);
                cgi[i2] = j1.cgi[k1];
                cgh[i2] = j1.cgh[k1];
                cgg[i2] = j1.cgg[k1];
                if(arg2)
                    if(arg1 > 1) {
                        cje[i2] = new int[j1.cje[k1].length + 1];
                        cje[i2][0] = i1;
                        for(int j2 = 0; j2 < j1.cje[k1].length; j2++)
                            cje[i2][j2 + 1] = j1.cje[k1][j2];

                    } else {
                        cje[i2] = new int[j1.cje[k1].length];
                        for(int k2 = 0; k2 < j1.cje[k1].length; k2++)
                            cje[i2][k2] = j1.cje[k1][k2];

                    }
            }

        }

        cgn = 1;
    }

    public int cln(int arg0, int arg1, int arg2) {
        for(int j = 0; j < cfh; j++)
            if(cil[j] == arg0 && cim[j] == arg1 && cin[j] == arg2)
                return j;

        if(cfh >= cik) {
            return -1;
        } else {
            cil[cfh] = arg0;
            cim[cfh] = arg1;
            cin[cfh] = arg2;
            return cfh++;
        }
    }

    public int cma(int j, int k, int l) {
        if(cfh >= cik) {
            return -1;
        } else {
            cil[cfh] = j;
            cim[cfh] = k;
            cin[cfh] = l;
            return cfh++;
        }
    }

    public int cmb(int j, int ai[], int k, int l) {
        if(cgb >= cjd) {
            return -1;
        } else {
            cgc[cgb] = j;
            cgd[cgb] = ai;
            cge[cgb] = k;
            cgf[cgb] = l;
            cgn = 1;
            return cgb++;
        }
    }

    public GameObject[] cmc(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, 
            boolean arg7) {
        cni();
        int ai[] = new int[arg5];
        int ai1[] = new int[arg5];
        for(int j = 0; j < arg5; j++) {
            ai[j] = 0;
            ai1[j] = 0;
        }

        for(int k = 0; k < cgb; k++) {
            int l = 0;
            int i1 = 0;
            int k1 = cgc[k];
            int ai3[] = cgd[k];
            for(int k2 = 0; k2 < k1; k2++) {
                l += cil[ai3[k2]];
                i1 += cin[ai3[k2]];
            }

            int i3 = l / (k1 * arg2) + (i1 / (k1 * arg3)) * arg4;
            ai[i3] += k1;
            ai1[i3]++;
        }

        GameObject ai2[] = new GameObject[arg5];
        for(int j1 = 0; j1 < arg5; j1++) {
            if(ai[j1] > arg6)
                ai[j1] = arg6;
            ai2[j1] = new GameObject(ai[j1], ai1[j1], true, true, true, arg7, true);
            ai2[j1].cle = cle;
            ai2[j1].clf = clf;
        }

        for(int l1 = 0; l1 < cgb; l1++) {
            int i2 = 0;
            int l2 = 0;
            int j3 = cgc[l1];
            int ai4[] = cgd[l1];
            for(int k3 = 0; k3 < j3; k3++) {
                i2 += cil[ai4[k3]];
                l2 += cin[ai4[k3]];
            }

            int l3 = i2 / (j3 * arg2) + (l2 / (j3 * arg3)) * arg4;
            cmd(ai2[l3], ai4, j3, l1);
        }

        for(int j2 = 0; j2 < arg5; j2++)
            ai2[j2].clj();

        return ai2;
    }

    public void cmd(GameObject arg0, int arg1[], int arg2, int arg3) {
        int ai[] = new int[arg2];
        for(int j = 0; j < arg2; j++) {
            int k = ai[j] = arg0.cln(cil[arg1[j]], cim[arg1[j]], cin[arg1[j]]);
            arg0.cfn[k] = cfn[arg1[j]];
            arg0.cga[k] = cga[arg1[j]];
        }

        int l = arg0.cmb(arg2, ai, cge[arg3], cgf[arg3]);
        if(!arg0.cic && !cic)
            arg0.entityType[l] = entityType[arg3];
        arg0.cgi[l] = cgi[arg3];
        arg0.cgh[l] = cgh[arg3];
        arg0.cgg[l] = cgg[arg3];
    }

    public void cme(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        clf = 256 - arg1 * 4;
        cle = (64 - arg2) * 16 + 128;
        if(cib)
            return;
        for(int j = 0; j < cgb; j++)
            if(arg0)
                cgi[j] = cij;
            else
                cgi[j] = 0;

        cla = arg3;
        clb = arg4;
        clc = arg5;
        cld = (int)Math.sqrt(arg3 * arg3 + arg4 * arg4 + arg5 * arg5);
        cne();
    }

    public void cmf(int j, int k, int l, int i1, int j1) {
        clf = 256 - j * 4;
        cle = (64 - k) * 16 + 128;
        if(cib) {
            return;
        } else {
            cla = l;
            clb = i1;
            clc = j1;
            cld = (int)Math.sqrt(l * l + i1 * i1 + j1 * j1);
            cne();
            return;
        }
    }

    public void cmg(int j, int k, int l) {
        if(cib) {
            return;
        } else {
            cla = j;
            clb = k;
            clc = l;
            cld = (int)Math.sqrt(j * j + k * k + l * l);
            cne();
            return;
        }
    }

    public void cmh(int j, int k) {
        cga[j] = (byte)k;
    }

    public void cmi(int j, int k, int l) {
        cka = cka + j & 0xff;
        ckb = ckb + k & 0xff;
        ckc = ckc + l & 0xff;
        cmm();
        cgn = 1;
    }

    public void cmj(int j, int k, int l) {
        cka = j & 0xff;
        ckb = k & 0xff;
        ckc = l & 0xff;
        cmm();
        cgn = 1;
    }

    public void cmk(int j, int k, int l) {
        cjl += j;
        cjm += k;
        cjn += l;
        cmm();
        cgn = 1;
    }

    public void cml(int j, int k, int l) {
        cjl = j;
        cjm = k;
        cjn = l;
        cmm();
        cgn = 1;
    }

    private void cmm() {
        if(ckg != 256 || ckh != 256 || cki != 256 || ckj != 256 || ckk != 256 || ckl != 256) {
            ckm = 4;
            return;
        }
        if(ckd != 256 || cke != 256 || ckf != 256) {
            ckm = 3;
            return;
        }
        if(cka != 0 || ckb != 0 || ckc != 0) {
            ckm = 2;
            return;
        }
        if(cjl != 0 || cjm != 0 || cjn != 0) {
            ckm = 1;
            return;
        } else {
            ckm = 0;
            return;
        }
    }

    private void cmn(int arg0, int arg1, int arg2) {
        for(int j = 0; j < cfh; j++) {
            cja[j] += arg0;
            cjb[j] += arg1;
            cjc[j] += arg2;
        }

    }

    private void cna(int arg0, int arg1, int arg2) {
        for(int k2 = 0; k2 < cfh; k2++) {
            if(arg2 != 0) {
                int j = cie[arg2];
                int i1 = cie[arg2 + 256];
                int l1 = cjb[k2] * j + cja[k2] * i1 >> 15;
                cjb[k2] = cjb[k2] * i1 - cja[k2] * j >> 15;
                cja[k2] = l1;
            }
            if(arg0 != 0) {
                int k = cie[arg0];
                int j1 = cie[arg0 + 256];
                int i2 = cjb[k2] * j1 - cjc[k2] * k >> 15;
                cjc[k2] = cjb[k2] * k + cjc[k2] * j1 >> 15;
                cjb[k2] = i2;
            }
            if(arg1 != 0) {
                int l = cie[arg1];
                int k1 = cie[arg1 + 256];
                int j2 = cjc[k2] * l + cja[k2] * k1 >> 15;
                cjc[k2] = cjc[k2] * k1 - cja[k2] * l >> 15;
                cja[k2] = j2;
            }
        }

    }

    private void cnb(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        for(int j = 0; j < cfh; j++) {
            if(arg0 != 0)
                cja[j] += cjb[j] * arg0 >> 8;
            if(arg1 != 0)
                cjc[j] += cjb[j] * arg1 >> 8;
            if(arg2 != 0)
                cja[j] += cjc[j] * arg2 >> 8;
            if(arg3 != 0)
                cjb[j] += cjc[j] * arg3 >> 8;
            if(arg4 != 0)
                cjc[j] += cja[j] * arg4 >> 8;
            if(arg5 != 0)
                cjb[j] += cja[j] * arg5 >> 8;
        }

    }

    private void cnc(int arg0, int arg1, int arg2) {
        for(int j = 0; j < cfh; j++) {
            cja[j] = cja[j] * arg0 >> 8;
            cjb[j] = cjb[j] * arg1 >> 8;
            cjc[j] = cjc[j] * arg2 >> 8;
        }

    }

    private void cnd() {
        chb = chd = chf = 0xf423f;
        ckn = chc = che = chg = 0xfff0bdc1;
        for(int j = 0; j < cgb; j++) {
            int ai[] = cgd[j];
            int l = ai[0];
            int j1 = cgc[j];
            int k1;
            int l1 = k1 = cja[l];
            int i2;
            int j2 = i2 = cjb[l];
            int k2;
            int l2 = k2 = cjc[l];
            for(int k = 0; k < j1; k++) {
                int i1 = ai[k];
                if(cja[i1] < k1)
                    k1 = cja[i1];
                else
                if(cja[i1] > l1)
                    l1 = cja[i1];
                if(cjb[i1] < i2)
                    i2 = cjb[i1];
                else
                if(cjb[i1] > j2)
                    j2 = cjb[i1];
                if(cjc[i1] < k2)
                    k2 = cjc[i1];
                else
                if(cjc[i1] > l2)
                    l2 = cjc[i1];
            }

            if(!cia) {
                cjf[j] = k1;
                cjg[j] = l1;
                cjh[j] = i2;
                cji[j] = j2;
                cjj[j] = k2;
                cjk[j] = l2;
            }
            if(l1 - k1 > ckn)
                ckn = l1 - k1;
            if(j2 - i2 > ckn)
                ckn = j2 - i2;
            if(l2 - k2 > ckn)
                ckn = l2 - k2;
            if(k1 < chb)
                chb = k1;
            if(l1 > chc)
                chc = l1;
            if(i2 < chd)
                chd = i2;
            if(j2 > che)
                che = j2;
            if(k2 < chf)
                chf = k2;
            if(l2 > chg)
                chg = l2;
        }

    }

    public void cne() {
        if(cib)
            return;
        int j = cle * cld >> 8;
        for(int k = 0; k < cgb; k++)
            if(cgi[k] != cij)
                cgi[k] = (cgj[k] * cla + cgk[k] * clb + cgl[k] * clc) / j;

        int ai[] = new int[cfh];
        int ai1[] = new int[cfh];
        int ai2[] = new int[cfh];
        int ai3[] = new int[cfh];
        for(int l = 0; l < cfh; l++) {
            ai[l] = 0;
            ai1[l] = 0;
            ai2[l] = 0;
            ai3[l] = 0;
        }

        for(int i1 = 0; i1 < cgb; i1++)
            if(cgi[i1] == cij) {
                for(int j1 = 0; j1 < cgc[i1]; j1++) {
                    int l1 = cgd[i1][j1];
                    ai[l1] += cgj[i1];
                    ai1[l1] += cgk[i1];
                    ai2[l1] += cgl[i1];
                    ai3[l1]++;
                }

            }

        for(int k1 = 0; k1 < cfh; k1++)
            if(ai3[k1] > 0)
                cfn[k1] = (ai[k1] * cla + ai1[k1] * clb + ai2[k1] * clc) / (j * ai3[k1]);

    }

    public void cnf() {
        if(cib && cia)
            return;
        for(int j = 0; j < cgb; j++) {
            int ai[] = cgd[j];
            int k = cja[ai[0]];
            int l = cjb[ai[0]];
            int i1 = cjc[ai[0]];
            int j1 = cja[ai[1]] - k;
            int k1 = cjb[ai[1]] - l;
            int l1 = cjc[ai[1]] - i1;
            int i2 = cja[ai[2]] - k;
            int j2 = cjb[ai[2]] - l;
            int k2 = cjc[ai[2]] - i1;
            int l2 = k1 * k2 - j2 * l1;
            int i3 = l1 * i2 - k2 * j1;
            int j3;
            for(j3 = j1 * j2 - i2 * k1; l2 > 8192 || i3 > 8192 || j3 > 8192 || l2 < -8192 || i3 < -8192 || j3 < -8192; j3 >>= 1) {
                l2 >>= 1;
                i3 >>= 1;
            }

            int k3 = (int)(256D * Math.sqrt(l2 * l2 + i3 * i3 + j3 * j3));
            if(k3 <= 0)
                k3 = 1;
            cgj[j] = (l2 * 0x10000) / k3;
            cgk[j] = (i3 * 0x10000) / k3;
            cgl[j] = (j3 * 65535) / k3;
            cgh[j] = -1;
        }

        cne();
    }

    public void cng() {
        if(cgn == 2) {
            cgn = 0;
            for(int j = 0; j < cfh; j++) {
                cja[j] = cil[j];
                cjb[j] = cim[j];
                cjc[j] = cin[j];
            }

            chb = chd = chf = 0xff676981;
            ckn = chc = che = chg = 0x98967f;
            return;
        }
        if(cgn == 1) {
            cgn = 0;
            for(int k = 0; k < cfh; k++) {
                cja[k] = cil[k];
                cjb[k] = cim[k];
                cjc[k] = cin[k];
            }

            if(ckm >= 2)
                cna(cka, ckb, ckc);
            if(ckm >= 3)
                cnc(ckd, cke, ckf);
            if(ckm >= 4)
                cnb(ckg, ckh, cki, ckj, ckk, ckl);
            if(ckm >= 1)
                cmn(cjl, cjm, cjn);
            cnd();
            cnf();
        }
    }

    public void cnh(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, 
            int arg7) {
        cng();
        if(chf > Camera.bgj || chg < Camera.bgi || chb > Camera.bgf || chc < Camera.bge || chd > Camera.bgh || che < Camera.bgg) {
            cha = false;
            return;
        }
        cha = true;
        int i1 = 0;
        int j1 = 0;
        int k1 = 0;
        int l1 = 0;
        int i2 = 0;
        int j2 = 0;
        if(arg5 != 0) {
            i1 = cif[arg5];
            j1 = cif[arg5 + 1024];
        }
        if(arg4 != 0) {
            i2 = cif[arg4];
            j2 = cif[arg4 + 1024];
        }
        if(arg3 != 0) {
            k1 = cif[arg3];
            l1 = cif[arg3 + 1024];
        }
        for(int k2 = 0; k2 < cfh; k2++) {
            int l2 = cja[k2] - arg0;
            int i3 = cjb[k2] - arg1;
            int j3 = cjc[k2] - arg2;
            if(arg5 != 0) {
                int j = i3 * i1 + l2 * j1 >> 15;
                i3 = i3 * j1 - l2 * i1 >> 15;
                l2 = j;
            }
            if(arg4 != 0) {
                int k = j3 * i2 + l2 * j2 >> 15;
                j3 = j3 * j2 - l2 * i2 >> 15;
                l2 = k;
            }
            if(arg3 != 0) {
                int l = i3 * l1 - j3 * k1 >> 15;
                j3 = i3 * k1 + j3 * l1 >> 15;
                i3 = l;
            }
            if(j3 >= arg7)
                cfl[k2] = (l2 << arg6) / j3;
            else
                cfl[k2] = l2 << arg6;
            if(j3 >= arg7)
                cfm[k2] = (i3 << arg6) / j3;
            else
                cfm[k2] = i3 << arg6;
            cfi[k2] = l2;
            cfj[k2] = i3;
            cfk[k2] = j3;
        }

    }

    public void cni() {
        cng();
        for(int j = 0; j < cfh; j++) {
            cil[j] = cja[j];
            cim[j] = cjb[j];
            cin[j] = cjc[j];
        }

        cjl = cjm = cjn = 0;
        cka = ckb = ckc = 0;
        ckd = cke = ckf = 256;
        ckg = ckh = cki = ckj = ckk = ckl = 256;
        ckm = 0;
    }

    public GameObject cnj() {
        GameObject ai[] = new GameObject[1];
        ai[0] = this;
        GameObject j = new GameObject(ai, 1);
        j.cgm = cgm;
        j.isGiantCrystal = isGiantCrystal;
        return j;
    }

    public GameObject cnk(boolean flag, boolean flag1, boolean flag2, boolean flag3) {
        GameObject ai[] = new GameObject[1];
        ai[0] = this;
        GameObject j = new GameObject(ai, 1, flag, flag1, flag2, flag3);
        j.cgm = cgm;
        return j;
    }

    public void cnl(GameObject j) {
        cka = j.cka;
        ckb = j.ckb;
        ckc = j.ckc;
        cjl = j.cjl;
        cjm = j.cjm;
        cjn = j.cjn;
        cmm();
        cgn = 1;
    }

    public int cnm(byte arg0[]) {
        for(; arg0[clg] == 10 || arg0[clg] == 13; clg++);
        int j = cih[arg0[clg++] & 0xff];
        int k = cih[arg0[clg++] & 0xff];
        int l = cih[arg0[clg++] & 0xff];
        int i1 = (j * 4096 + k * 64 + l) - 0x20000;
        if(i1 == 0x1e240)
            i1 = cij;
        return i1;
    }

    public int cfh;
    public int cfi[];
    public int cfj[];
    public int cfk[];
    public int cfl[];
    public int cfm[];
    public int cfn[];
    public byte cga[];
    public int cgb;
    public int cgc[];
    public int cgd[][];
    public int cge[];
    public int cgf[];
    public int cgg[];
    public int cgh[];
    public int cgi[];
    public int cgj[];
    public int cgk[];
    public int cgl[];
    public int cgm;
    public int cgn;
    public boolean cha;
    public int chb;
    public int chc;
    public int chd;
    public int che;
    public int chf;
    public int chg;
    public boolean chh;
    public boolean chi;
    public boolean isGiantCrystal;
    public int index;
    public int entityType[];
    public byte chm[];
    private boolean chn;
    public boolean cia;
    public boolean cib;
    public boolean cic;
    public boolean cid;
    private static int cie[];
    private static int cif[];
    private static byte cig[];
    private static int cih[];
    private int cij;
    public int cik;
    public int cil[];
    public int cim[];
    public int cin[];
    public int cja[];
    public int cjb[];
    public int cjc[];
    private int cjd;
    private int cje[][];
    private int cjf[];
    private int cjg[];
    private int cjh[];
    private int cji[];
    private int cjj[];
    private int cjk[];
    private int cjl;
    private int cjm;
    private int cjn;
    private int cka;
    private int ckb;
    private int ckc;
    private int ckd;
    private int cke;
    private int ckf;
    private int ckg;
    private int ckh;
    private int cki;
    private int ckj;
    private int ckk;
    private int ckl;
    private int ckm;
    private int ckn;
    private int cla;
    private int clb;
    private int clc;
    private int cld;
    protected int cle;
    protected int clf;
    private int clg;

    static  {
        cie = new int[512];
        cif = new int[2048];
        cig = new byte[64];
        cih = new int[256];
        for(int j = 0; j < 256; j++) {
            cie[j] = (int)(Math.sin((double)j * 0.02454369D) * 32768D);
            cie[j + 256] = (int)(Math.cos((double)j * 0.02454369D) * 32768D);
        }

        for(int k = 0; k < 1024; k++) {
            cif[k] = (int)(Math.sin((double)k * 0.00613592315D) * 32768D);
            cif[k + 1024] = (int)(Math.cos((double)k * 0.00613592315D) * 32768D);
        }

        for(int l = 0; l < 10; l++)
            cig[l] = (byte)(48 + l);

        for(int i1 = 0; i1 < 26; i1++)
            cig[i1 + 10] = (byte)(65 + i1);

        for(int j1 = 0; j1 < 26; j1++)
            cig[j1 + 36] = (byte)(97 + j1);

        cig[62] = -93;
        cig[63] = 36;
        for(int k1 = 0; k1 < 10; k1++)
            cih[48 + k1] = k1;

        for(int l1 = 0; l1 < 26; l1++)
            cih[65 + l1] = l1 + 10;

        for(int i2 = 0; i2 < 26; i2++)
            cih[97 + i2] = i2 + 36;

        cih[163] = 62;
        cih[36] = 63;
    }
}
