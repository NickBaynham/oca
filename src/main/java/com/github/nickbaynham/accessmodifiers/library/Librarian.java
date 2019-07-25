package com.github.nickbaynham.accessmodifiers.library;

public class Librarian {
    public Book book;

    public Librarian() {
        book = new Book("5511");
        book.author = "John Wick";
        book.modifyTemplate();
        // book.countPages();   <-- You can't access a private method from outside the class, even in the same package
    }
}
