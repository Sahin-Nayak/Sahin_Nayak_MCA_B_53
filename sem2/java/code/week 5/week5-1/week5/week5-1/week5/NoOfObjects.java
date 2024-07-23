public class NoOfObjects {
	public static int count=0;
	public NoOfObjects() {
		count++;}
	public static void main(String[] args) {
		NoOfObjects obj1=new NoOfObjects();
		NoOfObjects obj2=new NoOfObjects();
		NoOfObjects obj3=new NoOfObjects();
		System.out.println("we can count no of objects of a class using a static variable and that is "+ count);}}
