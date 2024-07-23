import java.lang.reflect.Method;
import java.util.Scanner;

public class q47 {
    public static void main(String[] args) {
        // Get the Class object for StringBuffer
        Class<StringBuffer> stringBufferClass = StringBuffer.class;

        // Get all the methods declared in the StringBuffer class
        Method[] stringBufferMethods = stringBufferClass.getDeclaredMethods();

        // Method name to check
        Scanner sc = new Scanner(System.in);
        String methodName = sc.nextLine(); // Change this to the method you want to verify

        // Check if the method exists in the StringBuffer class
        boolean methodExists = false;
        for (Method method : stringBufferMethods) {
            if (method.getName().equals(methodName)) {
                methodExists = true;
                break;
            }
        }

        // Print the result
        if (methodExists) {
            System.out.println("The method '" + methodName + "' exists in the StringBuffer class.");
        } else {
            System.out.println("The method '" + methodName + "' does not exist in the StringBuffer class.");
        }
        sc.close();
    }
}
