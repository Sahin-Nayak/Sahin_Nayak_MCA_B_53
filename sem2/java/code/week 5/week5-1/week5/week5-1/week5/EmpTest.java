package week5;

import java.util.Scanner;

public class EmpTest {
    public static void main(String[] args) {
       
        Emp[] employees = new Emp[5];

        
        Scanner scanner = new Scanner(System.in);

        
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for Employee " + (i + 1) + ":");
            System.out.print("Employee ID: ");
            int empid = scanner.nextInt();
            scanner.nextLine(); 
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Salary: ");
            double salary = scanner.nextDouble();

            
            employees[i] = new Emp(empid, name, salary);
        }

        
        System.out.println("\nEmployee Information:");
        for (Emp emp : employees) {
            emp.display();
        }

       
        scanner.close();
    }
}
