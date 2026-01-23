package streams;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.IOException;

public class PipedStreamDemo {

    public static void main(String[] args) {

        try {
            // Create piped streams
            PipedOutputStream pos = new PipedOutputStream();
            PipedInputStream pis = new PipedInputStream(pos);

            // Create threads
            WriterThread writer = new WriterThread(pos);
            ReaderThread reader = new ReaderThread(pis);

            // Start threads
            reader.start();
            writer.start();

        } catch (IOException e) {
            System.out.println("Pipe connection error.");
        }
    }
}
