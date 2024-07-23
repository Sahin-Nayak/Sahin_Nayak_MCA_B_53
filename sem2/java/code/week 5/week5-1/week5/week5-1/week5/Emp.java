package week5;

import java.util.Scanner;

class Emp {
    int empid;
    String name;
    double salary;

    // Parameterized constructor
    Emp(int empid, String name, double salary) {
        this.empid = empid;
        this.name = name;
        this.salary = salary;
    }

    // Display method to print employee information
    void display() {
        System.out.println("Employee ID: " + empid);
        System.out.println("Name: " + name);
        System.out.println("Salary: $" + salary);
        System.out.println();
    }
}



