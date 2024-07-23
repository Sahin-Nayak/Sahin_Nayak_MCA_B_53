package week5;

public class Student {
    private String name;
    private int roll;
    private double sub1;
    private double sub2;

    
    public Student(String name, int roll, double sub1, double sub2) {
        this.name = name;
        this.roll = roll;
        this.sub1 = sub1;
        this.sub2 = sub2;
    }

   
    public void displayStudentDetails() {
        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + roll);
        System.out.println("Subject 1 Marks: " + sub1);
        System.out.println("Subject 2 Marks: " + sub2);
    }

    
    public void calculateAndDisplayResult() {
        double totalMarks = sub1 + sub2;
        double percentage = (totalMarks / 200) * 100; 

        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");
    }

    public static void main(String[] args) {
       
        Student student1 = new Student("Ronith", 40, 85.5, 92.0);
        student1.displayStudentDetails();
        student1.calculateAndDisplayResult();
        System.out.println();
        Student student2 = new Student("Gourab", 39, 90, 82.0);
        student2.displayStudentDetails();
        student2.calculateAndDisplayResult();
    }
}

