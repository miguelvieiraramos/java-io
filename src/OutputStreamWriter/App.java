package OutputStreamWriter;

import java.io.*;

public class App {
    public static void main(String[] args) {
        OutputStream outputStream = null;
        OutputStreamWriter outputStreamWriter = null;
        try {
            outputStream = new FileOutputStream("/home/miguel/Documents/poo/io/src/OutputStreamWriter/foo.txt");
            outputStreamWriter = new OutputStreamWriter(outputStream);
            outputStreamWriter.write("Miguel Ramos");
            outputStreamWriter.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (outputStreamWriter != null) {
                    outputStreamWriter.close();
                }
                if (outputStream != null) {
                    outputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
