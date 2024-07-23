import java.util.Scanner;
class Student {
    private String name;
    private int rollNo;
    private int sub1;
    private int sub2;
    public void initialize(String name, int rollNo, int sub1, int sub2) {
        this.name = name;
        this.rollNo = rollNo;
        this.sub1 = sub1;
        this.sub2 = sub2;}
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks in Subject 1: " + sub1);
        System.out.println("Marks in Subject 2: " + sub2);}
    public int calculateTotalMarks() {
        return sub1 + sub2;}
    public double calculatePercentage() {
        int totalMarks = calculateTotalMarks();
        return (totalMarks / 2.0); // Considering two subjects, hence dividing by 2.0 for decimal result
    }}
public class student_total_percent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student details:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Roll No: ");
        int rollNo = sc.nextInt();
        System.out.print("Marks in Subject 1: ");
        int sub1 = sc.nextInt();
        System.out.print("Marks in Subject 2: ");
        int sub2 = sc.nextInt();
        Student student = new Student();
        student.initialize(name, rollNo, sub1, sub2);
        System.out.println("\nStudent Details:");
        student.display();
        int totalMarks = student.calculateTotalMarks();
        double percentage = student.calculatePercentage();
        System.out.println("\nTotal Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");
        sc.close(); }}