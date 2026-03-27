package lenox.week_3.writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterEx {

    public static void main(String[] args) {

        String desktopPath = System.getProperty("user.home") + "/Desktop";

        try{
           Writer wr = new FileWriter(desktopPath + "/output1.csv");


            String fileContent = "I am learning to write into a CSV file";

            wr.write(fileContent);
            wr.close();

            System.out.println("Successfully write into a CSV file");


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
