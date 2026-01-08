package loanbuddy;
public class HomeLoan extends LoanApplication {

    public HomeLoan(Applicant applicant, int term) {
        super(applicant, term, 8.5, "Home Loan");
    }

    @Override
    public boolean approveLoan() {
        if (applicant.getCreditScore() >= 700 && applicant.getIncome() >= 30000) {
            setApprovalStatus(true);
            return true;
        }
        setApprovalStatus(false);
        return false;
    }

    @Override
    public double calculateEMI() {
        return calculateStandardEMI(); // lower interest
    }
}
