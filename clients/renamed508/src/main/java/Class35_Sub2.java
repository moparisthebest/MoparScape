/* Class35_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.Mixer;
import javax.sound.sampled.SourceDataLine;

final class Class35_Sub2 extends Class35
{
    private SourceDataLine aSourceDataLine2724;
    private AudioFormat anAudioFormat2725;
    private byte[] aByteArray2726;
    private int anInt2727;
    private boolean aBoolean2728 = false;
    static Class aClass2729;

    final int method422()
    {
        return anInt2727 - (aSourceDataLine2724.available() >> (Class7.aBoolean132 ? 2 : 1));
    }

    final void method433(Component component)
    {
        Mixer.Info[] infos = AudioSystem.getMixerInfo();
        if (infos != null)
        {
            int i = 0;
            for (Mixer.Info[] infos_0_ = infos; i < infos_0_.length; i++)
            {
                Mixer.Info info = infos_0_[i];
                if (null != info)
                {
                    String string = info.getName();
                    if (null != string && string.toLowerCase().indexOf("soundmax") >= 0)
                        aBoolean2728 = true;
                }
            }
        }
        anAudioFormat2725 = new AudioFormat((float) Class93.anInt1662, 16, Class7.aBoolean132 ? 2 : 1, true, false);
        aByteArray2726 = new byte[256 << (!Class7.aBoolean132 ? 1 : 2)];
    }

    final void method434() throws LineUnavailableException
    {
        aSourceDataLine2724.flush();
        if (aBoolean2728)
        {
            aSourceDataLine2724.close();
            aSourceDataLine2724 = null;
            DataLine.Info info = (new DataLine.Info((aClass2729 == null ? (aClass2729 = method437("javax.sound.sampled.SourceDataLine")) : aClass2729), anAudioFormat2725, anInt2727 << (Class7.aBoolean132 ? 2 : 1)));
            aSourceDataLine2724 = (SourceDataLine) AudioSystem.getLine(info);
            aSourceDataLine2724.open();
            aSourceDataLine2724.start();
        }
    }

    final void method426()
    {
        if (aSourceDataLine2724 != null)
        {
            aSourceDataLine2724.close();
            aSourceDataLine2724 = null;
        }
    }

    final void method423(int i) throws LineUnavailableException
    {
        try
        {
            DataLine.Info info = (new DataLine.Info((aClass2729 == null ? (aClass2729 = method437("javax.sound.sampled.SourceDataLine")) : aClass2729), anAudioFormat2725, i << (!Class7.aBoolean132 ? 1 : 2)));
            aSourceDataLine2724 = (SourceDataLine) AudioSystem.getLine(info);
            aSourceDataLine2724.open();
            aSourceDataLine2724.start();
            anInt2727 = i;
        } catch (LineUnavailableException lineunavailableexception)
        {
            if (Class68_Sub20_Sub19.method1188(i, (byte) -73) != 1)
                method423(Class90.method1523(i, -21189));
            else
            {
                aSourceDataLine2724 = null;
                throw lineunavailableexception;
            }
        }
    }

    final void method420()
    {
        int i = 256;
        if (Class7.aBoolean132)
            i <<= 1;
        for (int i_1_ = 0; i_1_ < i; i_1_++)
        {
            int i_2_ = ((Class35_Sub2) this).anIntArray625[i_1_];
            if ((i_2_ + 8388608 & ~0xffffff) != 0)
                i_2_ = 0x7fffff ^ i_2_ >> 31;
            aByteArray2726[i_1_ * 2] = (byte) (i_2_ >> 8);
            aByteArray2726[i_1_ * 2 + 1] = (byte) (i_2_ >> 16);
        }
        aSourceDataLine2724.write(aByteArray2726, 0, i << 1);
    }

    static Class method437(String string)
    {
        Class var_class;
        try
        {
            var_class = Class.forName(string);
        } catch (ClassNotFoundException classnotfoundexception)
        {
            classnotfoundexception.printStackTrace();
            return null;
        }
        return var_class;
    }
}
