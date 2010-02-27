/* Class68_Sub13_Sub24 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class68_Sub13_Sub24 extends Class68_Sub13
{
    private int anInt3831 = 1;
    static int anInt3832;
    static Class21 aClass21_3833;
    static int anInt3834;
    static int anInt3835;
    static MutableString aClass100_3836;
    private int anInt3837;
    static int anInt3838;
    private int anInt3839 = 1;
    private static MutableString aClass100_3840;
    static MutableString aClass100_3841;
    static int anInt3842;
    static int anInt3843 = 0;
    static int anInt3844;
    static Class21 aClass21_3845;
    static int anInt3846;
    static int anInt3847;
    static int anInt3848;
    static MutableString aClass100_3849;

    static final MutableString method816(int i, int i_0_)
    {
        anInt3832++;
        if (i_0_ != 0)
            aClass21_3845 = null;
        return Class13_Sub1.method247(10, false, (byte) 125, i);
    }

    final void method700(Stream class68_sub14, int i, int i_1_)
    {
        try
        {
            int i_2_ = i;
            while_119_: do
            {
                do
                {
                    if (i_2_ != 0)
                    {
                        if (i_2_ != 1)
                        {
                            if (i_2_ == 2)
                                break;
                            break while_119_;
                        }
                    } else
                    {
                        anInt3839 = class68_sub14.readUByte();
                        break while_119_;
                    }
                    anInt3831 = class68_sub14.readUByte();
                    break while_119_;
                } while (false);
                anInt3837 = class68_sub14.readUShort();
            } while (false);
            if (i_1_ != -1)
                method818(111, null);
            anInt3834++;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("og.K(" + (class68_sub14 != null ? "{...}" : "null") + ',' + i + ',' + i_1_ + ')'));
        }
    }

    public Class68_Sub13_Sub24()
    {
        super(0, true);
        anInt3837 = 204;
    }

    public static void method817(int i)
    {
        if (i != 0)
            anInt3835 = 92;
        aClass21_3833 = null;
        aClass100_3849 = null;
        aClass100_3840 = null;
        aClass21_3845 = null;
        aClass100_3836 = null;
        aClass100_3841 = null;
    }

    static final void method818(int i, byte[] is)
    {
        try
        {
            anInt3838++;
            Stream class68_sub14 = new Stream(is);
            ((Stream) class68_sub14).position = is.length - 2;
            Stream.anInt3009 = class68_sub14.readUShort();
            Class4.anIntArray96 = new int[Stream.anInt3009];
            Class3.aByteArrayArray78 = new byte[Stream.anInt3009][];
            Object5.aByteArrayArray1240 = new byte[Stream.anInt3009][];
            ObjectDefinition.anIntArray1998 = new int[Stream.anInt3009];
            Class68_Sub13_Sub19.anIntArray3759 = new int[Stream.anInt3009];
            Class68_Sub10.aBooleanArray2907 = new boolean[Stream.anInt3009];
            Class68_Sub13_Sub12.anIntArray3641 = new int[Stream.anInt3009];
            ((Stream) class68_sub14).position = is.length - 7 - 8 * Stream.anInt3009;
            Class97.anInt1705 = class68_sub14.readUShort();
            Class68_Sub20_Sub15.anInt4407 = class68_sub14.readUShort();
            int i_3_ = (class68_sub14.readUByte() & 0xff) + 1;
            for (int i_4_ = 0; Stream.anInt3009 > i_4_; i_4_++)
                Class4.anIntArray96[i_4_] = class68_sub14.readUShort();
            for (int i_5_ = 0; Stream.anInt3009 > i_5_; i_5_++)
                ObjectDefinition.anIntArray1998[i_5_] = class68_sub14.readUShort();
            for (int i_6_ = 0; Stream.anInt3009 > i_6_; i_6_++)
                Class68_Sub13_Sub12.anIntArray3641[i_6_] = class68_sub14.readUShort();
            for (int i_7_ = 0; Stream.anInt3009 > i_7_; i_7_++)
                Class68_Sub13_Sub19.anIntArray3759[i_7_] = class68_sub14.readUShort();
            if (i != 14432)
                aClass100_3849 = null;
            ((Stream) class68_sub14).position = is.length - 7 - 3 * (i_3_ - 1) - 8 * Stream.anInt3009;
            Class68_Sub13_Sub17.anIntArray3721 = new int[i_3_];
            for (int i_8_ = 1; i_8_ < i_3_; i_8_++)
            {
                Class68_Sub13_Sub17.anIntArray3721[i_8_] = class68_sub14.readTInteger();
                if (Class68_Sub13_Sub17.anIntArray3721[i_8_] == 0)
                    Class68_Sub13_Sub17.anIntArray3721[i_8_] = 1;
            }
            ((Stream) class68_sub14).position = 0;
            for (int i_9_ = 0; i_9_ < Stream.anInt3009; i_9_++)
            {
                int i_10_ = Class68_Sub13_Sub12.anIntArray3641[i_9_];
                int i_11_ = Class68_Sub13_Sub19.anIntArray3759[i_9_];
                int i_12_ = i_10_ * i_11_;
                byte[] is_13_ = new byte[i_12_];
                byte[] is_14_ = new byte[i_12_];
                boolean bool = false;
                Object5.aByteArrayArray1240[i_9_] = is_14_;
                Class3.aByteArrayArray78[i_9_] = is_13_;
                int i_15_ = class68_sub14.readUByte();
                if ((0x1 & i_15_) == 0)
                {
                    for (int i_16_ = 0; i_12_ > i_16_; i_16_++)
                        is_14_[i_16_] = class68_sub14.readByte();
                    if ((0x2 & i_15_) != 0)
                    {
                        for (int i_17_ = 0; i_12_ > i_17_; i_17_++)
                        {
                            byte i_18_ = (is_13_[i_17_] = class68_sub14.readByte());
                            bool = bool | i_18_ != -1;
                        }
                    }
                } else
                {
                    for (int i_19_ = 0; i_10_ > i_19_; i_19_++)
                    {
                        for (int i_20_ = 0; i_11_ > i_20_; i_20_++)
                            is_14_[i_19_ + i_10_ * i_20_] = class68_sub14.readByte();
                    }
                    if ((0x2 & i_15_) != 0)
                    {
                        for (int i_21_ = 0; i_10_ > i_21_; i_21_++)
                        {
                            for (int i_22_ = 0; i_22_ < i_11_; i_22_++)
                            {
                                byte i_23_ = (is_13_[i_21_ + i_22_ * i_10_] = class68_sub14.readByte());
                                bool = bool | i_23_ != -1;
                            }
                        }
                    }
                }
                Class68_Sub10.aBooleanArray2907[i_9_] = bool;
            }
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, "og.C(" + i + ',' + (is != null ? "{...}" : "null") + ')');
        }
    }

    final int[] method698(byte i, int i_24_)
    {
        if (i != -61)
            return null;
        int[] is = ((Class68_Sub13) this).aClass115_2938.method1703(false, i_24_);
        if (((Class115) ((Class68_Sub13) this).aClass115_2938).aBoolean1959)
        {
            int i_25_ = 0;
            for (/**/; i_25_ < Class68_Sub13_Sub19.anInt3748; i_25_++)
            {
                int i_26_ = Class68_Sub13_Sub3.anIntArray3481[i_25_];
                int i_27_ = i_26_ * anInt3839 >> 12;
                int i_28_ = anInt3839 * (i_26_ % (4096 / anInt3839));
                int i_29_ = Class13_Sub3.anIntArray2674[i_24_];
                int i_30_ = i_29_ * anInt3831 >> 12;
                int i_31_ = anInt3831 * (i_29_ % (4096 / anInt3831));
                if (i_31_ < anInt3837)
                {
                    for (i_27_ -= i_30_; i_27_ < 0; i_27_ += 4)
                    {
                        /* empty */
                    }
                    for (/**/; i_27_ > 3; i_27_ -= 4)
                    {
                        /* empty */
                    }
                    if (i_27_ != 1)
                    {
                        is[i_25_] = 0;
                        continue;
                    }
                    if (anInt3837 > i_28_)
                    {
                        is[i_25_] = 0;
                        continue;
                    }
                }
                if (i_28_ < anInt3837)
                {
                    for (i_27_ -= i_30_; i_27_ < 0; i_27_ += 4)
                    {
                        /* empty */
                    }
                    for (/**/; i_27_ > 3; i_27_ -= 4)
                    {
                        /* empty */
                    }
                    if (i_27_ > 0)
                    {
                        is[i_25_] = 0;
                        continue;
                    }
                }
                is[i_25_] = 4096;
            }
        }
        anInt3844++;
        return is;
    }

    static final void method819(int i, int i_32_, int i_33_, boolean bool, int i_34_, int i_35_)
    {
        Class72.anInt1321 = i_35_;
        anInt3847++;
        PlayerDefinition.cameraViewToY = i_34_;
        Class68_Sub20_Sub12.anInt4356 = i;
        if (bool != true)
            method816(20, -89);
        Class68_Sub13.cameraViewToZ = i_32_;
        Class8.cameraViewToX = i_33_;
        if (Class72.anInt1321 >= 100)
        {
            int __x = 128 * Class8.cameraViewToX + 64;
            int __y = PlayerDefinition.cameraViewToY * 128 + 64;
            int __z = (Player.fixZ(__x, GameSocket.plane, __y) - Class68_Sub13.cameraViewToZ);
            int dy = __y - Class85.cameraPositionY;
            int dz = __z - Class68_Sub5.cameraPositionZ;
            int dx = __x - Class68_Sub7.cameraPositionX;
            int i_42_ = (int) Math.sqrt((double) (dx * dx + dy * dy));
            GameCanvas.cameraPitch = ((int) (Math.atan2((double) dz, (double) i_42_) * 325.949) & 0x7ff);
            Class74.cameraYaw = (int) (Math.atan2((double) dx, (double) dy) * -325.949) & 0x7ff;
            if (GameCanvas.cameraPitch < 128)
                GameCanvas.cameraPitch = 128;
            if (GameCanvas.cameraPitch > 383)
                GameCanvas.cameraPitch = 383;
        }
        NodeSubList.anInt2216 = 2;
    }

    static
    {
        aClass100_3840 = Class112.makeMutableString(43, "Take");
        aClass100_3841 = Class112.makeMutableString(43, "overlay2");
        anInt3835 = 0;
        aClass100_3849 = Class112.makeMutableString(43, "Freie Welt");
        aClass100_3836 = aClass100_3840;
    }
}
