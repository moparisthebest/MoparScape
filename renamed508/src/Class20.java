/* Class20 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

final class Class20
{
    static int anInt398;
    static MutableString aClass100_399;
    static MutableString aClass100_400;
    static MutableString aClass100_401;
    int anInt402;
    static int anInt403;
    private static MutableString aClass100_404 = Class112.makeMutableString(43, "Select");
    byte[] aByteArray405;
    static int anInt406;
    byte[] aByteArray407;
    int anInt408;
    int anInt409;
    static int anInt410;
    static int anInt411;
    static volatile int idleTime;
    static MutableString aClass100_413;
    int anInt414;
    int anInt415;
    static int anInt416;
    int anInt417;
    int anInt418;
    static int anInt419;
    static int anInt420;
    private static MutableString aClass100_421;

    static final void method320(int i)
    {
        Class3.anInt87++;
        anInt420++;
        Class21.connectionVector.startPacket(108);
        for (Class68_Sub3 class68_sub3 = (Class68_Sub3) Login.aClass113_1514.method1685(-32642); class68_sub3 != null; class68_sub3 = ((Class68_Sub3) Login.aClass113_1514.method1689((byte) -105)))
        {
            if (((Class68_Sub3) class68_sub3).anInt2802 == 0)
                Class68_Sub13_Sub10.method744(class68_sub3, true, true);
        }
        if (i != 636)
            method320(126);
        if (Class29.aClass45_539 != null)
        {
            NodeCache.method1688(Class29.aClass45_539, -124);
            Class29.aClass45_539 = null;
        }
    }

    static final void method321(Class21 class21, byte i, Class21 class21_0_)
    {
        try
        {
            Class68_Sub13_Sub21.aClass68_Sub20_Sub1_3803 = Class90.method1515(class21, 0, (byte) 81, class21_0_, NodeCache.anInt1914);
            int i_1_ = -114 % ((20 - i) / 61);
            Class72_Sub1.aClass68_Sub20_Sub1_Sub1_3278 = ((Class68_Sub20_Sub1_Sub1) Class68_Sub13_Sub21.aClass68_Sub20_Sub1_3803);
            anInt410++;
            Class68_Sub6.aClass68_Sub20_Sub1_2849 = Class90.method1515(class21, 0, (byte) 58, class21_0_, GameException.anInt2243);
            Class68_Sub13_Sub4.aClass68_Sub20_Sub1_3513 = Class90.method1515(class21, 0, (byte) 67, class21_0_, Class50.anInt986);
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("ch.F(" + (class21 != null ? "{...}" : "null") + ',' + i + ',' + (class21_0_ != null ? "{...}" : "null") + ')'));
        }
    }

    static final void method322(int i, Stream class68_sub14)
    {
        try
        {
            anInt406++;
            byte[] is = new byte[i];
            if (Class68_Sub13_Sub4.aClass124_3488 != null)
            {
                try
                {
                    Class68_Sub13_Sub4.aClass124_3488.method1766(0L, i - 23);
                    Class68_Sub13_Sub4.aClass124_3488.method1759(-128, is);
                    int i_2_;
                    for (i_2_ = 0; i_2_ < 24; i_2_++)
                    {
                        if (is[i_2_] != 0)
                            break;
                    }
                    if (i_2_ >= 24)
                        throw new IOException();
                } catch (Exception exception)
                {
                    for (int i_3_ = 0; i_3_ < 24; i_3_++)
                        is[i_3_] = (byte) -1;
                }
            }
            class68_sub14.writeBytes(24, 0, is);
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("ch.A(" + i + ',' + (class68_sub14 != null ? "{...}" : "null") + ')'));
        }
    }

    static final void method323(int i, int i_4_, int i_5_, int i_6_, boolean bool, int i_7_, int i_8_)
    {
        anInt398++;
        if (Class68_Sub13_Sub37.anInt4064 == 0 && !Class21_Sub1.aBoolean2707)
        {
            Class23.anInt491++;
            int i_9_ = NPCDefinition.anInt1429;
            int i_10_ = Class111.anInt1877;
            int i_11_ = Class68_Sub13_Sub38.anInt4081;
            int i_12_ = Animable.anInt63;
            int i_13_ = i_9_ + (i_8_ - i) * (i_10_ - i_9_) / i_7_;
            int i_14_ = i_12_ + (i_11_ - i_12_) * (i_6_ - i_4_) / i_5_;
            Class68_Sub3.method652(i_13_, i_14_, (byte) -108, Class68_Sub28_Sub2.aClass100_4558, (short) 5, Class37.aClass100_653, 0L);
        }
        long l = -1L;
        if (bool == true)
        {
            for (int i_15_ = 0; Class68_Sub13_Sub1.anInt3450 > i_15_; i_15_++)
            {
                long l_16_ = Class68_Sub20_Sub15.aLongArray4391[i_15_];
                int i_17_ = 0x7f & (int) l_16_;
                int i_18_ = 0x7f & (int) l_16_ >> 7;
                int i_19_ = (0x64d29b4f & (int) l_16_) >> 29;
                int i_20_ = (int) (l_16_ >>> 32) & 0x7fffffff;
                if (l != l_16_)
                {
                    l = l_16_;
                    if (i_19_ == 2 && Mouse.method1492(GameSocket.plane, i_17_, i_18_, l_16_))
                    {
                        ObjectDefinition class116 = Class1_Sub5.method140(80, i_20_);
                        if (((ObjectDefinition) class116).childrenIDs != null)
                            class116 = class116.method1716(-1);
                        if (class116 == null)
                            continue;
                        if (Class68_Sub13_Sub37.anInt4064 != 1)
                        {
                            if (!Class21_Sub1.aBoolean2707)
                            {
                                Class68_Sub13_Sub24.anInt3848++;
                                MutableString[] class100s = ((ObjectDefinition) class116).actions;
                                if (Class92.aBoolean1651)
                                    class100s = Class75_Sub1.method1387((byte) -106, class100s);
                                if (class100s != null)
                                {
                                    for (int i_21_ = 4; i_21_ >= 0; i_21_--)
                                    {
                                        if (class100s[i_21_] != null)
                                        {
                                            Class1_Sub7.anInt2618++;
                                            short i_22_ = 0;
                                            if (i_21_ == 0)
                                                i_22_ = (short) 18;
                                            if (i_21_ == 1)
                                                i_22_ = (short) 47;
                                            if (i_21_ == 2)
                                                i_22_ = (short) 46;
                                            if (i_21_ == 3)
                                                i_22_ = (short) 42;
                                            if (i_21_ == 4)
                                                i_22_ = (short) 1003;
                                            Class68_Sub3.method652(i_17_, i_18_, (byte) -119, (Class68_Sub20_Sub13_Sub2.method1166(2, (new MutableString[] { Class21.aClass100_478, (((ObjectDefinition) class116).name) }))), i_22_, class100s[i_21_], l_16_);
                                        }
                                    }
                                }
                                Class68_Sub3.method652(i_17_, i_18_, (byte) -87, (Class68_Sub20_Sub13_Sub2.method1166(2, new MutableString[] { Class21.aClass100_478, (((ObjectDefinition) class116).name) })), (short) 1005, Class119.aClass100_2088, (long) ((ObjectDefinition) class116).type);
                            } else if ((Class33.anInt589 & 0x4) == 4)
                            {
                                Class1_Sub1.anInt2428++;
                                Class68_Sub3.method652(i_17_, i_18_, (byte) -126, (Class68_Sub20_Sub13_Sub2.method1166(2, (new MutableString[] { Class68_Sub13_Sub1.aClass100_3454, Class114.aClass100_1932, (((ObjectDefinition) class116).name) }))), (short) 37, Class7.aClass100_118, l_16_);
                            }
                        } else
                        {
                            MutableString.anInt2317++;
                            Class68_Sub3.method652(i_17_, i_18_, (byte) -104, (Class68_Sub20_Sub13_Sub2.method1166(2, new MutableString[] { Class44.aClass100_743, Class114.aClass100_1932, (((ObjectDefinition) class116).name) })), (short) 1, Object2.aClass100_1347, l_16_);
                        }
                    }
                    if (i_19_ == 1)
                    {
                        NPC class1_sub6_sub1 = Class102.localNPCs[i_20_];
                        if (((NPCDefinition) (((NPC) class1_sub6_sub1).definition)).anInt1453 == 1 && (((Character) class1_sub6_sub1).x & 0x7f) == 64 && (((Character) class1_sub6_sub1).y & 0x7f) == 64)
                        {
                            for (int i_23_ = 0; i_23_ < Class13_Sub2.localNPCCount; i_23_++)
                            {
                                NPC class1_sub6_sub1_24_ = (Class102.localNPCs[Class68_Sub10.localNPCIndices[i_23_]]);
                                if (class1_sub6_sub1_24_ != null && class1_sub6_sub1_24_ != class1_sub6_sub1 && (((NPCDefinition) (((NPC) class1_sub6_sub1_24_).definition)).anInt1453 == 1) && ((((Character) class1_sub6_sub1_24_).x) == (((Character) class1_sub6_sub1).x)) && ((((Character) class1_sub6_sub1_24_).y) == (((Character) class1_sub6_sub1).y)))
                                    Class103.method1639((Class68_Sub10.localNPCIndices[i_23_]), i_18_, i_17_, (byte) 111, (((NPC) class1_sub6_sub1_24_).definition));
                            }
                            for (int i_25_ = 0; i_25_ < client.localPlayerCount; i_25_++)
                            {
                                Player class1_sub6_sub2 = (Class68_Sub13_Sub4.localPlayers[Class85.localPlayerIndices[i_25_]]);
                                if (class1_sub6_sub2 != null && ((((Character) class1_sub6_sub2).x) == (((Character) class1_sub6_sub1).x)) && ((((Character) class1_sub6_sub2).y) == (((Character) class1_sub6_sub1).y)))
                                    Class68_Sub4.method661(class1_sub6_sub2, -126, i_17_, i_18_, (Class85.localPlayerIndices[i_25_]));
                            }
                        }
                        Class103.method1639(i_20_, i_18_, i_17_, (byte) 93, ((NPC) class1_sub6_sub1).definition);
                    }
                    if (i_19_ == 0)
                    {
                        Player class1_sub6_sub2 = (Class68_Sub13_Sub4.localPlayers[i_20_]);
                        if ((((Character) class1_sub6_sub2).x & 0x7f) == 64 && (((Character) class1_sub6_sub2).y & 0x7f) == 64)
                        {
                            for (int i_26_ = 0; i_26_ < Class13_Sub2.localNPCCount; i_26_++)
                            {
                                NPC class1_sub6_sub1 = (Class102.localNPCs[Class68_Sub10.localNPCIndices[i_26_]]);
                                if (class1_sub6_sub1 != null && ((NPCDefinition) (((NPC) class1_sub6_sub1).definition)).anInt1453 == 1 && ((((Character) class1_sub6_sub1).x) == (((Character) class1_sub6_sub2).x)) && ((((Character) class1_sub6_sub1).y) == (((Character) class1_sub6_sub2).y)))
                                    Class103.method1639(Class68_Sub10.localNPCIndices[i_26_], i_18_, i_17_, (byte) -11, (((NPC) class1_sub6_sub1).definition));
                            }
                            for (int i_27_ = 0; i_27_ < client.localPlayerCount; i_27_++)
                            {
                                Player class1_sub6_sub2_28_ = (Class68_Sub13_Sub4.localPlayers[Class85.localPlayerIndices[i_27_]]);
                                if (class1_sub6_sub2_28_ != null && class1_sub6_sub2 != class1_sub6_sub2_28_ && ((((Character) class1_sub6_sub2_28_).x) == (((Character) class1_sub6_sub2).x)) && ((((Character) class1_sub6_sub2).y) == ((Character) class1_sub6_sub2_28_).y))
                                    Class68_Sub4.method661(class1_sub6_sub2_28_, -62, i_17_, i_18_, Class85.localPlayerIndices[i_27_]);
                            }
                        }
                        Class68_Sub4.method661(class1_sub6_sub2, -112, i_17_, i_18_, i_20_);
                    }
                    if (i_19_ == 3)
                    {
                        NodeList class16 = (Widget.groundItems[GameSocket.plane][i_17_][i_18_]);
                        if (class16 != null)
                        {
                            for (CachedItem class68_sub20_sub18 = ((CachedItem) class16.method289(30568)); class68_sub20_sub18 != null; class68_sub20_sub18 = ((CachedItem) class16.next()))
                            {
                                int i_29_ = (((Item) (((CachedItem) class68_sub20_sub18).item)).id);
                                ItemDefinition class19 = GameApplet.method18(-25672, i_29_);
                                if (Class68_Sub13_Sub37.anInt4064 == 1)
                                {
                                    Class75_Sub1.anInt3300++;
                                    Class68_Sub3.method652(i_17_, i_18_, (byte) -62, (Class68_Sub20_Sub13_Sub2.method1166(2, (new MutableString[] { Class44.aClass100_743, Class25.aClass100_511, (((ItemDefinition) class19).name) }))), (short) 8, Object2.aClass100_1347, (long) i_29_);
                                } else if (Class21_Sub1.aBoolean2707)
                                {
                                    if ((0x1 & Class33.anInt589) == 1)
                                    {
                                        Class75_Sub3.anInt3325++;
                                        Class68_Sub3.method652(i_17_, i_18_, (byte) -128, (Class68_Sub20_Sub13_Sub2.method1166(2, (new MutableString[] { (Class68_Sub13_Sub1.aClass100_3454), Class25.aClass100_511, (((ItemDefinition) class19).name) }))), (short) 34, Class7.aClass100_118, (long) i_29_);
                                    }
                                } else
                                {
                                    Object4.anInt1070++;
                                    MutableString[] class100s = (((ItemDefinition) class19).groundActions);
                                    if (Class92.aBoolean1651)
                                        class100s = (Class75_Sub1.method1387((byte) -79, class100s));
                                    for (int i_30_ = 4; i_30_ >= 0; i_30_--)
                                    {
                                        if (class100s == null || class100s[i_30_] == null)
                                        {
                                            if (i_30_ == 2)
                                            {
                                                Class94.anInt1676++;
                                                Class68_Sub3.method652(i_17_, i_18_, (byte) -104, (Class68_Sub20_Sub13_Sub2.method1166(2, (new MutableString[] { (Class68_Sub13_Sub10.aClass100_3590), (((ItemDefinition) class19).name) }))), (short) 30, (Class68_Sub13_Sub24.aClass100_3836), (long) i_29_);
                                            }
                                        } else
                                        {
                                            Class89.anInt1622++;
                                            short i_31_ = 0;
                                            if (i_30_ == 0)
                                                i_31_ = (short) 35;
                                            if (i_30_ == 1)
                                                i_31_ = (short) 45;
                                            if (i_30_ == 2)
                                                i_31_ = (short) 30;
                                            if (i_30_ == 3)
                                                i_31_ = (short) 3;
                                            if (i_30_ == 4)
                                                i_31_ = (short) 9;
                                            Class68_Sub3.method652(i_17_, i_18_, (byte) -52, (Class68_Sub20_Sub13_Sub2.method1166(2, (new MutableString[] { (Class68_Sub13_Sub10.aClass100_3590), (((ItemDefinition) class19).name) }))), i_31_, class100s[i_30_], (long) i_29_);
                                        }
                                    }
                                    Class68_Sub3.method652(i_17_, i_18_, (byte) -80, (Class68_Sub20_Sub13_Sub2.method1166(2, (new MutableString[] { (Class68_Sub13_Sub10.aClass100_3590), (((ItemDefinition) class19).name) }))), (short) 1006, Class119.aClass100_2088, (long) i_29_);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    static final void method324(int i, int i_32_, int i_33_, byte[][][] is, int i_34_, byte i_35_, int i_36_, int i_37_)
    {
        Ground.anInt2758++;
        Class68_Sub13_Sub11.anInt3620 = 0;
        int i_38_ = i_36_ - 16;
        int i_39_ = i_36_ + 16;
        int i_40_ = i_37_ - 16;
        int i_41_ = i_37_ + 16;
        for (int i_42_ = Object3.anInt944; i_42_ < Mouse.anInt1584; i_42_++)
        {
            Ground[][] class68_sub1s = Class22.groundArray[i_42_];
            for (int i_43_ = Object5.anInt1239; i_43_ < Class30.anInt549; i_43_++)
            {
                for (int i_44_ = Class85.anInt1559; i_44_ < RandomNumberGenerator.anInt1495; i_44_++)
                {
                    Ground class68_sub1 = class68_sub1s[i_43_][i_44_];
                    if (class68_sub1 != null)
                    {
                        if (!(Class68_Sub9.aBooleanArrayArray2889[(i_43_ - Class68_Sub20_Sub10.anInt4321 + ClientScript.anInt4386)][(i_44_ - Class68_Sub26.anInt3188 + ClientScript.anInt4386)]) || (is != null && i_42_ >= i_34_ && is[i_42_][i_43_][i_44_] == i_35_))
                        {
                            ((Ground) class68_sub1).aBoolean2771 = false;
                            ((Ground) class68_sub1).aBoolean2772 = false;
                            ((Ground) class68_sub1).anInt2780 = 0;
                            if (i_43_ >= i_38_ && i_43_ <= i_39_ && i_44_ >= i_40_ && i_44_ <= i_41_)
                            {
                                if (((Ground) class68_sub1).object_1 != null)
                                {
                                    Object1 class64 = (((Ground) class68_sub1).object_1);
                                    ((Object1) class64).aClass1_1181.method60(((Object1) class64).anInt1176, ((Object1) class64).anInt1183, 100, ((Object1) class64).anInt1176, ((Object1) class64).anInt1183);
                                    if (((Object1) class64).aClass1_1184 != null)
                                        ((Object1) class64).aClass1_1184.method60(((Object1) class64).anInt1176, ((Object1) class64).anInt1183, 102, ((Object1) class64).anInt1176, ((Object1) class64).anInt1183);
                                }
                                if (((Ground) class68_sub1).object_2 != null)
                                {
                                    Object2 class76 = (((Ground) class68_sub1).object_2);
                                    ((Object2) class76).aClass1_1358.method60(((Object2) class76).anInt1352, ((Object2) class76).anInt1349, 98, ((Object2) class76).anInt1352, ((Object2) class76).anInt1349);
                                    if (((Object2) class76).aClass1_1360 != null)
                                        ((Object2) class76).aClass1_1360.method60(((Object2) class76).anInt1352, ((Object2) class76).anInt1349, 123, ((Object2) class76).anInt1352, ((Object2) class76).anInt1349);
                                }
                                if (((Ground) class68_sub1).object_3 != null)
                                {
                                    Object3 class47 = (((Ground) class68_sub1).object_3);
                                    ((Object3) class47).aClass1_931.method60(((Object3) class47).anInt932, ((Object3) class47).anInt941, 99, ((Object3) class47).anInt932, ((Object3) class47).anInt941);
                                }
                                if ((((Ground) class68_sub1).object_5) != null)
                                {
                                    for (int i_45_ = 0; i_45_ < (((Ground) class68_sub1).anInt2773); i_45_++)
                                    {
                                        Object5 class69 = (((Ground) class68_sub1).object_5[i_45_]);
                                        ((Object5) class69).aClass1_1242.method60(((Object5) class69).anInt1234, ((Object5) class69).anInt1254, 99, ((Object5) class69).anInt1253, ((Object5) class69).anInt1238);
                                    }
                                }
                            }
                        } else
                        {
                            ((Ground) class68_sub1).aBoolean2771 = true;
                            ((Ground) class68_sub1).aBoolean2772 = true;
                            if (((Ground) class68_sub1).anInt2773 > 0)
                                ((Ground) class68_sub1).aBoolean2783 = true;
                            else
                                ((Ground) class68_sub1).aBoolean2783 = false;
                            Class68_Sub13_Sub11.anInt3620++;
                        }
                    }
                }
            }
        }
        boolean bool = (Class68_Sub20_Sub12.intGroundArray == Class68_Sub13_Sub14.anIntArrayArrayArray3673);
        for (int i_46_ = Object3.anInt944; i_46_ < Mouse.anInt1584; i_46_++)
        {
            Ground[][] class68_sub1s = Class22.groundArray[i_46_];
            for (int i_47_ = -ClientScript.anInt4386; i_47_ <= 0; i_47_++)
            {
                int i_48_ = Class68_Sub20_Sub10.anInt4321 + i_47_;
                int i_49_ = Class68_Sub20_Sub10.anInt4321 - i_47_;
                if (i_48_ >= Object5.anInt1239 || i_49_ < Class30.anInt549)
                {
                    for (int i_50_ = -ClientScript.anInt4386; i_50_ <= 0; i_50_++)
                    {
                        int i_51_ = Class68_Sub26.anInt3188 + i_50_;
                        int i_52_ = Class68_Sub26.anInt3188 - i_50_;
                        if (i_48_ >= Object5.anInt1239)
                        {
                            if (i_51_ >= Class85.anInt1559)
                            {
                                Ground class68_sub1 = class68_sub1s[i_48_][i_51_];
                                if (class68_sub1 != null && (((Ground) class68_sub1).aBoolean2771))
                                    Class108.method1661(class68_sub1, true);
                            }
                            if (i_52_ < RandomNumberGenerator.anInt1495)
                            {
                                Ground class68_sub1 = class68_sub1s[i_48_][i_52_];
                                if (class68_sub1 != null && (((Ground) class68_sub1).aBoolean2771))
                                    Class108.method1661(class68_sub1, true);
                            }
                        }
                        if (i_49_ < Class30.anInt549)
                        {
                            if (i_51_ >= Class85.anInt1559)
                            {
                                Ground class68_sub1 = class68_sub1s[i_49_][i_51_];
                                if (class68_sub1 != null && (((Ground) class68_sub1).aBoolean2771))
                                    Class108.method1661(class68_sub1, true);
                            }
                            if (i_52_ < RandomNumberGenerator.anInt1495)
                            {
                                Ground class68_sub1 = class68_sub1s[i_49_][i_52_];
                                if (class68_sub1 != null && (((Ground) class68_sub1).aBoolean2771))
                                    Class108.method1661(class68_sub1, true);
                            }
                        }
                        if (Class68_Sub13_Sub11.anInt3620 == 0)
                        {
                            if (!bool)
                                Stream.aBoolean2986 = false;
                            return;
                        }
                    }
                }
            }
        }
        for (int i_53_ = Object3.anInt944; i_53_ < Mouse.anInt1584; i_53_++)
        {
            Ground[][] class68_sub1s = Class22.groundArray[i_53_];
            for (int i_54_ = -ClientScript.anInt4386; i_54_ <= 0; i_54_++)
            {
                int i_55_ = Class68_Sub20_Sub10.anInt4321 + i_54_;
                int i_56_ = Class68_Sub20_Sub10.anInt4321 - i_54_;
                if (i_55_ >= Object5.anInt1239 || i_56_ < Class30.anInt549)
                {
                    for (int i_57_ = -ClientScript.anInt4386; i_57_ <= 0; i_57_++)
                    {
                        int i_58_ = Class68_Sub26.anInt3188 + i_57_;
                        int i_59_ = Class68_Sub26.anInt3188 - i_57_;
                        if (i_55_ >= Object5.anInt1239)
                        {
                            if (i_58_ >= Class85.anInt1559)
                            {
                                Ground class68_sub1 = class68_sub1s[i_55_][i_58_];
                                if (class68_sub1 != null && (((Ground) class68_sub1).aBoolean2771))
                                    Class108.method1661(class68_sub1, false);
                            }
                            if (i_59_ < RandomNumberGenerator.anInt1495)
                            {
                                Ground class68_sub1 = class68_sub1s[i_55_][i_59_];
                                if (class68_sub1 != null && (((Ground) class68_sub1).aBoolean2771))
                                    Class108.method1661(class68_sub1, false);
                            }
                        }
                        if (i_56_ < Class30.anInt549)
                        {
                            if (i_58_ >= Class85.anInt1559)
                            {
                                Ground class68_sub1 = class68_sub1s[i_56_][i_58_];
                                if (class68_sub1 != null && (((Ground) class68_sub1).aBoolean2771))
                                    Class108.method1661(class68_sub1, false);
                            }
                            if (i_59_ < RandomNumberGenerator.anInt1495)
                            {
                                Ground class68_sub1 = class68_sub1s[i_56_][i_59_];
                                if (class68_sub1 != null && (((Ground) class68_sub1).aBoolean2771))
                                    Class108.method1661(class68_sub1, false);
                            }
                        }
                        if (Class68_Sub13_Sub11.anInt3620 == 0)
                        {
                            if (!bool)
                                Stream.aBoolean2986 = false;
                            return;
                        }
                    }
                }
            }
        }
        Stream.aBoolean2986 = false;
    }

    public static void method325(byte i)
    {
        if (i == 87)
        {
            aClass100_400 = null;
            aClass100_421 = null;
            aClass100_401 = null;
            aClass100_413 = null;
            aClass100_399 = null;
            aClass100_404 = null;
        }
    }

    public Class20()
    {
        /* empty */
    }

    static final void method326(int i, int i_60_, boolean bool)
    {
        anInt416++;
        if (bool == true)
        {
            long l = (long) ((i << 16) + i_60_);
            Class68_Sub20_Sub15 class68_sub20_sub15 = ((Class68_Sub20_Sub15) Stream.aClass113_3010.method1684(l, -111));
            if (class68_sub20_sub15 != null)
                Class68_Sub7.aClass128_2856.method1792(class68_sub20_sub15, (byte) 121);
        }
    }

    static final void method327(byte i)
    {
        Class68_Sub20_Sub13.aClass50_4366.method529(true);
        for (int i_61_ = 0; i_61_ < 32; i_61_++)
            Mouse.aLongArray1577[i_61_] = 0L;
        for (int i_62_ = 0; i_62_ < 32; i_62_++)
            Class122.aLongArray2115[i_62_] = 0L;
        if (i < 24)
            method322(37, null);
        anInt419++;
        Class68_Sub13_Sub22.anInt3812 = 0;
    }

    static
    {
        aClass100_401 = aClass100_404;
        anInt403 = 0;
        aClass100_413 = Class112.makeMutableString(43, "runes");
        idleTime = 0;
        aClass100_421 = Class112.makeMutableString(43, "cyan:");
        aClass100_400 = aClass100_421;
        aClass100_399 = aClass100_421;
    }
}
