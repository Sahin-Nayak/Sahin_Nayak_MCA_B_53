import java.util.Scanner;
class Num {
    protected int number;
    public Num(int number) {
        this.number = number;}
    public void showNum() {
        System.out.println("Number: " + number);}}
class OctNum extends Num { // Derived class OctNum
    public OctNum(int number) {
        super(number);        }
    public void showNum() {
        System.out.println("Octal Value: " + Integer.toOctalString(number)); }}
public class num_octnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int number = sc.nextInt();
        Num num = new Num(number);
        OctNum octNum = new OctNum(number);
        System.out.println("\nDisplaying number using Num:");
        num.showNum();
        System.out.println("\nDisplaying number using OctNum:");
        octNum.showNum();
        sc.close();
    }}
