package vinitha.inputStreamEx;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamEx {

    public static void main(String[] args) {
        String desktopPath = System.getProperty("user.home") + "/Desktop";

        try{

            InputStream input = new FileInputStream(desktopPath + "/myFile.csv");

            int data;

            while ((data = input.read()) != -1){
                System.out.print((char) data);
            }

            input.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
