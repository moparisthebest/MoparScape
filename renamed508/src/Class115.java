/* Class115 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class115
{
    static int anInt1941;
    private int anInt1942;
    private Class68_Sub17[] aClass68_Sub17Array1943;
    static int anInt1944;
    static int[] anIntArray1945 = { 0, 0, 2, 0, 0, 2, 1, 1, 0 };
    static int anInt1946;
    static int anInt1947;
    static int anInt1948;
    static int anInt1949;
    private int anInt1950 = 0;
    static int anInt1951;
    static int[] anIntArray1952 = { 0, -1, 0, 1 };
    private int[][] anIntArrayArray1953;
    private int anInt1954;
    private int anInt1955 = -1;
    private NodeList aClass16_1956 = new NodeList();
    static NodeList aClass16_1957 = new NodeList();
    static int anInt1958;
    boolean aBoolean1959 = false;
    static volatile int mouseX = -1;

    static final void method1700(int i, int i_0_, boolean bool, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_)
    {
        if (bool != false)
            method1705(120);
        anInt1949++;
        int i_7_ = i_3_ - i_4_;
        int i_8_ = i_5_ - i;
        int i_9_ = (i_2_ - i_6_ << 16) / i_8_;
        int i_10_ = (i_1_ - i_0_ << 16) / i_7_;
        Class68_Sub13_Sub39.method903(i_10_, i_5_, i_4_, 0, -117, i_6_, i, 0, i_9_, i_0_, i_3_);
    }

    static final void method1701(boolean bool)
    {
        anInt1951++;
        if (bool == false && Class30.aClass68_Sub20_Sub16_540 != null)
        {
            if (Object4.anInt1080 < 10)
            {
                if (!(Class87.aClass21_1590.method354(0, ((Class68_Sub20_Sub16) Class30.aClass68_Sub20_Sub16_540).aClass100_4414)) || !(Class87.aClass21_1590.method354(0, (Class68_Sub20_Sub13_Sub2.method1166(2, (new MutableString[] { (((Class68_Sub20_Sub16) Class30.aClass68_Sub20_Sub16_540).aClass100_4414), Class68_Sub2.aClass100_2787 }))))))
                {
                    Object4.anInt1080 = (Class68_Sub20_Sub5.aClass21_Sub1_4223.method363(126, (((Class68_Sub20_Sub16) Class30.aClass68_Sub20_Sub16_540).aClass100_4414))) / 10;
                    return;
                }
                Class92.method1535(297);
                Object4.anInt1080 = 10;
            }
            if (Object4.anInt1080 == 10)
            {
                Ground.anInt2762 = (((Class68_Sub20_Sub16) Class30.aClass68_Sub20_Sub16_540).anInt4409) >> 6 << 6;
                Class103.anInt1770 = (((Class68_Sub20_Sub16) Class30.aClass68_Sub20_Sub16_540).anInt4408 >> 6 << 6) + 64 - Ground.anInt2762;
                Class70.anInt1273 = (((Class68_Sub20_Sub16) Class30.aClass68_Sub20_Sub16_540).anInt4421) >> 6 << 6;
                int i = (-Class68_Sub13_Sub35.baseY - ((((Character) Class68_Sub7.localPlayer).y) >> 7) + Ground.anInt2762 + (Class103.anInt1770 - 1));
                Class68_Sub13_Sub27.aFloat3915 = Class68_Sub9.aFloat2894 = 8.0F;
                i += (int) (Math.random() * 10.0) - 5;
                Class68_Sub6.anInt2848 = (64 - Class70.anInt1273 + (((Class68_Sub20_Sub16) Class30.aClass68_Sub20_Sub16_540).anInt4412 >> 6 << 6));
                int i_11_ = (Class36.baseX - Class70.anInt1273 + ((((Character) Class68_Sub7.localPlayer).x) >> 7));
                i_11_ += (int) (Math.random() * 10.0) - 5;
                do
                {
                    if (i_11_ >= 0 && Class68_Sub6.anInt2848 > i_11_ && i >= 0 && i < Class103.anInt1770)
                    {
                        Class68_Sub13_Sub24.anInt3846 = i_11_;
                        Class85.anInt1553 = i;
                        if (client.anInt2387 == 0)
                            break;
                    }
                    Class68_Sub13_Sub24.anInt3846 = (64 * ((Class68_Sub20_Sub16) Class30.aClass68_Sub20_Sub16_540).anInt4425 - Class70.anInt1273);
                    Class85.anInt1553 = (Ground.anInt2762 - ((Class68_Sub20_Sub16) Class30.aClass68_Sub20_Sub16_540).anInt4430 * 64 - 1 + Class103.anInt1770);
                } while (false);
                NodeSubList.method1788(-1);
                int i_12_ = Class18.anInt316 >> 1;
                int i_13_ = Class1_Sub1.anInt2426 >> 2 << 10;
                int i_14_ = Class103.anInt1770 >> 6;
                Class121.anIntArray2106 = new int[Class112.anInt1881 + 1];
                int i_15_ = Class68_Sub6.anInt2848 >> 6;
                Class68_Sub20_Sub17.anIntArrayArrayArray4444 = new int[i_15_][i_14_][];
                Class68_Sub13_Sub16.aByteArrayArrayArray3712 = new byte[i_15_][i_14_][];
                Class48.aByteArrayArrayArray949 = new byte[i_15_][i_14_][];
                Class12.aByteArrayArrayArray212 = new byte[i_15_][i_14_][];
                Class33.anIntArrayArrayArray584 = new int[i_15_][i_14_][];
                Class68_Sub13_Sub11.aByteArrayArrayArray3624 = new byte[i_15_][i_14_][];
                Class68_Sub13_Sub11.aShortArrayArrayArray3628 = new short[i_15_][i_14_][];
                Class49.aByteArrayArrayArray970 = new byte[i_15_][i_14_][];
                Class68_Sub13_Sub33.method868(i_12_, i_13_, 68);
                Object4.anInt1080 = 20;
            } else if (Object4.anInt1080 == 20)
            {
                Class75_Sub1_Sub1.method1393(79, new Stream(Class87.aClass21_1590.method351((((Class68_Sub20_Sub16) Class30.aClass68_Sub20_Sub16_540).aClass100_4414), Class68_Sub20_Sub15.aClass100_4395, (byte) 89)));
                Object4.anInt1080 = 30;
                Class13_Sub1.method254(-12915, true);
                Class20.method327((byte) 63);
            } else if (Object4.anInt1080 == 30)
            {
                Class68_Sub13_Sub11.method746(81, new Stream(Class87.aClass21_1590.method351((((Class68_Sub20_Sub16) Class30.aClass68_Sub20_Sub16_540).aClass100_4414), Class60.aClass100_1115, (byte) 104)));
                Object4.anInt1080 = 40;
                Class20.method327((byte) 63);
            } else if (Object4.anInt1080 == 40)
            {
                Class68_Sub13_Sub35.method877((byte) 69, new Stream(Class87.aClass21_1590.method351((((Class68_Sub20_Sub16) Class30.aClass68_Sub20_Sub16_540).aClass100_4414), Class68_Sub13_Sub24.aClass100_3841, (byte) 117)));
                Object4.anInt1080 = 50;
                Class20.method327((byte) 53);
            } else if (Object4.anInt1080 == 50)
            {
                ScriptParameters.method1325(14904, new Stream(Class87.aClass21_1590.method351((((Class68_Sub20_Sub16) Class30.aClass68_Sub20_Sub16_540).aClass100_4414), Class101.aClass100_1744, (byte) 102)));
                Object4.anInt1080 = 60;
                Class13_Sub1.method254(-12915, true);
                Class20.method327((byte) 50);
            } else if (Object4.anInt1080 == 60)
            {
                Class102.aClass91_1758 = Class90.method1516((Class68_Sub20_Sub13_Sub2.method1166(2, (new MutableString[] { (((Class68_Sub20_Sub16) (Class30.aClass68_Sub20_Sub16_540)).aClass100_4414), Class68_Sub2.aClass100_2787 }))), 12666, Class87.aClass21_1590);
                Object4.anInt1080 = 70;
                Class20.method327((byte) 103);
            } else if (Object4.anInt1080 == 70)
            {
                Class68_Sub13_Sub27.aClass65_3914 = new Class65(11, true, Mouse.gameCanvas);
                Object4.anInt1080 = 73;
                Class13_Sub1.method254(-12915, true);
                Class20.method327((byte) 120);
            } else if (Object4.anInt1080 == 73)
            {
                Class68_Sub10.aClass65_2914 = new Class65(12, true, Mouse.gameCanvas);
                Object4.anInt1080 = 76;
                Class13_Sub1.method254(-12915, true);
                Class20.method327((byte) 38);
            } else if (Object4.anInt1080 == 76)
            {
                Class68_Sub16.aClass65_3033 = new Class65(14, true, Mouse.gameCanvas);
                Object4.anInt1080 = 79;
                Class13_Sub1.method254(-12915, true);
                Class20.method327((byte) 123);
            } else if (Object4.anInt1080 == 79)
            {
                Animation.aClass65_2038 = new Class65(17, true, Mouse.gameCanvas);
                Object4.anInt1080 = 82;
                Class13_Sub1.method254(-12915, true);
                Class20.method327((byte) 49);
            } else if (Object4.anInt1080 == 82)
            {
                Class104.aClass65_1789 = new Class65(19, true, Mouse.gameCanvas);
                Object4.anInt1080 = 85;
                Class13_Sub1.method254(-12915, true);
                Class20.method327((byte) 79);
            } else if (Object4.anInt1080 == 85)
            {
                Class72.aClass65_1305 = new Class65(22, true, Mouse.gameCanvas);
                Object4.anInt1080 = 88;
                Class13_Sub1.method254(-12915, true);
                Class20.method327((byte) 85);
            } else if (Object4.anInt1080 == 88)
            {
                Class75.aClass65_1344 = new Class65(26, true, Mouse.gameCanvas);
                Object4.anInt1080 = 91;
                Class13_Sub1.method254(-12915, true);
                Class20.method327((byte) 86);
            } else
            {
                Class68_Sub20_Sub16.aClass65_4419 = new Class65(30, true, Mouse.gameCanvas);
                Object4.anInt1080 = 100;
                Class13_Sub1.method254(-12915, true);
                Class20.method327((byte) 25);
                Class3.anInt85 = -1;
                Class68_Sub22.anInt3147 = -1;
                System.gc();
            }
        }
    }

    final int[][] method1702(int i)
    {
        anInt1947++;
        if (i != -32044)
            aClass16_1956 = null;
        if (anInt1954 != anInt1942)
            throw new RuntimeException("Can only retrieve a full image cache");
        for (int i_16_ = 0; i_16_ < anInt1942; i_16_++)
            aClass68_Sub17Array1943[i_16_] = Stream.aClass68_Sub17_2996;
        return anIntArrayArray1953;
    }

    final int[] method1703(boolean bool, int i)
    {
        if (bool != false)
            method1702(30);
        anInt1941++;
        if (anInt1954 != anInt1942)
        {
            if (anInt1942 != 1)
            {
                Class68_Sub17 class68_sub17 = aClass68_Sub17Array1943[i];
                if (class68_sub17 == null)
                {
                    ((Class115) this).aBoolean1959 = true;
                    if (anInt1942 <= anInt1950)
                    {
                        Class68_Sub17 class68_sub17_17_ = (Class68_Sub17) aClass16_1956.method289(30568);
                        class68_sub17 = new Class68_Sub17(i, ((Class68_Sub17) class68_sub17_17_).anInt3037);
                        aClass68_Sub17Array1943[((Class68_Sub17) class68_sub17_17_).anInt3036] = null;
                        class68_sub17_17_.unlink();
                    } else
                    {
                        class68_sub17 = new Class68_Sub17(i, anInt1950);
                        anInt1950++;
                    }
                    aClass68_Sub17Array1943[i] = class68_sub17;
                } else
                    ((Class115) this).aBoolean1959 = false;
                aClass16_1956.method291((byte) 107, class68_sub17);
                return (anIntArrayArray1953[((Class68_Sub17) class68_sub17).anInt3037]);
            }
            ((Class115) this).aBoolean1959 = anInt1955 != i;
            anInt1955 = i;
            return anIntArrayArray1953[0];
        }
        ((Class115) this).aBoolean1959 = aClass68_Sub17Array1943[i] == null;
        aClass68_Sub17Array1943[i] = Stream.aClass68_Sub17_2996;
        return anIntArrayArray1953[i];
    }

    static final MutableString method1704(MutableString class100, int i)
    {
        try
        {
            int i_18_ = Class68_Sub13_Sub31.method858(64, class100);
            anInt1944++;
            if (i != 14589)
                anInt1948 = 117;
            if (i_18_ == -1)
                return Class68_Sub13_Sub3.aClass100_3469;
            return (((Class91) Class102.aClass91_1758).aClass100Array1637[i_18_]);
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, "ti.G(" + (class100 != null ? "{...}" : "null") + ',' + i + ')');
        }
    }

    public static void method1705(int i)
    {
        anIntArray1945 = null;
        anIntArray1952 = null;
        aClass16_1957 = null;
        if (i != 100)
            method1701(true);
    }

    final void method1706(boolean bool)
    {
        for (int i = 0; anInt1942 > i; i++)
            anIntArrayArray1953[i] = null;
        if (bool == true)
        {
            aClass68_Sub17Array1943 = null;
            anInt1946++;
            anIntArrayArray1953 = null;
            aClass16_1956.method284(105);
            aClass16_1956 = null;
        }
    }

    static final void method1707()
    {
        for (int i = 0; i < Animation.anInt2057; i++)
        {
            Object5 class69 = Node.aClass69Array1222[i];
            Class95.method1555(class69);
            Node.aClass69Array1222[i] = null;
        }
        Animation.anInt2057 = 0;
    }

    Class115(int i, int i_19_, int i_20_)
    {
        anInt1954 = i_19_;
        aClass68_Sub17Array1943 = new Class68_Sub17[anInt1954];
        anInt1942 = i;
        anIntArrayArray1953 = new int[anInt1942][i_20_];
    }
}
