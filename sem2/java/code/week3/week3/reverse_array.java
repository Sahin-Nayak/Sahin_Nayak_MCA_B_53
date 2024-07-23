import java.util.Scanner;
public class reverse_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        // Input elements into the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }
        reverseArray(array); // Reverse the array
        System.out.println("Reversed array:"); // Display the reversed array
        for (int num : array) {
            System.out.print(num + " ");
        }sc.close();
    }
    public static void reverseArray(int[] array) {
        int start = 0;
        int end = array.length - 1;
        while (start < end) {
            int temp = array[start]; 
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }}}
