/* Class72_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;
import java.awt.image.*;
import java.util.Hashtable;

public class Class72_Sub2 extends Class72 {
    public Component aComponent3290;

    public void method1350(int i, int i_0_, int i_1_, Graphics graphics) {
        if (i < 72)
            method1359(null, true, -108, 25, 34, 46);
        graphics.drawImage(anImage1314, i_0_, i_1_, aComponent3290);
    }

    public void method1356(Component component, int i, int i_2_, int i_3_) {
        anIntArray1307 = new int[1 + i * i_3_];
        anInt1322 = i;
        anInt1308 = i_3_;
        DataBufferInt databufferint
                = new DataBufferInt(anIntArray1307, anIntArray1307.length);
        int i_4_ = -5 % ((i_2_ - -80) / 38);
        DirectColorModel directcolormodel
                = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster writableraster
                = (Raster.createWritableRaster
                (directcolormodel.createCompatibleSampleModel(anInt1322,
                        anInt1308),
                        databufferint, null));
        // xxx if you set this to another image, it covers the entire screen
        anImage1314 = new BufferedImage(directcolormodel, writableraster, false, new Hashtable());
        aComponent3290 = component;
        method1358(37);
    }

    public void method1359(Graphics graphics, boolean bool, int i, int i_5_,
                           int i_6_, int i_7_) {
        Shape shape = graphics.getClip();
        graphics.clipRect(i_5_, i_6_, i, i_7_);
        if (bool != true)
            method1356(null, -64, 3, 120);
        graphics.drawImage(anImage1314, 0, 0, aComponent3290);
        graphics.setClip(shape);
    }
}
