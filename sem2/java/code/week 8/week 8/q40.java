import java.util.Scanner;
public class q40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str1.length(); i++) {
            char currentChar = str1.charAt(i);
            if (str2.indexOf(currentChar) != -1) {
                sb.append(str1.charAt(i)).append(" ");}}
        System.out.println("Common characters are : " + sb.toString());
        scanner.close();}}