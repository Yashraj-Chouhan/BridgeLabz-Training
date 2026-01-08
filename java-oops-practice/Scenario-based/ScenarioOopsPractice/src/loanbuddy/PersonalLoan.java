package loanbuddy;
public class PersonalLoan extends LoanApplication {

    public PersonalLoan(Applicant applicant, int term) {
        super(applicant, term, 14.0, "Personal Loan");
    }

    @Override
    public boolean approveLoan() {
        if (applicant.getCreditScore() >= 720 && applicant.getIncome() >= 40000) {
            setApprovalStatus(true);
            return true;
        }
        setApprovalStatus(false);
        return false;
    }

    @Override
    public double calculateEMI() {
        return calculateStandardEMI(); // highest EMI
    }
}
