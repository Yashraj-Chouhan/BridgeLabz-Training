package streams;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteStudentData {

    public static void main(String[] args) {

        try (DataOutputStream dos =
                     new DataOutputStream(new FileOutputStream("student.dat"))) {

            // Writing primitive data
            dos.writeInt(101);            // Roll number
            dos.writeUTF("Yashraj");      // Name
            dos.writeDouble(8.75);        // GPA

            System.out.println("Student data written successfully.");

        } catch (IOException e) {
            System.out.println("Error while writing student data.");
        }
    }
}
