class Box {
    double width;
    double height;
    double depth;
    Box() { // Constructor with no parameters
        width = 1;
        height = 1;
        depth = 1;}
    Box(double w, double h, double d) { // Constructor with three parameters
        width = w;
        height = h;
        depth = d;}
    Box(double len) { // Constructor with a single parameter to create a cube
        width = len;
        height = len;
        depth = len;}
    double volume() { // Method to calculate and return the volume of the box
        return width * height * depth;
    }}
public class constructor_overloading{
    public static void main(String[] args) {
        Box box1 = new Box(); // Default constructor
        Box box2 = new Box(5, 3, 4); // Constructor with three parameters
        Box box3 = new Box(2.5); // Constructor with a single parameter
        System.out.println("Volume of box1: " + box1.volume());
        System.out.println("Volume of box2: " + box2.volume());
        System.out.println("Volume of box3: " + box3.volume());
    }}
