import java.util.Scanner;
class Vehicle {
    protected int Wheels;
    protected double speed;
    public Vehicle(int Wheels, double speed) {
        this.Wheels = Wheels;
        this.speed = speed; }
    public double getSpeed() {
        return speed; }
    public void displayInfo() {
        System.out.println("Number of Wheels: " + Wheels);
        System.out.println("Speed: " + speed + " mph"); }}
class Car extends Vehicle { // Derived class Car
    private int Passengers;
    public Car(int Wheels, double speed, int Passengers) {
        super(Wheels, speed);
        this.Passengers = Passengers; }
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Passengers: " + Passengers);}}
class Truck extends Vehicle { // Derived class Truck
    private double loadLimit;
    public Truck(int Wheels, double speed, double loadLimit) {
        super(Wheels, speed);
        this.loadLimit = loadLimit;}
    public void displayInfo() {
        super.displayInfo();
	System.out.println("Load Limit: " + loadLimit + " tons");}}
public class vehicle_car_truck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter details for Car:");
        System.out.print("Number of Wheels: ");
        int carWheels = sc.nextInt();
        System.out.print("Speed (mph): ");
        double carSpeed = sc.nextDouble();
        System.out.print("Number of Passengers: ");
        int passengers = sc.nextInt();
        System.out.println("\nEnter details for Truck:");
        System.out.print("Number of Wheels: ");
        int truckWheels = sc.nextInt();
        System.out.print("Speed (mph): ");
        double truckSpeed = sc.nextDouble();
        System.out.print("Load Limit (tons): ");
        double loadLimit = sc.nextDouble();
        Car c = new Car(carWheels, carSpeed, passengers);
        Truck t = new Truck(truckWheels, truckSpeed, loadLimit);
        System.out.println("\nInformation about Car:");
        c.displayInfo();
        System.out.println("\nInformation about Truck:");
        t.displayInfo();
        if (c.getSpeed() > t.getSpeed()) { // Comparing speeds
            System.out.println("\nCar is faster than Truck.");
        } else if (c.getSpeed() < t.getSpeed()) {
            System.out.println("\nTruck is faster than Car.");
        } else {
            System.out.println("\nCar and Truck have the same speed.");}
        sc.close(); }}
