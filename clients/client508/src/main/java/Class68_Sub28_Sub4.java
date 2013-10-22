/* Class68_Sub28_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class68_Sub28_Sub4 extends Class68_Sub28 {
    public Class16 aClass16_4572 = new Class16();
    public Class16 aClass16_4573 = new Class16();
    public int anInt4574 = -1;
    public int anInt4575 = 0;

    public int method1224() {
        return 0;
    }

    public Class68_Sub28 method1226() {
        return (Class68_Sub28) aClass16_4572.method293((byte) 76);
    }

    public void method1312(Class68_Sub23 class68_sub23) {
        class68_sub23.method647(-17554);
        class68_sub23.method1204();
        Class68 class68 = aClass16_4573.aClass68_266.aClass68_1229;
        if (class68 == aClass16_4573.aClass68_266)
            anInt4574 = -1;
        else
            anInt4574 = ((Class68_Sub23) class68).anInt3151;
    }

    public void method1313(int i) {
        for (Class68_Sub28 class68_sub28
                     = (Class68_Sub28) aClass16_4572.method293((byte) 76);
             class68_sub28 != null;
             class68_sub28
                     = (Class68_Sub28) aClass16_4572.method290((byte) -110))
            class68_sub28.method1229(i);
    }

    public synchronized void method1314(Class68_Sub28 class68_sub28) {
        class68_sub28.method647(-17554);
    }

    public void method1315(Class68 class68, Class68_Sub23 class68_sub23) {
        for (/**/;
                 (class68 != aClass16_4573.aClass68_266
                         && (((Class68_Sub23) class68).anInt3151
                         <= class68_sub23.anInt3151));
                 class68 = class68.aClass68_1229) {
            /* empty */
        }
        Class75_Sub3.method1399(86, class68, class68_sub23);
        anInt4574 = (((Class68_Sub23) aClass16_4573.aClass68_266.aClass68_1229)
                .anInt3151);
    }

    public synchronized void method1316(Class68_Sub28 class68_sub28) {
        aClass16_4572.method291((byte) 107, class68_sub28);
    }

    public synchronized void method1225(int[] is, int i, int i_0_) {
        do {
            if (anInt4574 < 0) {
                method1318(is, i, i_0_);
                break;
            }
            if (anInt4575 + i_0_ < anInt4574) {
                anInt4575 += i_0_;
                method1318(is, i, i_0_);
                break;
            }
            int i_1_ = anInt4574 - anInt4575;
            method1318(is, i, i_1_);
            i += i_1_;
            i_0_ -= i_1_;
            anInt4575 += i_1_;
            method1317();
            Class68_Sub23 class68_sub23
                    = (Class68_Sub23) aClass16_4573.method293((byte) 76);
            synchronized (class68_sub23) {
                int i_2_ = class68_sub23.method1203(this);
                if (i_2_ < 0) {
                    class68_sub23.anInt3151 = 0;
                    method1312(class68_sub23);
                } else {
                    class68_sub23.anInt3151 = i_2_;
                    method1315(class68_sub23.aClass68_1229, class68_sub23);
                }
            }
        } while (i_0_ != 0);
    }

    public synchronized void method1229(int i) {
        do {
            if (anInt4574 < 0) {
                method1313(i);
                break;
            }
            if (anInt4575 + i < anInt4574) {
                anInt4575 += i;
                method1313(i);
                break;
            }
            int i_3_ = anInt4574 - anInt4575;
            method1313(i_3_);
            i -= i_3_;
            anInt4575 += i_3_;
            method1317();
            Class68_Sub23 class68_sub23
                    = (Class68_Sub23) aClass16_4573.method293((byte) 76);
            synchronized (class68_sub23) {
                int i_4_ = class68_sub23.method1203(this);
                if (i_4_ < 0) {
                    class68_sub23.anInt3151 = 0;
                    method1312(class68_sub23);
                } else {
                    class68_sub23.anInt3151 = i_4_;
                    method1315(class68_sub23.aClass68_1229, class68_sub23);
                }
            }
        } while (i != 0);
    }

    public void method1317() {
        if (anInt4575 > 0) {
            for (Class68_Sub23 class68_sub23
                         = (Class68_Sub23) aClass16_4573.method293((byte) 76);
                 class68_sub23 != null;
                 class68_sub23
                         = (Class68_Sub23) aClass16_4573.method290((byte) -127))
                class68_sub23.anInt3151 -= anInt4575;
            anInt4574 -= anInt4575;
            anInt4575 = 0;
        }
    }

    public Class68_Sub28 method1228() {
        return (Class68_Sub28) aClass16_4572.method290((byte) -110);
    }

    public void method1318(int[] is, int i, int i_5_) {
        for (Class68_Sub28 class68_sub28
                     = (Class68_Sub28) aClass16_4572.method293((byte) 76);
             class68_sub28 != null;
             class68_sub28
                     = (Class68_Sub28) aClass16_4572.method290((byte) -116))
            class68_sub28.method1223(is, i, i_5_);
    }
}
