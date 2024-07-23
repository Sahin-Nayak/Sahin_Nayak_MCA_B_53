import java.util.Scanner;
public class q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = sc.nextLine();
        str = str.trim();
        str = str.replaceAll("\\s", "");
        System.out.println(str);
        sc.close();}}