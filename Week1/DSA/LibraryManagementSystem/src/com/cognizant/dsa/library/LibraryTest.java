package com.cognizant.dsa.library;

public class LibraryTest {

    public static void main(String[] args) {

        Book[] books = {

                new Book(101, "C Programming", "Dennis Ritchie"),
                new Book(102, "Data Structures", "Mark Allen"),
                new Book(103, "Java Programming", "Herbert Schildt"),
                new Book(104, "Operating Systems", "Galvin"),
                new Book(105, "Python Programming", "Guido")
        };

        System.out.println("LINEAR SEARCH");

        Book linearResult =
                LibrarySearch.linearSearch(
                        books,
                        "Java Programming"
                );

        if (linearResult != null) {
            System.out.println(linearResult);
        } else {
            System.out.println("Book Not Found");
        }

        System.out.println();

        System.out.println("BINARY SEARCH");

        Book binaryResult =
                LibrarySearch.binarySearch(
                        books,
                        "Java Programming"
                );

        if (binaryResult != null) {
            System.out.println(binaryResult);
        } else {
            System.out.println("Book Not Found");
        }
    }
}