/* Class12 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class12
{
    private static MutableString aClass100_197;
    static MutableString aClass100_198;
    static volatile int mouseClickX;
    static MutableString[] aClass100Array200;
    static int[] anIntArray201 = { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };
    static int anInt202;
    private static MutableString aClass100_203;
    private static MutableString aClass100_204;
    private static MutableString aClass100_205;
    private static MutableString aClass100_206;
    private static MutableString aClass100_207;
    static int anInt208;
    private static MutableString aClass100_209;
    static int anInt210;
    static MRUNodes aClass98_211;
    static byte[][][] aByteArrayArrayArray212;

    public static void method237(int i)
    {
        aClass100_203 = null;
        aClass100_197 = null;
        aClass98_211 = null;
        aClass100_204 = null;
        aClass100_206 = null;
        aClass100_209 = null;
        aClass100Array200 = null;
        aByteArrayArrayArray212 = null;
        if (i != -5)
            method239((byte) 49, null, null);
        aClass100_207 = null;
        aClass100_205 = null;
        aClass100_198 = null;
        anIntArray201 = null;
    }

    static final void method238(Signlink class55, Stream class68_sub14, int i, byte i_0_)
    {
        try
        {
            int i_1_ = -54 % ((-40 - i_0_) / 34);
            anInt210++;
            Class68_Sub9 class68_sub9 = new Class68_Sub9();
            ((Class68_Sub9) class68_sub9).anInt2886 = class68_sub14.readUByte();
            ((Class68_Sub9) class68_sub9).anInt2899 = class68_sub14.readInteger();
            ((Class68_Sub9) class68_sub9).anIntArray2895 = new int[((Class68_Sub9) class68_sub9).anInt2886];
            ((Class68_Sub9) class68_sub9).anIntArray2891 = new int[((Class68_Sub9) class68_sub9).anInt2886];
            ((Class68_Sub9) class68_sub9).aByteArrayArrayArray2883 = new byte[((Class68_Sub9) class68_sub9).anInt2886][][];
            ((Class68_Sub9) class68_sub9).aClass31Array2896 = new Class31[((Class68_Sub9) class68_sub9).anInt2886];
            ((Class68_Sub9) class68_sub9).anIntArray2890 = new int[((Class68_Sub9) class68_sub9).anInt2886];
            ((Class68_Sub9) class68_sub9).aClass31Array2900 = new Class31[((Class68_Sub9) class68_sub9).anInt2886];
            for (int i_2_ = 0; i_2_ < ((Class68_Sub9) class68_sub9).anInt2886; i_2_++)
            {
                try
                {
                    int i_3_ = class68_sub14.readUByte();
                    if (i_3_ == 0 || i_3_ == 1 || i_3_ == 2)
                    {
                        String string = new String(class68_sub14.readString().getData());
                        String string_4_ = new String(class68_sub14.readString().getData());
                        int i_5_ = 0;
                        if (i_3_ == 1)
                            i_5_ = class68_sub14.readInteger();
                        ((Class68_Sub9) class68_sub9).anIntArray2891[i_2_] = i_3_;
                        ((Class68_Sub9) class68_sub9).anIntArray2895[i_2_] = i_5_;
                        ((Class68_Sub9) class68_sub9).aClass31Array2900[i_2_] = class55.method561(30810, string_4_, Class68_Sub13_Sub7.method729(string, -1));
                    } else if (i_3_ == 3 || i_3_ == 4)
                    {
                        String string = new String(class68_sub14.readString().getData());
                        String string_6_ = new String(class68_sub14.readString().getData());
                        int i_7_ = class68_sub14.readUByte();
                        String[] strings = new String[i_7_];
                        for (int i_8_ = 0; i_7_ > i_8_; i_8_++)
                            strings[i_8_] = new String(class68_sub14.readString().getData());
                        byte[][] is = new byte[i_7_][];
                        if (i_3_ == 3)
                        {
                            for (int i_9_ = 0; i_9_ < i_7_; i_9_++)
                            {
                                int i_10_ = class68_sub14.readInteger();
                                is[i_9_] = new byte[i_10_];
                                class68_sub14.readBytes(0, i_10_, is[i_9_]);
                            }
                        }
                        Class[] var_classes = new Class[i_7_];
                        ((Class68_Sub9) class68_sub9).anIntArray2891[i_2_] = i_3_;
                        for (int i_11_ = 0; i_11_ < i_7_; i_11_++)
                            var_classes[i_11_] = Class68_Sub13_Sub7.method729(strings[i_11_], -1);
                        ((Class68_Sub9) class68_sub9).aClass31Array2896[i_2_] = class55.method564(var_classes, 0, string_6_, Class68_Sub13_Sub7.method729(string, -1));
                        ((Class68_Sub9) class68_sub9).aByteArrayArrayArray2883[i_2_] = is;
                    }
                } catch (ClassNotFoundException classnotfoundexception)
                {
                    ((Class68_Sub9) class68_sub9).anIntArray2890[i_2_] = -1;
                } catch (SecurityException securityexception)
                {
                    ((Class68_Sub9) class68_sub9).anIntArray2890[i_2_] = -2;
                } catch (NullPointerException nullpointerexception)
                {
                    ((Class68_Sub9) class68_sub9).anIntArray2890[i_2_] = -3;
                } catch (Exception exception)
                {
                    ((Class68_Sub9) class68_sub9).anIntArray2890[i_2_] = -4;
                } catch (Throwable throwable)
                {
                    ((Class68_Sub9) class68_sub9).anIntArray2890[i_2_] = -5;
                }
            }
            Class50.aClass16_984.pushFront(class68_sub9);
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("bg.B(" + (class55 != null ? "{...}" : "null") + ',' + (class68_sub14 != null ? "{...}" : "null") + ',' + i + ',' + i_0_ + ')'));
        }
    }

    static final void method239(byte i, NodeSub class68_sub20, NodeSub class68_sub20_12_)
    {
        try
        {
            anInt202++;
            if (((NodeSub) class68_sub20).nextSub != null)
                class68_sub20.unlinkSub();
            ((NodeSub) class68_sub20).nextSub = class68_sub20_12_;
            ((NodeSub) class68_sub20).prevSub = ((NodeSub) class68_sub20_12_).prevSub;
            if (i == -74)
            {
                ((NodeSub) (((NodeSub) class68_sub20).nextSub)).prevSub = class68_sub20;
                ((NodeSub) (((NodeSub) class68_sub20).prevSub)).nextSub = class68_sub20;
            }
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("bg.A(" + i + ',' + (class68_sub20 != null ? "{...}" : "null") + ',' + (class68_sub20_12_ != null ? "{...}" : "null") + ')'));
        }
    }

    static
    {
        aClass100_198 = Class112.makeMutableString(43, "rot:");
        mouseClickX = 0;
        aClass100_205 = Class112.makeMutableString(43, "Sat");
        aClass100_197 = Class112.makeMutableString(43, "Thu");
        aClass100_207 = Class112.makeMutableString(43, "Fri");
        aClass100_206 = Class112.makeMutableString(43, "Tue");
        anInt208 = 0;
        aClass100_203 = Class112.makeMutableString(43, "Wed");
        aClass100_209 = Class112.makeMutableString(43, "Sun");
        aClass100_204 = Class112.makeMutableString(43, "Mon");
        aClass100Array200 = new MutableString[] { aClass100_209, aClass100_204, aClass100_206, aClass100_203, aClass100_197, aClass100_207, aClass100_205 };
        aClass98_211 = new MRUNodes(50);
    }
}
