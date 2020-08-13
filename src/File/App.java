package File;

import java.io.File;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        File file = new File("/home/miguel/Documents/poo/io/src/File/foo.txt");
        if (file.exists()) {
            System.out.println("The file exists.");
        } else {
            try {
                file.createNewFile();
                System.out.println("File created.");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
