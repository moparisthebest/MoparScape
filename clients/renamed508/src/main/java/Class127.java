/* Class127 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class127
{
    static int anInt2204;
    static int anInt2205;
    static int anInt2206;
    static NodeList aClass16_2207 = new NodeList();
    private static MutableString aClass100_2208;
    static MutableString[] aClass100Array2209;
    static MutableString aClass100_2210;
    static int anInt2211;
    static int anInt2212;
    static MutableString aClass100_2213 = Class112.makeMutableString(43, ":trade:");

    static final void method1783(byte i)
    {
        anInt2212++;
        NodeCache.method1688(Class35.aClass45_606, -127);
        Class68_Sub26.anInt3202++;
        if (!Class124.aBoolean2161 || !Class68_Sub18.aBoolean3060)
        {
            if (Class68_Sub26.anInt3202 > 1)
                Class35.aClass45_606 = null;
        } else
        {
            int i_0_ = Class96.anInt1697;
            i_0_ -= Class68_Sub13_Sub25.anInt3855;
            if (Class68_Sub13_Sub37.anInt4075 > i_0_)
                i_0_ = Class68_Sub13_Sub37.anInt4075;
            int i_1_ = Class13.anInt223;
            i_1_ -= Class58.anInt1087;
            if (NodeCache.anInt1905 > i_1_)
                i_1_ = NodeCache.anInt1905;
            if (((Widget) Class35.aClass45_606).anInt892 + i_0_ > (Class68_Sub13_Sub37.anInt4075 + (((Widget) Class68_Sub13_Sub26_Sub1.aClass45_4609).anInt892)))
                i_0_ = ((((Widget) Class68_Sub13_Sub26_Sub1.aClass45_4609).anInt892) + (Class68_Sub13_Sub37.anInt4075 - ((Widget) Class35.aClass45_606).anInt892));
            if (i > -112)
                aClass100_2213 = null;
            if ((NodeCache.anInt1905 + ((Widget) Class68_Sub13_Sub26_Sub1.aClass45_4609).anInt873) < i_1_ + ((Widget) Class35.aClass45_606).anInt873)
                i_1_ = ((((Widget) Class68_Sub13_Sub26_Sub1.aClass45_4609).anInt873) + NodeCache.anInt1905 - ((Widget) Class35.aClass45_606).anInt873);
            int i_2_ = i_0_ - Class68_Sub28_Sub2.anInt4547;
            int i_3_ = i_1_ - Class22.anInt481;
            int i_4_ = ((Widget) Class35.aClass45_606).anInt870;
            if ((((Widget) Class35.aClass45_606).anInt909 < Class68_Sub26.anInt3202) && (i_4_ < i_2_ || i_2_ < -i_4_ || i_3_ > i_4_ || -i_4_ > i_3_))
                Class15.aBoolean247 = true;
            int i_5_ = (((Widget) Class68_Sub13_Sub26_Sub1.aClass45_4609).anInt847 + i_0_ - Class68_Sub13_Sub37.anInt4075);
            int i_6_ = (((Widget) Class68_Sub13_Sub26_Sub1.aClass45_4609).anInt818 + (i_1_ - NodeCache.anInt1905));
            if (((Widget) Class35.aClass45_606).anObjectArray807 != null && Class15.aBoolean247)
            {
                ScriptParameters class68_sub29 = new ScriptParameters();
                ((ScriptParameters) class68_sub29).anInt3234 = i_6_;
                ((ScriptParameters) class68_sub29).parameters = ((Widget) Class35.aClass45_606).anObjectArray807;
                ((ScriptParameters) class68_sub29).anInt3242 = i_5_;
                ((ScriptParameters) class68_sub29).aClass45_3241 = Class35.aClass45_606;
                Class68_Sub13_Sub16.method776(class68_sub29, 16);
            }
            if (Class68_Sub20_Sub12.anInt4354 == 0)
            {
                if (Class15.aBoolean247)
                {
                    if (((Widget) Class35.aClass45_606).anObjectArray778 != null)
                    {
                        ScriptParameters class68_sub29 = new ScriptParameters();
                        ((ScriptParameters) class68_sub29).aClass45_3246 = Animable.aClass45_61;
                        ((ScriptParameters) class68_sub29).anInt3234 = i_6_;
                        ((ScriptParameters) class68_sub29).parameters = (((Widget) Class35.aClass45_606).anObjectArray778);
                        ((ScriptParameters) class68_sub29).aClass45_3241 = Class35.aClass45_606;
                        ((ScriptParameters) class68_sub29).anInt3242 = i_5_;
                        Class68_Sub13_Sub16.method776(class68_sub29, 16);
                    }
                    if (Animable.aClass45_61 != null && client.method36(Class35.aClass45_606) != null)
                    {
                        Class21.connectionVector.startPacket(179);
                        ObjectDefinition.anInt1961++;
                        Class21.connectionVector.writeDWord(((Widget) Animable.aClass45_61).anInt792);
                        Class21.connectionVector.writeDWord(((Widget) Class35.aClass45_606).anInt792);
                        Class21.connectionVector.writeShort(((Widget) Class35.aClass45_606).anInt867);
                        Class21.connectionVector.writeLEShort(((Widget) Animable.aClass45_61).anInt867);
                    }
                } else if ((Class14.anInt228 == 1 || GameApplet.method17((byte) -126, (Class68_Sub13_Sub21.menuOptionsCount) - 1)) && Class68_Sub13_Sub21.menuOptionsCount > 2)
                    Class68_Sub13_Sub18.method787((byte) -25);
                else if (Class68_Sub13_Sub21.menuOptionsCount > 0)
                    Class68_Sub13_Sub39.method901((byte) 49);
                Class35.aClass45_606 = null;
            }
        }
    }

    static final boolean method1784(int i)
    {
        anInt2204++;
        if (i != Class68_Sub13_Sub10.anInt3599)
        {
            try
            {
                Class103.aClass100_1773.method1610((Class75_Sub1_Sub1.signlink.gameApplet), (byte) -123);
                return true;
            } catch (Throwable throwable)
            {
                /* empty */
            }
        }
        return false;
    }

    public static void method1785(int i)
    {
        aClass100_2210 = null;
        aClass100Array2209 = null;
        if (i != 0)
            aClass16_2207 = null;
        aClass16_2207 = null;
        aClass100_2213 = null;
        aClass100_2208 = null;
    }

    static final Class68_Sub20_Sub10[] method1786(int i, int i_7_, int i_8_, Class21 class21)
    {
        try
        {
            anInt2206++;
            if (i != 0)
                method1784(-51);
            if (!Class68_Sub13_Sub36.method880(-29381, i_7_, class21, i_8_))
                return null;
            return Class68_Sub13_Sub38.method897((byte) 15);
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("wg.E(" + i + ',' + i_7_ + ',' + i_8_ + ',' + (class21 != null ? "{...}" : "null") + ')'));
        }
    }

    static final void method1787(int i, int i_9_, int i_10_, int i_11_, byte i_12_)
    {
        int i_13_ = 0;
        if (i_12_ >= -25)
            method1785(-89);
        for (/**/; i_13_ < Class56.anInt1061; i_13_++)
        {
            if (i < (Class105.anIntArray1797[i_13_] + ItemDefinition.anIntArray376[i_13_]) && Class105.anIntArray1797[i_13_] < i_10_ + i && (Player.anIntArray3432[i_13_] + Class71.anIntArray1294[i_13_]) > i_9_ && Class71.anIntArray1294[i_13_] < i_9_ + i_11_)
                Class121.aBooleanArray2111[i_13_] = true;
        }
        anInt2205++;
    }

    static
    {
        aClass100Array2209 = new MutableString[8];
        anInt2211 = 0;
        aClass100_2208 = Class112.makeMutableString(43, " has logged in)3");
        aClass100_2210 = aClass100_2208;
    }
}
