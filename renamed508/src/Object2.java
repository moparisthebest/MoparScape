/* Class76 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Object2
{
    static int anInt1345 = 20;
    static int[][] anIntArrayArray1346 = new int[104][104];
    static MutableString aClass100_1347;
    static int anInt1348;
    int anInt1349;
    private static MutableString aClass100_1350 = Class112.makeMutableString(43, "Use");
    static int anInt1351;
    int anInt1352;
    static int anInt1353;
    static Class52 aClass52_1354;
    static int anInt1355 = 0;
    int anInt1356;
    static int anInt1357;
    Animable aClass1_1358;
    int anInt1359;
    Animable aClass1_1360;
    int anInt1361;
    int anInt1362;
    int anInt1363;
    long uid = 0L;

    static final int method1404(int i, int i_0_)
    {
        anInt1357++;
        if (Class68_Sub13_Sub27.language == 1)
            return 7;
        if (Class68_Sub13_Sub27.language == 2)
            return 20;
        int i_1_ = i_0_;
        while_117_: do
        {
            while_116_: do
            {
                while_115_: do
                {
                    while_114_: do
                    {
                        while_113_: do
                        {
                            while_112_: do
                            {
                                while_111_: do
                                {
                                    while_110_: do
                                    {
                                        while_109_: do
                                        {
                                            while_108_: do
                                            {
                                                while_107_: do
                                                {
                                                    while_106_: do
                                                    {
                                                        while_105_: do
                                                        {
                                                            while_104_: do
                                                            {
                                                                while_103_: do
                                                                {
                                                                    while_102_: do
                                                                    {
                                                                        while_101_: do
                                                                        {
                                                                            while_100_: do
                                                                            {
                                                                                do
                                                                                {
                                                                                    if (i_1_ != 15)
                                                                                    {
                                                                                        if (i_1_ == 16)
                                                                                            break;
                                                                                        if (i_1_ == 22)
                                                                                            break while_100_;
                                                                                        if (i_1_ == 31)
                                                                                            break while_101_;
                                                                                        if (i_1_ == 38)
                                                                                            break while_102_;
                                                                                        if (i_1_ == 43)
                                                                                            break while_103_;
                                                                                        if (i_1_ == 48)
                                                                                            break while_104_;
                                                                                        if (i_1_ == 58)
                                                                                            break while_105_;
                                                                                        if (i_1_ == 69)
                                                                                            break while_106_;
                                                                                        if (i_1_ == 74)
                                                                                            break while_107_;
                                                                                        if (i_1_ == 77)
                                                                                            break while_108_;
                                                                                        if (i_1_ == 101)
                                                                                            break while_109_;
                                                                                        if (i_1_ == 103)
                                                                                            break while_110_;
                                                                                        if (i_1_ == 152)
                                                                                            break while_111_;
                                                                                        if (i_1_ == 161)
                                                                                            break while_112_;
                                                                                        if (i_1_ == 162)
                                                                                            break while_113_;
                                                                                        if (i_1_ == 166)
                                                                                            break while_114_;
                                                                                        if (i_1_ == 179)
                                                                                            break while_115_;
                                                                                        if (i_1_ != 191)
                                                                                            break while_117_;
                                                                                        if (client.anInt2387 == 0)
                                                                                            break while_116_;
                                                                                    }
                                                                                    return 13;
                                                                                } while (false);
                                                                                return 3;
                                                                            } while (false);
                                                                            return 8;
                                                                        } while (false);
                                                                        return 14;
                                                                    } while (false);
                                                                    return 2;
                                                                } while (false);
                                                                return 15;
                                                            } while (false);
                                                            return 17;
                                                        } while (false);
                                                        return 11;
                                                    } while (false);
                                                    return 6;
                                                } while (false);
                                                return 20;
                                            } while (false);
                                            return 1;
                                        } while (false);
                                        return 12;
                                    } while (false);
                                    return 19;
                                } while (false);
                                return 16;
                            } while (false);
                            return 4;
                        } while (false);
                        return 9;
                    } while (false);
                    return 10;
                } while (false);
                return 18;
            } while (false);
            return 5;
        } while (false);
        if (i != 3)
            anIntArrayArray1346 = null;
        return 0;
    }

    static final Class13_Sub2 method1405(int i, Stream class68_sub14)
    {
        try
        {
            if (i != 3)
                return null;
            anInt1353++;
            return new Class13_Sub2(class68_sub14.readShort(), class68_sub14.readShort(), class68_sub14.readShort(), class68_sub14.readShort(), class68_sub14.readTInteger(), class68_sub14.readUByte());
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("mk.C(" + i + ',' + (class68_sub14 != null ? "{...}" : "null") + ')'));
        }
    }

    static final void method1406(int i, byte i_2_)
    {
        anInt1348++;
        if (Class68_Sub13_Sub25.method824(i, (byte) -2))
        {
            Widget[] class45s = Class68_Sub13_Sub36.widgetCache[i];
            if (i_2_ <= 103)
                method1405(125, null);
            for (int i_3_ = 0; class45s.length > i_3_; i_3_++)
            {
                Widget class45 = class45s[i_3_];
                if (class45 != null)
                {
                    ((Widget) class45).anInt756 = 0;
                    ((Widget) class45).anInt771 = 0;
                }
            }
        }
    }

    static final void method1407(int i)
    {
        anInt1351++;
        if (Class71.anInt1298 != -1 && Class84.anInt1537 != -1)
        {
            int i_4_ = ((GameCanvas.anInt48 * (Class68_Sub13_Sub25.anInt3858 - Class33.anInt577) >> 16) + Class33.anInt577);
            GameCanvas.anInt48 += i_4_;
            float[] fs = new float[3];
            if (GameCanvas.anInt48 >= 65535)
            {
                if (!CipheredByteVector.aBoolean4129)
                    MutableString.aBoolean2281 = true;
                else
                    MutableString.aBoolean2281 = false;
                CipheredByteVector.aBoolean4129 = true;
                GameCanvas.anInt48 = 65535;
            } else
            {
                MutableString.aBoolean2281 = false;
                CipheredByteVector.aBoolean4129 = false;
            }
            int i_5_ = Class30.anInt546 * 2;
            float f = (float) GameCanvas.anInt48 / 65535.0F;
            for (int i_6_ = 0; i_6_ < 3; i_6_++)
            {
                int i_7_ = ((Class68_Sub13_Sub4.anIntArrayArrayArray3505[Class71.anInt1298][i_5_ + 1][i_6_]) * 3);
                int i_8_ = 3 * ((Class68_Sub13_Sub4.anIntArrayArrayArray3505[Class71.anInt1298][i_5_ + 2][i_6_]) - (Class68_Sub13_Sub4.anIntArrayArrayArray3505[Class71.anInt1298][i_5_ + 3][i_6_]) + (Class68_Sub13_Sub4.anIntArrayArrayArray3505[Class71.anInt1298][i_5_ + 2][i_6_]));
                int i_9_ = (Class68_Sub13_Sub4.anIntArrayArrayArray3505[Class71.anInt1298][i_5_][i_6_]);
                int i_10_ = ((Class68_Sub13_Sub4.anIntArrayArrayArray3505[Class71.anInt1298][i_5_][i_6_]) * 3);
                int i_11_ = i_7_ - i_10_;
                int i_12_ = (i_7_ - i_8_ + ((Class68_Sub13_Sub4.anIntArrayArrayArray3505[Class71.anInt1298][i_5_ + 2][i_6_]) - i_9_));
                int i_13_ = i_10_ - (i_7_ * 2 - i_8_);
                fs[i_6_] = (float) i_9_ + f * (f * (f * (float) i_12_ + (float) i_13_) + (float) i_11_);
            }
            if (Class36.baseX == 0 && Class68_Sub13_Sub35.baseY == 0)
            {
                Class68_Sub13_Sub35.baseY = ((int) fs[2] >> 10) * 8 - 48;
                Class36.baseX = 8 * ((int) fs[0] >> 10) - 48;
            }
            Class85.cameraPositionY = (int) fs[2] - Class68_Sub13_Sub35.baseY * 128;
            Class68_Sub5.cameraPositionZ = (int) fs[1] * i;
            Class68_Sub7.cameraPositionX = (int) fs[0] - 128 * Class36.baseX;
            float[] fs_14_ = new float[3];
            int i_15_ = 2 * Class68_Sub13_Sub10.anInt3592;
            for (int i_16_ = 0; i_16_ < 3; i_16_++)
            {
                int i_17_ = ((Class68_Sub13_Sub4.anIntArrayArrayArray3505[Class84.anInt1537][i_15_ + 1][i_16_]) * 3);
                int i_18_ = 3 * (Class68_Sub13_Sub4.anIntArrayArrayArray3505[Class84.anInt1537][i_15_][i_16_]);
                int i_19_ = (Class68_Sub13_Sub4.anIntArrayArrayArray3505[Class84.anInt1537][i_15_][i_16_]);
                int i_20_ = (((Class68_Sub13_Sub4.anIntArrayArrayArray3505[Class84.anInt1537][i_15_ + 2][i_16_]) + (Class68_Sub13_Sub4.anIntArrayArrayArray3505[Class84.anInt1537][i_15_ + 2][i_16_]) - (Class68_Sub13_Sub4.anIntArrayArrayArray3505[Class84.anInt1537][i_15_ + 3][i_16_])) * 3);
                int i_21_ = i_20_ + (i_18_ - 2 * i_17_);
                int i_22_ = i_17_ - i_18_;
                int i_23_ = ((Class68_Sub13_Sub4.anIntArrayArrayArray3505[Class84.anInt1537][i_15_ + 2][i_16_]) - (i_19_ - i_17_) - i_20_);
                fs_14_[i_16_] = (((float) i_22_ + ((float) i_21_ + (float) i_23_ * f) * f) * f) + (float) i_19_;
            }
            float f_24_ = -fs[0] + fs_14_[0];
            float f_25_ = -1.0F * (fs_14_[1] - fs[1]);
            float f_26_ = fs_14_[2] - fs[2];
            double d = Math.sqrt((double) (f_26_ * f_26_ + f_24_ * f_24_));
            Class68_Sub13_Sub22.aFloat3814 = (float) Math.atan2((double) f_25_, d);
            Widget.aFloat921 = -(float) Math.atan2((double) f_24_, (double) f_26_);
            Class74.cameraYaw = (int) (325.949 * (double) Widget.aFloat921) & 0x7ff;
            GameCanvas.cameraPitch = ((int) (325.949 * (double) Class68_Sub13_Sub22.aFloat3814) & 0x7ff);
        }
    }

    public static void method1408(int i)
    {
        aClass100_1347 = null;
        aClass100_1350 = null;
        anIntArrayArray1346 = null;
        if (i == 162)
            aClass52_1354 = null;
    }

    public Object2()
    {
        /* empty */
    }

    static
    {
        aClass100_1347 = aClass100_1350;
    }
}
