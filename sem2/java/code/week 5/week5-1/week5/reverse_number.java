import java.util.Scanner;
class ThreeDigitNumber {
    private int num;
    public ThreeDigitNumber(int num) {
        if (num < 100 || num > 999) {
            System.out.println("Error: Number must be a 3-digit number.");
            System.exit(1); // Exit the program with an error status
        }
        this.num = num;}
    public void reverseAndDisplay() {
        int originalNum = num;
        int reverse = 0;
        while (originalNum != 0) {
            int digit = originalNum % 10;
            reverse = reverse * 10 + digit;
            originalNum /= 10;}
        System.out.println("Original Number: " + num);
        System.out.println("Reverse of the Number: " + reverse);}}
public class reverse_number{
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        System.out.print("Enter a 3-digit number: ");
        int number = sc.nextInt();
        ThreeDigitNumber obj = new ThreeDigitNumber(number);
        obj.reverseAndDisplay();
        sc.close(); }}
