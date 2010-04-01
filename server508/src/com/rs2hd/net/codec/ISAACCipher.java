package com.rs2hd.net.codec;

/**
 * Implementation of an ISAAC cipher.
 * 
 * NOTE: because Paladino76 disabled the ISAAC client side (stupid idea really) we don't use this.
 * @author Varek
 *
 */
public class ISAACCipher {
	
	public ISAACCipher(int ai[]) {
		cryptArray = new int[256];
		keySetArray = new int[256];
		for(int i = 0; i < ai.length; i++)
			keySetArray[i] = ai[i];
		
		initializeKeySet();
	}
	
	public int getNextKey() {
		if(keyArrayIdx-- == 0) {
			generateNextKeySet();
			keyArrayIdx = 255;
		}
		return keySetArray[keyArrayIdx];
	}
	
	public void generateNextKeySet() {
		cryptVar2 += ++cryptVar3;
		for(int i = 0; i < 256; i++) {
			int j = cryptArray[i];
			if((i & 3) == 0)
				cryptVar1 ^= cryptVar1 << 13;
			else
				if((i & 3) == 1)
					cryptVar1 ^= cryptVar1 >>> 6;
				else
					if((i & 3) == 2)
						cryptVar1 ^= cryptVar1 << 2;
					else
						if((i & 3) == 3)
							cryptVar1 ^= cryptVar1 >>> 16;
			cryptVar1 += cryptArray[i + 128 & 0xff];
			int k;
			cryptArray[i] = k = cryptArray[(j & 0x3fc) >> 2] + cryptVar1 + cryptVar2;
			keySetArray[i] = cryptVar2 = cryptArray[(k >> 8 & 0x3fc) >> 2] + j;
		}
		
	}
	
	public void initializeKeySet() {
		int i1;
		int j1;
		int k1;
		int l1;
		int i2;
		int j2;
		int k2;
		int l = i1 = j1 = k1 = l1 = i2 = j2 = k2 = 0x9e3779b9;
		for(int i = 0; i < 4; i++) {
			l ^= i1 << 11;
			k1 += l;
			i1 += j1;
			i1 ^= j1 >>> 2;
			l1 += i1;
			j1 += k1;
			j1 ^= k1 << 8;
			i2 += j1;
			k1 += l1;
			k1 ^= l1 >>> 16;
			j2 += k1;
			l1 += i2;
			l1 ^= i2 << 10;
			k2 += l1;
			i2 += j2;
			i2 ^= j2 >>> 4;
			l += i2;
			j2 += k2;
			j2 ^= k2 << 8;
			i1 += j2;
			k2 += l;
			k2 ^= l >>> 9;
			j1 += k2;
			l += i1;
		}
		
		for(int j = 0; j < 256; j += 8) {
			l += keySetArray[j];
			i1 += keySetArray[j + 1];
			j1 += keySetArray[j + 2];
			k1 += keySetArray[j + 3];
			l1 += keySetArray[j + 4];
			i2 += keySetArray[j + 5];
			j2 += keySetArray[j + 6];
			k2 += keySetArray[j + 7];
			l ^= i1 << 11;
			k1 += l;
			i1 += j1;
			i1 ^= j1 >>> 2;
			l1 += i1;
			j1 += k1;
			j1 ^= k1 << 8;
			i2 += j1;
			k1 += l1;
			k1 ^= l1 >>> 16;
			j2 += k1;
			l1 += i2;
			l1 ^= i2 << 10;
			k2 += l1;
			i2 += j2;
			i2 ^= j2 >>> 4;
			l += i2;
			j2 += k2;
			j2 ^= k2 << 8;
			i1 += j2;
			k2 += l;
			k2 ^= l >>> 9;
			j1 += k2;
			l += i1;
			cryptArray[j] = l;
			cryptArray[j + 1] = i1;
			cryptArray[j + 2] = j1;
			cryptArray[j + 3] = k1;
			cryptArray[j + 4] = l1;
			cryptArray[j + 5] = i2;
			cryptArray[j + 6] = j2;
			cryptArray[j + 7] = k2;
		}
		
		for(int k = 0; k < 256; k += 8) {
			l += cryptArray[k];
			i1 += cryptArray[k + 1];
			j1 += cryptArray[k + 2];
			k1 += cryptArray[k + 3];
			l1 += cryptArray[k + 4];
			i2 += cryptArray[k + 5];
			j2 += cryptArray[k + 6];
			k2 += cryptArray[k + 7];
			l ^= i1 << 11;
			k1 += l;
			i1 += j1;
			i1 ^= j1 >>> 2;
			l1 += i1;
			j1 += k1;
			j1 ^= k1 << 8;
			i2 += j1;
			k1 += l1;
			k1 ^= l1 >>> 16;
			j2 += k1;
			l1 += i2;
			l1 ^= i2 << 10;
			k2 += l1;
			i2 += j2;
			i2 ^= j2 >>> 4;
			l += i2;
			j2 += k2;
			j2 ^= k2 << 8;
			i1 += j2;
			k2 += l;
			k2 ^= l >>> 9;
			j1 += k2;
			l += i1;
			cryptArray[k] = l;
			cryptArray[k + 1] = i1;
			cryptArray[k + 2] = j1;
			cryptArray[k + 3] = k1;
			cryptArray[k + 4] = l1;
			cryptArray[k + 5] = i2;
			cryptArray[k + 6] = j2;
			cryptArray[k + 7] = k2;
		}
		
		generateNextKeySet();
		keyArrayIdx = 256;
	}
	
	public int keyArrayIdx = 0;
	public int keySetArray[] = null;
	public int cryptArray[] = null;
	public int cryptVar1 = 0;
	public int cryptVar2 = 0;
	public int cryptVar3 = 0;
}