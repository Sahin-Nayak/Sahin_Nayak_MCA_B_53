class MyClass {
    // 0-argument constructor
    public MyClass() {
        System.out.println("This is a 0-argument constructor.");
    }

    // Method to display a message
    public void display() {
        System.out.println("hi, how are you?");
    }
}

public class zero_argument {
    public static void main(String[] args) {
        // Creating an object of MyClass
        MyClass obj = new MyClass();

        // Calling a method of the object
        obj.display();
    }
}
