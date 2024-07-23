import java.util.Scanner;
public class sparse_matrix{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }}
        int zero = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    zero++;
                }}}
        double ratio = (double) zero / (rows * cols);
        if (ratio > 0.5) { // If more than 50% of elements are zero
            System.out.println("The matrix is sparse.");
        } else {
            System.out.println("The matrix is not sparse.");
        }sc.close();
    }}
