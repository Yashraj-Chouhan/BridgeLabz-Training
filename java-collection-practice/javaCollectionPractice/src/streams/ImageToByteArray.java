package streams;
import java.io.*;

public class ImageToByteArray {

    public static void main(String[] args) {

        FileInputStream fis = null;
        FileOutputStream fos = null;
        ByteArrayOutputStream baos = null;
        ByteArrayInputStream bais = null;

        try {
            // Step 1: Read image file
            fis = new FileInputStream("original.jpg");
            baos = new ByteArrayOutputStream();

            byte[] buffer = new byte[4096];
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
                baos.write(buffer, 0, bytesRead);
            }

            // Step 2: Convert image to byte array
            byte[] imageBytes = baos.toByteArray();

            // Step 3: Write byte array back to new image
            bais = new ByteArrayInputStream(imageBytes);
            fos = new FileOutputStream("copied.jpg");

            while ((bytesRead = bais.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

            System.out.println("Image converted to byte array and written successfully.");

        } catch (IOException e) {
            System.out.println("Error occurred while processing image.");

        } finally {
            try {
                if (fis != null) fis.close();
                if (baos != null) baos.close();
                if (bais != null) bais.close();
                if (fos != null) fos.close();
            } catch (IOException e) {
                System.out.println("Error while closing resources.");
            }
        }
    }
}
