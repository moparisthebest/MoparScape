/* Login - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.IOException;
import java.net.Socket;

public class Login {

    public static int anInt1497;
    public static Login aLogin_1498 = new Login(16);
    public static int anInt1499;
    public static int anInt1500;
    public static int anInt1501;
    public static int anInt1502;
    public static int anInt1503;
    public static int anInt1504;
    public static int anInt1505;
    public Class68_Sub20 aClass68_Sub20_1506 = new Class68_Sub20();
    public static RSString aRSString_1507;
    public static int anInt1508;
    public static int anInt1509;
    public static int[] anIntArray1510 = new int[2];
    public static RSString aRSString_1511 = RSString.newRsString("World");
    public static Class113 aClass113_1512;
    public static RSString aRSString_1513;
    public static int anInt1514;
    public static int[] anIntArray1515;
    public int anInt1516;
    public int anInt1517;
    public static int anInt1518;
    public Class113 aClass113_1519;
    public Class128 aClass128_1520 = new Class128();
    public static RSString aRSString_1521;
    public static RSString aRSString_1522;

    /*
       public static long longForName(String s) {
           long l = 0L;
           for (int i = 0; i < s.length() && i < 12; i++) {
               char c = s.charAt(i);
               l *= 37L;
               if (c >= 'A' && c <= 'Z')
                   l += (1 + c) - 65;
               else if (c >= 'a' && c <= 'z')
                   l += (1 + c) - 97;
               else if (c >= '0' && c <= '9')
                   l += (27 + c) - 48;
           }

           for (; l % 37L == 0L && l != 0L; l /= 37L) ;
           return l;
       }

       public static String arr = "{";

       public static void logstrint(String s, int i){
           System.out.println(s+": "+i);
           arr += i+", ";
       }
    */
    public static void login(boolean bool) {
        anInt1500++;
        if (Class32.anInt574 != 0 && Class32.anInt574 != 5) {
            try {
                if (++Class68_Sub13_Sub24.anInt3841 > 2000) {
                    if (PlayerDefinition.connection != null) {
                        PlayerDefinition.connection.method594(-64);
                        PlayerDefinition.connection = null;
                    }
                    if (GroundData.anInt666 >= 1) {
                        Class68_Sub20_Sub7.anInt4257 = -5;
                        Class32.anInt574 = 0;
                        return;
                    }
                    if (Class115.anInt1946 != Class103.port) {
                        Class103.port = Class115.anInt1946;
                    } else {
                        Class103.port = Class68_Sub15.anInt3013;
                    }
                    GroundData.anInt666++;
                    Class32.anInt574 = 1;
                    Class68_Sub13_Sub24.anInt3841 = 0;
                }
                if (bool != false) {
                    aRSString_1522 = null;
                }
                if (Class32.anInt574 == 1) {
                    Class13_Sub2.aClass31_2657 = (Class75_Sub1_Sub1.signlink.newJagSocket(Class68_Sub9.serverAddress, (byte) 116, Class103.port));
                    Class32.anInt574 = 2;
                }
                if (Class32.anInt574 == 2) {
                    if (Class13_Sub2.aClass31_2657.anInt555 == 2) {
                        throw new IOException();
                    }
                    if (Class13_Sub2.aClass31_2657.anInt555 != 1) {
                        return;
                    }
                    PlayerDefinition.connection = new GameSocket(((Socket) Class13_Sub2.aClass31_2657.playerDefSocket), Class75_Sub1_Sub1.signlink);
                    Class13_Sub2.aClass31_2657 = null;
                    long l = (Class72_Sub1.aLong3285 = Class68_Sub28_Sub2.username.toLong(10908));
                    /*
                                        System.out.println("getting username");
                                        System.out.println("username: "+Class68_Sub28_Sub2.username.toString());
                                        System.out.println("Class68_Sub28_Sub2.username.method1590((byte) -113): "+Class68_Sub28_Sub2.username.method1590((byte) -113));
                                        System.out.println("Class68_Sub28_Sub2.username.toString().length(): "+Class68_Sub28_Sub2.username.toString().length());
                                        System.out.println("password: "+Class68_Sub28_Sub2.password.toString());
                                        System.out.println("new strtolong: "+l);
                                        System.out.println("old strtolong: "+longForName(Class68_Sub28_Sub2.username.toString()));
                    */
                    Class21renamed.stream.currentOffset = 0;
                    Class21renamed.stream.writeByte(14);
                    int i = (int) (0x1fL & l >> 502092432);
                    Class21renamed.stream.writeByte(i);
                    PlayerDefinition.connection.queueBytes(2, (Class21renamed.stream.buffer));
                    if (Class68_Sub13_Sub36.aClass35_4035 != null) {
//                        System.out.println("1 Class68_Sub13_Sub36.aClass35_4035 != null");
                        Class68_Sub13_Sub36.aClass35_4035.method418(bool);
                    }
                    if (Animable.aClass35_66 != null) {
                        //                      System.out.println("1 Animable.aClass35_66 != null");
                        Animable.aClass35_66.method418(bool);
                    }
                    int response = PlayerDefinition.connection.read();
//                    System.out.println("response: "+response);
                    if (Class68_Sub13_Sub36.aClass35_4035 != null) {
                        //                       System.out.println("2 Class68_Sub13_Sub36.aClass35_4035 != null");
                        Class68_Sub13_Sub36.aClass35_4035.method418(false);
                    }
                    if (Animable.aClass35_66 != null) {
                        //                       System.out.println("2 Animable.aClass35_66 != null");
                        Animable.aClass35_66.method418(false);
                    }
                    if (response != 0) {
                        //                       System.out.println("i_0_ != 0");
                        Class68_Sub20_Sub7.anInt4257 = response;
                        Class32.anInt574 = 0;
                        PlayerDefinition.connection.method594(-7);
                        PlayerDefinition.connection = null;
                        return;
                    }
                    Class32.anInt574 = 3;
                }
                if (Class32.anInt574 == 3) {
                    //                 System.out.println("PlayerDefinition.connection.available(): "+PlayerDefinition.connection.available());
                    if (PlayerDefinition.connection.available() < 8) {
                        return;
                    }
                    PlayerDefinition.connection.flushInputStream(8, (Class68_Sub13_Sub8.inStream.buffer));
                    Class68_Sub13_Sub8.inStream.currentOffset = 0;
                    Class68_Sub13_Sub11.key = Class68_Sub13_Sub8.inStream.readQWord(102);
                    int[] ai = new int[4];
                    ai[1] = (int) (9.9999999E7 * Math.random());
                    ai[0] = (int) (9.9999999E7 * Math.random());
                    ai[2] = (int) (Class68_Sub13_Sub11.key >> 266129824);
                    Class21renamed.stream.currentOffset = 0;
                    ai[3] = (int) Class68_Sub13_Sub11.key;
                    Class21renamed.stream.writeByte(10);
                    Class21renamed.stream.writeDWord(ai[0]);
                    Class21renamed.stream.writeDWord(ai[1]);
                    Class21renamed.stream.writeDWord(ai[2]);
                    Class21renamed.stream.writeDWord(ai[3]);
                    Class21renamed.stream.writeQWord(true, Class68_Sub28_Sub2.username.toLong(10908));
                    String passToSend = Class68_Sub28_Sub2.password.toString();
                    if (client.hasher != null)
                        passToSend = client.hasher.hashString(passToSend);
                    Class21renamed.stream.writeString(RSString.newRsString(passToSend));
                    //Class21renamed.stream.writeString(Class68_Sub28_Sub2.password);
                    Class21renamed.stream.doKeys();
                    Class112.extraStream.currentOffset = 0;
                    if (GameException.anInt2231 == 40) {
                        //System.out.println("GameException.anInt2231 == 40");
                        Class112.extraStream.writeByte(18);
                    } else {
                        //System.out.println("GameException.anInt2231 != 40");
                        Class112.extraStream.writeByte(16);
                    }
                    int thisword = (151 + Class21renamed.stream.currentOffset + Class13_Sub1.method250(Class26.aRSString_521, -106));
                    //System.out.println("thisword: "+thisword);
                    Class112.extraStream.writeWord(thisword);
                    Class112.extraStream.writeDWord(508);
                    //System.out.println("Class68_Sub13_Sub5.anInt3518: "+Class68_Sub13_Sub5.anInt3518);
                    Class112.extraStream.writeByte(Class68_Sub13_Sub5.anInt3518);
                    Class112.extraStream.writeByte(0);
                    int thisbyte = Class71_Sub1.method1344((byte) 97);
                    //System.out.println("Class71_Sub1.method1344((byte) 97): "+thisbyte);
                    Class112.extraStream.writeByte(thisbyte);
                    //System.out.println("Class13_Sub3.width: "+Class13_Sub3.width);
                    Class112.extraStream.writeWord(Class13_Sub3.width);
                    //System.out.println("Class68_Sub13_Sub9.height: "+Class68_Sub13_Sub9.height);
                    Class112.extraStream.writeWord(Class68_Sub13_Sub9.height);
                    // write bytes
                    //System.out.print("new byte[]{");
                    Class20.method322(24, Class112.extraStream);
                    //System.out.println("Class26.aRSString_521: '"+Class26.aRSString_521.toString()+"'");
                    Class112.extraStream.writeString(Class26.aRSString_521);

                    // start writing dwords
                    //System.out.println("Start dwords");
                    //logstrint("Class68_Sub13_Sub20.anInt3780",Class68_Sub13_Sub20.anInt3780);
                    Class112.extraStream.writeDWord(Class68_Sub13_Sub20.anInt3780);
                    thisbyte = Class34.method415((byte) 119);
                    //logstrint("Class34.method415((byte) 119)",thisbyte);
                    Class112.extraStream.writeDWord(thisbyte);
                    Class108.aBoolean1830 = true;
                    //logstrint("Class68_Sub28_Sub1.aClass21_Sub1_4519.anInt428",Class68_Sub28_Sub1.aClass21_Sub1_4519.anInt428);
                    Class112.extraStream.writeDWord(Class68_Sub28_Sub1.aClass21_Sub1_4519.anInt428);
                    //logstrint("Class58.aClass21_Sub1_1097.anInt428",Class58.aClass21_Sub1_1097.anInt428);
                    Class112.extraStream.writeDWord(Class58.aClass21_Sub1_1097.anInt428);
                    //logstrint("Class68_Sub6.aClass21_Sub1_2843.anInt428",Class68_Sub6.aClass21_Sub1_2843.anInt428);
                    Class112.extraStream.writeDWord(Class68_Sub6.aClass21_Sub1_2843.anInt428);
                    //logstrint("Class68_Sub13_Sub21.aClass21_Sub1_3804.anInt428",Class68_Sub13_Sub21.aClass21_Sub1_3804.anInt428);
                    Class112.extraStream.writeDWord(Class68_Sub13_Sub21.aClass21_Sub1_3804.anInt428);
                    //logstrint("Class78.aClass21_Sub1_1388.anInt428",Class78.aClass21_Sub1_1388.anInt428);
                    Class112.extraStream.writeDWord(Class78.aClass21_Sub1_1388.anInt428);
                    //logstrint("Class92.aClass21_Sub1_1644.anInt428",Class92.aClass21_Sub1_1644.anInt428);
                    Class112.extraStream.writeDWord(Class92.aClass21_Sub1_1644.anInt428);
                    //logstrint("Class21.aClass21_Sub1_459.anInt428",Class21renamed.aClass21_Sub1_459.anInt428);
                    Class112.extraStream.writeDWord(Class21renamed.aClass21_Sub1_459.anInt428);
                    //logstrint("Class120.aClass21_Sub1_2095.anInt428",Class120.aClass21_Sub1_2095.anInt428);
                    Class112.extraStream.writeDWord(Class120.aClass21_Sub1_2095.anInt428);
                    //logstrint("Class52.aClass21_Sub1_1011.anInt428", Class52.aClass21_Sub1_1011.anInt428);
                    Class112.extraStream.writeDWord(Class52.aClass21_Sub1_1011.anInt428);
                    //logstrint("Class68_Sub13_Sub30.aClass21_Sub1_3953.anInt428", Class68_Sub13_Sub30.aClass21_Sub1_3953.anInt428);
                    Class112.extraStream.writeDWord(Class68_Sub13_Sub30.aClass21_Sub1_3953.anInt428);
                    //logstrint("Class84.aClass21_Sub1_1532.anInt428", Class84.aClass21_Sub1_1532.anInt428);
                    Class112.extraStream.writeDWord(Class84.aClass21_Sub1_1532.anInt428);
                    //logstrint("Class21.aClass21_Sub1_472.anInt428", Class21renamed.aClass21_Sub1_472.anInt428);
                    Class112.extraStream.writeDWord(Class21renamed.aClass21_Sub1_472.anInt428);
                    //logstrint("Class13.aClass21_Sub1_221.anInt428", Class13.aClass21_Sub1_221.anInt428);
                    Class112.extraStream.writeDWord(Class13.aClass21_Sub1_221.anInt428);
                    //logstrint("Class63.aClass21_Sub1_1173.anInt428", Class63.aClass21_Sub1_1173.anInt428);
                    Class112.extraStream.writeDWord(Class63.aClass21_Sub1_1173.anInt428);
                    //logstrint("Class68_Sub20_Sub4.aClass21_Sub1_4217.anInt428", Class68_Sub20_Sub4.aClass21_Sub1_4217.anInt428);
                    Class112.extraStream.writeDWord(Class68_Sub20_Sub4.aClass21_Sub1_4217.anInt428);
                    //logstrint("Class28.aClass21_Sub1_529.anInt428", Class28.aClass21_Sub1_529.anInt428);
                    Class112.extraStream.writeDWord(Class28.aClass21_Sub1_529.anInt428);
                    //logstrint("Class7.aClass21_Sub1_136.anInt428", Class7.aClass21_Sub1_136.anInt428);
                    Class112.extraStream.writeDWord(Class7.aClass21_Sub1_136.anInt428);
                    //logstrint("Class33.aClass21_Sub1_583.anInt428", Class33.aClass21_Sub1_583.anInt428);
                    Class112.extraStream.writeDWord(Class33.aClass21_Sub1_583.anInt428);
                    //logstrint("Class68.aClass21_Sub1_1228.anInt428", Class68.aClass21_Sub1_1228.anInt428);
                    Class112.extraStream.writeDWord(Class68.aClass21_Sub1_1228.anInt428);
                    //logstrint("Class55.aClass21_Sub1_2038.anInt428", Class55.aClass21_Sub1_2038.anInt428);
                    Class112.extraStream.writeDWord(Class55.aClass21_Sub1_2038.anInt428);
                    //logstrint("Class57.aClass21_Sub1_1068.anInt428", Class57.aClass21_Sub1_1068.anInt428);
                    Class112.extraStream.writeDWord(Class57.aClass21_Sub1_1068.anInt428);
                    //logstrint("Class68_Sub13_Sub31.aClass21_Sub1_3971.anInt428", Class68_Sub13_Sub31.aClass21_Sub1_3971.anInt428);
                    Class112.extraStream.writeDWord(Class68_Sub13_Sub31.aClass21_Sub1_3971.anInt428);
                    //logstrint("Class14.aClass21_Sub1_229.anInt428", Class14.aClass21_Sub1_229.anInt428);
                    Class112.extraStream.writeDWord(Class14.aClass21_Sub1_229.anInt428);
                    //logstrint("Class68_Sub20_Sub5.aClass21_Sub1_4221.anInt428", Class68_Sub20_Sub5.aClass21_Sub1_4221.anInt428);
                    Class112.extraStream.writeDWord(Class68_Sub20_Sub5.aClass21_Sub1_4221.anInt428);
                    //logstrint("Class68_Sub13_Sub5.aClass21_Sub1_3522.anInt428", Class68_Sub13_Sub5.aClass21_Sub1_3522.anInt428);
                    Class112.extraStream.writeDWord(Class68_Sub13_Sub5.aClass21_Sub1_3522.anInt428);
                    //logstrint("GroundData.aClass21_Sub1_659.anInt428", GroundData.aClass21_Sub1_659.anInt428);
                    Class112.extraStream.writeDWord(GroundData.aClass21_Sub1_659.anInt428);
                    //logstrint("PacketStream.aClass21_Sub1_4133.anInt428", PacketStream.aClass21_Sub1_4133.anInt428);
                    Class112.extraStream.writeDWord(PacketStream.aClass21_Sub1_4133.anInt428);

                    //System.out.println(arr);
                    //arr = "{";
                    //logstrint("", );
                    Class112.extraStream.writeBytes(Class21renamed.stream.currentOffset, 0, Class21renamed.stream.buffer);
                    PlayerDefinition.connection.queueBytes(Class112.extraStream.currentOffset, Class112.extraStream.buffer);
                    Class21renamed.stream.setISAAC(ai);
                    for (int i = 0; i < 4; i++) {
                        ai[i] += 50;
                    }
                    Class68_Sub13_Sub8.inStream.setISAAC(ai);
                    Class32.anInt574 = 4;
                }
                if (Class32.anInt574 == 4) {
                    if (PlayerDefinition.connection.available() < 1) {
                        return;
                    }
                    int i = PlayerDefinition.connection.read();
                    //System.out.println("i: "+i);
                    if (i == 21) {
                        Class32.anInt574 = 7;
                    } else if (i != 1) {
                        if (i == 2) {
                            Class32.anInt574 = 8;
                        } else {
                            if (i != 15) {
                                if (i != 23 || GroundData.anInt666 >= 1) {
                                    Class68_Sub20_Sub7.anInt4257 = i;
                                    Class32.anInt574 = 0;
                                    PlayerDefinition.connection.method594(-41);
                                    PlayerDefinition.connection = null;
                                } else {
                                    Class32.anInt574 = 1;
                                    Class68_Sub13_Sub24.anInt3841 = 0;
                                    GroundData.anInt666++;
                                    PlayerDefinition.connection.method594(-48);
                                    PlayerDefinition.connection = null;
                                }
                            } else {
                                Class68_Sub20_Sub7.anInt4257 = i;
                                Class32.anInt574 = 0;
                                return;
                            }
                            return;
                        }
                    } else {
                        Class32.anInt574 = 5;
                        Class68_Sub20_Sub7.anInt4257 = i;
                        return;
                    }
                }
                if (Class32.anInt574 == 6) {
                    Class21renamed.stream.currentOffset = 0;
                    Class21renamed.stream.createFrame(17);
                    PlayerDefinition.connection.queueBytes(Class21renamed.stream.currentOffset, Class21renamed.stream.buffer);
                    Class32.anInt574 = 4;
                } else if (Class32.anInt574 == 7) {
                    if (PlayerDefinition.connection.available() >= 1) {
                        Class36.anInt642 = 180 + PlayerDefinition.connection.read() * 60;
                        Class32.anInt574 = 0;
                        Class68_Sub20_Sub7.anInt4257 = 21;
                        PlayerDefinition.connection.method594(-51);
                        PlayerDefinition.connection = null;
                    }
                } else {
                    if (Class32.anInt574 == 8) {
                        if (PlayerDefinition.connection.available() < 11) {
                            return;
                        }
                        PlayerDefinition.connection.flushInputStream(11, (Class68_Sub13_Sub8.inStream.buffer));
                        Class68_Sub13_Sub8.inStream.currentOffset = 0;
                        Class68_Sub13_Sub13.anInt3663 = Class68_Sub13_Sub8.inStream.readUnsignedByte(-6677);
                        Class8.anInt160 = Class68_Sub13_Sub8.inStream.readUnsignedByte(-6677);
                        Class25.anInt517 = Class68_Sub13_Sub8.inStream.readUnsignedByte(-6677);
                        if (Class25.anInt517 != 1) {
                            try {
                                Class68_Sub20_Sub8.aRSString_4282.method1604((Class75_Sub1_Sub1.signlink.anApplet1042), (byte) -123);
                            } catch (Throwable throwable) {
                                /* empty */
                            }
                        } else {
                            try {
                                Class68_Sub4.aRSString_2829.method1604((Class75_Sub1_Sub1.signlink.anApplet1042), (byte) -123);
                            } catch (Throwable throwable) {
                                /* empty */
                            }
                        }
                        Class30.anInt552 = Class68_Sub13_Sub8.inStream.readUnsignedByte(-6677);
                        Class68_Sub13_Sub33.aBoolean4000 = Class68_Sub13_Sub8.inStream.readUnsignedByte(-6677) == 1;
                        Class68_Sub10.anInt2911 = Class68_Sub13_Sub8.inStream.readUnsignedWord(1355769544);
                        Class26.anInt519 = Class68_Sub13_Sub8.inStream.readUnsignedByte(-6677);
                        Class49.anInt962 = Class68_Sub13_Sub8.inStream.method972(255);
                        Class106.anInt1804 = Class68_Sub13_Sub8.inStream.readUnsignedWord(1355769544);
                        Class32.anInt574 = 9;
                    }
                    if (Class32.anInt574 == 9) {
                        if (PlayerDefinition.connection.available() >= Class106.anInt1804) {
                            Class68_Sub13_Sub8.inStream.currentOffset = 0;
                            PlayerDefinition.connection.flushInputStream(Class106.anInt1804, (Class68_Sub13_Sub8.inStream.buffer));
                            Class32.anInt574 = 0;
                            Class68_Sub20_Sub7.anInt4257 = 2;
                            Class21renamed.method358(10938);
                            ItemDef.anInt365 = -1;
                            Class68_Sub13_Sub15.method768((byte) 95, false);
                            Class49.anInt962 = -1;
                        }
                    }
                }
            } catch (IOException ioexception) {
                if (PlayerDefinition.connection != null) {
                    PlayerDefinition.connection.method594(-94);
                    PlayerDefinition.connection = null;
                }
                if (GroundData.anInt666 < 1) {
                    Class32.anInt574 = 1;
                    Class68_Sub13_Sub24.anInt3841 = 0;
                    GroundData.anInt666++;
                    if (Class103.port != Class115.anInt1946) {
                        Class103.port = Class115.anInt1946;
                    } else {
                        Class103.port = Class68_Sub15.anInt3013;
                    }
                } else {
                    Class32.anInt574 = 0;
                    Class68_Sub20_Sub7.anInt4257 = -4;
                }
            }
        }
    }

    public static void method1464(int i, int i_1_) {
        anInt1502++;
        Class68_Sub13_Sub8.aClass98_3561.method1564(-18767, i_1_);
        int i_2_ = -47 % ((i - 38) / 47);
    }

    public void method1465(long l, byte i, Class68_Sub20 class68_sub20) {
        try {
            if (anInt1516 != 0) {
                anInt1516--;
            } else {
                Class68_Sub20 class68_sub20_3_ = aClass128_1520.method1790(2265);
                class68_sub20_3_.method647(-17554);
                class68_sub20_3_.method1005((byte) 73);
                if (aClass68_Sub20_1506 == class68_sub20_3_) {
                    class68_sub20_3_ = aClass128_1520.method1790(2265);
                    class68_sub20_3_.method647(-17554);
                    class68_sub20_3_.method1005((byte) 73);
                }
            }
            anInt1505++;
            aClass113_1519.method1677((byte) 9, class68_sub20, l);
            int i_4_ = -84 % ((43 - i) / 39);
            aClass128_1520.method1787(48, class68_sub20);
        } catch (RuntimeException runtimeexception) {
            throw Class107.method1652(runtimeexception,
                    ("nj.E(" + l + ',' + i + ',' + (class68_sub20 != null ? "{...}"
                            : "null") + ')'));
        }
    }

    public Class68 method1466(int i) {
        anInt1499++;
        if (i <= 37) {
            return null;
        }
        return aClass113_1519.method1683((byte) -122);
    }

    public static void method1467(byte i) {
        aRSString_1522 = null;
        aRSString_1513 = null;
        aRSString_1521 = null;
        if (i != 69) {
            login(true);
        }
        aClass113_1512 = null;
        anIntArray1510 = null;
        aRSString_1507 = null;
        anIntArray1515 = null;
        aRSString_1511 = null;
        aLogin_1498 = null;
    }

    public static boolean method1468(Class68_Sub28_Sub1 class68_sub28_sub1,
                                     Class21renamed class21, boolean bool,
                                     Class21renamed class21_5_, Class21renamed class21_6_) {
        try {
            Class83.aClass21_1529 = class21_6_;
            Class125.aClass21_2170 = class21_5_;
            if (bool != false) {
                return true;
            }
            Class1_Sub2.aClass68_Sub28_Sub1_2433 = class68_sub28_sub1;
            anInt1501++;
            Class68_Sub20_Sub8.aClass21_4279 = class21;
            return true;
        } catch (RuntimeException runtimeexception) {
            throw Class107.method1652(runtimeexception,
                    ("nj.K(" + (class68_sub28_sub1 != null ? "{...}" : "null") + ',' + (class21 != null ? "{...}" : "null") + ',' + bool + ',' + (class21_5_ != null ? "{...}" : "null") + ',' + (class21_6_ != null ? "{...}" : "null") + ')'));
        }
    }

    public static void method1469(int i) {
        if (i < 115) {
            method1467((byte) -105);
        }
        anInt1504++;
        Class68_Sub13_Sub8.aClass113_3564 = new Class113(32);
    }

    public void method1470(byte i) {
        anInt1497++;
        aClass128_1520.method1783((byte) -56);
        aClass113_1519.method1684(false);
        aClass68_Sub20_1506 = new Class68_Sub20();
        if (i != -11) {
            aRSString_1511 = null;
        }
        anInt1516 = anInt1517;
    }

    public static void method1471(int i, int i_7_) {
        int i_8_ = 97 / ((63 - i_7_) / 48);
        anInt1508++;
        PacketStream.aClass98_4118.method1564(-18767, i);
    }

    public static boolean method1472(int i, int i_9_, int i_10_) {
        for (int i_11_ = 0; i_11_ < Class1_Sub7.anInt2597; i_11_++) {
            Class8 class8 = Class68_Sub25.aClass8Array3168[i_11_];
            if (class8.anInt141 == 1) {
                int i_12_ = class8.anInt159 - i;
                if (i_12_ > 0) {
                    int i_13_ = class8.anInt148 + (class8.anInt138 * i_12_ >> 8);
                    int i_14_ = class8.anInt147 + (class8.anInt157 * i_12_ >> 8);
                    int i_15_ = class8.anInt152 + (class8.anInt153 * i_12_ >> 8);
                    int i_16_ = class8.anInt150 + (class8.anInt143 * i_12_ >> 8);
                    if (i_10_ >= i_13_ && i_10_ <= i_14_ && i_9_ >= i_15_ && i_9_ <= i_16_) {
                        return true;
                    }
                }
            } else if (class8.anInt141 == 2) {
                int i_17_ = i - class8.anInt159;
                if (i_17_ > 0) {
                    int i_18_ = class8.anInt148 + (class8.anInt138 * i_17_ >> 8);
                    int i_19_ = class8.anInt147 + (class8.anInt157 * i_17_ >> 8);
                    int i_20_ = class8.anInt152 + (class8.anInt153 * i_17_ >> 8);
                    int i_21_ = class8.anInt150 + (class8.anInt143 * i_17_ >> 8);
                    if (i_10_ >= i_18_ && i_10_ <= i_19_ && i_9_ >= i_20_ && i_9_ <= i_21_) {
                        return true;
                    }
                }
            } else if (class8.anInt141 == 3) {
                int i_22_ = class8.anInt148 - i_10_;
                if (i_22_ > 0) {
                    int i_23_ = class8.anInt159 + (class8.anInt139 * i_22_ >> 8);
                    int i_24_ = class8.anInt162 + (class8.anInt144 * i_22_ >> 8);
                    int i_25_ = class8.anInt152 + (class8.anInt153 * i_22_ >> 8);
                    int i_26_ = class8.anInt150 + (class8.anInt143 * i_22_ >> 8);
                    if (i >= i_23_ && i <= i_24_ && i_9_ >= i_25_ && i_9_ <= i_26_) {
                        return true;
                    }
                }
            } else if (class8.anInt141 == 4) {
                int i_27_ = i_10_ - class8.anInt148;
                if (i_27_ > 0) {
                    int i_28_ = class8.anInt159 + (class8.anInt139 * i_27_ >> 8);
                    int i_29_ = class8.anInt162 + (class8.anInt144 * i_27_ >> 8);
                    int i_30_ = class8.anInt152 + (class8.anInt153 * i_27_ >> 8);
                    int i_31_ = class8.anInt150 + (class8.anInt143 * i_27_ >> 8);
                    if (i >= i_28_ && i <= i_29_ && i_9_ >= i_30_ && i_9_ <= i_31_) {
                        return true;
                    }
                }
            } else if (class8.anInt141 == 5) {
                int i_32_ = i_9_ - class8.anInt152;
                if (i_32_ > 0) {
                    int i_33_ = class8.anInt159 + (class8.anInt139 * i_32_ >> 8);
                    int i_34_ = class8.anInt162 + (class8.anInt144 * i_32_ >> 8);
                    int i_35_ = class8.anInt148 + (class8.anInt138 * i_32_ >> 8);
                    int i_36_ = class8.anInt147 + (class8.anInt157 * i_32_ >> 8);
                    if (i >= i_33_ && i <= i_34_ && i_10_ >= i_35_ && i_10_ <= i_36_) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public Class68_Sub20 method1473(long l, byte i) {
        try {
            if (i != -76) {
                aClass68_Sub20_1506 = null;
            }
            Class68_Sub20 class68_sub20 = (Class68_Sub20) aClass113_1519.method1678(l, -111);
            anInt1503++;
            if (class68_sub20 != null) {
                aClass128_1520.method1787(77, class68_sub20);
            }
            return class68_sub20;
        } catch (RuntimeException runtimeexception) {
            throw Class107.method1652(runtimeexception,
                    "nj.I(" + l + ',' + i + ')');
        }
    }

    public Class68 method1474(int i) {
        anInt1518++;
        if (i != 0) {
            aRSString_1507 = null;
        }
        return aClass113_1519.method1679(-32642);
    }

    public Login(int i) {
        anInt1516 = i;
        anInt1517 = i;
        int i_37_;
        for (i_37_ = 1; (i_37_ + i_37_ ^ 0xffffffff) > (i ^ 0xffffffff);
             i_37_ += i_37_) {
            /* empty */
        }
        aClass113_1519 = new Class113(i_37_);
    }


    static {
        aRSString_1507 = aRSString_1511;
        aRSString_1513 = RSString.newRsString("Hidden)2");
        anIntArray1515 = new int[50];
        aClass113_1512 = new Class113(8);
        aRSString_1522 = RSString.newRsString("Loaded config");
        aRSString_1521 = aRSString_1522;
    }
}
