package com.kiran;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Library {

    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void borrowBook(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn) && book.isAvailable()) {
                book.setAvailable(false);
                System.out.println("You have borrowed: " + book.getTitle()+ " by " + book.getAuthor());
                return;
            }
        }
        System.out.println("Book is not available or does not exist.");
    }

    public void returnBook(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn) && !book.isAvailable()) {
                book.setAvailable(true);
                System.out.println("You have returned: " + book.getTitle());
                return;
            }
        }
        System.out.println("This book was not borrowed from this library.");
    }

    public void listAvailableBooks() {
        int[] index = {1};
                books.stream()
                .filter(Book::isAvailable)
                .forEach(book -> {
                    System.out.println(index[0] + " ." + book.getTitle() + " by " + book.getAuthor());
                    index[0]++;
                });

    }

    public void listBooksByAuthor(String author) {
        int[] index = {1};
                books.stream()
                .filter(book -> book.getAuthor().equalsIgnoreCase(author))
                .forEach(book -> {
                    System.out.println("Book" + index[0] + "------------");
                    book.displayDetails();
                    index[0]++;
                });

    }


}
