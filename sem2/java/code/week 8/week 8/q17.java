import java.util.Scanner;
public class q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter string : ");
        String str = sc.nextLine();
        System.out.println("Enter sub string : ");
        String subStr = sc.next();
        int lastIndex = -1;
        for (int i = str.length() - subStr.length(); i >= 0; i--) {
            boolean match = true;
            for (int j = 0; j < subStr.length(); j++) {
                if (str.charAt(i + j) != subStr.charAt(j)) {
                    match = false;
                    break;}}
            if (match) {
                lastIndex = i;
                break;}}
        if (lastIndex != -1) {
            System.out.println("Found at " + lastIndex);
        } else {
            System.out.println("Not found");}
        sc.close();}}