/* Class39 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class39 {
    public static void method463(int[] is, int i, int i_0_) {
        i_0_ = i + i_0_ - 7;
        while (i < i_0_) {
            is[i++] = 0;
            is[i++] = 0;
            is[i++] = 0;
            is[i++] = 0;
            is[i++] = 0;
            is[i++] = 0;
            is[i++] = 0;
            is[i++] = 0;
        }
        i_0_ += 7;
        while (i < i_0_)
            is[i++] = 0;
    }

    public static void method464(int[] is, int i, int i_1_, int i_2_) {
        i_1_ = i + i_1_ - 7;
        while (i < i_1_) {
            is[i++] = i_2_;
            is[i++] = i_2_;
            is[i++] = i_2_;
            is[i++] = i_2_;
            is[i++] = i_2_;
            is[i++] = i_2_;
            is[i++] = i_2_;
            is[i++] = i_2_;
        }
        i_1_ += 7;
        while (i < i_1_)
            is[i++] = i_2_;
    }

    public static void method465(byte[] is, int i, byte[] is_3_, int i_4_,
                                 int i_5_) {
        if (is == is_3_) {
            if (i == i_4_)
                return;
            if (i_4_ > i && i_4_ < i + i_5_) {
                i_5_--;
                i += i_5_;
                i_4_ += i_5_;
                i_5_ = i - i_5_;
                i_5_ += 7;
                while (i >= i_5_) {
                    is_3_[i_4_--] = is[i--];
                    is_3_[i_4_--] = is[i--];
                    is_3_[i_4_--] = is[i--];
                    is_3_[i_4_--] = is[i--];
                    is_3_[i_4_--] = is[i--];
                    is_3_[i_4_--] = is[i--];
                    is_3_[i_4_--] = is[i--];
                    is_3_[i_4_--] = is[i--];
                }
                i_5_ -= 7;
                while (i >= i_5_)
                    is_3_[i_4_--] = is[i--];
                return;
            }
        }
        i_5_ += i;
        i_5_ -= 7;
        while (i < i_5_) {
            is_3_[i_4_++] = is[i++];
            is_3_[i_4_++] = is[i++];
            is_3_[i_4_++] = is[i++];
            is_3_[i_4_++] = is[i++];
            is_3_[i_4_++] = is[i++];
            is_3_[i_4_++] = is[i++];
            is_3_[i_4_++] = is[i++];
            is_3_[i_4_++] = is[i++];
        }
        i_5_ += 7;
        while (i < i_5_)
            is_3_[i_4_++] = is[i++];
    }

    public static void method466(int[] is, int i, int[] is_6_, int i_7_,
                                 int i_8_) {
        if (is == is_6_) {
            if (i == i_7_)
                return;
            if (i_7_ > i && i_7_ < i + i_8_) {
                i_8_--;
                i += i_8_;
                i_7_ += i_8_;
                i_8_ = i - i_8_;
                i_8_ += 7;
                while (i >= i_8_) {
                    is_6_[i_7_--] = is[i--];
                    is_6_[i_7_--] = is[i--];
                    is_6_[i_7_--] = is[i--];
                    is_6_[i_7_--] = is[i--];
                    is_6_[i_7_--] = is[i--];
                    is_6_[i_7_--] = is[i--];
                    is_6_[i_7_--] = is[i--];
                    is_6_[i_7_--] = is[i--];
                }
                i_8_ -= 7;
                while (i >= i_8_)
                    is_6_[i_7_--] = is[i--];
                return;
            }
        }
        i_8_ += i;
        i_8_ -= 7;
        while (i < i_8_) {
            is_6_[i_7_++] = is[i++];
            is_6_[i_7_++] = is[i++];
            is_6_[i_7_++] = is[i++];
            is_6_[i_7_++] = is[i++];
            is_6_[i_7_++] = is[i++];
            is_6_[i_7_++] = is[i++];
            is_6_[i_7_++] = is[i++];
            is_6_[i_7_++] = is[i++];
        }
        i_8_ += 7;
        while (i < i_8_)
            is_6_[i_7_++] = is[i++];
    }
}
