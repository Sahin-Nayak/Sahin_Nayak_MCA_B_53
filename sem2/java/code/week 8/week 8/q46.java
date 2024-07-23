public class q46 {
    public static void main(String[] args) {
        // Create a StringBuffer object
        StringBuffer stringBuffer = new StringBuffer();

        // Append string literals to the StringBuffer
        stringBuffer.append("Hello");
        stringBuffer.append(" ");
        stringBuffer.append("world");

        // Display the content of the StringBuffer
        System.out.println("Content of StringBuffer: " + stringBuffer);

        // Append more string literals
        stringBuffer.append(", ");
        stringBuffer.append("how");
        stringBuffer.append(" ");
        stringBuffer.append("are");
        stringBuffer.append(" ");
        stringBuffer.append("you");

        // Display the updated content of the StringBuffer
        System.out.println("Updated content of StringBuffer: " + stringBuffer);

        // You can also insert or replace characters in the StringBuffer using its
        // various methods
        stringBuffer.insert(12, "beautiful ");
        System.out.println("Content after insertion: " + stringBuffer);

        stringBuffer.replace(21, 24, "doing");
        System.out.println("Content after replacement: " + stringBuffer);

        // You can also delete characters from the StringBuffer
        stringBuffer.delete(29, 33);
        System.out.println("Content after deletion: " + stringBuffer);
    }
}
