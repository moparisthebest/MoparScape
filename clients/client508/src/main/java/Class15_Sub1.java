/* Class15_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.nio.ByteBuffer;

public class Class15_Sub1 extends Class15 {
    public ByteBuffer aByteBuffer2692;

    public byte[] method275(int i) {
        if (i >= -80)
            return null;
        byte[] is = new byte[aByteBuffer2692.capacity()];
        aByteBuffer2692.position(0);
        aByteBuffer2692.get(is);
        return is;
    }

    public void method277(byte[] is, boolean bool) {
        aByteBuffer2692 = ByteBuffer.allocateDirect(is.length);
        aByteBuffer2692.position(0);
        aByteBuffer2692.put(is);
        if (bool != true)
            method277(null, true);
    }
}
