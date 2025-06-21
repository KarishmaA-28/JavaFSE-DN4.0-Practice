import java.util.Scanner;

public class InvestmentProjector {
    
    static double futureValue(double presentValue, double growthRate, int years) {
        if (years == 0) {
            return presentValue;
        } else {
            return (1 + growthRate) * futureValue(presentValue, growthRate, years - 1);
        }
    }
    
    static void showComplexityInfo() {
        System.out.println("\n Time Complexity Info:");
        System.out.println("- Recursive Time Complexity: O(n)");
        System.out.println("- Recursive Space Complexity: O(n) (due to call stack)");
        System.out.println("- Iterative approach would reduce space to O(1)\n");
    }
    
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println(" Investment Growth Projection Tool\n");
            
            System.out.print(" Enter Initial Investment Amount: ");
            double initialAmount = input.nextDouble();
            
            System.out.print(" Enter Expected Annual Return Rate (e.g. 0.08 for 8%): ");
            double returnRate = input.nextDouble();
            
            System.out.print(" Enter Investment Period in Years: ");
            int timePeriod = input.nextInt();
            
            double projectedValue = futureValue(initialAmount, returnRate, timePeriod);
            
            System.out.printf("\n Projected Investment Value after %d years: $%.2f\n", timePeriod, projectedValue);
            
            double totalGrowth = projectedValue - initialAmount;
            System.out.printf(" Total Growth: $%.2f\n", totalGrowth);
            
            showComplexityInfo();
        }
    }
}