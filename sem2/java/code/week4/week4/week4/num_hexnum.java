import java.util.Scanner;
class Num {
    protected int number;
    public Num(int number) {
        this.number = number;}
    public void showNum() {
        System.out.println("Number: " + number); }}
class HexNum extends Num { // Derived class HexNum
    public HexNum(int number) {
        super(number);        }
    public void showNum() {
        System.out.println("Hexadecimal Value: " + Integer.toHexString(number)); }}
public class num_hexnum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int number = sc.nextInt();
        Num num = new Num(number);// Creating objects
        HexNum hexNum = new HexNum(number);
        System.out.println("\nDisplaying number using Num:");
        num.showNum();
        System.out.println("\nDisplaying number using HexNum:");
        hexNum.showNum();
        sc.close(); }}
