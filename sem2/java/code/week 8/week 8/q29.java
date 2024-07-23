import java.util.HashSet;
import java.util.Scanner;
public class q29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter First String : ");
        String str1 = sc.nextLine();
		System.out.println("Enter Second String : ");
        String str2 = sc.nextLine();
        String result = removeChars(str1, str2);
        System.out.println("Original String (First): " + str1);
        System.out.println("Original String (Second): " + str2);
        System.out.println("String after removing characters: " + result);
        sc.close();}
    public static String removeChars(String str1, String str2) {
        StringBuilder sb = new StringBuilder();
        HashSet<Character> charSet = new HashSet<>();
        for (char c : str1.toCharArray()) {
            charSet.add(c);}
        for (char c : str2.toCharArray()) {
            if (!charSet.contains(c)) {
                sb.append(c);}}
        return sb.toString();}}