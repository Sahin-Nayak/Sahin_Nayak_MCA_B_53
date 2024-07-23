public class Employee {
    private int empid;
    private String empname;
    private double basic_salary;   
    public Employee(int empid, String empname, double basic_salary) {
        this.empid = empid;
        this.empname = empname;
        this.basic_salary = basic_salary;}
    public void displayGrossSalary() {
        double allowances = 0.2 * basic_salary;  
        double deductions = 0.1 * basic_salary;  
        double gross_salary = basic_salary + allowances - deductions;
        System.out.println("Employee Details:");
        System.out.println("Employee ID: " + empid);
        System.out.println("Employee Name: " + empname);
        System.out.println("Basic Salary: " + basic_salary);
        System.out.println("Allowances: " + allowances);
        System.out.println("Deductions: " + deductions);
        System.out.println("Gross Salary: " + gross_salary);}
    public static void main(String[] args) {
        Employee employee1 = new Employee(1001, "Alice", 50000.0);
        employee1.displayGrossSalary(); }}

