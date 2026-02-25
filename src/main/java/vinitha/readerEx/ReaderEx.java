package vinitha.readerEx;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderEx {

    public static void main(String[] args) {

        String desktopPath = System.getProperty("user.home") + "/Desktop";

        try{
            Reader re = new FileReader(desktopPath + "/output.csv");

            int readContent = re.read();

            while (readContent != -1){ // This while the content we want to read from is not empty

                System.out.print((char) readContent);

                readContent = re.read();

            }

            re.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
