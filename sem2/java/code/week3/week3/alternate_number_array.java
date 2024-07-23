import java.util.Scanner;

public class alternate_number_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: "); // Input the size of the array
        int size = sc.nextInt();
        int[] array = new int[size]; // Input the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        // Print every alternate number
        System.out.println("Alternate numbers of the array:");
        for (int i = 0; i < size; i += 2) {
            System.out.print(array[i] + " ");
        }

        sc.close();
    }
}
