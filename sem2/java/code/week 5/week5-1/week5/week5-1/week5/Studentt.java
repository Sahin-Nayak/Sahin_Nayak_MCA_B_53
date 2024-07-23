package week5;

class Studentt {
    String name;
    int age;

    // Parameterized constructor using 'this' keyword
    Studentt(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method using 'this' keyword to refer to instance variables
    void displayInfo() {
        System.out.println("Student Name: " + this.name);
        System.out.println("Student Age: " + this.age);
    }



    public static void main(String[] args) {
        // Creating an instance of the Student class
        Studentt student1 = new Studentt("John Doe", 20);

        // Calling the method to display information
        student1.displayInfo();
    }
}

