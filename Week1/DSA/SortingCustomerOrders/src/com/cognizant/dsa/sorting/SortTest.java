package com.cognizant.dsa.sorting;

public class SortTest {

    public static void main(String[] args) {

        Order[] orders1 = {
                new Order(101, "Pratyush", 5000),
                new Order(102, "Rahul", 1200),
                new Order(103, "Aman", 8000),
                new Order(104, "Riya", 3000)
        };

        System.out.println("BUBBLE SORT RESULT");

        BubbleSort.sort(orders1);

        for (Order order : orders1) {
            System.out.println(order);
        }

        System.out.println();

        Order[] orders2 = {
                new Order(101, "Pratyush", 5000),
                new Order(102, "Rahul", 1200),
                new Order(103, "Aman", 8000),
                new Order(104, "Riya", 3000)
        };

        System.out.println("QUICK SORT RESULT");

        QuickSort.sort(orders2, 0, orders2.length - 1);

        for (Order order : orders2) {
            System.out.println(order);
        }
    }
}