import java.util.Scanner;
public class q1 {
    public static int calculateFactorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        return n * calculateFactorial(n - 1);}
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = scanner.nextInt();
        int fact = calculateFactorial(number);
        System.out.println(fact);
        scanner.close();}}