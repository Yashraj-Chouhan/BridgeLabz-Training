package loanbuddy;
public abstract class LoanApplication implements IApprovable {

    protected Applicant applicant;
    protected int term; // months
    protected double interestRate;
    protected String loanType;

    private boolean approved; // internal state

    public LoanApplication(Applicant applicant, int term, double interestRate, String loanType) {
        this.applicant = applicant;
        this.term = term;
        this.interestRate = interestRate;
        this.loanType = loanType;
    }

    protected void setApprovalStatus(boolean status) {
        this.approved = status; // restricted access
    }

    public boolean isApproved() {
        return approved;
    }

    // EMI formula: P × R × (1+R)^N / ((1+R)^N – 1)
    protected double calculateStandardEMI() {
        double P = applicant.getLoanAmount();
        double R = interestRate / 12 / 100;
        int N = term;

        return (P * R * Math.pow(1 + R, N)) /
               (Math.pow(1 + R, N) - 1);
    }
}
