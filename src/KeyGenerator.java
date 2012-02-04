/*
 * Copyright (C) 2012  moparisthebest
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

import org.moparscape.Base64;

import java.io.*;
import java.security.Key;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.spec.RSAKeyGenParameterSpec;
import java.util.zip.CRC32;
import java.util.zip.CheckedInputStream;
import java.util.zip.CheckedOutputStream;

public class KeyGenerator {

    public static void main(String[] args) throws Exception {
        int keyLength = 2048;
        keyLength = 4096;
        /*
        KeyFactory keyFactory = KeyFactory.getInstance("RSA");
        PublicKey pubKey = keyFactory.generatePublic(new X509EncodedKeySpec(new BigInteger("258483531987721813854435365666199783121097212864526576114955744050873252978581213214062885665119329089273296913884093898593877564098511382732309048889240854054459372263273672334107564088395710980478911359605768175143527864461996266529749955416370971506195317045377519645018157466830930794446490944537605962330090699836840861268493872513762630835769942133970804813091619416385064187784658945").toByteArray()));
        byte[] bytes = pubKey.getEncoded();
        printKeys(bytes);
        System.out.println("now with gzip compression: (worse)");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        Downloader.writeStream(new ByteArrayInputStream(bytes), new GZIPOutputStream(baos));
        printKeys(baos.toByteArray());
        PublicKey p = keyFactory.generatePublic(new X509EncodedKeySpec(Base64.decode(Base64.encodeBytes(bytes, Base64.URL_SAFE), Base64.URL_SAFE)));
        System.out.println("Base64 implementation verified: "+p.equals(pubKey));
        Base64.encodeToFile(bytes, "./public.out");
        Base64.encodeToFile(bytes, "./public.url.out", Base64.URL_SAFE);
        p = keyFactory.generatePublic(new X509EncodedKeySpec(Base64.decodeFromFile("./public.out")));
        System.out.println("Base64 implementation verified: "+p.equals(pubKey));
        p = keyFactory.generatePublic(new X509EncodedKeySpec(Base64.decodeFromFile("./public.url.out", Base64.URL_SAFE)));
        System.out.println("Base64 implementation verified: "+p.equals(pubKey));
        */

        //System.exit(0);

        KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");

        // Generate a key that is 2048 bits long
        RSAKeyGenParameterSpec spec = new RSAKeyGenParameterSpec(keyLength, RSAKeyGenParameterSpec.F4);
        keyGen.initialize(spec);
        KeyPair pair = keyGen.generateKeyPair();
        printKeyPair(pair);
        //printKeys(pair.getPublic().getEncoded());
    }

    public static void printKeyPair(KeyPair kp) throws Exception {
        printKey(kp.getPrivate(), "private");
        printKey(kp.getPublic(), "public");
    }

    public static void printKey(Key key, String name) throws Exception {
        String encoded = Base64.encodeBytes(key.getEncoded(), Base64.URL_SAFE);
        System.out.printf("%s: %s\nlength: %d\n", name, encoded, encoded.length());
        String fileName = "./" + name + "key.txt";
        CheckedOutputStream os = new CheckedOutputStream(new FileOutputStream(fileName), new CRC32());
        writeStream(new ByteArrayInputStream(encoded.getBytes()), os);
        long crc = os.getChecksum().getValue();
        System.out.printf("%s key written to: '%s'\ncrc: '%d'\n", name, fileName, crc);
        CheckedInputStream is = new CheckedInputStream(new FileInputStream(fileName), new CRC32());
        writeStream(is, new OutputStream() {
            public void write(int b) {

            }
        });
        if(crc != is.getChecksum().getValue())
            System.out.println("ERROR: file written incorrectly, do not use these!");



    }

    public static void writeStream(InputStream in, OutputStream out) throws IOException {
        byte[] buffer = new byte[512];
        int len;
        while ((len = in.read(buffer)) >= 0)
            out.write(buffer, 0, len);
        out.close();
    }

    public static void printKeys(byte[] bytes) throws Exception {
        printKeyType("dec", new java.math.BigInteger(1, bytes).toString());
        printKeyType("hex", new java.math.BigInteger(1, bytes).toString(16));
        printKeyType("b32", new org.moparscape.res.Base32().encode(bytes));
        printKeyType("b64", org.moparscape.Base64.encodeBytes(bytes));
        printKeyType("b64 url-safe", org.moparscape.Base64.encodeBytes(bytes, Base64.URL_SAFE));
        printKeyType("b64 ordered", org.moparscape.Base64.encodeBytes(bytes, Base64.ORDERED));
    }

    public static void printKeyType(String type, String key) {
        System.out.printf("pubKey %s: %s\nlength: %d\n", type, key, key.length());
    }

}