package week5;

public class Complex {
    private double real;
    private double imaginary;

    // Constructor to initialize the complex numbers
    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Method to add two complex numbers
    public void add(Complex other) {
        double resultReal = this.real + other.real;
        double resultImaginary = this.imaginary + other.imaginary;

        System.out.println("Sum: " + resultReal + " + " + resultImaginary + "i");
    }

    public static void main(String[] args) {
        // Declare and initialize two complex objects
        Complex complex1 = new Complex(2.5, 3.0);
        Complex complex2 = new Complex(1.5, 2.0);

        // Call the add() method on the first complex object, passing the second complex object as a parameter
        complex1.add(complex2);
    }
}

