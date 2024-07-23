class Superclass {
    static void display() {
        System.out.println("Static method in Superclass");}}
class Subclass extends Superclass {
    static void display() {
        System.out.println("Static method in Subclass");}}
public class method_hiding {
    public static void main(String[] args) {
        Superclass.display(); // Call the static method in Superclass
        Subclass.display(); // Call the static method in Subclass
        // Access the static method in Subclass using Superclass reference
        Superclass ref = new Subclass();
        ref.display();}}
