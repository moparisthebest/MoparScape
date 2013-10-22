/* Class15_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;

final class Class15_Sub1 extends Class15
{
    private ByteBuffer aByteBuffer2694;

    final byte[] method275(int i)
    {
        if (i >= -80)
            return null;
        byte[] is = new byte[aByteBuffer2694.capacity()];
        aByteBuffer2694.position(0);
        aByteBuffer2694.get(is);
        return is;
    }

    final void method277(byte[] is, boolean bool)
    {
        aByteBuffer2694 = ByteBuffer.allocateDirect(is.length);
        aByteBuffer2694.position(0);
        aByteBuffer2694.put(is);
        if (bool != true)
            method277(null, true);
    }
}
