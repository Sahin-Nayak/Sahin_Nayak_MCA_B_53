import java.util.Scanner;

public class count_prime_array {
    // Function to check if a number is prime
    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }}
        return true;}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size]; // Input the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int c = 0; // Count prime numbers in the array
        for (int i = 0; i < size; i++) {
            if (isPrime(arr[i])) {
                c++;
            }}
        System.out.println("Number of prime numbers in the array: " +c);
        sc.close();
    }}
