import java.util.Scanner;
class Time {
    private int hour;
    private int min;
    private int sec;
    public Time(int hour, int min, int sec) {
        this.hour = hour;
        this.min = min;
        this.sec = sec;}
    public void add(Time other) {
        this.sec += other.sec;
        this.min += other.min + this.sec / 60;
        this.hour += other.hour + this.min / 60;
        this.sec %= 60;
        this.min %= 60;
        this.hour %= 24;
        System.out.println("Added time: " + this.hour + " hours, " + this.min + " minutes, " + this.sec + " seconds"); }}
public class time_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter time for first object (hours minutes seconds):");
        int hour1 = sc.nextInt();
        int min1 = sc.nextInt();
        int sec1 = sc.nextInt();
        System.out.println("Enter time for second object (hours minutes seconds):");
        int hour2 = sc.nextInt();
        int min2 = sc.nextInt();
        int sec2 = sc.nextInt();
        Time ob1 = new Time(hour1, min1, sec1);
        Time ob2 = new Time(hour2, min2, sec2);
        System.out.println("Time 1: " + hour1 + " hours, " + min1 + " minutes, " + sec1 + " seconds");
        System.out.println("Time 2: " + hour2 + " hours, " + min2 + " minutes, " + sec2 + " seconds");
        ob1.add(ob2);
        sc.close();}}
