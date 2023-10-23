package org.tnsif.assignment;
import java .util.Scanner;
public class Executor {

	
		public static void main(String[] args) {
	        Country country = new Country();
	        Scanner scanner = new Scanner(System.in);

	        while (true) {
	            System.out.println("1.Add\n2.Search\n3.Exit");
	            System.out.println("Enter your choice");
	            int choice = scanner.nextInt();
	            scanner.nextLine();  // Consume newline character

	            switch (choice) {
	                case 1:
	                    System.out.println("Enter the country name");
	                    String countryName = scanner.nextLine();
	                    System.out.println("Enter the capital name");
	                    String capitalName = scanner.nextLine();
	                    country.add(countryName, capitalName);
	                    break;
	                case 2:
	                    if (country.getCountryMap().isEmpty()) {
	                        System.out.println("The map is empty");
	                    } else {
	                        System.out.println("Enter the country name");
	                        String searchCountry = scanner.nextLine();
	                        String capital = country.search(searchCountry);
	                        System.out.println(capital);
	                    }
	                    break;
	                case 3:
	                    System.out.println("Thank you for using the application");
	                    scanner.close();
	                    return;
	                default:
	                    System.out.println("Invalid choice. Please select 1, 2, or 3.");
	                    break;
	            }
	        }
	    }
	}

	


