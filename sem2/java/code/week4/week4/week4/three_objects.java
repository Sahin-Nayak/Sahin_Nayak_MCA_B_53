import java.util.Scanner;
class ThreeDObject {
    ThreeDObject() {}     // Default constructor
    double wholeSurfaceArea() { // Method to calculate whole surface area
        return 0.0; }
    double volume() { // Method to calculate volume
        return 0.0;}}
class Box extends ThreeDObject {
    double length, width, height;
    Box(double l, double w, double h) {
        length = l;
        width = w;
        height = h; }
    double wholeSurfaceArea() { // Override method to calculate whole surface area
        return 2 * (length * width + length * height + width * height); }
    double volume() { // Override method to calculate volume
        return length * width * height; }}
class Cube extends Box {
    Cube(double side) {
        super(side, side, side); }}
class Cylinder extends ThreeDObject {
    double radius, height;
    Cylinder(double r, double h) {
        radius = r;
        height = h;}
    @Override
    double wholeSurfaceArea() { // Override method to calculate whole surface area
        return 2 * Math.PI * radius * (radius + height);}
    double volume() {
        return Math.PI * radius * radius * height;}}
class Cone extends Cylinder {
    Cone(double r, double h) {
        super(r, h);}
    double wholeSurfaceArea() {
        return Math.PI * radius * (radius + Math.sqrt(radius * radius + height * height));}
    double volume() {   // Override method to calculate volume
        return (1.0/3.0) * Math.PI * radius * radius * height;}}
public class three_objects {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length, width, and height of the Box:");
        double boxLength = sc.nextDouble();
        double boxWidth = sc.nextDouble();
        double boxHeight = sc.nextDouble();
        Box b = new Box(boxLength, boxWidth, boxHeight);
        System.out.println("Volume of Box: " + b.volume());
        System.out.println("Whole Surface Area of Box: " + b.wholeSurfaceArea());
        System.out.println("\nEnter side of the Cube:");
        double cubeSide = sc.nextDouble();
        Cube c = new Cube(cubeSide);
        System.out.println("Volume of Cube: " + c.volume());
        System.out.println("Whole Surface Area of Cube: " + c.wholeSurfaceArea());
        System.out.println("\nEnter radius and height of the Cylinder:");
        double cylinderRadius = sc.nextDouble();
        double cylinderHeight = sc.nextDouble();
        Cylinder cy = new Cylinder(cylinderRadius, cylinderHeight);
        System.out.println("Volume of Cylinder: " + cy.volume());
        System.out.println("Whole Surface Area of Cylinder: " + cy.wholeSurfaceArea());
        System.out.println("\nEnter radius and height of the Cone:");
        double coneRadius = sc.nextDouble();
        double coneHeight = sc.nextDouble();
        Cone cone = new Cone(coneRadius, coneHeight);
        System.out.println("Volume of Cone: " + cone.volume());
        System.out.println("Whole Surface Area of Cone: " + cone.wholeSurfaceArea());
        sc.close();
    }}
