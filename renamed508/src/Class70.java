/* Class70 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Calendar;
import java.util.TimeZone;

final class Class70
{
    static int anInt1263;
    private int anInt1264 = 128;
    static int anInt1265;
    private int anInt1266;
    private int anInt1267;
    static int anInt1268;
    private int anInt1269 = 0;
    private short[] aShortArray1270;
    private short[] aShortArray1271;
    static int anInt1272;
    static int anInt1273;
    private int anInt1274;
    static int anInt1275;
    private short[] aShortArray1276;
    int anInt1277;
    static int anInt1278;
    boolean aBoolean1279;
    static int anInt1280;
    static int anInt1281 = 0;
    int anInt1282;
    static Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    private int anInt1284;
    private short[] aShortArray1285;
    static Class68_Sub20_Sub10[] aClass68_Sub20_Sub10Array1286;
    static int anInt1287 = 0;

    private final void method1331(int i, Stream class68_sub14, int i_0_)
    {
        try
        {
            anInt1263++;
            if (i_0_ <= 77)
                method1334(null, -50);
            if (i == 1)
                anInt1267 = class68_sub14.readUShort();
            else if (i == 2)
                ((Class70) this).anInt1282 = class68_sub14.readUShort();
            else if (i == 4)
                anInt1264 = class68_sub14.readUShort();
            else if (i != 5)
            {
                if (i != 6)
                {
                    if (i != 7)
                    {
                        if (i != 8)
                        {
                            if (i != 9)
                            {
                                if (i != 40)
                                {
                                    if (i == 41)
                                    {
                                        int i_1_ = class68_sub14.readUByte();
                                        aShortArray1285 = new short[i_1_];
                                        aShortArray1270 = new short[i_1_];
                                        for (int i_2_ = 0; i_2_ < i_1_; i_2_++)
                                        {
                                            aShortArray1285[i_2_] = (short) (class68_sub14.readUShort());
                                            aShortArray1270[i_2_] = (short) (class68_sub14.readUShort());
                                        }
                                    }
                                } else
                                {
                                    int i_3_ = class68_sub14.readUByte();
                                    aShortArray1271 = new short[i_3_];
                                    aShortArray1276 = new short[i_3_];
                                    for (int i_4_ = 0; i_3_ > i_4_; i_4_++)
                                    {
                                        aShortArray1276[i_4_] = (short) (class68_sub14.readUShort());
                                        aShortArray1271[i_4_] = (short) (class68_sub14.readUShort());
                                    }
                                }
                            } else
                                ((Class70) this).aBoolean1279 = true;
                        } else
                            anInt1284 = class68_sub14.readUByte();
                    } else
                        anInt1274 = class68_sub14.readUByte();
                } else
                    anInt1269 = class68_sub14.readUShort();
            } else
                anInt1266 = class68_sub14.readUShort();
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("mb.D(" + i + ',' + (class68_sub14 != null ? "{...}" : "null") + ',' + i_0_ + ')'));
        }
    }

    public static void unsetStatic()
    {
        calendar = null;
        aClass68_Sub20_Sub10Array1286 = null;
    }

    static final void method1333(int i, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_, int i_13_, int i_14_)
    {
        if (i_10_ != i_8_ || i_12_ != i_9_ || i != i_13_ || i_14_ != i_7_)
        {
            int i_15_ = i_10_;
            int i_16_ = i_9_;
            int i_17_ = 3 * i_10_;
            int i_18_ = 3 * i_9_;
            int i_19_ = 3 * i_12_;
            int i_20_ = i_8_ * 3;
            int i_21_ = 3 * i_13_;
            int i_22_ = i_7_ * 3;
            int i_23_ = i_20_ + i + (-i_21_ - i_10_);
            int i_24_ = i_14_ - i_22_ - i_9_ + i_19_;
            int i_25_ = -i_19_ - i_19_ + (i_22_ + i_18_);
            int i_26_ = i_17_ + (i_21_ - i_20_ - i_20_);
            int i_27_ = i_20_ - i_17_;
            int i_28_ = i_19_ - i_18_;
            for (int i_29_ = 128; i_29_ <= 4096; i_29_ += 128)
            {
                int i_30_ = i_29_ * i_29_ >> 12;
                int i_31_ = i_29_ * i_30_ >> 12;
                int i_32_ = i_31_ * i_24_;
                int i_33_ = i_31_ * i_23_;
                int i_34_ = i_25_ * i_30_;
                int i_35_ = i_28_ * i_29_;
                int i_36_ = i_26_ * i_30_;
                int i_37_ = i_27_ * i_29_;
                int i_38_ = i_10_ + (i_36_ + (i_33_ + i_37_) >> 12);
                int i_39_ = i_9_ + (i_35_ + (i_32_ + i_34_) >> 12);
                Class44.method487(i_15_, i_39_, (byte) 87, i_38_, i_11_, i_16_);
                i_15_ = i_38_;
                i_16_ = i_39_;
            }
        } else
            Class44.method487(i_10_, i_14_, (byte) 126, i, i_11_, i_9_);
        anInt1275++;
        if (i_6_ >= -15)
            method1333(51, -81, -54, 36, 92, -32, 125, -18, -46, 118);
    }

    static final Class58 method1334(Stream class68_sub14, int i)
    {
        try
        {
            anInt1265++;
            Class58 class58 = new Class58();
            if (i != -10)
                aClass68_Sub20_Sub10Array1286 = null;
            ((Class58) class58).anInt1089 = class68_sub14.readUShort();
            ((Class58) class58).aClass68_Sub20_Sub8_1099 = Class118.method1737(((Class58) class58).anInt1089, (byte) 111);
            return class58;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, "mb.F(" + (class68_sub14 != null ? "{...}" : "null") + ',' + i + ')');
        }
    }

    static int OR(int a, int b)
    {
        return a | b;
    }

    final void method1336(Stream class68_sub14, int i)
    {
        do
        {
            try
            {
                for (;;)
                {
                    int i_41_ = class68_sub14.readUByte();
                    if (i_41_ == 0)
                        break;
                    method1331(i_41_, class68_sub14, 84);
                }
                anInt1278++;
                if (i == -1)
                    break;
                method1334(null, 120);
            } catch (RuntimeException runtimeexception)
            {
                throw Class107.getException(runtimeexception, ("mb.C(" + (class68_sub14 != null ? "{...}" : "null") + ',' + i + ')'));
            }
            break;
        } while (false);
    }

    final Model method1337(int i, int i_42_)
    {
        if (i_42_ != -10)
            return null;
        anInt1280++;
        Model class1_sub3 = ((Model) ClientScript.aClass98_4374.getNodeForID((long) ((Class70) this).anInt1277));
        if (class1_sub3 == null)
        {
            Class1_Sub4 class1_sub4 = Class1_Sub4.method115(Class75_Sub1_Sub1.aClass21_4593, anInt1267, 0);
            if (class1_sub4 == null)
                return null;
            if (aShortArray1276 != null)
            {
                for (int i_43_ = 0; i_43_ < aShortArray1276.length; i_43_++)
                    class1_sub4.method129(aShortArray1276[i_43_], aShortArray1271[i_43_]);
            }
            if (aShortArray1285 != null)
            {
                for (int i_44_ = 0; aShortArray1285.length > i_44_; i_44_++)
                    class1_sub4.method110(aShortArray1285[i_44_], aShortArray1270[i_44_]);
            }
            class1_sub3 = class1_sub4.method127(anInt1274 + 64, anInt1284 + 850, -30, -50, -30);
            ClientScript.aClass98_4374.addObject(class1_sub3, (long) ((Class70) this).anInt1277);
        }
        Model class1_sub3_45_;
        if (((Class70) this).anInt1282 == -1 || i == -1)
            class1_sub3_45_ = class1_sub3.method81(true, true);
        else
            class1_sub3_45_ = Object1.getAnimation(((Class70) this).anInt1282).method1722(class1_sub3, 8493, i);
        if (anInt1264 != 128 || anInt1266 != 128)
            class1_sub3_45_.method72(anInt1264, anInt1266, anInt1264);
        if (anInt1269 != 0)
        {
            if (anInt1269 == 90)
                class1_sub3_45_.method80();
            if (anInt1269 == 180)
                class1_sub3_45_.method83();
            if (anInt1269 == 270)
                class1_sub3_45_.method88();
        }
        return class1_sub3_45_;
    }

    public Class70()
    {
        anInt1266 = 128;
        ((Class70) this).aBoolean1279 = false;
        anInt1274 = 0;
        ((Class70) this).anInt1282 = -1;
        anInt1284 = 0;
    }
}
