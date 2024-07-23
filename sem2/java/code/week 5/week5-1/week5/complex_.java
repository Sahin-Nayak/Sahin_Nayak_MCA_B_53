import java.util.Scanner;
class Complex {
    private double real;
    private double imaginary;
    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary; }
    public void add(Complex other) {
        double sumReal = this.real + other.real;
        double sumImaginary = this.imaginary + other.imaginary;
        System.out.println("Sum: " + sumReal + " + " + sumImaginary + "i"); }}
public class complex_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter real and imaginary parts for first complex number:");
        double real1 = sc.nextDouble();
        double imaginary1 = sc.nextDouble();
        System.out.println("Enter real and imaginary parts for second complex number:");
        double real2 = sc.nextDouble();
        double imaginary2 = sc.nextDouble();
        Complex ob1 = new Complex(real1, imaginary1);
        Complex ob2 = new Complex(real2, imaginary2);
        System.out.println("First Complex Number: " + real1 + " + " + imaginary1 + "i");
        System.out.println("Second Complex Number: " + real2 + " + " + imaginary2 + "i");
        ob1.add(ob2);
        sc.close(); }}
