package org.moparscape.rsakeys;/*
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

import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.security.Key;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.spec.RSAKeyGenParameterSpec;
import java.util.zip.CRC32;
import java.util.zip.CheckedInputStream;
import java.util.zip.CheckedOutputStream;

public class KeyGenerator {

    int keyLength = 4096;
    String folderName = ".";

    public static void main(String[] args) throws Exception {
        if (args.length == 0) {
            new KeyGenerator((Component) null);
            return;
        }
        int len = 0;
        String fName = null;
        if (args.length > 0)
            try {
                len = Integer.parseInt(args[0]);
            } catch (Exception e) {

            }
        if (args.length > 1)
            fName = args[1];
        new KeyGenerator(len, fName);
    }

    public KeyGenerator(Component parent) {
        JFileChooser fc = new JFileChooser();
        fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        fc.setDialogTitle("Select directory to place RSA keys into");

        int len = 0;
        if (fc.showOpenDialog(parent) != JFileChooser.APPROVE_OPTION) {
            System.out.println("Key Generator command cancelled by user.");
            return;
        }

        try {
            len = Integer.parseInt(JOptionPane.showInputDialog(parent, "Enter the number of bits for the RSA Key", keyLength));
        } catch (Exception e) {

        }

        this.genKeys(len, fc.getSelectedFile().getAbsolutePath());
    }

    public KeyGenerator() {
        this(0, null);
    }

    public KeyGenerator(int keyLength, String folderName) {
        genKeys(keyLength, folderName);
    }

    private void genKeys(int keyLength, String folderName) {
        if (keyLength > 0)
            this.keyLength = keyLength;
        if (folderName != null)
            this.folderName = folderName;
        if (!this.folderName.endsWith("/"))
            this.folderName += "/";
        System.out.printf("Generating %d-bit RSA keys in folder '%s'\n", this.keyLength, this.folderName);
        try {
            KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");

            // Generate a key that is keyLength bits long
            RSAKeyGenParameterSpec spec = new RSAKeyGenParameterSpec(this.keyLength, RSAKeyGenParameterSpec.F4);
            keyGen.initialize(spec);
            KeyPair pair = keyGen.generateKeyPair();
            printKeyPair(pair);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void printKeyPair(KeyPair kp) throws Exception {
        printKey(kp.getPrivate(), "private");
        writeToClipboard(printKey(kp.getPublic(), "public"));
    }

    // this doesn't appear to work on my system at least, oh well (linux)
    public void writeToClipboard(String writeMe) {
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(new StringSelection(writeMe), null);
    }

    public String printKey(Key key, String name) throws Exception {
        String encoded = Base64.encodeBytes(key.getEncoded(), Base64.URL_SAFE);
        System.out.printf("%s: %s\nlength: %d\n", name, encoded, encoded.length());
        String fileName = this.folderName + name + "key.txt";
        CheckedOutputStream os = new CheckedOutputStream(new FileOutputStream(fileName), new CRC32());
        org.moparscape.res.impl.Downloader.writeStream(new ByteArrayInputStream(encoded.getBytes()), os);
        long crc = os.getChecksum().getValue();
        System.out.printf("%s key written to: '%s'\ncrc: %d\n\n", name, fileName, crc);
        CheckedInputStream is = new CheckedInputStream(new FileInputStream(fileName), new CRC32());
        org.moparscape.res.impl.Downloader.writeStream(is, new OutputStream() {
            public void write(int b) {

            }
        });
        if (crc != is.getChecksum().getValue())
            System.out.println("ERROR: file written incorrectly, do not use these!");
        return encoded;
    }

}