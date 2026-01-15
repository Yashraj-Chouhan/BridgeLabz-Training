package budgetwise;
class AnnualBudget extends Budget {

    public AnnualBudget(double income, double limit, Map<String, Double> categories) {
        super(income, limit, categories);
    }

    @Override
    public void generateReport() {
        System.out.println("📆 Annual Budget Report");
        System.out.println("Yearly Income: " + income);
        System.out.println("Yearly Expenses: " + totalExpenses());
        System.out.println("Yearly Savings: " + netSavings());
    }

    @Override
    public void detectOverspend() {
        if (totalExpenses() > limit) {
            System.out.println("⚠ Annual spending exceeded overall limit!");
        }
    }
}
