/* Class5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class5 {
    public int anInt98;
    public int[] anIntArray99;
    public int anInt100;
    public int anInt101 = 2;
    public int anInt102;
    public int[] anIntArray103 = new int[2];
    public int anInt104;
    public int anInt105;
    public int anInt106;
    public int anInt107;
    public int anInt108;

    public void method189(Stream class68_sub14) {
        anInt101 = class68_sub14.readUnsignedByte(-6677);
        anIntArray103 = new int[anInt101];
        anIntArray99 = new int[anInt101];
        for (int i = 0; i < anInt101; i++) {
            anIntArray103[i] = class68_sub14.readUnsignedWord(1355769544);
            anIntArray99[i] = class68_sub14.readUnsignedWord(1355769544);
        }
    }

    public int method190(int i) {
        if (anInt104 >= anInt105) {
            anInt107 = anIntArray99[anInt108++] << 15;
            if (anInt108 >= anInt101)
                anInt108 = anInt101 - 1;
            anInt105 = (int) ((double) anIntArray103[anInt108] / 65536.0
                    * (double) i);
            if (anInt105 > anInt104)
                anInt106 = (((anIntArray99[anInt108] << 15) - anInt107)
                        / (anInt105 - anInt104));
        }
        anInt107 += anInt106;
        anInt104++;
        return anInt107 - anInt106 >> 15;
    }

    public void method191(Stream class68_sub14) {
        anInt100 = class68_sub14.readUnsignedByte(-6677);
        anInt98 = class68_sub14.readDWord();
        anInt102 = class68_sub14.readDWord();
        method189(class68_sub14);
    }

    public void method192() {
        anInt105 = 0;
        anInt108 = 0;
        anInt106 = 0;
        anInt107 = 0;
        anInt104 = 0;
    }

    public Class5() {
        anIntArray99 = new int[2];
        anIntArray103[0] = 0;
        anIntArray103[1] = 65535;
        anIntArray99[0] = 0;
        anIntArray99[1] = 65535;
    }
}
