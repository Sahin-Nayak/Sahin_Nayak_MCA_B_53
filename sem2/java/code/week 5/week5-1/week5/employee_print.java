import java.util.Scanner;
class Employee {
    private int empId;
    private String empName;
    private double basicSalary;
    public void acceptDetails(int empId, String empName, double basicSalary) {
        this.empId = empId;
        this.empName = empName;
        this.basicSalary = basicSalary; }
    public double calculateGrossSalary() {
        // Assuming 20% of basic salary as allowance
        double allowance = 0.2 * basicSalary;
        double grossSalary = basicSalary + allowance;
        return grossSalary; }
    public void displayGrossSalary() {
        double grossSalary = calculateGrossSalary();
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Gross Salary: " + grossSalary); }}
public class employee_print{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        int empId = sc.nextInt();
        sc.nextLine(); // Consume newline character
        System.out.print("Enter Employee Name: ");
        String empName = sc.nextLine();
        System.out.print("Enter Basic Salary: ");
        double basicSalary = sc.nextDouble();
        Employee ob = new Employee();
        ob.acceptDetails(empId, empName, basicSalary);
        System.out.println("\nEmployee Details and Gross Salary:");
        ob.displayGrossSalary();
	    sc.close();}}
