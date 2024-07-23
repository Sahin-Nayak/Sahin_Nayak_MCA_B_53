import java.util.Scanner;
public class q22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string : ");
        String str = sc.nextLine();
        String[] substrings = str.split("\\s");
        System.out.println("Substrings:");
        for (String substring : substrings) {
            System.out.println(substring);}
        sc.close();}}