package lenox.week_3.reader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamEx {

    public static void main(String[] args) {

        String desktopPath = System.getProperty("user.home") + "/Desktop";

        try{
            FileInputStream fs = new FileInputStream(desktopPath + "/output2.csv");

            int data;

            while ((data = fs.read()) != -1){
                System.out.print((char) data);
            }
            fs.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
