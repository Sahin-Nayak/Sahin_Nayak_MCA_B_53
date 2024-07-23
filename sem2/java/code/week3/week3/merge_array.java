import java.util.Scanner;

public class merge_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the first array: ");
        int size1 = sc.nextInt();
        float[] arr1 = new float[size1];
        System.out.println("Enter the elements of the first array:");
        for (int i = 0; i < size1; i++) {
            arr1[i] = sc.nextFloat();
        }
        System.out.print("Enter the size of the second array: ");
        int size2 = sc.nextInt();
        float[] arr2 = new float[size2];
        System.out.println("Enter the elements of the second array:");
        for (int i = 0; i < size2; i++) {
            arr2[i] = sc.nextFloat();
        }
        float[] mergedArray = mergeArrays(arr1, arr2);
        System.out.println("Merged array:");
        for (float num : mergedArray) {
            System.out.print(num + " ");
        }sc.close();
    }
    public static float[] mergeArrays(float[] arr1, float[] arr2) {
        int size1 = arr1.length;
        int size2 = arr2.length;
        float[] mergedArray = new float[size1 + size2];
        for (int i = 0; i < size1; i++) {
            mergedArray[i] = arr1[i];
        }
        for (int i = 0; i < size2; i++) {
            mergedArray[size1 + i] = arr2[i];
        }return mergedArray;
    }
}
