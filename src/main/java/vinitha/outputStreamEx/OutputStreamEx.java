package vinitha.outputStreamEx;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamEx {


    public static void main(String[] args) {

        String desktopPath = System.getProperty("user.home") + "/Desktop";

        try{
            // The FileOutputStream is the sub-class of the Output stream class
            OutputStream out = new FileOutputStream(desktopPath + "/myfile.csv");

            String fileContent = "I am still learning a different way of writing into a file";

            byte[] bytes = fileContent.getBytes();

            // This are methods of the output stream
            out.write(bytes);
            out.flush();
            out.close();

            System.out.println("Successfully write into a file");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
