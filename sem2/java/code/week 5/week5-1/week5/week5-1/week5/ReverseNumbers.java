import java.util.Scanner;
public class ReverseNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        System.out.println("Enter ten integers:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter integer #" + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();}
        System.out.println("\nIntegers in reverse order:");
        for (int i = 9; i >= 0; i--) {
            System.out.println(numbers[i]);}
        scanner.close(); }}

