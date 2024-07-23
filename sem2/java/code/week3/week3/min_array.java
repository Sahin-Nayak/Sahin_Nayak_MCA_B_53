import java.util.Scanner;

public class min_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }
        int min = array[0];
        for (int i = 1; i < n; i++) { // Find the smallest number in the array
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("The smallest number in the array is: " + min);
        sc.close();
    }
}
