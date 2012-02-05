/* Class50 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public abstract class Class50 {
    public static int anInt978;
    public static Stream aStream_979;
    public static int anInt980 = -2;
    public static RSString aRSString_981;
    public static int anInt982;
    public static int[] anIntArray983 = new int[128];
    public static Class16 aClass16_984;
    public static RSString aRSString_985;
    public static int anInt986;
    public static int anInt987;
    public static RSString aRSString_988
            = RSString.newRsString("Fallen lassen");
    public static RSString aRSString_989 = RSString.newRsString("::fps ");
    public static int anInt990;
    public static int anInt991;
    public static RSString aRSString_992 = RSString.newRsString("null");

    public static void method527(int i) {
        aRSString_988 = null;
        aClass16_984 = null;
        aRSString_989 = null;
        aRSString_992 = null;
        int i_0_ = 89 / ((i - 55) / 57);
        aStream_979 = null;
        anIntArray983 = null;
        aRSString_985 = null;
        aRSString_981 = null;
    }

    public static void method528(int i, long l) {
        do {
            try {
                anInt987++;
                if (l > 0L) {
                    if (l % 10L != 0L)
                        Class68_Sub13_Sub7.method725(false, l);
                    else {
                        Class68_Sub13_Sub7.method725(false, l + -1L);
                        Class68_Sub13_Sub7.method725(false, 1L);
                    }
                    if (i == -5)
                        break;
                    method530(false, false);
                }
            } catch (RuntimeException runtimeexception) {
                throw Class107.method1652(runtimeexception,
                        "hg.F(" + i + ',' + l + ')');
            }
            break;
        } while (false);
    }

    public abstract void method529(boolean bool);

    public static void method530(boolean bool, boolean bool_1_) {
        anInt978++;
        if (Class68_Sub25.updateSocketCopy != null) {
            try {
                Stream class68_sub14 = new Stream(4);
                class68_sub14.writeByte(!bool ? 3 : 2);
                class68_sub14.method918(0, bool_1_);
                Class68_Sub25.updateSocketCopy
                        .queueBytes(4, class68_sub14.buffer);
            } catch (java.io.IOException ioexception) {
                try {
                    Class68_Sub25.updateSocketCopy.method594(-125);
                } catch (Exception exception) {
                    /* empty */
                }
                Class68_Sub25.updateSocketCopy = null;
                Class68_Sub10.anInt2909++;
            }
        }
    }

    public static void method531(boolean bool, int i,
                                 PacketStream class68_sub14_sub1) {
        anInt991++;
        if (bool != false)
            method527(-39);
        for (; ; ) {
            Class68_Sub9 class68_sub9
                    = (Class68_Sub9) aClass16_984.method293((byte) 76);
            if (class68_sub9 == null)
                break;
            boolean bool_2_ = false;
            for (int i_3_ = 0; i_3_ < class68_sub9.anInt2884; i_3_++) {
                if (class68_sub9.aClass31Array2898[i_3_] != null) {
                    if ((class68_sub9.aClass31Array2898[i_3_].anInt555
                            ^ 0xffffffff)
                            == -3)
                        class68_sub9.anIntArray2888[i_3_] = -5;
                    if (class68_sub9.aClass31Array2898[i_3_].anInt555 == 0)
                        bool_2_ = true;
                }
                if (class68_sub9.aClass31Array2894[i_3_] != null) {
                    if ((class68_sub9.aClass31Array2894[i_3_].anInt555
                            ^ 0xffffffff)
                            == -3)
                        class68_sub9.anIntArray2888[i_3_] = -6;
                    if ((class68_sub9.aClass31Array2894[i_3_].anInt555
                            ^ 0xffffffff)
                            == -1)
                        bool_2_ = true;
                }
            }
            if (bool_2_)
                break;
            class68_sub14_sub1.createFrame(i);
            class68_sub14_sub1.writeByte(0);
            int i_4_ = class68_sub14_sub1.currentOffset;
            class68_sub14_sub1.writeDWord(class68_sub9.anInt2897);
            for (int i_5_ = 0;
                 (i_5_ ^ 0xffffffff) > (class68_sub9.anInt2884 ^ 0xffffffff);
                 i_5_++) {
                if (class68_sub9.anIntArray2888[i_5_] != 0)
                    class68_sub14_sub1
                            .writeByte(class68_sub9.anIntArray2888[i_5_]);
                else {
                    try {
                        int i_6_ = class68_sub9.anIntArray2889[i_5_];
                        if ((i_6_ ^ 0xffffffff) == -1) {
                            Field field
                                    = (Field) (class68_sub9.aClass31Array2898[i_5_]
                                    .playerDefSocket);
                            int i_7_ = field.getInt(null);
                            class68_sub14_sub1.writeByte(0);
                            class68_sub14_sub1.writeDWord(i_7_);
                        } else if ((i_6_ ^ 0xffffffff) == -2) {
                            Field field
                                    = (Field) (class68_sub9.aClass31Array2898[i_5_]
                                    .playerDefSocket);
                            field.setInt(null,
                                    class68_sub9.anIntArray2893[i_5_]);
                            class68_sub14_sub1.writeByte(0);
                        } else if (i_6_ == 2) {
                            Field field
                                    = (Field) (class68_sub9.aClass31Array2898[i_5_]
                                    .playerDefSocket);
                            int i_8_ = field.getModifiers();
                            class68_sub14_sub1.writeByte(0);
                            class68_sub14_sub1.writeDWord(i_8_);
                        }
                        if (i_6_ == 3) {
                            Method method
                                    = (Method) (class68_sub9.aClass31Array2894
                                    [i_5_].playerDefSocket);
                            byte[][] is
                                    = class68_sub9.aByteArrayArrayArray2881[i_5_];
                            Object[] objects = new Object[is.length];
                            for (int i_9_ = 0; is.length > i_9_; i_9_++) {
                                ObjectInputStream objectinputstream
                                        = (new ObjectInputStream
                                        (new ByteArrayInputStream(is[i_9_])));
                                objects[i_9_] = objectinputstream.readObject();
                            }
                            Object object = method.invoke(null, objects);
                            if (object != null) {
                                if (object instanceof Number) {
                                    class68_sub14_sub1.writeByte(1);
                                    class68_sub14_sub1.writeQWord
                                            (!bool, ((Number) object).longValue());
                                } else if (!(object instanceof RSString))
                                    class68_sub14_sub1.writeByte(4);
                                else {
                                    class68_sub14_sub1.writeByte(2);
                                    class68_sub14_sub1.writeString(
                                            ((RSString)
                                                    object));
                                }
                            } else
                                class68_sub14_sub1.writeByte(0);
                        } else if (i_6_ == 4) {
                            Method method
                                    = (Method) (class68_sub9.aClass31Array2894
                                    [i_5_].playerDefSocket);
                            int i_10_ = method.getModifiers();
                            class68_sub14_sub1.writeByte(0);
                            class68_sub14_sub1.writeDWord(i_10_);
                        }
                    } catch (ClassNotFoundException classnotfoundexception) {
                        class68_sub14_sub1.writeByte(-10);
                    } catch (java.io.InvalidClassException invalidclassexception) {
                        class68_sub14_sub1.writeByte(-11);
                    } catch (java.io.StreamCorruptedException streamcorruptedexception) {
                        class68_sub14_sub1.writeByte(-12);
                    } catch (java.io.OptionalDataException optionaldataexception) {
                        class68_sub14_sub1.writeByte(-13);
                    } catch (IllegalAccessException illegalaccessexception) {
                        class68_sub14_sub1.writeByte(-14);
                    } catch (IllegalArgumentException illegalargumentexception) {
                        class68_sub14_sub1.writeByte(-15);
                    } catch (java.lang.reflect.InvocationTargetException invocationtargetexception) {
                        class68_sub14_sub1.writeByte(-16);
                    } catch (SecurityException securityexception) {
                        class68_sub14_sub1.writeByte(-17);
                    } catch (java.io.IOException ioexception) {
                        class68_sub14_sub1.writeByte(-18);
                    } catch (NullPointerException nullpointerexception) {
                        class68_sub14_sub1.writeByte(-19);
                    } catch (Exception exception) {
                        class68_sub14_sub1.writeByte(-20);
                    } catch (Throwable throwable) {
                        class68_sub14_sub1.writeByte(-21);
                    }
                }
            }
            class68_sub14_sub1.method920(i_4_, -116);
            class68_sub14_sub1.method935(class68_sub14_sub1.currentOffset - i_4_,
                    124);
            class68_sub9.method647(-17554);
        }
    }

    public abstract int method532(int i, int i_11_, int i_12_);

    public static int method533(int i, int i_13_, int i_14_) {
        if (i_13_ != -11143)
            return 32;
        Class68_Sub22 class68_sub22
                = ((Class68_Sub22)
                Class68_Sub13_Sub8.aClass113_3564.method1678((long) i_14_,
                        -106));
        anInt982++;
        if (class68_sub22 == null)
            return -1;
        if (i < 0 || i >= class68_sub22.anIntArray3144.length)
            return -1;
        return class68_sub22.anIntArray3144[i];
    }

    static {
        aRSString_981
                = RSString.newRsString(" is already on your friend list)3");
        aRSString_985 = aRSString_981;
        aClass16_984 = new Class16();
    }
}
