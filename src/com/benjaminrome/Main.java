package com.benjaminrome;

public class Main {

    public static void main(String[] args) {

        Book testBook = new Book("Test Book", "Me", "7", 4);
        int book = testBook.getCopies();
        System.out.println(book);
        testBook.setCopies(6);
        System.out.println(testBook.getCopies());

    }
}
