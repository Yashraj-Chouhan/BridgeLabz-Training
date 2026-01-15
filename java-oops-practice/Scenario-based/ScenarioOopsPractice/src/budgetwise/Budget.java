package budgetwise;
import java.util.*;

abstract class Budget implements IAnalyzable {

    protected double income;
    protected double limit;
    protected Map<String, Double> categoryLimits;
    protected List<Transaction> transactions;

    public Budget(double income, double limit, Map<String, Double> categoryLimits) {
        this.income = income;
        this.limit = limit;
        this.categoryLimits = categoryLimits;
        this.transactions = new ArrayList<>();
    }

    // Controlled expense addition
    public void addTransaction(Transaction t) {
        transactions.add(t);
    }

    protected double totalExpenses() {
        double sum = 0;
        for (Transaction t : transactions) {
            if (t.getType().equalsIgnoreCase("expense")) {
                sum += t.getAmount();
            }
        }
        return sum;
    }

    // Operator usage
    public double netSavings() {
        return income - totalExpenses();
    }
}
