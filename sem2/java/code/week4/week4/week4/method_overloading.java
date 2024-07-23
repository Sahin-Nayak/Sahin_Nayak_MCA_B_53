import java.util.Scanner;
public class method_overloading {
    static int add(int a, int b) {// Method with two integer parameters
        return a + b;            }
    static int add(int a, int b, int c) { // Method with three integer parameters
        return a + b + c;               }
    static double add(double a, double b){ // Method with two double parameters
        return a + b;                    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter two integers:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("Sum of " + num1 + " and " + num2 + " is: " + add(num1, num2));
        System.out.println("Enter three integers:");
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();
        int num5 = sc.nextInt();
        System.out.println("Sum of " + num3 + ", " + num4 + " and " + num5 + " is: " + add(num3, num4, num5));
        System.out.println("Enter two doubles:");
        double num6 = sc.nextDouble();
        double num7 = sc.nextDouble();
        System.out.println("Sum of " + num6 + " and " + num7 + " is: " + add(num6, num7)); }}
