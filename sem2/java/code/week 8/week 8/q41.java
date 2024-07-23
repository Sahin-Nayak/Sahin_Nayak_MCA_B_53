import java.util.Scanner;
public class q41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.print("Enter a character to search for: ");
        char ch = sc.next().charAt(0);
        int freq = 0;
        System.out.print("Position(s) of occurrence: ");
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                freq++;
                System.out.print((i + 1) + " ");}}
        System.out.println("\nfreq of character '" + ch + "': " + freq);
        sc.close();}}