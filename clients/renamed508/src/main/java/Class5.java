/* Class5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class5
{
    int anInt98;
    private int[] anIntArray99;
    int anInt100;
    private int anInt101 = 2;
    int anInt102;
    private int[] anIntArray103 = new int[2];
    private int anInt104;
    private int anInt105;
    private int anInt106;
    private int anInt107;
    private int anInt108;

    final void method189(Stream class68_sub14)
    {
        anInt101 = class68_sub14.readUByte();
        anIntArray103 = new int[anInt101];
        anIntArray99 = new int[anInt101];
        for (int i = 0; i < anInt101; i++)
        {
            anIntArray103[i] = class68_sub14.readUShort();
            anIntArray99[i] = class68_sub14.readUShort();
        }
    }

    final int method190(int i)
    {
        if (anInt104 >= anInt105)
        {
            anInt107 = anIntArray99[anInt108++] << 15;
            if (anInt108 >= anInt101)
                anInt108 = anInt101 - 1;
            anInt105 = (int) ((double) anIntArray103[anInt108] / 65536.0 * (double) i);
            if (anInt105 > anInt104)
                anInt106 = (((anIntArray99[anInt108] << 15) - anInt107) / (anInt105 - anInt104));
        }
        anInt107 += anInt106;
        anInt104++;
        return anInt107 - anInt106 >> 15;
    }

    final void method191(Stream class68_sub14)
    {
        ((Class5) this).anInt100 = class68_sub14.readUByte();
        ((Class5) this).anInt98 = class68_sub14.readInteger();
        ((Class5) this).anInt102 = class68_sub14.readInteger();
        method189(class68_sub14);
    }

    final void method192()
    {
        anInt105 = 0;
        anInt108 = 0;
        anInt106 = 0;
        anInt107 = 0;
        anInt104 = 0;
    }

    public Class5()
    {
        anIntArray99 = new int[2];
        anIntArray103[0] = 0;
        anIntArray103[1] = 65535;
        anIntArray99[0] = 0;
        anIntArray99[1] = 65535;
    }
}
