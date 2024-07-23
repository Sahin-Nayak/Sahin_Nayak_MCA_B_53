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
public class parameterized_constructor{
    public static void main(String[] args) {
        // Creating a Student object using the parameterized constructor
        Student stu1 = new Student("Sahin", 22);
        System.out.println("Student 1 Details:");
        stu1.displayDetails();
        Student stu2 = new Student("Piklu", 18);
        System.out.println("\nStudent 2 Details:");
        stu2.displayDetails();
    }
}
