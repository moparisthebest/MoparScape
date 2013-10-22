/* Class1_Sub6_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class NPC extends Character
{
    static int anInt3392;
    static short aShort3393 = 256;
    static long aLong3394 = 0L;
    static int anInt3395;
    static int anInt3396;
    NPCDefinition definition;
    static int anInt3398;
    static int anInt3399;
    static int anInt3400;

    final void render(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, long l)
    {
        anInt3395++;
        if (definition != null)
        {
            Animation class117 = ((((Character) this).animationID != -1 && ((Character) this).anInt2547 == 0) ? Object1.getAnimation(((Character) this).animationID) : null);
            Animation class117_7_ = ((((Character) this).anInt2526 != -1 && ((((Character) this).anInt2526 != ((Character) this).anInt2532) || class117 == null)) ? Object1.getAnimation(((Character) this).anInt2526) : null);
            Model class1_sub3 = (((NPC) this).definition.method1457(((Character) this).anInt2557, class117_7_, (byte) 17, class117, ((Character) this).anInt2524));
            if (class1_sub3 != null)
            {
                ((Character) this).height = class1_sub3.method56();
                NPCDefinition class80 = ((NPC) this).definition;
                if (((NPCDefinition) class80).anIntArray1433 != null)
                    class80 = class80.method1453(-94);
                if (Class68_Sub20_Sub13_Sub2.aBoolean4631 && ((NPCDefinition) class80).aBoolean1450)
                {
                    Model class1_sub3_8_ = (GameException.method1799(((Character) this).y, i, ((Character) this).anInt2584, class1_sub3, (class117_7_ == null ? ((Character) this).anInt2524 : ((Character) this).anInt2557), class117_7_ != null ? class117_7_ : class117, ((NPCDefinition) (((NPC) this).definition)).aByte1455, ((NPCDefinition) (((NPC) this).definition)).aShort1438, ((Character) this).x, ((NPCDefinition) (((NPC) this).definition)).anInt1453,
                            ((NPCDefinition) (((NPC) this).definition)).aByte1472, ((NPCDefinition) (((NPC) this).definition)).aShort1466, 126, ((Character) this).aBoolean2585));
                    class1_sub3_8_.render(0, i_0_, i_1_, i_2_, i_3_, i_4_, i_5_, i_6_, -1L);
                }
                int i_9_ = 0;
                int i_10_ = 0;
                int i_11_ = 0;
                if ((((NPCDefinition) ((NPC) this).definition).aShort1421) != 0 || (((NPCDefinition) ((NPC) this).definition).aShort1425) != 0)
                {
                    int i_12_ = Class62.PRECOMUPTED_COSINE_CACHE[i];
                    int i_13_ = Class62.PRECOMPUTED_SINE_CACHE[i];
                    int i_14_ = (((NPCDefinition) ((NPC) this).definition).aShort1425);
                    int i_15_ = -i_14_ / 2;
                    int i_16_ = (((NPCDefinition) ((NPC) this).definition).aShort1421);
                    int i_17_ = -i_16_ / 2;
                    int i_18_ = i_15_ * i_12_ - i_17_ * i_13_ >> 16;
                    int i_19_ = i_17_ * i_12_ + i_13_ * i_15_ >> 16;
                    int i_20_ = (Player.fixZ(i_19_ + ((Character) this).x, GameSocket.plane, i_18_ + ((Character) this).y));
                    int i_21_ = i_16_ / 2;
                    int i_22_ = -i_14_ / 2;
                    int i_23_ = i_22_ * i_13_ + i_21_ * i_12_ >> 16;
                    int i_24_ = i_12_ * i_22_ - i_21_ * i_13_ >> 16;
                    int i_25_ = (Player.fixZ(i_23_ + ((Character) this).x, GameSocket.plane, ((Character) this).y + i_24_));
                    int i_26_ = -i_16_ / 2;
                    int i_27_ = i_14_ / 2;
                    int i_28_ = i_12_ * i_27_ - i_13_ * i_26_ >> 16;
                    int i_29_ = i_14_ / 2;
                    int i_30_ = i_27_ * i_13_ + i_26_ * i_12_ >> 16;
                    int i_31_ = i_16_ / 2;
                    int i_32_ = i_29_ * i_13_ + i_31_ * i_12_ >> 16;
                    int i_33_ = i_29_ * i_12_ - i_13_ * i_31_ >> 16;
                    int i_34_ = (Player.fixZ(i_30_ + ((Character) this).x, GameSocket.plane, i_28_ + ((Character) this).y));
                    int i_35_ = (Player.fixZ(((Character) this).x + i_32_, GameSocket.plane, ((Character) this).y + i_33_));
                    i_11_ = i_20_ + i_35_;
                    if (i_34_ + i_25_ < i_11_)
                        i_11_ = i_25_ + i_34_;
                    int i_36_ = i_34_ < i_35_ ? i_34_ : i_35_;
                    int i_37_ = i_25_ > i_20_ ? i_20_ : i_25_;
                    int i_38_ = i_35_ <= i_25_ ? i_35_ : i_25_;
                    int i_39_ = i_34_ > i_20_ ? i_20_ : i_34_;
                    if (i_14_ != 0)
                    {
                        i_9_ = 0x7ff & (int) (Math.atan2((double) (i_37_ - i_36_), (double) i_14_) * 325.95);
                        if (i_9_ != 0)
                            class1_sub3.method78(i_9_);
                    }
                    if (i_16_ != 0)
                    {
                        i_10_ = (int) (325.95 * Math.atan2((double) (i_39_ - i_38_), (double) i_16_)) & 0x7ff;
                        if (i_10_ != 0)
                            class1_sub3.method85(i_10_);
                    }
                    i_11_ = (i_11_ >> 1) - ((Character) this).anInt2584;
                    if (i_11_ != 0)
                        class1_sub3.method92(0, i_11_, 0);
                }
                Model class1_sub3_40_ = null;
                if (((Character) this).anInt2554 != -1 && ((Character) this).anInt2580 != -1)
                {
                    Class70 class70 = Class68_Sub20_Sub13.method1160(((Character) this).anInt2554, 1);
                    class1_sub3_40_ = class70.method1337(((Character) this).anInt2580, -10);
                    if (class1_sub3_40_ != null)
                    {
                        class1_sub3_40_.method92(0, -((Character) this).anInt2562, 0);
                        if (((Class70) class70).aBoolean1279)
                        {
                            if (i_9_ != 0)
                                class1_sub3_40_.method78(i_9_);
                            if (i_10_ != 0)
                                class1_sub3_40_.method85(i_10_);
                            if (i_11_ != 0)
                                class1_sub3_40_.method92(0, i_11_, 0);
                        }
                    }
                }
                if (class1_sub3_40_ != null)
                    class1_sub3 = ((SpriteFactory) class1_sub3).method106(class1_sub3_40_);
                if ((((NPCDefinition) ((NPC) this).definition).anInt1453) == 1)
                    ((Model) class1_sub3).aBoolean2445 = true;
                class1_sub3.render(i, i_0_, i_1_, i_2_, i_3_, i_4_, i_5_, i_6_, l);
            }
        }
    }

    final boolean hasDefinition()
    {
        return definition != null;
    }

    static final void method154(byte i, Character class1_sub6)
    {
        try
        {
            if (i <= 116)
                method156(106, 48, 104, -51);
            if (((Character) class1_sub6).anInt2590 == 0)
                ((Character) class1_sub6).turnDirection = 1024;
            ((Character) class1_sub6).anInt2522 = 0;
            anInt3400++;
            if (((Character) class1_sub6).anInt2590 == 1)
                ((Character) class1_sub6).turnDirection = 1536;
            int i_41_ = (((Character) class1_sub6).anInt2561 * 128 + 64 * ((Character) class1_sub6).raw_range);
            if (((Character) class1_sub6).anInt2590 == 2)
                ((Character) class1_sub6).turnDirection = 0;
            int i_42_ = (((Character) class1_sub6).anInt2552 - Class68_Sub3.loopCycle);
            int i_43_ = (128 * ((Character) class1_sub6).anInt2520 + ((Character) class1_sub6).raw_range * 64);
            ((Character) class1_sub6).x += (i_41_ - ((Character) class1_sub6).x) / i_42_;
            if (((Character) class1_sub6).anInt2590 == 3)
                ((Character) class1_sub6).turnDirection = 512;
            ((Character) class1_sub6).y += (i_43_ - ((Character) class1_sub6).y) / i_42_;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, "eh.BA(" + i + ',' + (class1_sub6 != null ? "{...}" : "null") + ')');
        }
    }

    final int method56()
    {
        anInt3396++;
        return ((Character) this).height;
    }

    static final void method155(MutableString class100, boolean bool, int i)
    {
        try
        {
            anInt3398++;
            if (i >= -112)
                aLong3394 = -56L;
            if (!bool)
            {
                try
                {
                    Object5.anApplet_Sub1_1241.getAppletContext().showDocument(class100.toURL(Object5.anApplet_Sub1_1241.getCodeBase()), "_top");
                } catch (Exception exception)
                {
                    /* empty */
                }
            } else
            {
                try
                {
                    Object5.anApplet_Sub1_1241.getAppletContext().showDocument(class100.toURL(Object5.anApplet_Sub1_1241.getCodeBase()), "_blank");
                } catch (Exception exception)
                {
                    /* empty */
                }
            }
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("eh.CA(" + (class100 != null ? "{...}" : "null") + ',' + bool + ',' + i + ')'));
        }
    }

    static final int method156(int i, int i_44_, int i_45_, int i_46_)
    {
        anInt3399++;
        int i_47_ = i_44_ / i;
        int i_48_ = i_44_ & i_46_ + i;
        int i_49_ = i_45_ / i;
        int i_50_ = Class68_Sub19.method1002(i_47_, i_49_, i_46_ + 17);
        int i_51_ = i_45_ & i - 1;
        int i_52_ = Class68_Sub19.method1002(i_47_ + 1, i_49_, 16);
        int i_53_ = Class68_Sub19.method1002(i_47_, i_49_ + 1, 16);
        int i_54_ = Class68_Sub19.method1002(i_47_ + 1, i_49_ + 1, 16);
        int i_55_ = Class78.method1420(i_48_, i_50_, i_52_, (byte) 25, i);
        int i_56_ = Class78.method1420(i_48_, i_53_, i_54_, (byte) 25, i);
        return Class78.method1420(i_51_, i_55_, i_56_, (byte) 25, i);
    }
}
