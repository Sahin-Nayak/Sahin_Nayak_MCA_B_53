import java.util.Scanner;

class Grader {
    private int score;
    public Grader(int score) { // Constructor
        this.score = score;}
    public String letterGrade() {
        if (score < 0 || score > 100) {
            return "Invalid Score";
        } else if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else if (score >= 50) {
            return "E";
        } else {
            return "F";
        }}}
public class grader_demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the score: ");
        int score = sc.nextInt();
        if (score < 0 || score > 100) {
            System.out.println("Invalid score. Score must be between 0 and 100.");
        } else {
            Grader ob = new Grader(score);
            System.out.println("Letter Grade: " + ob.letterGrade());
        }sc.close();}}