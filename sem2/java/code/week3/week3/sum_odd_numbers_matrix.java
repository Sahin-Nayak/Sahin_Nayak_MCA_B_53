import java.util.Scanner;

public class sum_odd_numbers_matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();
        int[][] array = new int[rows][cols];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = sc.nextInt();
            }}
        int sum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (array[i][j] % 2 != 0) {
                    sum += array[i][j];
                }
            }
        }
        System.out.println("Sum of odd numbers in the 2D array: " + sum);
        sc.close();
    }
}
