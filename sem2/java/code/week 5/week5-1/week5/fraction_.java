class Fraction {
 private int numerator;
 private int denominator;
 public Fraction() {
 numerator = 1;
 denominator = 1;}
 public Fraction(int numerator, int denominator) {
 this.numerator = numerator;
 this.denominator = denominator != 0 ? denominator : 1;}
 public Fraction(int numerator) {
 this.numerator = numerator;
 this.denominator = 1;}
 public void displayFraction() {
 System.out.println(numerator + "/" + denominator);}}
public class fraction_{
 public static void main(String[] args) {
 Fraction ob1 = new Fraction();
 Fraction ob2 = new Fraction(3, 4);
 Fraction ob3 = new Fraction(5); 
 System.out.print("Fraction 1: ");
 ob1.displayFraction();
 System.out.print("Fraction 2: ");
 ob2.displayFraction();
 System.out.print("Fraction 3: ");
 ob3.displayFraction();}}