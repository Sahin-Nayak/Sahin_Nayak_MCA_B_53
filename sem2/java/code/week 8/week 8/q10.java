import java.util.Scanner;
public class q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two strings : ");
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        boolean areEqual = str1.equalsIgnoreCase(str2);
        System.out.println(areEqual);
        sc.close();}}