import java.util.Scanner;
class Item {
    private String code;
    private double price;
    public Item(String code, double price) {
        this.code = code;
        this.price = price;}
    public String getCode() {
        return code;}
    public double getPrice() {
        return price;}}
public class item_code_price {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Item[] items = new Item[5]; // Create an array of Item objects to store data for five items
        for (int i = 0; i < items.length; i++) {
            System.out.println("Enter details for Item " + (i + 1) + ":");
            System.out.print("Code: ");
            String code = sc.next();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            items[i] = new Item(code, price);}
        System.out.println("\nCode\tPrice");
        double totalPrice = 0;
        for (Item item : items) {
            System.out.println(item.getCode() + "\t$" + item.getPrice());
            totalPrice += item.getPrice();}
        System.out.println("Total Price: $" + totalPrice);
        sc.close(); }}