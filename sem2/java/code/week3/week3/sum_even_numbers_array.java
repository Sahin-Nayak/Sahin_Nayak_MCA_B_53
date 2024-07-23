import java.util.Scanner;

public class sum_even_numbers_array {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        // Input elements into the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }
        int sum = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                sum += num;
            }
        }
        System.out.println("Sum of even numbers in the array: " + sum);
        sc.close();
    }
}
