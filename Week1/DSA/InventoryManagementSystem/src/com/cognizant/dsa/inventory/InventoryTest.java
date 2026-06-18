package com.cognizant.dsa.inventory;

public class InventoryTest {

    public static void main(String[] args) {

        InventoryManager manager = new InventoryManager();

        Product p1 = new Product(101, "Laptop", 10, 50000);
        Product p2 = new Product(102, "Mouse", 50, 500);
        Product p3 = new Product(103, "Keyboard", 25, 1200);

        manager.addProduct(p1);
        manager.addProduct(p2);
        manager.addProduct(p3);

        System.out.println("\nInventory After Adding Products:");
        manager.displayProducts();

        manager.updateProduct(102, 60, 550);

        System.out.println("\nInventory After Update:");
        manager.displayProducts();

        manager.deleteProduct(103);

        System.out.println("\nInventory After Deletion:");
        manager.displayProducts();
    }
}