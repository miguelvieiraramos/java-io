package InputStreamReader;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) {
        InputStream byteReader = null;
        InputStreamReader charReader = null;
        try {
            byteReader = new FileInputStream("/home/miguel/Documents/poo/io/src/InputStreamReader/foo.txt");
            charReader = new InputStreamReader(byteReader);
            int character;
            while((character=charReader.read()) != -1) {
                System.out.println((char) character);
            }
            String enconding = charReader.getEncoding();
            System.out.println(enconding);
        } catch(IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (byteReader != null) {
                    byteReader.close();
                }
                if (charReader != null) {
                    charReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
