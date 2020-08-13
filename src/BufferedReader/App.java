package BufferedReader;

import java.io.*;

public class App {
    public static void main(String[] args) {
        InputStream byteReader = null;
        InputStreamReader charReader = null;
        BufferedReader wordReader = null;
        try {
            byteReader = new FileInputStream("/home/miguel/Documents/poo/io/src/BufferedReader/foo.txt");
            charReader = new InputStreamReader(byteReader);
            wordReader = new BufferedReader(charReader);
            System.out.println(wordReader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (byteReader != null) {
                    byteReader.close();
                }
                if (charReader != null) {
                    charReader.close();
                }
                if (wordReader != null) {
                    wordReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
