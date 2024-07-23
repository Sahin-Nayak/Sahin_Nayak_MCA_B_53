import java.util.Scanner;
class Num {
    protected int number;
    public Num(int number) {
        this.number = number;}
    public void showNum() {
        System.out.println("Number: " + number); }}
class HexNum extends Num { // Derived class HexNum
    public HexNum(int number) {
        super(number); }
    public void showNum() {
        System.out.println("Hexadecimal Value: " + Integer.toHexString(number)); }}
class OctNum extends Num { // Derived class OctNum
    public OctNum(int number) {
        super(number);}
    public void showNum() {
        System.out.println("Octal Value: " + Integer.toOctalString(number)); }}
public class num_hexnum_octnum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int number = scanner.nextInt();
        Num num = new Num(number);
        HexNum hexNum = new HexNum(number);
        OctNum octNum = new OctNum(number);
        System.out.println("\nDisplaying number using Num:");
        num.showNum();
        System.out.println("\nDisplaying number using HexNum:");
        hexNum.showNum();
        System.out.println("\nDisplaying number using OctNum:");
        octNum.showNum();
        scanner.close();
    }}
