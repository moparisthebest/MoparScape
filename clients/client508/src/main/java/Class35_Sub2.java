/* Class35_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import javax.sound.sampled.*;
import java.awt.*;

public class Class35_Sub2 extends Class35 {
    public SourceDataLine aSourceDataLine2722;
    public AudioFormat anAudioFormat2723;
    public byte[] aByteArray2724;
    public int anInt2725;
    public boolean aBoolean2726 = false;
    public static Class aClass2727;

    public int method422() {
        return anInt2725 - (aSourceDataLine2722.available()
                >> (Class7.aBoolean132 ? 2 : 1));
    }

    public void method433(Component component) {
        Mixer.Info[] infos = AudioSystem.getMixerInfo();
        if (infos != null) {
            int i = 0;
            for (Mixer.Info[] infos_0_ = infos;
                 (i ^ 0xffffffff) > (infos_0_.length ^ 0xffffffff); i++) {
                Mixer.Info info = infos_0_[i];
                if (null != info) {
                    String string = info.getName();
                    if (null != string
                            && (string.toLowerCase().indexOf("soundmax")
                            ^ 0xffffffff) <= -1)
                        aBoolean2726 = true;
                }
            }
        }
        anAudioFormat2723
                = new AudioFormat((float) Class93.anInt1660, 16,
                Class7.aBoolean132 ? 2 : 1, true, false);
        aByteArray2724 = new byte[256 << (!Class7.aBoolean132 ? 1 : 2)];
    }

    public void method434() throws LineUnavailableException {
        aSourceDataLine2722.flush();
        if (aBoolean2726) {
            aSourceDataLine2722.close();
            aSourceDataLine2722 = null;
            DataLine.Info info
                    = (new DataLine.Info
                    ((aClass2727 == null
                            ? (aClass2727
                            = method437("javax.sound.sampled.SourceDataLine"))
                            : aClass2727),
                            anAudioFormat2723,
                            anInt2725 << (Class7.aBoolean132 ? 2 : 1)));
            aSourceDataLine2722 = (SourceDataLine) AudioSystem.getLine(info);
            aSourceDataLine2722.open();
            aSourceDataLine2722.start();
        }
    }

    public void method426() {
        if (aSourceDataLine2722 != null) {
            aSourceDataLine2722.close();
            aSourceDataLine2722 = null;
        }
    }

    public void method423(int i) throws LineUnavailableException {
        try {
            DataLine.Info info
                    = (new DataLine.Info
                    ((aClass2727 == null
                            ? (aClass2727
                            = method437("javax.sound.sampled.SourceDataLine"))
                            : aClass2727),
                            anAudioFormat2723, i << (!Class7.aBoolean132 ? 1 : 2)));
            aSourceDataLine2722 = (SourceDataLine) AudioSystem.getLine(info);
            aSourceDataLine2722.open();
            aSourceDataLine2722.start();
            anInt2725 = i;
        } catch (LineUnavailableException lineunavailableexception) {
            if ((Class68_Sub20_Sub19.method1188(i, (byte) -73) ^ 0xffffffff)
                    != -2)
                method423(Class90.method1517(i, -21189));
            else {
                aSourceDataLine2722 = null;
                throw lineunavailableexception;
            }
        }
    }

    public void method420() {
        int i = 256;
        if (Class7.aBoolean132)
            i <<= 1;
        for (int i_1_ = 0; i_1_ < i; i_1_++) {
            int i_2_ = anIntArray625[i_1_];
            if ((i_2_ + 8388608 & ~0xffffff) != 0)
                i_2_ = 0x7fffff ^ i_2_ >> 31;
            aByteArray2724[i_1_ * 2] = (byte) (i_2_ >> 8);
            aByteArray2724[i_1_ * 2 + 1] = (byte) (i_2_ >> 16);
        }
        aSourceDataLine2722.write(aByteArray2724, 0, i << 1);
    }

    public static Class method437(String string) {
        Class var_class;
        try {
            var_class = Class.forName(string);
        } catch (ClassNotFoundException classnotfoundexception) {
            return null;
        }
        return var_class;
    }
}
