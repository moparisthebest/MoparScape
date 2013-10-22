/* Class51 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Date;

final class Class51 implements Interface2
{
    static int anInt2250;
    static int anInt2251;
    static int anInt2252;
    static NodeList aClass16_2253 = new NodeList();
    static int anInt2254;
    static int anInt2255;
    static int anInt2256;
    static int anInt2257;
    static int anInt2258;
    static int[] anIntArray2259 = { 1, 1, 1, 1 };
    static MutableString aClass100_2260;
    static int anInt2261;
    private static MutableString aClass100_2262;

    public final MutableString method7(int i, byte i_0_, long l, int[] is)
    {
        try
        {
            anInt2255++;
            if (i == 0)
            {
                Class68_Sub20_Sub3 class68_sub20_sub3 = NodeSub.method1008(i_0_ - 1, is[0]);
                return class68_sub20_sub3.method1047((byte) -113, (int) l);
            }
            if (i_0_ != 22)
                return null;
            if (i == 1 || i == 10)
            {
                ItemDefinition class19 = GameApplet.method18(-25672, (int) l);
                return ((ItemDefinition) class19).name;
            }
            if (i == 6 || i == 7)
                return NodeSub.method1008(21, is[0]).method1047((byte) -112, (int) l);
            return null;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("hh.A(" + i + ',' + i_0_ + ',' + l + ',' + (is != null ? "{...}" : "null") + ')'));
        }
    }

    static final void method536(long l, byte i)
    {
        anInt2256++;
        if (l != 0L)
        {
            if (Class68_Sub13_Sub26.anInt3882 >= 100)
                Class48.method520(Class68_Sub28_Sub2.aClass100_4558, -88, Class52.aClass100_1005, 0);
            else
            {
                MutableString class100 = Class56.method570(l, -1).method1603(12688);
                for (int i_1_ = 0; Class68_Sub13_Sub26.anInt3882 > i_1_; i_1_++)
                {
                    if (l == Class21_Sub1.aLongArray2705[i_1_])
                    {
                        Class48.method520(Class68_Sub28_Sub2.aClass100_4558, -88, (Class68_Sub20_Sub13_Sub2.method1166(2, (new MutableString[] { class100, Class67.aClass100_1213 }))), 0);
                        return;
                    }
                }
                int i_2_ = 9 / ((-19 - i) / 57);
                for (int i_3_ = 0; Class32.friendCount > i_3_; i_3_++)
                {
                    if (Class68_Sub13_Sub21.friendList[i_3_] == l)
                    {
                        Class48.method520(Class68_Sub28_Sub2.aClass100_4558, 125, (Class68_Sub20_Sub13_Sub2.method1166(2, (new MutableString[] { (ClientScript.aClass100_4388), class100, (CachedItem.aClass100_4452) }))), 0);
                        return;
                    }
                }
                if (class100.equalTo((((Player) Class68_Sub7.localPlayer).name)))
                    Class48.method520(Class68_Sub28_Sub2.aClass100_4558, -99, Class125.aClass100_2167, 0);
                else
                {
                    Class21_Sub1.aLongArray2705[Class68_Sub13_Sub26.anInt3882] = l;
                    Class68_Sub4.aClass100Array2829[Class68_Sub13_Sub26.anInt3882++] = Class56.method570(l, -1);
                    Keyboard.anInt2132 = Class68_Sub22.anInt3150;
                    Class21.connectionVector.startPacket(61);
                    anInt2254++;
                    Class21.connectionVector.writeLong(l);
                }
            }
        }
    }

    static final void method537(Character class1_sub6, int i, int i_4_)
    {
        try
        {
            anInt2250++;
            if (Class68_Sub3.loopCycle >= ((Character) class1_sub6).anInt2552)
            {
                if (Class68_Sub3.loopCycle > ((Character) class1_sub6).anInt2523)
                    Class58.walkingStuff(class1_sub6, true);
                else
                    Class75_Sub1.method1389(128, class1_sub6);
            } else
                NPC.method154((byte) 126, class1_sub6);
            if (i == 128)
            {
                if (((Character) class1_sub6).x < 128 || ((Character) class1_sub6).y < 128 || ((Character) class1_sub6).x >= 13184 || ((Character) class1_sub6).y >= 13184)
                {
                    ((Character) class1_sub6).anInt2523 = 0;
                    ((Character) class1_sub6).y = (((Character) class1_sub6).walkQueueY[0] * 128 + ((Character) class1_sub6).raw_range * 64);
                    ((Character) class1_sub6).anInt2554 = -1;
                    ((Character) class1_sub6).anInt2552 = 0;
                    ((Character) class1_sub6).x = (64 * ((Character) class1_sub6).raw_range + 128 * (((Character) class1_sub6).walkQueueX[0]));
                    ((Character) class1_sub6).animationID = -1;
                    class1_sub6.method153(i - 128);
                }
                if (class1_sub6 == Class68_Sub7.localPlayer && (((Character) class1_sub6).x < 1536 || ((Character) class1_sub6).y < 1536 || ((Character) class1_sub6).x >= 11776 || ((Character) class1_sub6).y >= 11776))
                {
                    ((Character) class1_sub6).anInt2554 = -1;
                    ((Character) class1_sub6).anInt2552 = 0;
                    ((Character) class1_sub6).y = (128 * ((Character) class1_sub6).walkQueueY[0] + 64 * ((Character) class1_sub6).raw_range);
                    ((Character) class1_sub6).anInt2523 = 0;
                    ((Character) class1_sub6).x = (64 * ((Character) class1_sub6).raw_range + (((Character) class1_sub6).walkQueueX[0] * 128));
                    ((Character) class1_sub6).animationID = -1;
                    class1_sub6.method153(0);
                }
                NodeSubList.method1794(i + 19978, class1_sub6);
                Class68_Sub20_Sub12.method1154(class1_sub6, 1);
            }
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("hh.B(" + (class1_sub6 != null ? "{...}" : "null") + ',' + i + ',' + i_4_ + ')'));
        }
    }

    static final MutableString method538(int i, long l)
    {
        Class70.calendar.setTime(new Date(l));
        int i_5_ = Class70.calendar.get(7);
        if (i >= -102)
            anInt2258 = -26;
        int i_6_ = Class70.calendar.get(5);
        anInt2252++;
        int i_7_ = Class70.calendar.get(2);
        int i_8_ = Class70.calendar.get(1);
        int i_9_ = Class70.calendar.get(11);
        int i_10_ = Class70.calendar.get(12);
        int i_11_ = Class70.calendar.get(13);
        return (Class68_Sub20_Sub13_Sub2.method1166(2, new MutableString[] { Class12.aClass100Array200[i_5_ - 1], Class94.aClass100_1680, Class68_Sub13_Sub24.method816(i_6_ / 10, 0), Class68_Sub13_Sub24.method816(i_6_ % 10, 0), Class68_Sub18.aClass100_3054, Class68_Sub13_Sub6.aClass100Array3526[i_7_], Class68_Sub18.aClass100_3054, Class68_Sub13_Sub24.method816(i_8_, 0), Class68_Sub20_Sub6.aClass100_4238, Class68_Sub13_Sub24.method816(i_9_ / 10, 0), Class68_Sub13_Sub24.method816(i_9_ % 10, 0),
                Class13.aClass100_218, Class68_Sub13_Sub24.method816(i_10_ / 10, 0), Class68_Sub13_Sub24.method816(i_10_ % 10, 0), Class13.aClass100_218, Class68_Sub13_Sub24.method816(i_11_ / 10, 0), Class68_Sub13_Sub24.method816(i_11_ % 10, 0), Class37.aClass100_651 }));
    }

    static final void method539(int i, int i_12_, int i_13_, int i_14_)
    {
        anInt2251++;
        MutableString class100 = (Class68_Sub20_Sub13_Sub2.method1166(2, (new MutableString[] { GameSocket.aClass100_1141, Class68_Sub13_Sub24.method816(i_12_, 0), Class106.aClass100_1802, Class68_Sub13_Sub24.method816(i >> 6, 0), Class106.aClass100_1802, Class68_Sub13_Sub24.method816(i_13_ >> 6, 0), Class106.aClass100_1802, Class68_Sub13_Sub24.method816(0x3f & i, i_14_ - 24867), Class106.aClass100_1802, Class68_Sub13_Sub24.method816(0x3f & i_13_, 0) })));
        class100.toConsole();
        if (i_14_ != 24867)
            aClass16_2253 = null;
        Class44.method486(class100, (byte) 1);
    }

    public Class51()
    {
        /* empty */
    }

    public static void method540(int i)
    {
        aClass100_2262 = null;
        if (i != 10)
            method536(117L, (byte) 123);
        anIntArray2259 = null;
        aClass16_2253 = null;
        aClass100_2260 = null;
    }

    static
    {
        anInt2258 = 0;
        anInt2257 = 100;
        aClass100_2262 = Class112.makeMutableString(43, " ");
        aClass100_2260 = aClass100_2262;
    }
}
