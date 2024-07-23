import java.util.Scanner;

public class sum_2D_array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input dimensions of the arrays
        System.out.print("Enter the number of rows for the arrays: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns for the arrays: ");
        int cols = scanner.nextInt();
        // Initialize arrays
        int[][] array1 = new int[rows][cols];
        int[][] array2 = new int[rows][cols];
        int[][] sum= new int[rows][cols];
        // Input elements for first array
        System.out.println("Enter elements for the first array:");
		for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[0].length; j++) {
                System.out.print("Enter element at position [" + i + "][" + j + "]: ");
                array1[i][j] = scanner.nextInt();
            }
        }       
        // Input elements for second array
        System.out.println("Enter elements for the second array:");
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[0].length; j++) {
                System.out.print("Enter element at position [" + i + "][" + j + "]: ");
                array2[i][j] = scanner.nextInt();
            }
        }
        // Calculate sum
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j] = array1[i][j] + array2[i][j];
            }
        }
        // Display the sum array
        System.out.println("Sum of the two arrays:");
       for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < sum[0].length; j++) {
                System.out.print(sum[i][j] + "\t");
            }
            System.out.println();
        }
        scanner.close();
    }
}
   
