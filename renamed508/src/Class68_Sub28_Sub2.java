/* Class68_Sub28_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class68_Sub28_Sub2 extends Class68_Sub28
{
    static int anInt4533;
    static int anInt4534;
    static int anInt4535;
    static int anInt4536;
    static int anInt4537;
    static int anInt4538;
    static int anInt4539;
    static int anInt4540;
    static int anInt4541;
    static int anInt4542;
    static int anInt4543;
    NodeList aClass16_4544 = new NodeList();
    private Class68_Sub28_Sub1 aClass68_Sub28_Sub1_4545;
    static MRUNodes aClass98_4546 = new MRUNodes(4);
    static int anInt4547;
    static int[] anIntArray4548;
    static int anInt4549;
    static MutableString aClass100_4550;
    static MutableString aClass100_4551 = Class112.makeMutableString(43, "Konfig geladen)3");
    static MutableString aClass100_4552 = Class112.makeMutableString(43, "Spieler kann nicht gefunden werden: ");
    static MutableString username;
    static MutableString password;
    static int anInt4555;
    static int anInt4556;
    Class68_Sub28_Sub4 aClass68_Sub28_Sub4_4557 = new Class68_Sub28_Sub4();
    static MutableString aClass100_4558;

    final void method1225(int[] is, int i, int i_0_)
    {
        try
        {
            ((Class68_Sub28_Sub2) this).aClass68_Sub28_Sub4_4557.method1225(is, i, i_0_);
            anInt4533++;
            Class68_Sub26 class68_sub26 = (Class68_Sub26) ((Class68_Sub28_Sub2) this).aClass16_4544.method293((byte) 76);
            while_60_: for (/**/; class68_sub26 != null; class68_sub26 = (Class68_Sub26) ((Class68_Sub28_Sub2) this).aClass16_4544.method290((byte) -114))
            {
                if (!aClass68_Sub28_Sub1_4545.method1231(class68_sub26, (byte) -42))
                {
                    int i_1_ = i_0_;
                    int i_2_ = i;
                    while (i_1_ > ((Class68_Sub26) class68_sub26).anInt3198)
                    {
                        method1270(class68_sub26, ((Class68_Sub26) class68_sub26).anInt3198, 24981, i_2_, i_2_ + i_1_, is);
                        i_2_ += ((Class68_Sub26) class68_sub26).anInt3198;
                        i_1_ -= ((Class68_Sub26) class68_sub26).anInt3198;
                        if (aClass68_Sub28_Sub1_4545.method1252(i_1_, i_2_, class68_sub26, (byte) -68, is))
                            continue while_60_;
                    }
                    method1270(class68_sub26, i_1_, 24981, i_2_, i_2_ + i_1_, is);
                    ((Class68_Sub26) class68_sub26).anInt3198 -= i_1_;
                }
            }
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("hk.F(" + (is != null ? "{...}" : "null") + ',' + i + ',' + i_0_ + ')'));
        }
    }

    static final void method1265(int i)
    {
        anInt4535++;
        if (i == -2 && Class54.aClass45_1033 == null && Class35.aClass45_606 == null)
        {
            int i_3_ = Class29.anInt537;
            do
            {
                if (Class120.menuOpen)
                {
                    if (i_3_ != 1)
                    {
                        int i_4_ = Class13.anInt223;
                        int i_5_ = Class96.anInt1697;
                        if (i_5_ < Class49.menuX - 10 || (Class68_Sub13_Sub15.anInt3689 + Class49.menuX + 10) < i_5_ || i_4_ < Class68_Sub13_Sub14.menuY - 10 || i_4_ > (Class68_Sub13_Sub14.menuY + Class33.anInt588 + 10))
                        {
                            Class120.menuOpen = false;
                            Class127.method1787(Class49.menuX, Class68_Sub13_Sub14.menuY, Class68_Sub13_Sub15.anInt3689, Class33.anInt588, (byte) -45);
                        }
                    }
                    if (i_3_ == 1)
                    {
                        int i_6_ = Class49.menuX;
                        int i_7_ = Class68_Sub13_Sub14.menuY;
                        int i_8_ = Class68_Sub13_Sub37.anInt4079;
                        int i_9_ = Class125.anInt2175;
                        int i_10_ = -1;
                        int i_11_ = Class68_Sub13_Sub15.anInt3689;
                        for (int i_12_ = 0; i_12_ < Class68_Sub13_Sub21.menuOptionsCount; i_12_++)
                        {
                            int i_13_ = (i_7_ + 31 + 15 * (Class68_Sub13_Sub21.menuOptionsCount - i_12_ - 1));
                            if (i_8_ > i_6_ && i_11_ + i_6_ > i_8_ && i_9_ > i_13_ - 13 && i_9_ < i_13_ + 3)
                                i_10_ = i_12_;
                        }
                        if (i_10_ != -1)
                            Class68_Sub20_Sub8.method1083((byte) 51, i_10_);
                        Class120.menuOpen = false;
                        Class127.method1787(Class49.menuX, Class68_Sub13_Sub14.menuY, Class68_Sub13_Sub15.anInt3689, Class33.anInt588, (byte) -95);
                    }
                } else
                {
                    if (i_3_ == 1 && Class68_Sub13_Sub21.menuOptionsCount > 0)
                    {
                        short i_14_ = (Class68_Sub28_Sub1.menuActionIDs[Class68_Sub13_Sub21.menuOptionsCount - 1]);
                        if (i_14_ == 41 || i_14_ == 40 || i_14_ == 43 || i_14_ == 38 || i_14_ == 58 || i_14_ == 14 || i_14_ == 17 || i_14_ == 13 || i_14_ == 7 || i_14_ == 22 || i_14_ == 16 || i_14_ == 1001)
                        {
                            int i_15_ = (Class37.menuActionCommands2[Class68_Sub13_Sub21.menuOptionsCount - 1]);
                            int i_16_ = (Class68_Sub13_Sub37.menuActionCommands3[Class68_Sub13_Sub21.menuOptionsCount - 1]);
                            Widget class45 = Class68_Sub20_Sub15.method1170(i_16_, (byte) -80);
                            if (Class52.method542(client.method41(class45), true) || (Class68_Sub13_Sub8.method733(0, client.method41(class45))))
                            {
                                Class68_Sub13_Sub6.anInt3534 = 0;
                                Class87.aBoolean1589 = false;
                                if (Class54.aClass45_1033 != null)
                                    NodeCache.method1688(Class54.aClass45_1033, -115);
                                Class54.aClass45_1033 = Class68_Sub20_Sub15.method1170(i_16_, (byte) -80);
                                Class68_Sub18.anInt3048 = Class125.anInt2175;
                                Class59.anInt1102 = Class68_Sub13_Sub37.anInt4079;
                                Class68_Sub20_Sub2.anInt4191 = i_15_;
                                NodeCache.method1688(Class54.aClass45_1033, -114);
                                break;
                            }
                        }
                    }
                    if (i_3_ == 1 && ((Class14.anInt228 == 1 && Class68_Sub13_Sub21.menuOptionsCount > 2) || GameApplet.method17((byte) -121, (Class68_Sub13_Sub21.menuOptionsCount) - 1)))
                        i_3_ = 2;
                    if (i_3_ == 2 && Class68_Sub13_Sub21.menuOptionsCount > 0 || Object3.anInt940 == 1)
                        Class68_Sub13_Sub18.method787((byte) -15);
                    if ((i_3_ != 1 || Class68_Sub13_Sub21.menuOptionsCount <= 0) && Object3.anInt940 != 2)
                        break;
                    Class68_Sub13_Sub39.method901((byte) 106);
                }
                break;
            } while (false);
        }
    }

    private final void method1266(Class68_Sub26 class68_sub26, int i, int i_17_)
    {
        try
        {
            if (((((Class68_Sub28_Sub1) aClass68_Sub28_Sub1_4545).anIntArray4526[((Class68_Sub26) class68_sub26).anInt3195]) & 0x4) != 0 && ((Class68_Sub26) class68_sub26).anInt3190 < 0)
            {
                int i_18_ = ((((Class68_Sub28_Sub1) aClass68_Sub28_Sub1_4545).anIntArray4463[((Class68_Sub26) class68_sub26).anInt3195]) / Class93.anInt1662);
                int i_19_ = ((i_18_ + (1048575 - ((Class68_Sub26) class68_sub26).anInt3182)) / i_18_);
                ((Class68_Sub26) class68_sub26).anInt3182 = (i * i_18_ + ((Class68_Sub26) class68_sub26).anInt3182 & 0xfffff);
                if (i_19_ <= i)
                {
                    if ((((Class68_Sub28_Sub1) aClass68_Sub28_Sub1_4545).anIntArray4503[((Class68_Sub26) class68_sub26).anInt3195]) == 0)
                        ((Class68_Sub26) class68_sub26).aClass68_Sub28_Sub3_3187 = (Class68_Sub28_Sub3.method1287((((Class68_Sub26) class68_sub26).aClass68_Sub11_Sub1_3206), ((Class68_Sub26) class68_sub26).aClass68_Sub28_Sub3_3187.method1294(), ((Class68_Sub26) class68_sub26).aClass68_Sub28_Sub3_3187.method1291(), ((Class68_Sub26) class68_sub26).aClass68_Sub28_Sub3_3187.method1284()));
                    else
                    {
                        ((Class68_Sub26) class68_sub26).aClass68_Sub28_Sub3_3187 = (Class68_Sub28_Sub3.method1287((((Class68_Sub26) class68_sub26).aClass68_Sub11_Sub1_3206), ((Class68_Sub26) class68_sub26).aClass68_Sub28_Sub3_3187.method1294(), 0, ((Class68_Sub26) class68_sub26).aClass68_Sub28_Sub3_3187.method1284()));
                        aClass68_Sub28_Sub1_4545.method1243(class68_sub26, (((Class68_Sub27) (((Class68_Sub26) class68_sub26).aClass68_Sub27_3196)).aShortArray3213[((Class68_Sub26) class68_sub26).anInt3200]) < 0, (byte) 59);
                    }
                    if ((((Class68_Sub27) ((Class68_Sub26) class68_sub26).aClass68_Sub27_3196).aShortArray3213[((Class68_Sub26) class68_sub26).anInt3200]) < 0)
                        ((Class68_Sub26) class68_sub26).aClass68_Sub28_Sub3_3187.method1272(-1);
                    i = ((Class68_Sub26) class68_sub26).anInt3182 / i_18_;
                }
            }
            if (i_17_ != -1)
                aClass100_4552 = null;
            ((Class68_Sub26) class68_sub26).aClass68_Sub28_Sub3_3187.method1229(i);
            anInt4536++;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("hk.B(" + (class68_sub26 != null ? "{...}" : "null") + ',' + i + ',' + i_17_ + ')'));
        }
    }

    final Class68_Sub28 method1226()
    {
        Class68_Sub26 class68_sub26 = ((Class68_Sub26) ((Class68_Sub28_Sub2) this).aClass16_4544.method293((byte) 76));
        anInt4537++;
        if (class68_sub26 == null)
            return null;
        if (((Class68_Sub26) class68_sub26).aClass68_Sub28_Sub3_3187 != null)
            return ((Class68_Sub26) class68_sub26).aClass68_Sub28_Sub3_3187;
        return method1228();
    }

    static final void method1267(int i)
    {
        Class91.aClass98_1638.method1572((byte) 94);
        Class11.aClass98_193.method1572((byte) 94);
        anInt4539++;
        if (i <= 67)
            aClass98_4546 = null;
    }

    public static void method1268(int i)
    {
        aClass100_4552 = null;
        aClass98_4546 = null;
        password = null;
        aClass100_4558 = null;
        aClass100_4550 = null;
        anIntArray4548 = null;
        aClass100_4551 = null;
        if (i > -19)
            anInt4547 = -57;
        username = null;
    }

    static final void method1269(int i)
    {
        anInt4543++;
        Class68_Sub13_Sub28.aClass98_3925.method1573(i ^ 0x1632);
        if (i != 5698)
            aClass100_4558 = null;
    }

    private final void method1270(Class68_Sub26 class68_sub26, int i, int i_20_, int i_21_, int i_22_, int[] is)
    {
        try
        {
            if ((0x4 & (((Class68_Sub28_Sub1) aClass68_Sub28_Sub1_4545).anIntArray4526[((Class68_Sub26) class68_sub26).anInt3195])) != 0 && ((Class68_Sub26) class68_sub26).anInt3190 < 0)
            {
                int i_23_ = ((((Class68_Sub28_Sub1) aClass68_Sub28_Sub1_4545).anIntArray4463[((Class68_Sub26) class68_sub26).anInt3195]) / Class93.anInt1662);
                for (;;)
                {
                    int i_24_ = ((1048575 - ((Class68_Sub26) class68_sub26).anInt3182 + i_23_) / i_23_);
                    if (i < i_24_)
                        break;
                    ((Class68_Sub26) class68_sub26).aClass68_Sub28_Sub3_3187.method1225(is, i_21_, i_24_);
                    ((Class68_Sub26) class68_sub26).anInt3182 += i_23_ * i_24_ - 1048576;
                    i -= i_24_;
                    int i_25_ = Class93.anInt1662 / 100;
                    i_21_ += i_24_;
                    int i_26_ = 262144 / i_23_;
                    if (i_25_ > i_26_)
                        i_25_ = i_26_;
                    Class68_Sub28_Sub3 class68_sub28_sub3 = (((Class68_Sub26) class68_sub26).aClass68_Sub28_Sub3_3187);
                    if ((((Class68_Sub28_Sub1) aClass68_Sub28_Sub1_4545).anIntArray4503[((Class68_Sub26) class68_sub26).anInt3195]) == 0)
                        ((Class68_Sub26) class68_sub26).aClass68_Sub28_Sub3_3187 = (Class68_Sub28_Sub3.method1287((((Class68_Sub26) class68_sub26).aClass68_Sub11_Sub1_3206), class68_sub28_sub3.method1294(), class68_sub28_sub3.method1291(), class68_sub28_sub3.method1284()));
                    else
                    {
                        ((Class68_Sub26) class68_sub26).aClass68_Sub28_Sub3_3187 = (Class68_Sub28_Sub3.method1287((((Class68_Sub26) class68_sub26).aClass68_Sub11_Sub1_3206), class68_sub28_sub3.method1294(), 0, class68_sub28_sub3.method1284()));
                        aClass68_Sub28_Sub1_4545.method1243(class68_sub26, (((Class68_Sub27) (((Class68_Sub26) class68_sub26).aClass68_Sub27_3196)).aShortArray3213[((Class68_Sub26) class68_sub26).anInt3200]) < 0, (byte) 56);
                        ((Class68_Sub26) class68_sub26).aClass68_Sub28_Sub3_3187.method1280(i_25_, class68_sub28_sub3.method1291());
                    }
                    if ((((Class68_Sub27) ((Class68_Sub26) class68_sub26).aClass68_Sub27_3196).aShortArray3213[((Class68_Sub26) class68_sub26).anInt3200]) < 0)
                        ((Class68_Sub26) class68_sub26).aClass68_Sub28_Sub3_3187.method1272(-1);
                    class68_sub28_sub3.method1288(i_25_);
                    class68_sub28_sub3.method1225(is, i_21_, i_22_ - i_21_);
                    if (class68_sub28_sub3.method1278())
                        ((Class68_Sub28_Sub2) this).aClass68_Sub28_Sub4_4557.method1316(class68_sub28_sub3);
                }
                ((Class68_Sub26) class68_sub26).anInt3182 += i_23_ * i;
            }
            anInt4538++;
            if (i_20_ != 24981)
                aClass100_4550 = null;
            ((Class68_Sub26) class68_sub26).aClass68_Sub28_Sub3_3187.method1225(is, i_21_, i);
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("hk.G(" + (class68_sub26 != null ? "{...}" : "null") + ',' + i + ',' + i_20_ + ',' + i_21_ + ',' + i_22_ + ',' + (is != null ? "{...}" : "null") + ')'));
        }
    }

    static final void method1271(byte i)
    {
        if (i != -38)
            method1265(-58);
        anInt4534++;
        for (;;)
        {
            Class68_Sub25 class68_sub25;
            synchronized (Class68_Sub20_Sub10.aClass16_4316)
            {
                class68_sub25 = (Class68_Sub25) Class127.aClass16_2207.method294(-110);
            }
            if (class68_sub25 == null)
                break;
            ((Class68_Sub25) class68_sub25).aClass21_Sub1_3177.method364(-83, false, ((Class68_Sub25) class68_sub25).aByteArray3167, ((Class68_Sub25) class68_sub25).aClass89_3172, (int) ((Node) class68_sub25).nodeID);
        }
    }

    final int method1224()
    {
        anInt4542++;
        return 0;
    }

    final void method1229(int i)
    {
        ((Class68_Sub28_Sub2) this).aClass68_Sub28_Sub4_4557.method1229(i);
        anInt4540++;
        while_62_: for (Class68_Sub26 class68_sub26 = (Class68_Sub26) ((Class68_Sub28_Sub2) this).aClass16_4544.method293((byte) 76); class68_sub26 != null; class68_sub26 = (Class68_Sub26) ((Class68_Sub28_Sub2) this).aClass16_4544.method290((byte) -117))
        {
            if (!aClass68_Sub28_Sub1_4545.method1231(class68_sub26, (byte) -42))
            {
                int i_27_ = i;
                while (((Class68_Sub26) class68_sub26).anInt3198 < i_27_)
                {
                    method1266(class68_sub26, ((Class68_Sub26) class68_sub26).anInt3198, -1);
                    i_27_ -= ((Class68_Sub26) class68_sub26).anInt3198;
                    if (aClass68_Sub28_Sub1_4545.method1252(i_27_, 0, class68_sub26, (byte) -68, null))
                        continue while_62_;
                }
                method1266(class68_sub26, i_27_, -1);
                ((Class68_Sub26) class68_sub26).anInt3198 -= i_27_;
            }
        }
    }

    final Class68_Sub28 method1228()
    {
        anInt4556++;
        Class68_Sub26 class68_sub26;
        do
        {
            class68_sub26 = (Class68_Sub26) ((Class68_Sub28_Sub2) this).aClass16_4544.method290((byte) 61);
            if (class68_sub26 == null)
                return null;
        } while (((Class68_Sub26) class68_sub26).aClass68_Sub28_Sub3_3187 == null);
        return ((Class68_Sub26) class68_sub26).aClass68_Sub28_Sub3_3187;
    }

    Class68_Sub28_Sub2(Class68_Sub28_Sub1 class68_sub28_sub1)
    {
        try
        {
            aClass68_Sub28_Sub1_4545 = class68_sub28_sub1;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("hk.<init>(" + (class68_sub28_sub1 != null ? "{...}" : "null") + ')'));
        }
    }

    static
    {
        aClass100_4550 = Class112.makeMutableString(43, "settings=");
        anInt4549 = 0;
        anInt4547 = -1;
        aClass100_4558 = Class112.makeMutableString(43, "");
        password = aClass100_4558;
        username = aClass100_4558;
    }
}
