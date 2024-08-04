package src;

public class WeeklyTaxService {
    private final ITaxCalculator taxCalculator;

    public WeeklyTaxService(ITaxCalculator taxCalculator) {
        this.taxCalculator = taxCalculator;
    }

    public double calculateWeeklyTax(double income) {
        return taxCalculator.calculateTax(income);
    }
}