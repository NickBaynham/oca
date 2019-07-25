package com.github.nickbaynham.accessmodifiers.library;

public class CourseBook extends Book {
    public CourseBook(String isbn) {
        super(isbn);    // reference the protected superclass variable
        author = "abc";     // protected superclass instance variable
        modifyTemplate();   // protected superclass method
        // super.countPages();    <-- You can't access a private method from a sub class, even in the same package
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
