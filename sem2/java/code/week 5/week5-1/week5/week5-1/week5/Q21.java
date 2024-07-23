import java.util.Scanner;
public class Q21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int inputNumber = scanner.nextInt();
        int sum = calculateConsecutiveDigitSum(inputNumber);
        System.out.println("Output: " + sum);}
    private static int calculateConsecutiveDigitSum(int number) {
        String strNumber = Integer.toString(number);
        int sum = 0;
        for (int i = 0; i < strNumber.length() - 1; i++) {
            int currentDigit = Character.getNumericValue(strNumber.charAt(i));
            int nextDigit = Character.getNumericValue(strNumber.charAt(i + 1));
            int consecutiveNumber = currentDigit * 10 + nextDigit;
            sum += consecutiveNumber;}
        return sum; }}

