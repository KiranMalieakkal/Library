package com.kiran;

public class Main {
    public static void main(String[] args) {

        Library saltLibrary = new Library();

        // Adding some books to the library

        Book book1 = new Book("Master Java like a Pro", "Ivan", "1234567890");
        Book book2 = new Book("Teach SpringBoot the right way", "Aleksandar Miloeski", "1234567891");
        Book book3 = new Book("Become a TableTennis Pro in 7 days", "Ivan", "1234567892");
        Book book4 = new EBook("Finding fun in IT", "Harald Börestam", "1234567893", 150);
        Book book5 = new EBook("100 Reasons why Gothenburg is Boring", "Aleksandar Miloeski", "1234567894", 100);

        saltLibrary.addBook(book1);
        saltLibrary.addBook(book2);
        saltLibrary.addBook(book3);
        saltLibrary.addBook(book4);
        saltLibrary.addBook(book5);


        // Listing available books
        System.out.println("Here is the List of all available books in Salt Library");
        saltLibrary.listAvailableBooks();

        System.out.println("  ");
        System.out.println("------------------------------------------------------------------------------------------------");

        // Borrowing a book
        System.out.println();
        saltLibrary.borrowBook("1234567890");


        System.out.println("  ");
        System.out.println("------------------------------------------------------------------------------------------------");

        // Listing available books again
        System.out.println("Here is the List of all available books in Salt Library");
        saltLibrary.listAvailableBooks();

        System.out.println("  ");
        System.out.println("------------------------------------------------------------------------------------------------");

        // Listing books by an author
        System.out.println("Here are the List of all books written by Aleksandar Miloeski ");
        saltLibrary.listBooksByAuthor("Aleksandar Miloeski");
    }
}
