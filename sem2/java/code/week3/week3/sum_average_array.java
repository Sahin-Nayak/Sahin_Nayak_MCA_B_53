import java.util.Scanner;

public class sum_average_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // taking input of array length from user
        System.out.print("Enter the number of elements in the array: ");
        int size = sc.nextInt();
        // Declare an array of the given size
        int[] array = new int[size];
        // Input elements from the user
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }
        int sum = 0; // Calculate sum
        for (int num : array) {
            sum += num;
        }
        double average = (double) sum / size;  // Calculate average
        System.out.println("Sum: " + sum); // Display sum and average
        System.out.println("Average: " + average);
        sc.close();
    }
}
