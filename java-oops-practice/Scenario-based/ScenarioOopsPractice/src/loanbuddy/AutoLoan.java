package loanbuddy;
public class AutoLoan extends LoanApplication {

    public AutoLoan(Applicant applicant, int term) {
        super(applicant, term, 10.5, "Auto Loan");
    }

    @Override
    public boolean approveLoan() {
        if (applicant.getCreditScore() >= 650 && applicant.getIncome() >= 25000) {
            setApprovalStatus(true);
            return true;
        }
        setApprovalStatus(false);
        return false;
    }

    @Override
    public double calculateEMI() {
        return calculateStandardEMI(); // higher interest
    }
}
