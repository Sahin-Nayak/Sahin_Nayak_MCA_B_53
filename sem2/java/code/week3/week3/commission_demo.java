import java.util.Scanner;
class Commission {
    private double sales;
    public Commission(double sales) {
        this.sales = sales;}
    public double commission() { // Method to calculate commission
        if (sales < 0) {
            return -1; // Indicates invalid input
        } else {
            return sales * 0.10; // Assuming commission rate is 10%
        }}}
public class commission_demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the sales amount: ");
        double sales = sc.nextDouble();
        if (sales < 0) { // Validate sales
            System.out.println("Invalid Input");
        } else {
            Commission ob  = new Commission(sales);
            double amount = ob.commission();
            if (amount == -1) {
                System.out.println("Invalid Input");
            } else {
                System.out.println("Commission: Rs " + amount); }}
        sc.close();}}
		
		
		
		
