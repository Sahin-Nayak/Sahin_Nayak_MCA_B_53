import java.util.Scanner;
public class q30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        System.out.println("Consecutive vowel substrings: " + findConsecutiveVowels(str));
        sc.close();}
    public static String findConsecutiveVowels(String str) {
        StringBuilder result = new StringBuilder();
        String vowels = "aeiouAEIOU";
        int startIndex = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (vowels.indexOf(ch) != -1) {
                if (i == 0 || !vowels.contains(String.valueOf(str.charAt(i - 1)))) {
                    startIndex = i;}
            } else if (startIndex != 0) {
                result.append(str.substring(startIndex, i));
                startIndex = 0;}}
        if (startIndex != 0) {
            result.append(str.substring(startIndex));}
        return result.toString().isEmpty() ? "No consecutive vowel substrings found." : result.toString(); }}