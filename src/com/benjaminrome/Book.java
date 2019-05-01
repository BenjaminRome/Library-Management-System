package com.benjaminrome;

public class Book {

    private String title;
    private String author;
    private String publicationDate;
    private int copies;

    Book(String bookTitle, String bookAuthor, String bookPublicationDate, int bookCopies) {
        title = bookTitle;
        author = bookAuthor;
        publicationDate = bookPublicationDate;
        copies = bookCopies;
    }

    public void setCopies(int copies) {
        this.copies = copies;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public int getCopies() {
        return copies;
    }
}
