public class Q_1 {
    public static void main(String[] args) {
      try {
        int result = divide(10, 0);  
        System.out.println("Result: " + result);
      } catch (ArithmeticException e) {
        System.out.println("Exception occurred: Division by zero");
      } finally {
        System.out.println("This block always executes.");}
      throwExample(); }
    public static int divide(int a, int b) throws ArithmeticException {
      if (b == 0) {
        throw new ArithmeticException("Division by zero");}
      return a / b;}
    public static void throwExample() {
      throw new NullPointerException("This exception is thrown intentionally.");}}
  