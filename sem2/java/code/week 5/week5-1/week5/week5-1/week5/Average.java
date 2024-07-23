import java.util.Scanner;
public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        
        double[] numbers = new double[10];
        System.out.println("Enter ten numbers:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextDouble();}
        double sum = 0;
        for (double num : numbers) {
            sum += num; }
        double average = sum / 10;
        System.out.println("Average: " + average);
        int countAboveAverage = 0;
        for (double num : numbers) {
            if (num > average) {
                countAboveAverage++; }}
        System.out.println("Numbers above average: " + countAboveAverage);
        scanner.close();}}

