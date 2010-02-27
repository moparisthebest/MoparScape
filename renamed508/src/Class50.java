/* Class50 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

abstract class Class50
{
    static int anInt978;
    static Stream aClass68_Sub14_979;
    static int anInt980 = -2;
    private static MutableString aClass100_981;
    static int anInt982;
    static int[] anIntArray983 = new int[128];
    static NodeList aClass16_984;
    static MutableString aClass100_985;
    static int anInt986;
    static int anInt987;
    static MutableString aClass100_988 = Class112.makeMutableString(43, "Fallen lassen");
    static MutableString aClass100_989 = Class112.makeMutableString(43, "::fps ");
    static int anInt990;
    static int anInt991;
    static MutableString aClass100_992 = Class112.makeMutableString(43, "null");

    public static void method527(int i)
    {
        aClass100_988 = null;
        aClass16_984 = null;
        aClass100_989 = null;
        aClass100_992 = null;
        int i_0_ = 89 / ((i - 55) / 57);
        aClass68_Sub14_979 = null;
        anIntArray983 = null;
        aClass100_985 = null;
        aClass100_981 = null;
    }

    static final void method528(int i, long l)
    {
        anInt987++;
        if (l > 0L)
        {
            if (l % 10L != 0L)
                Class68_Sub13_Sub7.method725(false, l);
            else
            {
                Class68_Sub13_Sub7.method725(false, l - 1L);
                Class68_Sub13_Sub7.method725(false, 1L);
            }
            if (i != -5)
                method530(false, false);
        }
    }

    abstract void method529(boolean bool);

    static final void method530(boolean bool, boolean bool_1_)
    {
        anInt978++;
        if (Class68_Sub25.aClass61_3169 != null)
        {
            try
            {
                Stream class68_sub14 = new Stream(4);
                class68_sub14.writeByte(!bool ? 3 : 2);
                class68_sub14.writeTInteger(0);
                Class68_Sub25.aClass61_3169.queueBytes(0, (byte) 116, 4, (((Stream) class68_sub14).buffer));
            } catch (java.io.IOException ioexception)
            {
                try
                {
                    Class68_Sub25.aClass61_3169.method594(-125);
                } catch (Exception exception)
                {
                    /* empty */
                }
                Class68_Sub25.aClass61_3169 = null;
                Class68_Sub10.anInt2911++;
            }
        }
    }

    static final void method531(boolean bool, int i, CipheredByteVector class68_sub14_sub1)
    {
        try
        {
            anInt991++;
            if (bool != false)
                method527(-39);
            for (;;)
            {
                Class68_Sub9 class68_sub9 = (Class68_Sub9) aClass16_984.method293((byte) 76);
                if (class68_sub9 == null)
                    break;
                boolean bool_2_ = false;
                for (int i_3_ = 0; i_3_ < ((Class68_Sub9) class68_sub9).anInt2886; i_3_++)
                {
                    if (((Class68_Sub9) class68_sub9).aClass31Array2900[i_3_] != null)
                    {
                        if ((((Class68_Sub9) class68_sub9).aClass31Array2900[i_3_].anInt555) == 2)
                            ((Class68_Sub9) class68_sub9).anIntArray2890[i_3_] = -5;
                        if ((((Class68_Sub9) class68_sub9).aClass31Array2900[i_3_].anInt555) == 0)
                            bool_2_ = true;
                    }
                    if (((Class68_Sub9) class68_sub9).aClass31Array2896[i_3_] != null)
                    {
                        if ((((Class68_Sub9) class68_sub9).aClass31Array2896[i_3_].anInt555) == 2)
                            ((Class68_Sub9) class68_sub9).anIntArray2890[i_3_] = -6;
                        if ((((Class68_Sub9) class68_sub9).aClass31Array2896[i_3_].anInt555) == 0)
                            bool_2_ = true;
                    }
                }
                if (bool_2_)
                    break;
                class68_sub14_sub1.startPacket(i);
                class68_sub14_sub1.writeByte(0);
                int i_4_ = ((Stream) class68_sub14_sub1).position;
                class68_sub14_sub1.writeDWord((((Class68_Sub9) class68_sub9).anInt2899));
                for (int i_5_ = 0; i_5_ < ((Class68_Sub9) class68_sub9).anInt2886; i_5_++)
                {
                    if (((Class68_Sub9) class68_sub9).anIntArray2890[i_5_] != 0)
                        class68_sub14_sub1.writeByte((((Class68_Sub9) class68_sub9).anIntArray2890[i_5_]));
                    else
                    {
                        try
                        {
                            int i_6_ = (((Class68_Sub9) class68_sub9).anIntArray2891[i_5_]);
                            if (i_6_ == 0)
                            {
                                Field field = ((Field) (((Class68_Sub9) class68_sub9).aClass31Array2900[i_5_].playerDefSocket));
                                int i_7_ = field.getInt(null);
                                class68_sub14_sub1.writeByte(0);
                                class68_sub14_sub1.writeDWord(i_7_);
                            } else if (i_6_ == 1)
                            {
                                Field field = ((Field) (((Class68_Sub9) class68_sub9).aClass31Array2900[i_5_].playerDefSocket));
                                field.setInt(null, (((Class68_Sub9) class68_sub9).anIntArray2895[i_5_]));
                                class68_sub14_sub1.writeByte(0);
                            } else if (i_6_ == 2)
                            {
                                Field field = ((Field) (((Class68_Sub9) class68_sub9).aClass31Array2900[i_5_].playerDefSocket));
                                int i_8_ = field.getModifiers();
                                class68_sub14_sub1.writeByte(0);
                                class68_sub14_sub1.writeDWord(i_8_);
                            }
                            if (i_6_ == 3)
                            {
                                Method method = ((Method) (((Class68_Sub9) class68_sub9).aClass31Array2896[i_5_].playerDefSocket));
                                byte[][] is = (((Class68_Sub9) class68_sub9).aByteArrayArrayArray2883[i_5_]);
                                Object[] objects = new Object[is.length];
                                for (int i_9_ = 0; is.length > i_9_; i_9_++)
                                {
                                    ObjectInputStream objectinputstream = (new ObjectInputStream(new ByteArrayInputStream(is[i_9_])));
                                    objects[i_9_] = objectinputstream.readObject();
                                }
                                Object object = method.invoke(null, objects);
                                if (object != null)
                                {
                                    if (object instanceof Number)
                                    {
                                        class68_sub14_sub1.writeByte(1);
                                        class68_sub14_sub1.writeLong(((Number) object).longValue());
                                    } else if (!(object instanceof MutableString))
                                        class68_sub14_sub1.writeByte(4);
                                    else
                                    {
                                        class68_sub14_sub1.writeByte(2);
                                        class68_sub14_sub1.writeString((MutableString) object);
                                    }
                                } else
                                    class68_sub14_sub1.writeByte(0);
                            } else if (i_6_ == 4)
                            {
                                Method method = ((Method) (((Class68_Sub9) class68_sub9).aClass31Array2896[i_5_].playerDefSocket));
                                int i_10_ = method.getModifiers();
                                class68_sub14_sub1.writeByte(0);
                                class68_sub14_sub1.writeDWord(i_10_);
                            }
                        } catch (ClassNotFoundException classnotfoundexception)
                        {
                            class68_sub14_sub1.writeByte(-10);
                        } catch (java.io.InvalidClassException invalidclassexception)
                        {
                            class68_sub14_sub1.writeByte(-11);
                        } catch (java.io.StreamCorruptedException streamcorruptedexception)
                        {
                            class68_sub14_sub1.writeByte(-12);
                        } catch (java.io.OptionalDataException optionaldataexception)
                        {
                            class68_sub14_sub1.writeByte(-13);
                        } catch (IllegalAccessException illegalaccessexception)
                        {
                            class68_sub14_sub1.writeByte(-14);
                        } catch (IllegalArgumentException illegalargumentexception)
                        {
                            class68_sub14_sub1.writeByte(-15);
                        } catch (java.lang.reflect.InvocationTargetException invocationtargetexception)
                        {
                            class68_sub14_sub1.writeByte(-16);
                        } catch (SecurityException securityexception)
                        {
                            class68_sub14_sub1.writeByte(-17);
                        } catch (java.io.IOException ioexception)
                        {
                            class68_sub14_sub1.writeByte(-18);
                        } catch (NullPointerException nullpointerexception)
                        {
                            class68_sub14_sub1.writeByte(-19);
                        } catch (Exception exception)
                        {
                            class68_sub14_sub1.writeByte(-20);
                        } catch (Throwable throwable)
                        {
                            class68_sub14_sub1.writeByte(-21);
                        }
                    }
                }
                class68_sub14_sub1.method920(i_4_, -116);
                class68_sub14_sub1.writeSizeByte((((Stream) class68_sub14_sub1).position - i_4_));
                class68_sub9.unlink();
            }
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("hg.H(" + bool + ',' + i + ',' + (class68_sub14_sub1 != null ? "{...}" : "null") + ')'));
        }
    }

    public Class50()
    {
        /* empty */
    }

    abstract int method532(int i, int i_11_, int i_12_);

    static final int method533(int i, int i_13_, int i_14_)
    {
        if (i_13_ != -11143)
            return 32;
        Class68_Sub22 class68_sub22 = ((Class68_Sub22) Class68_Sub13_Sub8.aClass113_3566.method1684((long) i_14_, -106));
        anInt982++;
        if (class68_sub22 == null)
            return -1;
        if (i < 0 || i >= ((Class68_Sub22) class68_sub22).anIntArray3146.length)
            return -1;
        return ((Class68_Sub22) class68_sub22).anIntArray3146[i];
    }

    static
    {
        aClass100_981 = Class112.makeMutableString(43, " is already on your friend list)3");
        aClass100_985 = aClass100_981;
        aClass16_984 = new NodeList();
    }
}
