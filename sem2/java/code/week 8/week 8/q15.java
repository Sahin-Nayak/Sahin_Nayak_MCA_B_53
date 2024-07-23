import java.util.Scanner;
public class q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st String");
        String str1 = sc.nextLine();
		System.out.println("Enter 2nd String");
        String str2 = sc.nextLine();
        int result1 = str1.compareToIgnoreCase(str2);
        int result2 = str2.compareToIgnoreCase(str1);
        System.out.println("str1.compareToIgnoreCase(str2): " + result1);
        System.out.println("str2.compareToIgnoreCase(str1): " + result2);
        sc.close();}}