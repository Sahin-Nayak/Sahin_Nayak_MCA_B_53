import java.util.Scanner;
public class Investment{
    public static void main(String[] args) {     
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the investment amount: ");
        double investmentAmount = scanner.nextDouble();
        System.out.print("Enter the annual interest rate (in percentage): ");
        double annualInterestRate = scanner.nextDouble();     
        annualInterestRate /= 100;     
        System.out.println("Years\tFuture Value");
        for (int years = 1; years <= 30; years++) {
            double futureValue = calculateFutureValue(investmentAmount, annualInterestRate, years);
            System.out.printf("%d\t%.2f\n", years, futureValue);}       
        scanner.close();}
    private static double calculateFutureValue(double investmentAmount, double annualInterestRate, int years) {
        return investmentAmount * Math.pow(1 + annualInterestRate, years);
    }}
