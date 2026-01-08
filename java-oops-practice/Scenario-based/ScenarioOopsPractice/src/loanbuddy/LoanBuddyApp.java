package loanbuddy;
public class LoanBuddyApp {

    public static void main(String[] args) {

        Applicant applicant =
                new Applicant("Yashraj", 750, 50000, 500000);

        LoanApplication loan =
                new HomeLoan(applicant, 240); // 20 years

        if (loan.approveLoan()) {
            System.out.println("Loan Approved!");
            System.out.println("Monthly EMI: ₹" +
                    String.format("%.2f", loan.calculateEMI()));
        } else {
            System.out.println("Loan Rejected!");
        }
    }
}
