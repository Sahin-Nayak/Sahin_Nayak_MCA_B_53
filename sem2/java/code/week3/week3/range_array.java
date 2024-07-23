import java.util.Scanner;

public class range_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: "); // Input the size of the array
        int size = sc.nextInt();
        // Declare the array
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }
        int min = array[0];
        int max = array[0];
        for (int i = 1; i < size; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        int range = max - min;
        System.out.println("Range of the array: " + range);
        sc.close();
    }
}
