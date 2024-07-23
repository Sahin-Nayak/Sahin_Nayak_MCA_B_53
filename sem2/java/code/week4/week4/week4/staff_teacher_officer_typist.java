import java.util.*;
class Staff { // Base class Staff
    protected int code;
    protected String name;
    public Staff(int code, String name) {
        this.code = code;
        this.name = name;}
    public void display() {
        System.out.println("Code: " + code);
        System.out.println("Name: " + name);}}
class Teacher extends Staff { // Subclass Teacher
    private String subject;
    private String publication;
    public Teacher(int code, String name, String subject, String publication) {
        super(code, name);
        this.subject = subject;
        this.publication = publication;}
    public void display() {
        super.display();
        System.out.println("Subject: " + subject);
        System.out.println("Publication: " + publication);}}
class Officer extends Staff {// Subclass Officer
    private String grade;
    public Officer(int code, String name, String grade) {
        super(code, name);
        this.grade = grade;}
    public void display() {
        super.display();
        System.out.println("Grade: " + grade);}}
class Typist extends Staff {// Subclass Typist
    private int speed;
    public Typist(int code, String name, int speed) {
        super(code, name);
        this.speed = speed;}
    public void display() {
        super.display();
        System.out.println("Speed: " + speed);}}
class RegularTypist extends Typist {// Subclass RegularTypist
    private double remuneration;
    public RegularTypist(int code, String name, int speed, double remuneration) {
        super(code, name, speed);
        this.remuneration = remuneration;}
    public void display() {
        super.display();
        System.out.println("Remuneration: " + remuneration);}}
class CasualTypist extends Typist {// Subclass CasualTypist
    private double dailyWages;
    public CasualTypist(int code, String name, int speed, double dailyWages) {
        super(code, name, speed);
        this.dailyWages = dailyWages;}
    public void display() {
        super.display();
        System.out.println("Daily Wages: " + dailyWages);}}
public class staff_teacher_officer_typist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter details for Teacher:");
        System.out.print("Code: ");
        int teacherCode = sc.nextInt();
        sc.nextLine(); // Consume newline
        System.out.print("Name: ");
        String teacherName = sc.nextLine();
        System.out.print("Subject: ");
        String subject = sc.nextLine();
        System.out.print("Publication: ");
        String publication = sc.nextLine();
        Teacher teacher = new Teacher(teacherCode, teacherName, subject, publication);
        System.out.println("\nEnter details for Officer:");
        System.out.print("Code: ");
        int officerCode = sc.nextInt();
        sc.nextLine(); // Consume newline
        System.out.print("Name: ");
        String officerName = sc.nextLine();
        System.out.print("Grade: ");
        String grade = sc.nextLine();
        Officer officer = new Officer(officerCode, officerName, grade);
        System.out.println("\nEnter details for Regular Typist:");
        System.out.print("Code: ");
        int regularTypistCode = sc.nextInt();
        sc.nextLine(); // Consume newline
        System.out.print("Name: ");
        String regularTypistName = sc.nextLine();
        System.out.print("Speed: ");
        int speed = sc.nextInt();
        System.out.print("Remuneration: ");
        double remuneration = sc.nextDouble();
        RegularTypist regularTypist = new RegularTypist(regularTypistCode, regularTypistName, speed, remuneration);
        System.out.println("\nEnter details for Casual Typist:");
        System.out.print("Code: ");
        int casualTypistCode = sc.nextInt();
        sc.nextLine(); // Consume newline
        System.out.print("Name: ");
        String casualTypistName = sc.nextLine();
        System.out.print("Speed: ");
        int casualTypistSpeed = sc.nextInt();
        System.out.print("Daily Wages: ");
        double dailyWages = sc.nextDouble();
        CasualTypist casualTypist = new CasualTypist(casualTypistCode, casualTypistName, casualTypistSpeed, dailyWages);
        System.out.println("\nDetails of entered employees:");
        System.out.println("\nTeacher:");
        teacher.display();
        System.out.println("\nOfficer:");
        officer.display();
        System.out.println("\nRegular Typist:");
        regularTypist.display();
        System.out.println("\nCasual Typist:");
        casualTypist.display();
        sc.close();}}
