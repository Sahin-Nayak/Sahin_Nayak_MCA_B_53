import java.util.Scanner;
public class q12andq13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st String :");
        String str1 = sc.nextLine();
		System.out.println("Enter 2nd String :");
        String str2 = sc.nextLine();
        // Method 1: Using equals() method (case-sensitive)
        boolean areEqual = str1.equals(str2);
        System.out.println("Using equals(): " + str1 + " == " + str2 + " is " + areEqual);
        // Method 2: Using equalsIgnoreCase() method (case-insensitive)
        boolean areEqualIgnoreCase = str1.equalsIgnoreCase(str2);
        System.out.println("Using equalsIgnoreCase(): " + str1 + " == " + str2 + " is " + areEqualIgnoreCase);
        sc.close();}}