package org.tnsif.assignment;
import java.util.Scanner;
public class FurnitureStore {

	public static void main(String args[]) { 
        
		Scanner scanner = new Scanner(System.in);

        // Get customer details
        System.out.println("Enter customer name:");
        String customerName = scanner.nextLine();
        System.out.println("Enter phone number:");
        long phoneNumber = scanner.nextLong();
        scanner.nextLine(); // Consume the newline
        System.out.println("Enter address:");
        String address = scanner.nextLine();
        
        CustomerDetails customerDetails = new CustomerDetails(customerName, phoneNumber, address);

        // Get bero type
        System.out.println("Enter bero type (Steel Bero or Wooden Bero):");
        String beroType = scanner.nextLine();

        // Create Bero object based on user input
        Bero bero = null;
        if (beroType.equals("Steel Bero")) {
            System.out.println("Enter bero colour:");
            String beroColour = scanner.nextLine();
            System.out.println("Enter bero height:");
            int beroHeight = scanner.nextInt();
            bero = new SteelBero(beroType, beroColour, beroHeight);
        } else if (beroType.equals("Wooden Bero")) {
            System.out.println("Enter bero colour:");
            String beroColour = scanner.nextLine();
            System.out.println("Enter wood type (Ply Wood, Teak Wood, or Engineered Wood):");
            String woodType = scanner.nextLine();
            bero = new WoodenBero(beroType, beroColour, woodType);
        } else {
            System.out.println(beroType + " is an invalid bero type");
            System.exit(0);
        }

        // Calculate price and discount
        bero.calculatePrice();
        Discount discount = new Discount();
        double discountAmount = discount.calculateDiscount(bero);
        double totalPrice = bero.getPrice() - discountAmount;

        // Display results
        System.out.println("Customer Details:");
        System.out.println("Name: " + customerDetails.getCustomerName());
        System.out.println("Phone Number: " + customerDetails.getPhoneNumber());
        System.out.println("Address: " + customerDetails.getAddress());

        System.out.println("Bero Details:");
        System.out.println("Bero Type: " + bero.getBeroType());
        System.out.println("Bero Colour: " + bero.getBeroColour());
        System.out.println("Price: Rs " + bero.getPrice());
        System.out.println("Discount: Rs " + discountAmount);
        System.out.println("Total Price: Rs " + totalPrice);

        scanner.close();
  








	}

}
