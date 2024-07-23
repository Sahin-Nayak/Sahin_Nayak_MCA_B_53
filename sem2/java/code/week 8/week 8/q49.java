import java.util.Scanner;

public class q49 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String input = scanner.nextLine();

        int wordCount = countWords(input);
        System.out.println("Number of words: " + wordCount);

        scanner.close();
    }

    public static int countWords(String text) {
        int wordCount = 0;
        boolean inWord = false;

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if (c != ' ' && !inWord) {
                wordCount++;
                inWord = true;
            } else if (c == ' ' && inWord) {
                inWord = false;
            }
        }

        return wordCount;
    }
}
