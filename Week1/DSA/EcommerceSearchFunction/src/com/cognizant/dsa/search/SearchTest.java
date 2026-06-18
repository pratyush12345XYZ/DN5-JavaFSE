package com.cognizant.dsa.search;

public class SearchTest {

    public static void main(String[] args) {

        Product[] products = {

                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Mouse", "Electronics"),
                new Product(103, "Keyboard", "Electronics"),
                new Product(104, "Monitor", "Electronics"),
                new Product(105, "Printer", "Electronics")
        };

        System.out.println("LINEAR SEARCH");

        Product linearResult =
                SearchService.linearSearch(products, 104);

        if (linearResult != null) {
            System.out.println(linearResult);
        } else {
            System.out.println("Product Not Found");
        }

        System.out.println();

        System.out.println("BINARY SEARCH");

        Product binaryResult =
                SearchService.binarySearch(products, 104);

        if (binaryResult != null) {
            System.out.println(binaryResult);
        } else {
            System.out.println("Product Not Found");
        }
    }
}