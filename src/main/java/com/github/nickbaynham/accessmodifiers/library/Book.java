package com.github.nickbaynham.accessmodifiers.library;

public class Book {
    protected String isbn;
    protected String author;

    public Book(String isbn) {
        this.isbn = isbn;
    }

    protected void modifyTemplate() {
        countPages();                   // accessing a private method OK from SAME class
    }

    public void printBook() {
        System.out.println("Printing Book: " + isbn);
    }

    private void countPages() {
        System.out.println("Counting Pages");
    }
}
