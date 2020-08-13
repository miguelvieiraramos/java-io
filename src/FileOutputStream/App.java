package FileOutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class App {
    public static void main(String[] args) {
        OutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream("/home/miguel/Documents/poo/io/src/FileOutputStream/foo.txt");
            fileOutputStream.write(77);
            fileOutputStream.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
