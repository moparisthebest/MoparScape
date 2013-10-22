/* Class72_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Shape;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.DirectColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.util.Hashtable;

public final class Class72_Sub2 extends Class72
{
    private Component aComponent3292;

    final void method1350(int i, int i_0_, int i_1_, Graphics graphics)
    {
        if (i < 72)
            method1359(null, true, -108, 25, 34, 46);
        graphics.drawImage(((Class72_Sub2) this).anImage1314, i_0_, i_1_, aComponent3292);
    }

    final void method1356(Component component, int i, int i_2_, int i_3_)
    {
        ((Class72_Sub2) this).anIntArray1307 = new int[i * i_3_ + 1];
        ((Class72_Sub2) this).anInt1322 = i;
        ((Class72_Sub2) this).anInt1308 = i_3_;
        DataBufferInt databufferint = new DataBufferInt(((Class72_Sub2) this).anIntArray1307, ((Class72_Sub2) this).anIntArray1307.length);
        int i_4_ = -5 % ((i_2_ + 80) / 38);
        DirectColorModel directcolormodel = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster writableraster = Raster.createWritableRaster((directcolormodel.createCompatibleSampleModel(((Class72_Sub2) this).anInt1322, ((Class72_Sub2) this).anInt1308)), databufferint, null);
        ((Class72_Sub2) this).anImage1314 = new BufferedImage(directcolormodel, writableraster, false, new Hashtable());
        aComponent3292 = component;
        method1358(37);
    }

    final void method1359(Graphics graphics, boolean bool, int i, int i_5_, int i_6_, int i_7_)
    {
        Shape shape = graphics.getClip();
        graphics.clipRect(i_5_, i_6_, i, i_7_);
        if (bool != true)
            method1356(null, -64, 3, 120);
        graphics.drawImage(((Class72_Sub2) this).anImage1314, 0, 0, aComponent3292);
        graphics.setClip(shape);
    }
}
