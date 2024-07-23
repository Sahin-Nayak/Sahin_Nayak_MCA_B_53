public class q11{
	private double radius;
	private String color;
	public q11(){
		this.radius=1.0;
		this.color="red";}
	public q11(double radius){
		this.radius=radius;
		this.color="red";}
	public double getRadius(){
		return this.radius;}
	public double getArea(){
		return 3.14*this.radius*this.radius;}
	public static void main(String[] args){
		q11 c1=new q11();
		q11 c2=new q11(10.4);
		System.out.println("Radius of circle 1 is "+ c1.getRadius());
		System.out.println("Area of circle 1 is "+ c1.getArea());
		System.out.println("Radius of circle 2 is "+ c1.getRadius());
		System.out.println("Area of circle 2 is "+ c1.getArea());}}