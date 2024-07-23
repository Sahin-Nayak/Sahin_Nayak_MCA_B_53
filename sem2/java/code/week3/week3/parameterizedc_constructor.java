class Student {
    private String name;
    private int age;

    // Parameterized constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class parameterizedc_constructor{
    public static void main(String[] args) {
        // Creating a Student object using the parameterized constructor
        Student stu1 = new Student("John", 20);

        // Displaying student details
        System.out.println("Student 1 Details:");
        stu1.displayDetails();

        // Creating another Student object using the parameterized constructor
        Student stu2 = new Student("Hrisha", 21);

        // Displaying student details
        System.out.println("\nStudent 2 Details:");
        stu2.displayDetails();
    }
}
