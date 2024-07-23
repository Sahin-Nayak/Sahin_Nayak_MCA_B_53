import java.util.Scanner;

public class sum_diagonals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the square matrix: ");
        int size = sc.nextInt();
        int[][] matrix = new int[size][size];
        // Input elements into the matrix
        System.out.println("Enter the elements of the square matrix:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("Element at position [" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += matrix[i][i]; // Add elements from the main diagonal
        }
        // Display the sum of diagonal elements
        System.out.println("Sum of diagonal elements: " + sum);
        sc.close();
    }
}
