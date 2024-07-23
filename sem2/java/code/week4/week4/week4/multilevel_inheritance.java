// Base class
class Animal {
    public void eat() {
        System.out.println("Animal is eating."); }}
class Mammal extends Animal { // Derived class inheriting from Animal
    public void walk() {
        System.out.println("Mammal is walking."); }}
class Dog extends Mammal { // Further derived class inheriting from Mammal
    public void bark() {
        System.out.println("Dog is barking."); }}
public class multilevel_inheritance{
    public static void main(String[] args) {
        Dog dog = new Dog();
        // Calling methods from Animal, Mammal, and Dog classes
        dog.eat();  // Inherited from Animal class
        dog.walk(); // Inherited from Mammal class
        dog.bark(); // Defined in Dog class 
		}}
