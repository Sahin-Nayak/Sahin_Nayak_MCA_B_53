import java.util.Scanner;

public class merge_two_array_sort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the first array (A): ");
        int sizeA = scanner.nextInt();
        int[] A = new int[sizeA];
        System.out.println("Enter the elements of the first array (A) in ascending order:");
        for (int i = 0; i < sizeA; i++) {
            A[i] = scanner.nextInt();
        }
        System.out.print("Enter the size of the second array (B): ");
        int sizeB = scanner.nextInt();
        int[] B = new int[sizeB];
        System.out.println("Enter the elements of the second array (B) in ascending order:");
        for (int i = 0; i < sizeB; i++) {
            B[i] = scanner.nextInt();
        }
        int[] C = mergeArrays(A, B);
        System.out.println("Merged array (C):"); // Display the merged array
        for (int num : C) {
            System.out.print(num + " ");
        }scanner.close();
    }
    public static int[] mergeArrays(int[] A, int[] B) {
        int sizeA = A.length;
        int sizeB = B.length;
        int[] C = new int[sizeA + sizeB];

        int i = 0, j = 0, k = 0;
        while (i < sizeA && j < sizeB) {
            if (A[i] < B[j]) {
                C[k++] = A[i++];
            } else {
                C[k++] = B[j++];
            }
        }

        while (i < sizeA) {
            C[k++] = A[i++];
        }

        while (j < sizeB) {
            C[k++] = B[j++];
        }

        return C;
    }
}
