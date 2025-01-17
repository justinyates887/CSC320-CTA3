package src;
import java.util.Scanner; //IO

public class TaxCalculatorApp {
    public static void main(String[] args) {
    	
    	//Implement the interface
        ITaxCalculator taxCalculator = new TaxCalculator();
        //Inject dependency
        WeeklyTaxService weeklyTaxService = new WeeklyTaxService(taxCalculator);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your weekly income: ");
        double income = scanner.nextDouble();
        scanner.close();
        
        double tax = weeklyTaxService.calculateWeeklyTax(income);

        System.out.println("Weekly income: " + income);
        System.out.println("Tax withholding: " + tax);
        System.out.println("-----------------------");
        System.out.println("Net income " + (income - tax));
    }
}