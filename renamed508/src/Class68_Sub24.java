/* Class68_Sub24 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class68_Sub24 extends Node
{
    static MutableString aClass100_3154;
    static int anInt3155 = 0;
    private static MutableString aClass100_3156 = Class112.makeMutableString(43, "Loading textures )2 ");
    static int anInt3157;
    static int anInt3158;
    static int anInt3159;
    static int anInt3160;
    static MutableString aClass100_3161;
    static int cameraTurnStep_local;
    static int anInt3163;
    static MutableString aClass100_3164;
    MutableString aClass100_3165;

    static final int method1205(int i, int i_0_, Widget class45)
    {
        try
        {
            anInt3159++;
            if (((Widget) class45).valueIndices == null || ((Widget) class45).valueIndices.length <= i)
                return -2;
            try
            {
                if (i_0_ != 20)
                    method1208(-10, -70, 84, -119, -48, -79, 2, (byte) -64);
                int[] is = ((Widget) class45).valueIndices[i];
                int i_1_ = 0;
                int i_2_ = 0;
                int i_3_ = 0;
                for (;;)
                {
                    int i_4_ = is[i_1_++];
                    int i_5_ = 0;
                    int i_6_ = 0;
                    if (i_4_ == 0)
                        return i_3_;
                    if (i_4_ == 1)
                        i_6_ = Class30.skillLevels[is[i_1_++]];
                    if (i_4_ == 15)
                        i_5_ = 1;
                    if (i_4_ == 2)
                        i_6_ = Class88.skillLevelMaxes[is[i_1_++]];
                    if (i_4_ == 16)
                        i_5_ = 2;
                    if (i_4_ == 17)
                        i_5_ = 3;
                    if (i_4_ == 3)
                        i_6_ = Class1_Sub5.skillExperiences[is[i_1_++]];
                    if (i_4_ == 4)
                    {
                        int i_7_ = is[i_1_++] << 16;
                        i_7_ += is[i_1_++];
                        Widget class45_8_ = Class68_Sub20_Sub15.method1170(i_7_, (byte) -80);
                        int i_9_ = is[i_1_++];
                        if (i_9_ != -1 && (!(((ItemDefinition) GameApplet.method18(-25672, i_9_)).membersObject) || Class1_Sub7.members))
                        {
                            for (int i_10_ = 0; (((Widget) class45_8_).inventory.length > i_10_); i_10_++)
                            {
                                if (i_9_ + 1 == (((Widget) class45_8_).inventory[i_10_]))
                                    i_6_ += (((Widget) class45_8_).inventoryStackSizes[i_10_]);
                            }
                        }
                    }
                    if (i_4_ == 5)
                        i_6_ = Class103.settingArray[is[i_1_++]];
                    if (i_4_ == 6)
                        i_6_ = (GameSocket.skillExperiencesMax[Class88.skillLevelMaxes[is[i_1_++]] - 1]);
                    if (i_4_ == 7)
                        i_6_ = (Class103.settingArray[is[i_1_++]] * 100 / 46875);
                    if (i_4_ == 8)
                        i_6_ = ((Player) Class68_Sub7.localPlayer).combatLevel;
                    if (i_4_ == 9)
                    {
                        for (int i_11_ = 0; i_11_ < 25; i_11_++)
                        {
                            if (Class26.aBooleanArray522[i_11_])
                                i_6_ += Class88.skillLevelMaxes[i_11_];
                        }
                    }
                    if (i_4_ == 10)
                    {
                        int i_12_ = is[i_1_++] << 16;
                        i_12_ += is[i_1_++];
                        Widget class45_13_ = Class68_Sub20_Sub15.method1170(i_12_, (byte) -80);
                        int i_14_ = is[i_1_++];
                        if (i_14_ != -1 && (!(((ItemDefinition) GameApplet.method18(-25672, i_14_)).membersObject) || Class1_Sub7.members))
                        {
                            for (int i_15_ = 0; i_15_ < (((Widget) class45_13_).inventory).length; i_15_++)
                            {
                                if (i_14_ + 1 == (((Widget) class45_13_).inventory[i_15_]))
                                {
                                    i_6_ = 999999999;
                                    break;
                                }
                            }
                        }
                    }
                    if (i_4_ == 11)
                        i_6_ = Class68_Sub20_Sub9.anInt4297;
                    if (i_4_ == 12)
                        i_6_ = Class75_Sub3.anInt3332;
                    if (i_4_ == 13)
                    {
                        int i_16_ = Class103.settingArray[is[i_1_++]];
                        int i_17_ = is[i_1_++];
                        i_6_ = (1 << i_17_ & i_16_) != 0 ? 1 : 0;
                    }
                    if (i_4_ == 14)
                    {
                        int i_18_ = is[i_1_++];
                        i_6_ = Class18.method300(i_18_, false);
                    }
                    if (i_4_ == 18)
                        i_6_ = (((Character) Class68_Sub7.localPlayer).x >> 7) + Class36.baseX;
                    if (i_4_ == 19)
                        i_6_ = (((Character) Class68_Sub7.localPlayer).y >> 7) + Class68_Sub13_Sub35.baseY;
                    if (i_4_ == 20)
                        i_6_ = is[i_1_++];
                    if (i_5_ != 0)
                        i_2_ = i_5_;
                    else
                    {
                        if (i_2_ == 0)
                            i_3_ += i_6_;
                        if (i_2_ == 1)
                            i_3_ -= i_6_;
                        if (i_2_ == 2 && i_6_ != 0)
                            i_3_ /= i_6_;
                        if (i_2_ == 3)
                            i_3_ *= i_6_;
                        i_2_ = 0;
                    }
                }
            } catch (Exception exception)
            {
                return -1;
            }
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("ug.A(" + i + ',' + i_0_ + ',' + (class45 != null ? "{...}" : "null") + ')'));
        }
    }

    static final void method1206(int i)
    {
        anInt3157++;
        synchronized (Class66.keyboard)
        {
            Class70.anInt1281 = Class75_Sub1_Sub1.anInt4592;
            Class33.anInt590++;
            if (Class33.anInt576 < 0)
            {
                for (int i_19_ = 0; i_19_ < 112; i_19_++)
                    NodeSubList.aBooleanArray2230[i_19_] = false;
                Class33.anInt576 = Class124.anInt2166;
            } else
            {
                while (Class33.anInt576 != Class124.anInt2166)
                {
                    int i_20_ = Class90.anIntArray2337[Class124.anInt2166];
                    Class124.anInt2166 = Class124.anInt2166 + 1 & 0x7f;
                    if (i_20_ >= 0)
                        NodeSubList.aBooleanArray2230[i_20_] = true;
                    else
                        NodeSubList.aBooleanArray2230[i_20_ ^ 0xffffffff] = false;
                }
            }
            Class75_Sub1_Sub1.anInt4592 = Class9.anInt177;
        }
        int i_21_ = 10 / ((i - 91) / 35);
    }

    public static void method1207(byte i)
    {
        aClass100_3161 = null;
        if (i != -69)
            aClass100_3154 = null;
        aClass100_3164 = null;
        aClass100_3156 = null;
        aClass100_3154 = null;
    }

    static final void method1208(int i, int i_22_, int i_23_, int i_24_, int i_25_, int i_26_, int i_27_, byte i_28_)
    {
        anInt3163++;
        int i_29_ = 2048 - i_27_ & 0x7ff;
        int i_30_ = 2048 - i_22_ & 0x7ff;
        if (i_28_ > 26)
        {
            int i_31_ = 0;
            int i_32_ = i_25_;
            if (i_29_ != 0)
            {
                int i_33_ = Class62.PRECOMPUTED_SINE_CACHE[i_29_];
                int i_34_ = Class62.PRECOMUPTED_COSINE_CACHE[i_29_];
                i_31_ = i_33_ * -i_32_ >> 16;
                i_32_ = i_32_ * i_34_ >> 16;
            }
            int i_35_ = 0;
            if (i_30_ != 0)
            {
                int i_36_ = Class62.PRECOMPUTED_SINE_CACHE[i_30_];
                i_35_ = i_32_ * i_36_ >> 16;
                int i_37_ = Class62.PRECOMUPTED_COSINE_CACHE[i_30_];
                i_32_ = i_37_ * i_32_ >> 16;
            }
            Class74.cameraYaw = i_22_;
            GameCanvas.cameraPitch = i_27_;
            Class68_Sub5.cameraPositionZ = i_24_ - i_31_;
            Class68_Sub7.cameraPositionX = i_23_ - i_35_;
            Class85.cameraPositionY = i_26_ - i_32_;
        }
    }

    static final int method1209(int i, int i_38_, int i_39_)
    {
        anInt3158++;
        if (i != 0)
            return -119;
        long l = (long) (i_38_ + (i_39_ << 16));
        if (Class68_Sub13_Sub22.aClass68_Sub20_Sub15_3813 == null || (((Node) Class68_Sub13_Sub22.aClass68_Sub20_Sub15_3813).nodeID) != l)
            return 0;
        return ((((Stream) Keyboard.aClass68_Sub14_2130).position * 99 / ((((Stream) Keyboard.aClass68_Sub14_2130).buffer).length - (((Class68_Sub20_Sub15) Class68_Sub13_Sub22.aClass68_Sub20_Sub15_3813).aByte4393))) + 1);
    }

    public Class68_Sub24()
    {
        /* empty */
    }

    Class68_Sub24(MutableString class100, int i)
    {
        try
        {
            ((Class68_Sub24) this).aClass100_3165 = class100;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("ug.<init>(" + (class100 != null ? "{...}" : "null") + ',' + i + ')'));
        }
    }

    static
    {
        aClass100_3154 = aClass100_3156;
        aClass100_3161 = Class112.makeMutableString(43, "http:)4)4");
        aClass100_3164 = Class112.makeMutableString(43, "settings");
    }
}
