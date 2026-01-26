package csv.basic.writecsv;
import java.io.*;

public class WriteCSV {
    public static void main(String[] args) throws Exception {

        FileWriter fw = new FileWriter("employees.csv");
        fw.write("ID,Name,Department,Salary\n");

        fw.write("1,Aman,IT,50000\n");
        fw.write("2,Rahul,HR,40000\n");
        fw.write("3,Priya,IT,60000\n");
        fw.write("4,Neha,Sales,45000\n");
        fw.write("5,Karan,IT,70000\n");

        fw.close();
    }
}
