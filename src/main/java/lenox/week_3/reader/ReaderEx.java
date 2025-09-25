package lenox.week_3.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderEx {

    public static void main(String[] args) {

        String desktopPath = System.getProperty("user.home") + "/Desktop";

        try{
            Reader rd = new FileReader(desktopPath + "/output1.csv");

            int readCount = rd.read();

            while (readCount != -1){
                System.out.print((char) readCount);
                readCount = rd.read();
            }
            rd.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
