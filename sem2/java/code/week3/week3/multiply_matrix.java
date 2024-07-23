import java.util.Scanner;

public class multiply_matrix {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of rows of the first matrix: ");
        int rows1 = sc.nextInt();
        System.out.print("Enter the number of columns of the first matrix: ");
        int cols1 = sc.nextInt();
        System.out.print("Enter the number of rows of the second matrix: ");
        int rows2 = sc.nextInt();
        System.out.print("Enter the number of columns of the second matrix: ");
        int cols2 = sc.nextInt();
        if (cols1 != rows2) { // Check if matrix multiplication is possible
            System.out.println("Matrix multiplication is not possible.");
            return;
        }
        int[][] matrix1 = new int[rows1][cols1]; // Input elements of the first matrix
        System.out.println("Enter the elements of the first matrix:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }
        int[][] matrix2 = new int[rows2][cols2]; // Input elements of the second matrix
        System.out.println("Enter the elements of the second matrix:");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }
        int[][] result = multiply(matrix1, matrix2);

        // Display the result
        System.out.println("Resultant matrix after multiplication:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }sc.close();}
    public static int[][] multiply(int[][] matrix1, int[][] matrix2) {
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int rows2 = matrix2.length;
        int cols2 = matrix2[0].length;
        int[][] result = new int[rows1][cols2];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }return result;}}
