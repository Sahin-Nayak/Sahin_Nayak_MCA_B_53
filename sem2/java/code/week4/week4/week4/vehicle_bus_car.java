import java.util.Scanner;
class Vehicle {
    protected String regnNumber;
    protected int speed;
    protected String color;
    protected String ownerName;
    public Vehicle(String regnNumber, int speed, String color, String ownerName) {
        this.regnNumber = regnNumber;
        this.speed = speed;
        this.color = color;
        this.ownerName = ownerName;}
    protected void showData() {
        System.out.println("This is a vehicle class");}}
class Bus extends Vehicle {
    private String routeNumber;
    public Bus(String regnNumber, int speed, String color, String ownerName, String routeNumber) {
        super(regnNumber, speed, color, ownerName);
        this.routeNumber = routeNumber;}
    public void showData() {
        super.showData();
        System.out.println("Registration Number: " + regnNumber);
        System.out.println("Speed: " + speed);
        System.out.println("Color: " + color);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Route Number: " + routeNumber);}}
class Car extends Vehicle {
    private String manufacturerName;
    public Car(String regnNumber, int speed, String color, String ownerName, String manufacturerName) {
        super(regnNumber, speed, color, ownerName);
        this.manufacturerName = manufacturerName;}
    public void showData() {
        super.showData();
        System.out.println("Registration Number: " + regnNumber);
        System.out.println("Speed: " + speed);
        System.out.println("Color: " + color);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Manufacturer Name: " + manufacturerName);}}
public class vehicle_bus_car {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Bus Details:");
        System.out.print("Registration Number: ");
        String busRegnNumber = sc.nextLine();
        System.out.print("Speed: ");
        int busSpeed = sc.nextInt();
        sc.nextLine(); // Consume newline
        System.out.print("Color: ");
        String busColor = sc.nextLine();
        System.out.print("Owner Name: ");
        String busOwnerName = sc.nextLine();
        System.out.print("Route Number: ");
        String busRouteNumber = sc.nextLine();
        Bus b = new Bus(busRegnNumber, busSpeed, busColor, busOwnerName, busRouteNumber);
        System.out.println("\nBus Details which is entered by the user are:");
        b.showData();
        System.out.println("\nEnter Car Details:");
        System.out.print("Registration Number: ");
        String carRegnNumber = sc.nextLine();
        System.out.print("Speed: ");
        int carSpeed = sc.nextInt();
        sc.nextLine(); // Consume newline
        System.out.print("Color: ");
        String carColor = sc.nextLine();
        System.out.print("Owner Name: ");
        String carOwnerName = sc.nextLine();
        System.out.print("Manufacturer Name: ");
        String carManufacturerName = sc.nextLine();
        Car c = new Car(carRegnNumber, carSpeed, carColor, carOwnerName, carManufacturerName);
        System.out.println("\nCar Details which is entered by the user are:");
        c.showData();
        sc.close();
    }}