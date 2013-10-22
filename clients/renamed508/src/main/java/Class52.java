/* Class52 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

final class Class52
{
    private static MutableString aClass100_993 = Class112.makeMutableString(43, "Your ignore list is full)3 Max of 100 users)3");
    static int anInt994;
    private int anInt995;
    private byte[] aByteArray996 = new byte[4];
    private int anInt997;
    static boolean aBoolean998;
    static int anInt999;
    static MRUNodes aClass98_1000;
    private Class31 aClass31_1001;
    static MutableString aClass100_1002 = Class112.makeMutableString(43, " )2>");
    private byte[] aByteArray1003;
    static Class92[] aClass92Array1004;
    static MutableString aClass100_1005 = aClass100_993;
    static int anInt1006 = 0;
    private long aLong1007;
    private int anInt1008;
    static MutableString aClass100_1009 = Class112.makeMutableString(43, ")4a=");
    static int anInt1010;
    static Class21_Sub1 aClass21_Sub1_1011;
    private DataInputStream aDataInputStream1012;
    static int anInt1013;
    static byte[][][] aByteArrayArrayArray1014;

    final byte[] method541(byte i) throws IOException
    {
        anInt999++;
        if (Class36.method438(17161) > aLong1007)
            throw new IOException("fdt");
        if (i <= 15)
            return null;
        do
        {
            if (anInt997 == 0)
            {
                if (aClass31_1001.anInt555 != 2)
                {
                    if (aClass31_1001.anInt555 != 1)
                        break;
                    anInt997 = 1;
                    aDataInputStream1012 = (DataInputStream) aClass31_1001.playerDefSocket;
                    if (client.anInt2387 == 0)
                        break;
                }
                throw new IOException("fds");
            }
        } while (false);
        if (anInt997 == 1)
        {
            int i_0_ = aDataInputStream1012.available();
            if (i_0_ > 0)
            {
                if (i_0_ + anInt995 > 4)
                    i_0_ = 4 - anInt995;
                anInt995 += aDataInputStream1012.read(aByteArray996, anInt995, i_0_);
                if (anInt995 == 4)
                {
                    int i_1_ = new Stream(aByteArray996).readInteger();
                    anInt997 = 2;
                    aByteArray1003 = new byte[i_1_];
                }
            }
        }
        if (anInt997 == 2)
        {
            int i_2_ = aDataInputStream1012.available();
            if (i_2_ > 0)
            {
                if (i_2_ + anInt1008 > aByteArray1003.length)
                    i_2_ = aByteArray1003.length - anInt1008;
                anInt1008 += aDataInputStream1012.read(aByteArray1003, anInt1008, i_2_);
                if (anInt1008 == aByteArray1003.length)
                    return aByteArray1003;
            }
        }
        return null;
    }

    static final boolean method542(int i, boolean bool)
    {
        if (bool != true)
            return true;
        anInt994++;
        if ((0x11196c85 & i) >> 28 == 0)
            return false;
        return true;
    }

    static final void method543(int i, int i_3_, NPC class1_sub6_sub1, ObjectDefinition class116, int i_4_, int i_5_, int i_6_, Player class1_sub6_sub2)
    {
        do
        {
            try
            {
                if (i != 19395)
                    method544((byte) 123);
                Class68_Sub18 class68_sub18 = new Class68_Sub18();
                ((Class68_Sub18) class68_sub18).anInt3066 = 128 * i_5_;
                ((Class68_Sub18) class68_sub18).anInt3041 = i_6_;
                anInt1010++;
                ((Class68_Sub18) class68_sub18).anInt3053 = i_3_ * 128;
                if (class116 != null)
                {
                    ((Class68_Sub18) class68_sub18).anIntArray3055 = ((ObjectDefinition) class116).anIntArray1997;
                    ((Class68_Sub18) class68_sub18).anInt3044 = ((ObjectDefinition) class116).anInt1984;
                    ((Class68_Sub18) class68_sub18).anInt3059 = 128 * ((ObjectDefinition) class116).anInt1977;
                    ((Class68_Sub18) class68_sub18).anInt3061 = ((ObjectDefinition) class116).anInt2002;
                    int i_7_ = ((ObjectDefinition) class116).anInt1989;
                    ((Class68_Sub18) class68_sub18).aClass116_3047 = class116;
                    ((Class68_Sub18) class68_sub18).anInt3046 = ((ObjectDefinition) class116).anInt1966;
                    int i_8_ = ((ObjectDefinition) class116).anInt1990;
                    if (i_4_ == 1 || i_4_ == 3)
                    {
                        i_8_ = ((ObjectDefinition) class116).anInt1989;
                        i_7_ = ((ObjectDefinition) class116).anInt1990;
                    }
                    ((Class68_Sub18) class68_sub18).anInt3064 = 128 * (i_8_ + i_5_);
                    ((Class68_Sub18) class68_sub18).anInt3040 = (i_7_ + i_3_) * 128;
                    if (((ObjectDefinition) class116).childrenIDs != null)
                    {
                        ((Class68_Sub18) class68_sub18).aBoolean3063 = true;
                        class68_sub18.method993(i + 12111);
                    }
                    if (((Class68_Sub18) class68_sub18).anIntArray3055 != null)
                        ((Class68_Sub18) class68_sub18).anInt3056 = (((Class68_Sub18) class68_sub18).anInt3046 + (int) (Math.random() * (double) (((Class68_Sub18) class68_sub18).anInt3061 - (((Class68_Sub18) class68_sub18).anInt3046))));
                    Class8.aClass16_140.pushFront(class68_sub18);
                } else if (class1_sub6_sub1 != null)
                {
                    NPCDefinition class80 = ((NPC) class1_sub6_sub1).definition;
                    ((Class68_Sub18) class68_sub18).aClass1_Sub6_Sub1_3062 = class1_sub6_sub1;
                    if (((NPCDefinition) class80).anIntArray1433 != null)
                    {
                        ((Class68_Sub18) class68_sub18).aBoolean3063 = true;
                        class80 = class80.method1453(i ^ ~0x4b9e);
                    }
                    if (class80 != null)
                    {
                        ((Class68_Sub18) class68_sub18).anInt3064 = (i_5_ + ((NPCDefinition) class80).anInt1453) * 128;
                        ((Class68_Sub18) class68_sub18).anInt3040 = 128 * (i_3_ + ((NPCDefinition) class80).anInt1453);
                        ((Class68_Sub18) class68_sub18).anInt3044 = Class72.method1349(class1_sub6_sub1, false);
                        ((Class68_Sub18) class68_sub18).anInt3059 = 128 * ((NPCDefinition) class80).anInt1465;
                    }
                    Class51.aClass16_2253.pushFront(class68_sub18);
                } else
                {
                    if (class1_sub6_sub2 == null)
                        break;
                    ((Class68_Sub18) class68_sub18).anInt3040 = 128 * (((Character) class1_sub6_sub2).raw_range + i_3_);
                    ((Class68_Sub18) class68_sub18).anInt3064 = ((((Character) class1_sub6_sub2).raw_range + i_5_) * 128);
                    ((Class68_Sub18) class68_sub18).aClass1_Sub6_Sub2_3052 = class1_sub6_sub2;
                    ((Class68_Sub18) class68_sub18).anInt3044 = GameApplet.method32(class1_sub6_sub2, i ^ ~0x51e6);
                    ((Class68_Sub18) class68_sub18).anInt3059 = (128 * ((Player) class1_sub6_sub2).anInt3429);
                    Class1_Sub5.aClass113_2511.method1683((byte) 119, class68_sub18, ((Player) class1_sub6_sub2).name.method1615(10908));
                }
            } catch (RuntimeException runtimeexception)
            {
                throw Class107.getException(runtimeexception, ("id.A(" + i + ',' + i_3_ + ',' + (class1_sub6_sub1 != null ? "{...}" : "null") + ',' + (class116 != null ? "{...}" : "null") + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ',' + (class1_sub6_sub2 != null ? "{...}" : "null") + ')'));
            }
            break;
        } while (false);
    }

    Class52(Signlink class55, URL url)
    {
        try
        {
            aClass31_1001 = class55.method562(url, 0);
            anInt997 = 0;
            aLong1007 = Class36.method438(17161) + 30000L;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("id.<init>(" + (class55 != null ? "{...}" : "null") + ',' + (url != null ? "{...}" : "null") + ')'));
        }
    }

    public static void method544(byte i)
    {
        aClass21_Sub1_1011 = null;
        aClass100_1002 = null;
        aClass100_993 = null;
        aClass98_1000 = null;
        aClass92Array1004 = null;
        aClass100_1005 = null;
        int i_9_ = 59 % ((-19 - i) / 34);
        aByteArrayArrayArray1014 = null;
        aClass100_1009 = null;
    }

    static
    {
        aClass98_1000 = new MRUNodes(500);
        anInt1013 = 0;
    }
}
