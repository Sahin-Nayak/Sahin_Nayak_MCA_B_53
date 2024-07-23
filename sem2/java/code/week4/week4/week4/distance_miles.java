import java.util.Scanner;
class Distance {
    protected double distanceInMiles;
    public Distance(double distanceInMiles) {
        this.distanceInMiles = distanceInMiles;}
    public void travelTime() {
        double timeInHours = distanceInMiles / 60.0; // Speed is 60 miles per hour
        System.out.println("Time taken to cover the distance: " + timeInHours + " hours");}}
class DistanceMKS extends Distance { // Derived class DistanceMKS
    public DistanceMKS(double distanceInMiles) {
        super(distanceInMiles);}
    public void travelTime() {
        double distanceInKilometers = distanceInMiles * 1.60934; // Conversion from miles to kilometers
        double timeInSeconds = distanceInKilometers / 100.0; // Speed is 100 kilometers per hour
        System.out.println("Time taken to cover the distance: " + timeInSeconds + " seconds");}}
public class distance_miles {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the distance between two locations in miles: ");
        double distanceInMiles = sc.nextDouble();
        Distance distance = new Distance(distanceInMiles);
        DistanceMKS distanceMKS = new DistanceMKS(distanceInMiles);
        System.out.println("\nTravel time assuming speed is 60 miles per hour:");
        distance.travelTime();
        System.out.println("\nTravel time assuming speed is 100 km per hour:");
        distanceMKS.travelTime();
        sc.close();}}
