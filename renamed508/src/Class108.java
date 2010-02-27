/* Class108 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Frame;

final class Class108
{
    static int anInt1826 = 0;
    static Widget aClass45_1827;
    static int anInt1828 = 0;
    static MRUNodes aClass98_1829 = new MRUNodes(4);
    static Class68_Sub20_Sub10[] aClass68_Sub20_Sub10Array1830;
    static int anInt1831;
    static boolean aBoolean1832 = true;
    static MutableString aClass100_1833 = Class112.makeMutableString(43, "Weiter");
    static Frame gameFrame;
    static Ground[][][] aClass68_Sub1ArrayArrayArray1835;

    static final void method1661(Ground class68_sub1, boolean bool)
    {
        Class72.aClass16_1312.pushFront(class68_sub1);
        for (;;)
        {
            Ground class68_sub1_0_ = (Ground) Class72.aClass16_1312.method294(-115);
            if (class68_sub1_0_ == null)
                break;
            if (((Ground) class68_sub1_0_).aBoolean2772)
            {
                int i = ((Ground) class68_sub1_0_).y;
                int i_1_ = ((Ground) class68_sub1_0_).x;
                int i_2_ = ((Ground) class68_sub1_0_).plane_2;
                int i_3_ = ((Ground) class68_sub1_0_).plane_1;
                Ground[][] class68_sub1s = Class22.groundArray[i_2_];
                if (((Ground) class68_sub1_0_).aBoolean2771)
                {
                    if (bool)
                    {
                        if (i_2_ > 0)
                        {
                            Ground class68_sub1_4_ = (Class22.groundArray[i_2_ - 1][i][i_1_]);
                            if (class68_sub1_4_ != null && (((Ground) class68_sub1_4_).aBoolean2772))
                                continue;
                        }
                        if (i <= Class68_Sub20_Sub10.anInt4321 && i > Object5.anInt1239)
                        {
                            Ground class68_sub1_5_ = class68_sub1s[i - 1][i_1_];
                            if (class68_sub1_5_ != null && (((Ground) class68_sub1_5_).aBoolean2772) && ((((Ground) class68_sub1_5_).aBoolean2771) || ((((Ground) class68_sub1_0_).anInt2770) & 0x1) == 0))
                                continue;
                        }
                        if (i >= Class68_Sub20_Sub10.anInt4321 && i < Class30.anInt549 - 1)
                        {
                            Ground class68_sub1_6_ = class68_sub1s[i + 1][i_1_];
                            if (class68_sub1_6_ != null && (((Ground) class68_sub1_6_).aBoolean2772) && ((((Ground) class68_sub1_6_).aBoolean2771) || ((((Ground) class68_sub1_0_).anInt2770) & 0x4) == 0))
                                continue;
                        }
                        if (i_1_ <= Class68_Sub26.anInt3188 && i_1_ > Class85.anInt1559)
                        {
                            Ground class68_sub1_7_ = class68_sub1s[i][i_1_ - 1];
                            if (class68_sub1_7_ != null && (((Ground) class68_sub1_7_).aBoolean2772) && ((((Ground) class68_sub1_7_).aBoolean2771) || ((((Ground) class68_sub1_0_).anInt2770) & 0x8) == 0))
                                continue;
                        }
                        if (i_1_ >= Class68_Sub26.anInt3188 && i_1_ < RandomNumberGenerator.anInt1495 - 1)
                        {
                            Ground class68_sub1_8_ = class68_sub1s[i][i_1_ + 1];
                            if (class68_sub1_8_ != null && (((Ground) class68_sub1_8_).aBoolean2772) && ((((Ground) class68_sub1_8_).aBoolean2771) || ((((Ground) class68_sub1_0_).anInt2770) & 0x2) == 0))
                                continue;
                        }
                    } else
                        bool = true;
                    ((Ground) class68_sub1_0_).aBoolean2771 = false;
                    if (((Ground) class68_sub1_0_).aClass68_Sub1_2782 != null)
                    {
                        Ground class68_sub1_9_ = (((Ground) class68_sub1_0_).aClass68_Sub1_2782);
                        if (((Ground) class68_sub1_9_).aClass7_2760 != null)
                        {
                            if (!Class21.method361(0, i, i_1_))
                                Class68_Sub16.method983((((Ground) class68_sub1_9_).aClass7_2760), 0, Class13_Sub2.anInt2653, Class66.anInt1205, NodeSubList.anInt2222, NodeList.anInt278, i, i_1_, false);
                            else
                                Class68_Sub16.method983((((Ground) class68_sub1_9_).aClass7_2760), 0, Class13_Sub2.anInt2653, Class66.anInt1205, NodeSubList.anInt2222, NodeList.anInt278, i, i_1_, true);
                        } else if ((((Ground) class68_sub1_9_).aClass77_2781) != null)
                        {
                            if (!Class21.method361(0, i, i_1_))
                                Class68_Sub13_Sub16.method778((((Ground) class68_sub1_9_).aClass77_2781), Class13_Sub2.anInt2653, Class66.anInt1205, NodeSubList.anInt2222, NodeList.anInt278, i, i_1_, false);
                            else
                                Class68_Sub13_Sub16.method778((((Ground) class68_sub1_9_).aClass77_2781), Class13_Sub2.anInt2653, Class66.anInt1205, NodeSubList.anInt2222, NodeList.anInt278, i, i_1_, true);
                        }
                        Object1 class64 = ((Ground) class68_sub1_9_).object_1;
                        if (class64 != null)
                            ((Object1) class64).aClass1_1181.render(0, Class13_Sub2.anInt2653, Class66.anInt1205, NodeSubList.anInt2222, NodeList.anInt278, (((Object1) class64).anInt1183 - Class25.anInt518), (((Object1) class64).anInt1186 - Class68_Sub17.anInt3035), (((Object1) class64).anInt1176 - Class68_Sub20_Sub12.anInt4357), ((Object1) class64).uid);
                        for (int i_10_ = 0; (i_10_ < ((Ground) class68_sub1_9_).anInt2773); i_10_++)
                        {
                            Object5 class69 = (((Ground) class68_sub1_9_).object_5[i_10_]);
                            if (class69 != null)
                                ((Object5) class69).aClass1_1242.render(((Object5) class69).anInt1255, Class13_Sub2.anInt2653, Class66.anInt1205, NodeSubList.anInt2222, NodeList.anInt278, (((Object5) class69).anInt1262 - Class25.anInt518), (((Object5) class69).anInt1252 - Class68_Sub17.anInt3035), (((Object5) class69).anInt1250 - Class68_Sub20_Sub12.anInt4357), ((Object5) class69).uid);
                        }
                    }
                    boolean bool_11_ = false;
                    if (((Ground) class68_sub1_0_).aClass7_2760 != null)
                    {
                        if (!Class21.method361(i_3_, i, i_1_))
                        {
                            bool_11_ = true;
                            if (((Class7) (((Ground) class68_sub1_0_).aClass7_2760)).anInt129 != 12345678 || (Stream.aBoolean2986 && i_2_ <= Class68_Sub20_Sub5.anInt4227))
                                Class68_Sub16.method983((((Ground) class68_sub1_0_).aClass7_2760), i_3_, Class13_Sub2.anInt2653, Class66.anInt1205, NodeSubList.anInt2222, NodeList.anInt278, i, i_1_, false);
                        } else
                            Class68_Sub16.method983(((Ground) class68_sub1_0_).aClass7_2760, i_3_, Class13_Sub2.anInt2653, Class66.anInt1205, NodeSubList.anInt2222, NodeList.anInt278, i, i_1_, true);
                    } else if (((Ground) class68_sub1_0_).aClass77_2781 != null)
                    {
                        if (!Class21.method361(i_3_, i, i_1_))
                        {
                            bool_11_ = true;
                            Class68_Sub13_Sub16.method778((((Ground) class68_sub1_0_).aClass77_2781), Class13_Sub2.anInt2653, Class66.anInt1205, NodeSubList.anInt2222, NodeList.anInt278, i, i_1_, false);
                        } else
                            Class68_Sub13_Sub16.method778((((Ground) class68_sub1_0_).aClass77_2781), Class13_Sub2.anInt2653, Class66.anInt1205, NodeSubList.anInt2222, NodeList.anInt278, i, i_1_, true);
                    }
                    if (bool_11_)
                    {
                        Object3 class47 = ((Ground) class68_sub1_0_).object_3;
                        if (class47 != null && (((Object3) class47).uid & 0x80000000L) != 0L)
                            ((Object3) class47).aClass1_931.render(0, Class13_Sub2.anInt2653, Class66.anInt1205, NodeSubList.anInt2222, NodeList.anInt278, (((Object3) class47).anInt941 - Class25.anInt518), (((Object3) class47).anInt937 - Class68_Sub17.anInt3035), (((Object3) class47).anInt932 - Class68_Sub20_Sub12.anInt4357), ((Object3) class47).uid);
                    }
                    int i_12_ = 0;
                    int i_13_ = 0;
                    Object1 class64 = ((Ground) class68_sub1_0_).object_1;
                    Object2 class76 = ((Ground) class68_sub1_0_).object_2;
                    if (class64 != null || class76 != null)
                    {
                        if (Class68_Sub20_Sub10.anInt4321 == i)
                            i_12_++;
                        else if (Class68_Sub20_Sub10.anInt4321 < i)
                            i_12_ += 2;
                        if (Class68_Sub26.anInt3188 == i_1_)
                            i_12_ += 3;
                        else if (Class68_Sub26.anInt3188 > i_1_)
                            i_12_ += 6;
                        i_13_ = Object5.anIntArray1257[i_12_];
                        ((Ground) class68_sub1_0_).anInt2775 = CipheredByteVector.anIntArray4134[i_12_];
                    }
                    if (class64 != null)
                    {
                        if ((((Object1) class64).anInt1187 & Class72_Sub1.anIntArray3275[i_12_]) != 0)
                        {
                            if (((Object1) class64).anInt1187 == 16)
                            {
                                ((Ground) class68_sub1_0_).anInt2780 = 3;
                                ((Ground) class68_sub1_0_).anInt2776 = Class115.anIntArray1945[i_12_];
                                ((Ground) class68_sub1_0_).anInt2778 = 3 - (((Ground) class68_sub1_0_).anInt2776);
                            } else if (((Object1) class64).anInt1187 == 32)
                            {
                                ((Ground) class68_sub1_0_).anInt2780 = 6;
                                ((Ground) class68_sub1_0_).anInt2776 = Class63.anIntArray1175[i_12_];
                                ((Ground) class68_sub1_0_).anInt2778 = 6 - (((Ground) class68_sub1_0_).anInt2776);
                            } else if (((Object1) class64).anInt1187 == 64)
                            {
                                ((Ground) class68_sub1_0_).anInt2780 = 12;
                                ((Ground) class68_sub1_0_).anInt2776 = Class63.anIntArray1174[i_12_];
                                ((Ground) class68_sub1_0_).anInt2778 = 12 - (((Ground) class68_sub1_0_).anInt2776);
                            } else
                            {
                                ((Ground) class68_sub1_0_).anInt2780 = 9;
                                ((Ground) class68_sub1_0_).anInt2776 = Class68_Sub13.anIntArray2946[i_12_];
                                ((Ground) class68_sub1_0_).anInt2778 = 9 - (((Ground) class68_sub1_0_).anInt2776);
                            }
                        } else
                            ((Ground) class68_sub1_0_).anInt2780 = 0;
                        if ((((Object1) class64).anInt1187 & i_13_) != 0 && !Class68_Sub13_Sub27.method840(i_3_, i, i_1_, (((Object1) class64).anInt1187)))
                            ((Object1) class64).aClass1_1181.render(0, Class13_Sub2.anInt2653, Class66.anInt1205, NodeSubList.anInt2222, NodeList.anInt278, (((Object1) class64).anInt1183 - Class25.anInt518), (((Object1) class64).anInt1186 - Class68_Sub17.anInt3035), (((Object1) class64).anInt1176 - Class68_Sub20_Sub12.anInt4357), ((Object1) class64).uid);
                        if ((((Object1) class64).anInt1177 & i_13_) != 0 && !Class68_Sub13_Sub27.method840(i_3_, i, i_1_, (((Object1) class64).anInt1177)))
                            ((Object1) class64).aClass1_1184.render(0, Class13_Sub2.anInt2653, Class66.anInt1205, NodeSubList.anInt2222, NodeList.anInt278, (((Object1) class64).anInt1183 - Class25.anInt518), (((Object1) class64).anInt1186 - Class68_Sub17.anInt3035), (((Object1) class64).anInt1176 - Class68_Sub20_Sub12.anInt4357), ((Object1) class64).uid);
                    }
                    if (class76 != null && !Class68_Sub13_Sub16.method777(i_3_, i, i_1_, ((Object2) class76).aClass1_1358.method56()))
                    {
                        if ((((Object2) class76).anInt1362 & i_13_) != 0)
                            ((Object2) class76).aClass1_1358.render(0, Class13_Sub2.anInt2653, Class66.anInt1205, NodeSubList.anInt2222, NodeList.anInt278, (((Object2) class76).anInt1349 - Class25.anInt518 + ((Object2) class76).anInt1356), (((Object2) class76).anInt1361 - Class68_Sub17.anInt3035), (((Object2) class76).anInt1352 - Class68_Sub20_Sub12.anInt4357 + ((Object2) class76).anInt1363), ((Object2) class76).uid);
                        else if (((Object2) class76).anInt1362 == 256)
                        {
                            int i_14_ = (((Object2) class76).anInt1349 - Class25.anInt518);
                            int i_15_ = (((Object2) class76).anInt1361 - Class68_Sub17.anInt3035);
                            int i_16_ = (((Object2) class76).anInt1352 - Class68_Sub20_Sub12.anInt4357);
                            int i_17_ = ((Object2) class76).anInt1359;
                            int i_18_;
                            if (i_17_ == 1 || i_17_ == 2)
                                i_18_ = -i_14_;
                            else
                                i_18_ = i_14_;
                            int i_19_;
                            if (i_17_ == 2 || i_17_ == 3)
                                i_19_ = -i_16_;
                            else
                                i_19_ = i_16_;
                            if (i_19_ < i_18_)
                                ((Object2) class76).aClass1_1358.render(0, Class13_Sub2.anInt2653, Class66.anInt1205, NodeSubList.anInt2222, NodeList.anInt278, i_14_ + ((Object2) class76).anInt1356, i_15_, i_16_ + ((Object2) class76).anInt1363, ((Object2) class76).uid);
                            else if (((Object2) class76).aClass1_1360 != null)
                                ((Object2) class76).aClass1_1360.render(0, Class13_Sub2.anInt2653, Class66.anInt1205, NodeSubList.anInt2222, NodeList.anInt278, i_14_, i_15_, i_16_, ((Object2) class76).uid);
                        }
                    }
                    if (bool_11_)
                    {
                        Object3 class47 = ((Ground) class68_sub1_0_).object_3;
                        if (class47 != null && (((Object3) class47).uid & 0x80000000L) == 0L)
                            ((Object3) class47).aClass1_931.render(0, Class13_Sub2.anInt2653, Class66.anInt1205, NodeSubList.anInt2222, NodeList.anInt278, (((Object3) class47).anInt941 - Class25.anInt518), (((Object3) class47).anInt937 - Class68_Sub17.anInt3035), (((Object3) class47).anInt932 - Class68_Sub20_Sub12.anInt4357), ((Object3) class47).uid);
                        Object4 class57 = ((Ground) class68_sub1_0_).object_4;
                        if (class57 != null && ((Object4) class57).anInt1069 == 0)
                        {
                            if (((Object4) class57).aClass1_1073 != null)
                                ((Object4) class57).aClass1_1073.render(0, Class13_Sub2.anInt2653, Class66.anInt1205, NodeSubList.anInt2222, NodeList.anInt278, (((Object4) class57).anInt1074 - Class25.anInt518), (((Object4) class57).anInt1085 - Class68_Sub17.anInt3035), (((Object4) class57).anInt1075 - Class68_Sub20_Sub12.anInt4357), ((Object4) class57).uid);
                            if (((Object4) class57).aClass1_1078 != null)
                                ((Object4) class57).aClass1_1078.render(0, Class13_Sub2.anInt2653, Class66.anInt1205, NodeSubList.anInt2222, NodeList.anInt278, (((Object4) class57).anInt1074 - Class25.anInt518), (((Object4) class57).anInt1085 - Class68_Sub17.anInt3035), (((Object4) class57).anInt1075 - Class68_Sub20_Sub12.anInt4357), ((Object4) class57).uid);
                            if (((Object4) class57).aClass1_1083 != null)
                                ((Object4) class57).aClass1_1083.render(0, Class13_Sub2.anInt2653, Class66.anInt1205, NodeSubList.anInt2222, NodeList.anInt278, (((Object4) class57).anInt1074 - Class25.anInt518), (((Object4) class57).anInt1085 - Class68_Sub17.anInt3035), (((Object4) class57).anInt1075 - Class68_Sub20_Sub12.anInt4357), ((Object4) class57).uid);
                        }
                    }
                    int i_20_ = ((Ground) class68_sub1_0_).anInt2770;
                    if (i_20_ != 0)
                    {
                        if (i < Class68_Sub20_Sub10.anInt4321 && (i_20_ & 0x4) != 0)
                        {
                            Ground class68_sub1_21_ = class68_sub1s[i + 1][i_1_];
                            if (class68_sub1_21_ != null && (((Ground) class68_sub1_21_).aBoolean2772))
                                Class72.aClass16_1312.pushFront(class68_sub1_21_);
                        }
                        if (i_1_ < Class68_Sub26.anInt3188 && (i_20_ & 0x2) != 0)
                        {
                            Ground class68_sub1_22_ = class68_sub1s[i][i_1_ + 1];
                            if (class68_sub1_22_ != null && (((Ground) class68_sub1_22_).aBoolean2772))
                                Class72.aClass16_1312.pushFront(class68_sub1_22_);
                        }
                        if (i > Class68_Sub20_Sub10.anInt4321 && (i_20_ & 0x1) != 0)
                        {
                            Ground class68_sub1_23_ = class68_sub1s[i - 1][i_1_];
                            if (class68_sub1_23_ != null && (((Ground) class68_sub1_23_).aBoolean2772))
                                Class72.aClass16_1312.pushFront(class68_sub1_23_);
                        }
                        if (i_1_ > Class68_Sub26.anInt3188 && (i_20_ & 0x8) != 0)
                        {
                            Ground class68_sub1_24_ = class68_sub1s[i][i_1_ - 1];
                            if (class68_sub1_24_ != null && (((Ground) class68_sub1_24_).aBoolean2772))
                                Class72.aClass16_1312.pushFront(class68_sub1_24_);
                        }
                    }
                }
                if (((Ground) class68_sub1_0_).anInt2780 != 0)
                {
                    boolean bool_25_ = true;
                    for (int i_26_ = 0; i_26_ < ((Ground) class68_sub1_0_).anInt2773; i_26_++)
                    {
                        if ((((Object5) (((Ground) class68_sub1_0_).object_5[i_26_])).anInt1260 != Ground.anInt2758) && (((((Ground) class68_sub1_0_).modifiers[i_26_]) & ((Ground) class68_sub1_0_).anInt2780) == (((Ground) class68_sub1_0_).anInt2776)))
                        {
                            bool_25_ = false;
                            break;
                        }
                    }
                    if (bool_25_)
                    {
                        Object1 class64 = ((Ground) class68_sub1_0_).object_1;
                        if (!Class68_Sub13_Sub27.method840(i_3_, i, i_1_, (((Object1) class64).anInt1187)))
                            ((Object1) class64).aClass1_1181.render(0, Class13_Sub2.anInt2653, Class66.anInt1205, NodeSubList.anInt2222, NodeList.anInt278, (((Object1) class64).anInt1183 - Class25.anInt518), (((Object1) class64).anInt1186 - Class68_Sub17.anInt3035), (((Object1) class64).anInt1176 - Class68_Sub20_Sub12.anInt4357), ((Object1) class64).uid);
                        ((Ground) class68_sub1_0_).anInt2780 = 0;
                    }
                }
                if (((Ground) class68_sub1_0_).aBoolean2783)
                {
                    try
                    {
                        int i_27_ = ((Ground) class68_sub1_0_).anInt2773;
                        ((Ground) class68_sub1_0_).aBoolean2783 = false;
                        int i_28_ = 0;
                        while_154_: for (int i_29_ = 0; i_29_ < i_27_; i_29_++)
                        {
                            Object5 class69 = (((Ground) class68_sub1_0_).object_5[i_29_]);
                            if (((Object5) class69).anInt1260 != Ground.anInt2758)
                            {
                                for (int i_30_ = ((Object5) class69).anInt1254; i_30_ <= ((Object5) class69).anInt1238; i_30_++)
                                {
                                    for (int i_31_ = ((Object5) class69).anInt1253; (i_31_ <= ((Object5) class69).anInt1234); i_31_++)
                                    {
                                        Ground class68_sub1_32_ = class68_sub1s[i_30_][i_31_];
                                        if (((Ground) class68_sub1_32_).aBoolean2771)
                                        {
                                            ((Ground) class68_sub1_0_).aBoolean2783 = true;
                                            continue while_154_;
                                        }
                                        if ((((Ground) class68_sub1_32_).anInt2780) != 0)
                                        {
                                            int i_33_ = 0;
                                            if (i_30_ > (((Object5) class69).anInt1254))
                                                i_33_++;
                                            if (i_30_ < (((Object5) class69).anInt1238))
                                                i_33_ += 4;
                                            if (i_31_ > (((Object5) class69).anInt1253))
                                                i_33_ += 8;
                                            if (i_31_ < (((Object5) class69).anInt1234))
                                                i_33_ += 2;
                                            if ((i_33_ & (((Ground) class68_sub1_32_).anInt2780)) == (((Ground) class68_sub1_0_).anInt2778))
                                            {
                                                ((Ground) class68_sub1_0_).aBoolean2783 = true;
                                                continue while_154_;
                                            }
                                        }
                                    }
                                }
                                Class75_Sub1.aClass69Array3308[i_28_++] = class69;
                                int i_34_ = (Class68_Sub20_Sub10.anInt4321 - ((Object5) class69).anInt1254);
                                int i_35_ = (((Object5) class69).anInt1238 - Class68_Sub20_Sub10.anInt4321);
                                if (i_35_ > i_34_)
                                    i_34_ = i_35_;
                                int i_36_ = (Class68_Sub26.anInt3188 - ((Object5) class69).anInt1253);
                                int i_37_ = (((Object5) class69).anInt1234 - Class68_Sub26.anInt3188);
                                if (i_37_ > i_36_)
                                    ((Object5) class69).anInt1256 = i_34_ + i_37_;
                                else
                                    ((Object5) class69).anInt1256 = i_34_ + i_36_;
                            }
                        }
                        while (i_28_ > 0)
                        {
                            int i_38_ = -50;
                            int i_39_ = -1;
                            for (int i_40_ = 0; i_40_ < i_28_; i_40_++)
                            {
                                Object5 class69 = Class75_Sub1.aClass69Array3308[i_40_];
                                if (((Object5) class69).anInt1260 != Ground.anInt2758)
                                {
                                    if (((Object5) class69).anInt1256 > i_38_)
                                    {
                                        i_38_ = ((Object5) class69).anInt1256;
                                        i_39_ = i_40_;
                                    } else if (((Object5) class69).anInt1256 == i_38_)
                                    {
                                        int i_41_ = (((Object5) class69).anInt1262 - Class25.anInt518);
                                        int i_42_ = (((Object5) class69).anInt1250 - (Class68_Sub20_Sub12.anInt4357));
                                        int i_43_ = (((Object5) (Class75_Sub1.aClass69Array3308[i_39_])).anInt1262 - Class25.anInt518);
                                        int i_44_ = (((Object5) (Class75_Sub1.aClass69Array3308[i_39_])).anInt1250 - (Class68_Sub20_Sub12.anInt4357));
                                        if (i_41_ * i_41_ + i_42_ * i_42_ > i_43_ * i_43_ + i_44_ * i_44_)
                                            i_39_ = i_40_;
                                    }
                                }
                            }
                            if (i_39_ == -1)
                                break;
                            Object5 class69 = Class75_Sub1.aClass69Array3308[i_39_];
                            ((Object5) class69).anInt1260 = Ground.anInt2758;
                            if (!Class68_Sub13_Sub10.method740(i_3_, ((Object5) class69).anInt1254, ((Object5) class69).anInt1238, ((Object5) class69).anInt1253, ((Object5) class69).anInt1234, ((Object5) class69).aClass1_1242.method56()))
                                ((Object5) class69).aClass1_1242.render(((Object5) class69).anInt1255, Class13_Sub2.anInt2653, Class66.anInt1205, NodeSubList.anInt2222, NodeList.anInt278, (((Object5) class69).anInt1262 - Class25.anInt518), (((Object5) class69).anInt1252 - Class68_Sub17.anInt3035), (((Object5) class69).anInt1250 - Class68_Sub20_Sub12.anInt4357), ((Object5) class69).uid);
                            for (int i_45_ = ((Object5) class69).anInt1254; i_45_ <= ((Object5) class69).anInt1238; i_45_++)
                            {
                                for (int i_46_ = ((Object5) class69).anInt1253; i_46_ <= ((Object5) class69).anInt1234; i_46_++)
                                {
                                    Ground class68_sub1_47_ = class68_sub1s[i_45_][i_46_];
                                    if ((((Ground) class68_sub1_47_).anInt2780) != 0)
                                        Class72.aClass16_1312.pushFront(class68_sub1_47_);
                                    else if ((i_45_ != i || i_46_ != i_1_) && (((Ground) class68_sub1_47_).aBoolean2772))
                                        Class72.aClass16_1312.pushFront(class68_sub1_47_);
                                }
                            }
                        }
                        if (((Ground) class68_sub1_0_).aBoolean2783)
                            continue;
                    } catch (Exception exception)
                    {
                        ((Ground) class68_sub1_0_).aBoolean2783 = false;
                    }
                }
                if (((Ground) class68_sub1_0_).aBoolean2772 && ((Ground) class68_sub1_0_).anInt2780 == 0)
                {
                    if (i <= Class68_Sub20_Sub10.anInt4321 && i > Object5.anInt1239)
                    {
                        Ground class68_sub1_48_ = class68_sub1s[i - 1][i_1_];
                        if (class68_sub1_48_ != null && ((Ground) class68_sub1_48_).aBoolean2772)
                            continue;
                    }
                    if (i >= Class68_Sub20_Sub10.anInt4321 && i < Class30.anInt549 - 1)
                    {
                        Ground class68_sub1_49_ = class68_sub1s[i + 1][i_1_];
                        if (class68_sub1_49_ != null && ((Ground) class68_sub1_49_).aBoolean2772)
                            continue;
                    }
                    if (i_1_ <= Class68_Sub26.anInt3188 && i_1_ > Class85.anInt1559)
                    {
                        Ground class68_sub1_50_ = class68_sub1s[i][i_1_ - 1];
                        if (class68_sub1_50_ != null && ((Ground) class68_sub1_50_).aBoolean2772)
                            continue;
                    }
                    if (i_1_ >= Class68_Sub26.anInt3188 && i_1_ < RandomNumberGenerator.anInt1495 - 1)
                    {
                        Ground class68_sub1_51_ = class68_sub1s[i][i_1_ + 1];
                        if (class68_sub1_51_ != null && ((Ground) class68_sub1_51_).aBoolean2772)
                            continue;
                    }
                    ((Ground) class68_sub1_0_).aBoolean2772 = false;
                    Class68_Sub13_Sub11.anInt3620--;
                    Object4 class57 = ((Ground) class68_sub1_0_).object_4;
                    if (class57 != null && ((Object4) class57).anInt1069 != 0)
                    {
                        if (((Object4) class57).aClass1_1073 != null)
                            ((Object4) class57).aClass1_1073.render(0, Class13_Sub2.anInt2653, Class66.anInt1205, NodeSubList.anInt2222, NodeList.anInt278, (((Object4) class57).anInt1074 - Class25.anInt518), (((Object4) class57).anInt1085 - Class68_Sub17.anInt3035 - ((Object4) class57).anInt1069), (((Object4) class57).anInt1075 - Class68_Sub20_Sub12.anInt4357), ((Object4) class57).uid);
                        if (((Object4) class57).aClass1_1078 != null)
                            ((Object4) class57).aClass1_1078.render(0, Class13_Sub2.anInt2653, Class66.anInt1205, NodeSubList.anInt2222, NodeList.anInt278, (((Object4) class57).anInt1074 - Class25.anInt518), (((Object4) class57).anInt1085 - Class68_Sub17.anInt3035 - ((Object4) class57).anInt1069), (((Object4) class57).anInt1075 - Class68_Sub20_Sub12.anInt4357), ((Object4) class57).uid);
                        if (((Object4) class57).aClass1_1083 != null)
                            ((Object4) class57).aClass1_1083.render(0, Class13_Sub2.anInt2653, Class66.anInt1205, NodeSubList.anInt2222, NodeList.anInt278, (((Object4) class57).anInt1074 - Class25.anInt518), (((Object4) class57).anInt1085 - Class68_Sub17.anInt3035 - ((Object4) class57).anInt1069), (((Object4) class57).anInt1075 - Class68_Sub20_Sub12.anInt4357), ((Object4) class57).uid);
                    }
                    if (((Ground) class68_sub1_0_).anInt2775 != 0)
                    {
                        Object2 class76 = ((Ground) class68_sub1_0_).object_2;
                        if (class76 != null && !(Class68_Sub13_Sub16.method777(i_3_, i, i_1_, ((Object2) class76).aClass1_1358.method56())))
                        {
                            if ((((Object2) class76).anInt1362 & ((Ground) class68_sub1_0_).anInt2775) != 0)
                                ((Object2) class76).aClass1_1358.render(0, Class13_Sub2.anInt2653, Class66.anInt1205, NodeSubList.anInt2222, NodeList.anInt278, (((Object2) class76).anInt1349 - Class25.anInt518 + ((Object2) class76).anInt1356), (((Object2) class76).anInt1361 - Class68_Sub17.anInt3035), (((Object2) class76).anInt1352 - Class68_Sub20_Sub12.anInt4357 + ((Object2) class76).anInt1363), ((Object2) class76).uid);
                            else if (((Object2) class76).anInt1362 == 256)
                            {
                                int i_52_ = (((Object2) class76).anInt1349 - Class25.anInt518);
                                int i_53_ = (((Object2) class76).anInt1361 - Class68_Sub17.anInt3035);
                                int i_54_ = (((Object2) class76).anInt1352 - Class68_Sub20_Sub12.anInt4357);
                                int i_55_ = ((Object2) class76).anInt1359;
                                int i_56_;
                                if (i_55_ == 1 || i_55_ == 2)
                                    i_56_ = -i_52_;
                                else
                                    i_56_ = i_52_;
                                int i_57_;
                                if (i_55_ == 2 || i_55_ == 3)
                                    i_57_ = -i_54_;
                                else
                                    i_57_ = i_54_;
                                if (i_57_ >= i_56_)
                                    ((Object2) class76).aClass1_1358.render(0, Class13_Sub2.anInt2653, Class66.anInt1205, NodeSubList.anInt2222, NodeList.anInt278, i_52_ + ((Object2) class76).anInt1356, i_53_, i_54_ + ((Object2) class76).anInt1363, ((Object2) class76).uid);
                                else if (((Object2) class76).aClass1_1360 != null)
                                    ((Object2) class76).aClass1_1360.render(0, Class13_Sub2.anInt2653, Class66.anInt1205, NodeSubList.anInt2222, NodeList.anInt278, i_52_, i_53_, i_54_, ((Object2) class76).uid);
                            }
                        }
                        Object1 class64 = ((Ground) class68_sub1_0_).object_1;
                        if (class64 != null)
                        {
                            if (((((Object1) class64).anInt1177 & ((Ground) class68_sub1_0_).anInt2775) != 0) && !(Class68_Sub13_Sub27.method840(i_3_, i, i_1_, ((Object1) class64).anInt1177)))
                                ((Object1) class64).aClass1_1184.render(0, Class13_Sub2.anInt2653, Class66.anInt1205, NodeSubList.anInt2222, NodeList.anInt278, (((Object1) class64).anInt1183 - Class25.anInt518), (((Object1) class64).anInt1186 - Class68_Sub17.anInt3035), (((Object1) class64).anInt1176 - Class68_Sub20_Sub12.anInt4357), ((Object1) class64).uid);
                            if (((((Object1) class64).anInt1187 & ((Ground) class68_sub1_0_).anInt2775) != 0) && !(Class68_Sub13_Sub27.method840(i_3_, i, i_1_, ((Object1) class64).anInt1187)))
                                ((Object1) class64).aClass1_1181.render(0, Class13_Sub2.anInt2653, Class66.anInt1205, NodeSubList.anInt2222, NodeList.anInt278, (((Object1) class64).anInt1183 - Class25.anInt518), (((Object1) class64).anInt1186 - Class68_Sub17.anInt3035), (((Object1) class64).anInt1176 - Class68_Sub20_Sub12.anInt4357), ((Object1) class64).uid);
                        }
                    }
                    if (i_2_ < Mouse.anInt1584 - 1)
                    {
                        Ground class68_sub1_58_ = (Class22.groundArray[i_2_ + 1][i][i_1_]);
                        if (class68_sub1_58_ != null && ((Ground) class68_sub1_58_).aBoolean2772)
                            Class72.aClass16_1312.pushFront(class68_sub1_58_);
                    }
                    if (i < Class68_Sub20_Sub10.anInt4321)
                    {
                        Ground class68_sub1_59_ = class68_sub1s[i + 1][i_1_];
                        if (class68_sub1_59_ != null && ((Ground) class68_sub1_59_).aBoolean2772)
                            Class72.aClass16_1312.pushFront(class68_sub1_59_);
                    }
                    if (i_1_ < Class68_Sub26.anInt3188)
                    {
                        Ground class68_sub1_60_ = class68_sub1s[i][i_1_ + 1];
                        if (class68_sub1_60_ != null && ((Ground) class68_sub1_60_).aBoolean2772)
                            Class72.aClass16_1312.pushFront(class68_sub1_60_);
                    }
                    if (i > Class68_Sub20_Sub10.anInt4321)
                    {
                        Ground class68_sub1_61_ = class68_sub1s[i - 1][i_1_];
                        if (class68_sub1_61_ != null && ((Ground) class68_sub1_61_).aBoolean2772)
                            Class72.aClass16_1312.pushFront(class68_sub1_61_);
                    }
                    if (i_1_ > Class68_Sub26.anInt3188)
                    {
                        Ground class68_sub1_62_ = class68_sub1s[i][i_1_ - 1];
                        if (class68_sub1_62_ != null && ((Ground) class68_sub1_62_).aBoolean2772)
                            Class72.aClass16_1312.pushFront(class68_sub1_62_);
                    }
                }
            }
        }
    }

    public static void method1662(int i)
    {
        aClass68_Sub20_Sub10Array1830 = null;
        aClass68_Sub1ArrayArrayArray1835 = null;
        aClass98_1829 = null;
        aClass45_1827 = null;
        if (i != 29889)
            anInt1831 = 69;
        aClass100_1833 = null;
        gameFrame = null;
    }
}
