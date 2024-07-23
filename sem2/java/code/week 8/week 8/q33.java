import java.util.Scanner;
public class q33 {
    public static boolean isPrime(int pos) {
        boolean flag = false;
        for (int i = 2; i <= pos / 2; i++) {
            if (pos % i == 0) {
                flag = true;
                break;}}
        if (!flag)
            return true;
        return false;}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        System.out.println("Characters at prime position : ");
        for (int i = 0; i < str.length() - 1; i++) {
            if (isPrime(i))
                sb.append(str.charAt(i)).append(" ");}
        System.out.println(sb.toString());
        sc.close();}}