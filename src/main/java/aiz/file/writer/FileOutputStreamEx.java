package aiz.file.writer;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx {

    public static void main(String[] args) {

        // ahahahahhahhahahahahhhhahhahhahahah
        // ahahahahhaaahaahhahahahhhahahahahh

        String desktopPath = System.getProperty("user.home") + "/Desktop";

        try{
           FileOutputStream out = new FileOutputStream(desktopPath + "/out.csv");

           String wr = "I am learning to write large amount of data into a file";
           byte[] bytes = wr.getBytes();

           out.write(bytes);

           out.close();

            System.out.println("Successfully written into a file");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
