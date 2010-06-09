package DavidScape.players;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class objectLoader //By Lin
{
    public int objectCount = 0;
    public int[] objectID = new int[1000];
    public int[] objectX = new int[1000];
    public int[] objectY = new int[1000];
    public int[] objectF = new int[1000];
    public int[] objectO = new int[1000];

    public boolean loadFile(String filename) {
        try {
            FileInputStream fstream = new FileInputStream(filename);
            DataInputStream in = new DataInputStream(fstream);
            int line = 0;
            objectCount = 0;

            while (in.available() != 0) {
                String l = in.readLine();
                if (l.equals("[EOF]"))
                    break;
                String[] splitData = l.split("\t");
                if (splitData[0].startsWith("object=")) {
                    objectID[objectCount] = Integer.parseInt(splitData[0].split("=")[1]);
                    objectX[objectCount] = Integer.parseInt(splitData[1]);
                    objectY[objectCount] = Integer.parseInt(splitData[2]);
                    objectF[objectCount] = Integer.parseInt(splitData[3]);
                    objectO[objectCount] = Integer.parseInt(splitData[4]);
                    //System.out.println(objectID[objectCount]+","+objectX[objectCount]+","+objectY[objectCount]+objectF[objectCount]+","+objectO[objectCount]);
                    objectCount++;
                }
            }
        }
        catch (Exception e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }
}