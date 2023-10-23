package org.tnsif.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.List;

public class Products1 {
    private List<String> productList = new ArrayList<>();

    public List<String> getProductList() {
        return productList;
    }

    public void setProductList(List<String> productList) {
        this.productList = productList;
    }

    public void addProductToList(String product) {
        productList.add(product);
    }

    public void sortProductList() {
        Collections.sort(productList);
    }

    public static void main(String[] args) {
        Products1 products = new Products1();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1.Add\n2.Display\n3.Exit");
            System.out.println("Enter your choice");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline character

            switch (choice) {
                case 1:
                    System.out.println("Enter the product");
                    String product = scanner.nextLine();
                    products.addProductToList(product);
                    break;
                case 2:
                    if (products.getProductList().isEmpty()) {
                        System.out.println("The list is empty");
                    } else {
                        products.sortProductList();
                        for (String item : products.getProductList()) {
                            System.out.println(item);
                        }
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

