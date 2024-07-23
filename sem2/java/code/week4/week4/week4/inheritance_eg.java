class stu {
  String name;
  public void message() {
    System.out.println("I am student of MCA");
  }}
class Name extends stu { // inherit from stu
  public void display() {   // new method in subclass
    System.out.println("My name is " + name);
  }}
class inheritance_eg {
  public static void main(String[] args) {
    Name ob = new Name();     // create an object of the subclass
    ob.name = "Sahin";
    ob.display();
    // call method of superclass
    // using object of subclass
    ob.message();}}