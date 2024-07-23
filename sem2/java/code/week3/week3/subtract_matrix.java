import java.util.Scanner;

public class subtract_matrix {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of rows of the matrices: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns of the matrices: ");
        int cols = sc.nextInt();
        int[][] matrix1 = new int[rows][cols];  // Input elements of the first matrix
        System.out.println("Enter the elements of the first matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }
        int[][] matrix2 = new int[rows][cols]; // Input elements of the second matrix
        System.out.println("Enter the elements of the second matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }
        int[][] result = subtract(matrix1, matrix2); // Subtract matrices
        System.out.println("Resultant matrix after subtraction:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }sc.close();}
    public static int[][] subtract(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }return result;}}
