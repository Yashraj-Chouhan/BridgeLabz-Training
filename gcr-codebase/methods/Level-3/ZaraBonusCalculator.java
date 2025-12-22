import java.util.Scanner;
public class ZaraBonusCalculator {

    // Method to generate salary and years of service
    public static double[][] generateEmployeeData(int employees) {
        double[][] data = new double[employees][2];

        for (int i = 0; i < employees; i++) {
            data[i][0] = 10000 + (int)(Math.random() * 90000); // 5-digit salary
            data[i][1] = 1 + (int)(Math.random() * 10);        // Years of service (1–10)
        }
        return data;
    }

    // Method to calculate bonus and new salary
    public static double[][] calculateBonus(double[][] data) {
        double[][] result = new double[data.length][2];

        for (int i = 0; i < data.length; i++) {
            double salary = data[i][0];
            double years = data[i][1];
            double bonus;

            if (years > 5) {
                bonus = salary * 0.05;
            } else {
                bonus = salary * 0.02;
            }

            result[i][0] = bonus;
            result[i][1] = salary + bonus;
        }
        return result;
    }

    // Method to display data and totals
    public static void displayReport(double[][] oldData, double[][] newData) {

        double totalOldSalary = 0;
        double totalBonus = 0;
        double totalNewSalary = 0;

        System.out.println("---------------------------------------------------------------");
        System.out.printf("%-10s %-15s %-15s %-15s%n",
                "Emp ID", "Old Salary", "Bonus", "New Salary");
        System.out.println("---------------------------------------------------------------");

        for (int i = 0; i < oldData.length; i++) {
            double oldSalary = oldData[i][0];
            double bonus = newData[i][0];
            double newSalary = newData[i][1];

            totalOldSalary += oldSalary;
            totalBonus += bonus;
            totalNewSalary += newSalary;

            System.out.printf("%-10d %-15.2f %-15.2f %-15.2f%n",
                    (i + 1), oldSalary, bonus, newSalary);
        }

        System.out.println("---------------------------------------------------------------");
        System.out.printf("%-10s %-15.2f %-15.2f %-15.2f%n",
                "TOTAL", totalOldSalary, totalBonus, totalNewSalary);
        System.out.println("---------------------------------------------------------------");
    }

    public static void main(String[] args) {

        int employees = 10;

        double[][] employeeData = generateEmployeeData(employees);
        double[][] bonusData = calculateBonus(employeeData);

        displayReport(employeeData, bonusData);
    }
}
