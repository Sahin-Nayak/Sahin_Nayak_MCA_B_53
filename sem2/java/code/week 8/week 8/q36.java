import java.util.Scanner;
public class q36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
        String str = sc.nextLine();
        System.out.println("Enter the word : ");
        String word = sc.next();
        int index = str.lastIndexOf(word);
        System.out.println(index);
        sc.close();}}