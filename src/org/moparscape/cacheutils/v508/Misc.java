/*
 * Copyright (C) 2010  moparisthebest
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Official forums are http://www.moparscape.org/smf/
 * Email me at admin@moparisthebest.com , I read it but don't usually respond.
 */

/**
 * Class:Misc
 * User: Silabsoft 
 * Date: Jul 9, 2009
 * Time: 12:57:34 AM
 */
package org.moparscape.cacheutils.v508;

public class Misc {
     public static byte[] aByteArray2125 = new byte[520];
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

 public static void method465B(byte[] is, int i, byte[] is_3_, int i_4_,
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
}
