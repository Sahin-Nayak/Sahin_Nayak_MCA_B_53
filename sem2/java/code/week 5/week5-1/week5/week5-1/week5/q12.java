import java.util.Scanner;
public class q12{
public static String printNumberWord(int n){
if(n==0){
	return "zero";}
else if(n==1){
return "one";}
else if(n==2){
return "two";}
else if(n==3){
return "three";}
else if(n==4){
return "four";}
else if(n==5){
return "five";}
else if(n==6){
return "six";}
else if(n==7){
return "seven";}
else if(n==8){
return "eight";}
else if(n==9){
return "nine";}
else{
return "Give number between 0 to 9";}}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int n=sc.nextInt();
System.out.println(printNumberWord(n)); }}