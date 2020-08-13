package FileInputStream;

import java.io.*;

public class App {
    public static void main(String[] args) {
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(new File("/home/miguel/Documents/poo/io/src/FileInputStream/foo.txt"));
            int ch;
            while ((ch = inputStream.read()) != -1) {
                System.out.println((char) ch);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
