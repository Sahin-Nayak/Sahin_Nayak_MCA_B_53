import java.util.Scanner;
public class q38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            char character = str.charAt(i);
            int asciiValue = character;
            System.out.println("Character: " + character + ", ASCII : " + asciiValue);}
	sc.close();}}