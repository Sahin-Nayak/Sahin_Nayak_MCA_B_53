import java.util.Scanner;
class Employee {
    private int empId;
    private String name;
    private double salary;
    public Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;}
    public void display() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);}}
public class employee_print1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee[] employees = new Employee[5];
        for (int i = 0; i < employees.length; i++) {
            System.out.println("Enter details for Employee " + (i + 1) + ":");
            System.out.print("Employee ID: ");
            int empId = sc.nextInt();
            sc.nextLine(); // Consume newline character
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            employees[i] = new Employee(empId, name, salary);
            sc.nextLine(); }// Consume newline character
        System.out.println("\nEmployee Details:");
        for (Employee employee : employees) {
            employee.display();
            System.out.println(); }// Add a newline after each employee details
        sc.close(); }}
