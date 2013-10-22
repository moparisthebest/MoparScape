package mudclient;

import java.io.InputStream;
import sun.audio.AudioPlayer;

public class AudioReader extends InputStream {

    public AudioReader() {
        AudioPlayer.player.start(this);
    }

    public void stop() {
        AudioPlayer.player.stop(this);
    }

    public void play(byte abyte0[], int i, int j) {
        data = abyte0;
        offset = i;
        length = i + j;
    }

    public int read(byte arg0[], int arg1, int arg2) {
        for(int i = 0; i < arg2; i++)
            if(offset < length)
                arg0[arg1 + i] = data[offset++];
            else
                arg0[arg1 + i] = -1;

        return arg2;
    }

    public int read() {
        byte abyte0[] = new byte[1];
        read(abyte0, 0, 1);
        return abyte0[0];
    }

    byte data[];
    int offset;
    int length;
}
