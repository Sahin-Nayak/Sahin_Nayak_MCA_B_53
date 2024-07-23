package week5;

import java.util.Scanner;

public class ItemDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        Item[] items = new Item[5];

        
        for (int i = 0; i < items.length; i++) {
            System.out.println("Enter details for Item " + (i + 1) + ":");
            System.out.print("Enter code: ");
            int code = scanner.nextInt();
            System.out.print("Enter price: ");
            double price = scanner.nextDouble();

            
            items[i] = new Item(code, price);
        }


        System.out.println("\nItem Details:");
        System.out.printf("%-10s%-10s\n", "Code", "Price");
        for (Item item : items) {
            System.out.printf("%-10d%-10.2f\n", item.code, item.price);
        }


        double totalPrice = 0;
        for (Item item : items) {
            totalPrice += item.price;
        }
        System.out.println("\nTotal Price: " + totalPrice);

     
      
    }
}
