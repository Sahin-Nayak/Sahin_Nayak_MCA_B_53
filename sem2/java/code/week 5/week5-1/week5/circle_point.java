import java.util.Scanner;
class Point {
    private double x;
    private double y;
    public Point(double x, double y) {
        this.x = x;
        this.y = y;}
    public double getX() {
        return x;}
    public double getY() {
        return y; }}
class Circle {
    private Point center;
    private double radius;
    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;}
    public double getArea() {
        return Math.PI * radius * radius;}}
public class circle_point {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the x-coordinate of the center:");
        double x = sc.nextDouble();
        System.out.println("Enter the y-coordinate of the center:");
        double y = sc.nextDouble();
        System.out.println("Enter the radius of the circle:");
        double radius = sc.nextDouble();
        Point center = new Point(x, y);
        Circle ob= new Circle(center, radius);
        double area = ob.getArea();
        System.out.println("The area of the circle is: " + area);
        sc.close(); }}
