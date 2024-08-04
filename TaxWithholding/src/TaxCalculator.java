package src;

public class TaxCalculator implements ITaxCalculator {

    public double calculateTax(double income) {
        if (income < 500) {
            return income * 0.10;
        } else if (income >= 500 && income < 1500) {
            return income * 0.15;
        } else if (income >= 1500 && income < 2500) {
            return income * 0.20;
        } else {
            return income * 0.30;
        }
    }
}