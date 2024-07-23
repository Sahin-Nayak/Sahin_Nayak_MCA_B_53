import java.util.Scanner;

public class add_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the arrays: ");
        int size = sc.nextInt();
        int[] arr1 = new int[size]; // Input the elements of the first array
        System.out.println("Enter the elements of the first array:");
        for (int i = 0; i < size; i++) {
            arr1[i] = sc.nextInt();
        }
        int[] arr2 = new int[size];  // Input the elements of the second array
        System.out.println("Enter the elements of the second array:");
        for (int i = 0; i < size; i++) {
            arr2[i] = sc.nextInt();
        }
        int[] resultArray = new int[size]; // Add the elements index-wise and store into a third array
        for (int i = 0; i < size; i++) {
            resultArray[i] = arr1[i] + arr2[i];
        }
        System.out.println("Result array:");
        for (int num : resultArray) {
            System.out.print(num + " ");
        }sc.close();
    }}
