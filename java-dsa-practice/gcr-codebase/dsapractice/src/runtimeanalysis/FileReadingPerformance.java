package runtimeanalysis;
import java.io.*;

public class FileReadingPerformance {

    // ---------- Using FileReader (Character Stream) ----------
    public static void readUsingFileReader(String filePath) {
        long start = System.currentTimeMillis();

        try (FileReader fr = new FileReader(filePath);
             BufferedReader br = new BufferedReader(fr)) {

            while (br.read() != -1) {
                // reading character by character
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        long end = System.currentTimeMillis();
        System.out.println("FileReader Time: " + (end - start) + " ms");
    }

    // ---------- Using InputStreamReader (Byte Stream -> Character Stream) ----------
    public static void readUsingInputStreamReader(String filePath) {
        long start = System.currentTimeMillis();

        try (InputStream is = new FileInputStream(filePath);
             InputStreamReader isr = new InputStreamReader(is);
             BufferedReader br = new BufferedReader(isr)) {

            while (br.read() != -1) {
                // reading bytes converted to characters
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        long end = System.currentTimeMillis();
        System.out.println("InputStreamReader Time: " + (end - start) + " ms");
    }

    // ---------- Main Method ----------
    public static void main(String[] args) {

        // Change path according to your system
        String filePath = "largefile.txt"; // e.g., 500MB file

        System.out.println("Reading file: " + filePath);

        readUsingFileReader(filePath);
        readUsingInputStreamReader(filePath);
    }
}
