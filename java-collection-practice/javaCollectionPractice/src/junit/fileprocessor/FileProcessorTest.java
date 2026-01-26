package junit.fileprocessor;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.IOException;

public class FileProcessorTest {

    FileProcessor processor = new FileProcessor();
    String fileName = "testfile.txt";

    @Test
    void testWriteAndReadFile() throws IOException {
        processor.writeToFile(fileName, "Hello JUnit");

        String content = processor.readFromFile(fileName);

        assertEquals("Hello JUnit", content);
    }

    @Test
    void testFileExistsAfterWrite() throws IOException {
        processor.writeToFile(fileName, "File Exists Test");

        File file = new File(fileName);
        assertTrue(file.exists());
    }

    @Test
    void testReadNonExistingFile() {
        assertThrows(IOException.class, () -> {
            processor.readFromFile("nofile.txt");
        });
    }
}
