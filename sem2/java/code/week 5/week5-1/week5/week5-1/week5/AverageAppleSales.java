import java.util.Scanner;
public class AverageAppleSales {
    public static void main(String[] args) {
        int daysInWeek = 7;
        float[] appleSales = new float[daysInWeek];
        Scanner scanner = new Scanner(System.in);
        for (int day = 0; day < daysInWeek; day++) {
            System.out.print("Enter the sales value for day " + (day + 1) + ": ");
            appleSales[day] = scanner.nextFloat(); }
        float totalSales = 0;
        for (float dailySale : appleSales) {
            totalSales += dailySale; }
        float averageSales = totalSales / daysInWeek;     
        System.out.println("The average apple sales for the week is: " + averageSales);}}

