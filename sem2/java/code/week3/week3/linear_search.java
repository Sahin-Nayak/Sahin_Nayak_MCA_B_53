import java.util.Scanner;

public class linear_search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] array = new int[size]; // Declare the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }
        System.out.print("Enter the element to search: "); // Input the element to be searched
        int target = sc.nextInt();
        int index = linearSearch(array, target); // Perform linear search
        if (index != -1) {
            System.out.println("Element " + target + " found at index " + index);
        } else {
            System.out.println("Element " + target + " not found in the array");
        }sc.close();
    }
    public static int linearSearch(int[] array, int target) {  // Method to perform search
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; // Return the index where the element is found
            }
        }
        return -1; // Return -1 if element is not found
    }
}
