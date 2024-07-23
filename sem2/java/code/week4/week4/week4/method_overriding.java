import java.util.Scanner;
class Animal {
    public void sound() {// Method to make sound
        System.out.println("Animal makes a sound"); }}
class Dog extends Animal { // Child class inheriting from Animal
    public void sound() { // Overriding the makeSound method
        System.out.println("Dog barks"); }}
class Cat extends Animal { // Child class inheriting from Animal
    public void sound() {
        System.out.println("Cat meows"); }}
public class method_overriding {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 'dog' or 'cat' to hear the sound: ");
        String aype = sc.nextLine();
        Animal ob;// Creating object of Animal class
        if (aype.equalsIgnoreCase("dog")) { // Depending on user input, create an object of Dog or Cat class
            ob= new Dog(); // Dog object created
        } else if (aype.equalsIgnoreCase("cat")) {
            ob= new Cat(); // Cat object created
        } else {
            System.out.println("Invalid input. Please enter 'dog' or 'cat'.");
            return; }
        ob.sound(); // Invoke makeSound method of the respective class
        sc.close();}}
