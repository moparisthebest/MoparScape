/* Class35 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;

class Class35
{
    static NodeList aClass16_602;
    static int anInt603;
    private int anInt604 = 32;
    static int anInt605;
    static Widget aClass45_606 = null;
    static int anInt607;
    static int anInt608;
    static int anInt609;
    static int anInt610;
    static int anInt611;
    static int anInt612;
    static int anInt613;
    static int anInt614;
    static int anInt615;
    private Class68_Sub28 aClass68_Sub28_616;
    static int anInt617;
    static int anInt618;
    static int anInt619;
    static int anInt620;
    static int anInt621;
    static int anInt622;
    static NodeList aClass16_623;
    private long aLong624 = Class36.method438(17161);
    int[] anIntArray625;
    static int anInt626;
    private boolean aBoolean627 = true;
    private Class68_Sub28[] aClass68_Sub28Array628;
    private int anInt629 = 0;
    private int anInt630;
    private int anInt631;
    int anInt632;
    private long aLong633 = 0L;
    private int anInt634;
    private Class68_Sub28[] aClass68_Sub28Array635;
    int anInt636;
    private int anInt637;
    private long aLong638;

    final void method418(boolean bool)
    {
        if (bool == false)
        {
            aBoolean627 = true;
            anInt608++;
        }
    }

    private final void method419(int[] is, int i)
    {
        int i_0_ = i;
        if (Class7.aBoolean132)
            i_0_ <<= 1;
        Class39.method463(is, 0, i_0_);
        anInt637 -= i;
        if (aClass68_Sub28_616 != null && anInt637 <= 0)
        {
            anInt637 += Class93.anInt1662 >> 4;
            Class75_Sub1_Sub1.method1395((byte) -45, aClass68_Sub28_616);
            method429((byte) 88, aClass68_Sub28_616, aClass68_Sub28_616.method1227());
            int i_1_ = 0;
            int i_2_ = 255;
            int i_3_ = 7;
            while_13_: while (i_2_ != 0)
            {
                int i_4_;
                int i_5_;
                if (i_3_ < 0)
                {
                    i_4_ = i_3_ & 0x3;
                    i_5_ = -(i_3_ >> 2);
                } else
                {
                    i_4_ = i_3_;
                    i_5_ = 0;
                }
                for (int i_6_ = i_2_ >>> i_4_ & 0x11111111; i_6_ != 0; i_6_ >>>= 4)
                {
                    if ((i_6_ & 0x1) != 0)
                    {
                        i_2_ &= 1 << i_4_ ^ 0xffffffff;
                        Class68_Sub28 class68_sub28 = null;
                        Class68_Sub28 class68_sub28_7_ = aClass68_Sub28Array628[i_4_];
                        while (class68_sub28_7_ != null)
                        {
                            Class68_Sub11 class68_sub11 = (((Class68_Sub28) class68_sub28_7_).aClass68_Sub11_3227);
                            if (class68_sub11 != null && (((Class68_Sub11) class68_sub11).anInt2917 > i_5_))
                            {
                                i_2_ |= 1 << i_4_;
                                class68_sub28 = class68_sub28_7_;
                                class68_sub28_7_ = (((Class68_Sub28) class68_sub28_7_).aClass68_Sub28_3230);
                            } else
                            {
                                ((Class68_Sub28) class68_sub28_7_).aBoolean3229 = true;
                                int i_8_ = class68_sub28_7_.method1224();
                                i_1_ += i_8_;
                                if (class68_sub11 != null)
                                    ((Class68_Sub11) class68_sub11).anInt2917 += i_8_;
                                if (i_1_ >= anInt604)
                                    break while_13_;
                                Class68_Sub28 class68_sub28_9_ = class68_sub28_7_.method1226();
                                if (class68_sub28_9_ != null)
                                {
                                    int i_10_ = (((Class68_Sub28) class68_sub28_7_).anInt3228);
                                    for (/**/; class68_sub28_9_ != null; class68_sub28_9_ = class68_sub28_7_.method1228())
                                        method429((byte) 104, class68_sub28_9_, (i_10_ * class68_sub28_9_.method1227() >> 8));
                                }
                                Class68_Sub28 class68_sub28_11_ = (((Class68_Sub28) class68_sub28_7_).aClass68_Sub28_3230);
                                ((Class68_Sub28) class68_sub28_7_).aClass68_Sub28_3230 = null;
                                if (class68_sub28 == null)
                                    aClass68_Sub28Array628[i_4_] = class68_sub28_11_;
                                else
                                    ((Class68_Sub28) class68_sub28).aClass68_Sub28_3230 = class68_sub28_11_;
                                if (class68_sub28_11_ == null)
                                    aClass68_Sub28Array635[i_4_] = class68_sub28;
                                class68_sub28_7_ = class68_sub28_11_;
                            }
                        }
                    }
                    i_4_ += 4;
                    i_5_++;
                }
                i_3_--;
            }
            for (int i_12_ = 0; i_12_ < 8; i_12_++)
            {
                Class68_Sub28 class68_sub28 = aClass68_Sub28Array628[i_12_];
                aClass68_Sub28Array628[i_12_] = aClass68_Sub28Array635[i_12_] = null;
                Class68_Sub28 class68_sub28_13_;
                for (/**/; class68_sub28 != null; class68_sub28 = class68_sub28_13_)
                {
                    class68_sub28_13_ = ((Class68_Sub28) class68_sub28).aClass68_Sub28_3230;
                    ((Class68_Sub28) class68_sub28).aClass68_Sub28_3230 = null;
                }
            }
        }
        if (anInt637 < 0)
            anInt637 = 0;
        if (aClass68_Sub28_616 != null)
            aClass68_Sub28_616.method1225(is, 0, i);
        aLong624 = Class36.method438(17161);
    }

    void method420() throws Exception
    {
        anInt612++;
    }

    private final void method421(int i, int i_14_)
    {
        if (i != 2955)
            anInt605 = 58;
        anInt610++;
        anInt637 -= i_14_;
        if (anInt637 < 0)
            anInt637 = 0;
        if (aClass68_Sub28_616 != null)
            aClass68_Sub28_616.method1229(i_14_);
    }

    int method422() throws Exception
    {
        anInt618++;
        return ((Class35) this).anInt636;
    }

    void method423(int i) throws Exception
    {
        anInt613++;
    }

    static final void method424(int i, int i_15_, int i_16_, int i_17_, boolean bool)
    {
        anInt617++;
        Class79.method1433(i_17_, i, i_17_ + i_16_, i_15_ + i);
        Class79.method1445(i_17_, i, i_16_, i_15_, 0);
        if (Object4.anInt1080 >= 100)
        {
            if (Animable.aClass68_Sub20_Sub10_59 == null || (((Class68_Sub20_Sub10) Animable.aClass68_Sub20_Sub10_59).width) != i_16_ || (((Class68_Sub20_Sub10) Animable.aClass68_Sub20_Sub10_59).height) != i_15_)
            {
                Sprite class68_sub20_sub10_sub1 = new Sprite(i_16_, i_15_);
                Class79.method1438(((Sprite) class68_sub20_sub10_sub1).pixels, i_16_, i_15_);
                ScriptParameters.method1323(0, 0, Class103.anInt1770, 0, 0, i_16_, 1391070128, i_15_, Class68_Sub6.anInt2848);
                Animable.aClass68_Sub20_Sub10_59 = class68_sub20_sub10_sub1;
                Class1_Sub5.aClass72_2498.method1358(81);
            }
            Animable.aClass68_Sub20_Sub10_59.method1108(i_17_, i);
            int i_18_ = i_17_ + i_16_ * Class25.anInt516 / Class68_Sub6.anInt2848;
            int i_19_ = i + Object1.anInt1192 * i_15_ / Class103.anInt1770;
            int i_20_ = i_16_ * Class13_Sub4.anInt2689 / Class68_Sub6.anInt2848;
            if (bool != true)
                method424(-12, 24, -51, 5, true);
            int i_21_ = i_15_ * Class1_Sub7.anInt2621 / Class103.anInt1770;
            Class79.method1441(i_18_, i_19_, i_20_, i_21_, 16711680, 128);
            Class79.method1421(i_18_, i_19_, i_20_, i_21_, 16711680);
            if (Class68_Sub13_Sub36.anInt4035 > 0 && Class68_Sub13_Sub36.anInt4035 % 10 < 5)
            {
                for (Class68_Sub8 class68_sub8 = ((Class68_Sub8) Class75.aClass16_1343.method293((byte) 76)); class68_sub8 != null; class68_sub8 = (Class68_Sub8) Class75.aClass16_1343.method290((byte) 90))
                {
                    if (Class68_Sub13_Sub12.anInt3646 == ((Class68_Sub8) class68_sub8).anInt2880)
                    {
                        int i_22_ = ((((Class68_Sub8) class68_sub8).anInt2871 * i_16_ / Class68_Sub6.anInt2848) + i_17_);
                        int i_23_ = ((((Class68_Sub8) class68_sub8).anInt2877 * i_15_ / Class103.anInt1770) + i);
                        Class79.method1445(i_22_ - 2, i_23_ - 2, 4, 4, 16776960);
                    }
                }
            }
        }
    }

    final synchronized void method425(boolean bool, Class68_Sub28 class68_sub28)
    {
        do
        {
            try
            {
                anInt609++;
                aClass68_Sub28_616 = class68_sub28;
                if (bool == false)
                    break;
                method419(null, 104);
            } catch (RuntimeException runtimeexception)
            {
                throw Class107.getException(runtimeexception, ("ff.K(" + bool + ',' + (class68_sub28 != null ? "{...}" : "null") + ')'));
            }
            break;
        } while (false);
    }

    void method426()
    {
        anInt603++;
    }

    public static void method427(byte i)
    {
        if (i == -90)
        {
            aClass16_602 = null;
            aClass16_623 = null;
            aClass45_606 = null;
        }
    }

    final synchronized void method428(byte i)
    {
        anInt622++;
        aBoolean627 = true;
        if (i == -100)
        {
            try
            {
                method434();
            } catch (Exception exception)
            {
                method426();
                aLong633 = Class36.method438(17161) + 2000L;
            }
        }
    }

    private final void method429(byte i, Class68_Sub28 class68_sub28, int i_24_)
    {
        try
        {
            anInt620++;
            int i_25_ = i_24_ >> 5;
            if (i < 4)
                aClass68_Sub28Array635 = null;
            Class68_Sub28 class68_sub28_26_ = aClass68_Sub28Array635[i_25_];
            if (class68_sub28_26_ != null)
                ((Class68_Sub28) class68_sub28_26_).aClass68_Sub28_3230 = class68_sub28;
            else
                aClass68_Sub28Array628[i_25_] = class68_sub28;
            aClass68_Sub28Array635[i_25_] = class68_sub28;
            ((Class68_Sub28) class68_sub28).anInt3228 = i_24_;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("ff.Q(" + i + ',' + (class68_sub28 != null ? "{...}" : "null") + ',' + i_24_ + ')'));
        }
    }

    final synchronized void method430(byte i)
    {
        int i_27_ = 101 / ((9 - i) / 44);
        anInt614++;
        if (((Class35) this).anIntArray625 != null)
        {
            long l = Class36.method438(17161);
            try
            {
                if (aLong633 != 0L)
                {
                    if (l < aLong633)
                        return;
                    method423(((Class35) this).anInt636);
                    aLong633 = 0L;
                    aBoolean627 = true;
                }
                int i_28_ = method422();
                if (anInt629 - i_28_ > anInt634)
                    anInt634 = anInt629 - i_28_;
                int i_29_ = anInt631 + ((Class35) this).anInt632;
                if (i_29_ + 256 > 16384)
                    i_29_ = 16128;
                if (((Class35) this).anInt636 < i_29_ + 256)
                {
                    ((Class35) this).anInt636 += 1024;
                    if (((Class35) this).anInt636 > 16384)
                        ((Class35) this).anInt636 = 16384;
                    method426();
                    method423(((Class35) this).anInt636);
                    aBoolean627 = true;
                    i_28_ = 0;
                    if (i_29_ + 256 > ((Class35) this).anInt636)
                    {
                        i_29_ = ((Class35) this).anInt636 - 256;
                        anInt631 = i_29_ - ((Class35) this).anInt632;
                    }
                }
                for (/**/; i_29_ > i_28_; i_28_ += 256)
                {
                    method419(((Class35) this).anIntArray625, 256);
                    method420();
                }
                if (aLong638 < l)
                {
                    if (aBoolean627)
                        aBoolean627 = false;
                    else
                    {
                        if (anInt634 == 0 && anInt630 == 0)
                        {
                            method426();
                            aLong633 = l + 2000L;
                            return;
                        }
                        anInt631 = Math.min(anInt630, anInt634);
                        anInt630 = anInt634;
                    }
                    anInt634 = 0;
                    aLong638 = l + 2000L;
                }
                anInt629 = i_28_;
            } catch (Exception exception)
            {
                method426();
                aLong633 = l + 2000L;
            }
            try
            {
                if (l > aLong624 + 500000L)
                    l = aLong624;
                for (/**/; l > aLong624 + 5000L; aLong624 += (long) (256000 / Class93.anInt1662))
                    method421(2955, 256);
            } catch (Exception exception)
            {
                aLong624 = l;
            }
        }
    }

    final synchronized void method431(int i)
    {
        if (Class44.aClass125_742 != null)
        {
            boolean bool = true;
            for (int i_30_ = 0; i_30_ < 2; i_30_++)
            {
                if (((Class125) Class44.aClass125_742).aClass35Array2176[i_30_] == this)
                    ((Class125) Class44.aClass125_742).aClass35Array2176[i_30_] = null;
                if (((Class125) Class44.aClass125_742).aClass35Array2176[i_30_] != null)
                    bool = false;
            }
            if (bool)
            {
                ((Class125) Class44.aClass125_742).aBoolean2178 = true;
                while (((Class125) Class44.aClass125_742).aBoolean2180)
                    Class50.method528(i - 7759449, 50L);
                Class44.aClass125_742 = null;
            }
        }
        anInt615++;
        method426();
        ((Class35) this).anIntArray625 = null;
        if (i != 7759444)
            aBoolean627 = true;
    }

    static final Class68_Sub20_Sub17 method432(int i, byte i_31_)
    {
        anInt621++;
        Class68_Sub20_Sub17 class68_sub20_sub17 = ((Class68_Sub20_Sub17) Class11.aClass98_193.getNodeForID((long) i));
        if (class68_sub20_sub17 != null)
            return class68_sub20_sub17;
        if (i_31_ >= -31)
            method435((byte) 102, null);
        class68_sub20_sub17 = Class68_Sub13_Sub30.method852(-32, false, Class50_Sub2.aClass21_2738, i, Class68_Sub13_Sub24.aClass21_3845);
        if (class68_sub20_sub17 != null)
            Class11.aClass98_193.addObject(class68_sub20_sub17, (long) i);
        return class68_sub20_sub17;
    }

    void method433(Component component) throws Exception
    {
        try
        {
            anInt611++;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, "ff.F(" + (component != null ? "{...}" : "null") + ')');
        }
    }

    void method434() throws Exception
    {
        anInt619++;
    }

    static final void method435(byte i, Class21 class21)
    {
        try
        {
            anInt607++;
            NodeCache.anInt1914 = class21.getIndex(Class90.aClass100_2357, (byte) -103);
            GameException.anInt2243 = class21.getIndex(Class7.aClass100_123, (byte) -117);
            Class50.anInt986 = class21.getIndex(Class37.aClass100_650, (byte) -112);
            NodeSub.anInt3091 = class21.getIndex(Class68_Sub13_Sub25.aClass100_3853, (byte) -83);
            Class68_Sub26.anInt3184 = class21.getIndex(Class68_Sub13_Sub29.aClass100_3938, (byte) -122);
            Class51.anInt2261 = class21.getIndex(Class59.aClass100_1103, (byte) -128);
            Class17.anInt280 = class21.getIndex(Character.aClass100_2586, (byte) -104);
            Class68_Sub13_Sub16.anInt3697 = class21.getIndex(Class90.aClass100_2343, (byte) -127);
            NodeCache.anInt1904 = class21.getIndex(Class109.aClass100_1839, (byte) -99);
            Class1_Sub5.anInt2502 = class21.getIndex(Class68_Sub13_Sub9.aClass100_3582, (byte) -92);
            Class68_Sub8.anInt2878 = class21.getIndex(GameCanvas.aClass100_51, (byte) -88);
            GameApplet.anInt16 = class21.getIndex(Class68_Sub13_Sub35.aClass100_4023, (byte) -117);
            Class68_Sub13_Sub38.anInt4084 = class21.getIndex(Class68_Sub13.aClass100_2930, (byte) -106);
            Class68_Sub13_Sub27.anInt3893 = class21.getIndex(Class59.aClass100_1112, (byte) -86);
            ClientScript.anInt4380 = class21.getIndex(Class91.aClass100_1643, (byte) -112);
            Class15.anInt252 = class21.getIndex(Class85.aClass100_1552, (byte) -128);
            class21.getIndex(Class68_Sub13_Sub27.aClass100_3903, (byte) -127);
            if (i != 105)
                method424(95, -83, 14, -46, false);
            Class97.anInt1714 = class21.getIndex(Class22.aClass100_488, (byte) -82);
            Class97.anInt1708 = class21.getIndex(Animation.aClass100_2066, (byte) -106);
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("ff.I(" + i + ',' + (class21 != null ? "{...}" : "null") + ')'));
        }
    }

    public Class35()
    {
        aClass68_Sub28Array628 = new Class68_Sub28[8];
        anInt630 = 0;
        aClass68_Sub28Array635 = new Class68_Sub28[8];
        anInt634 = 0;
        anInt637 = 0;
        aLong638 = 0L;
    }

    static
    {
        anInt605 = 0;
        aClass16_602 = new NodeList();
        anInt626 = 7759444;
        aClass16_623 = new NodeList();
    }
}
