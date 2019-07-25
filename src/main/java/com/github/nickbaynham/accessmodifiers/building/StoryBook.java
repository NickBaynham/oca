package com.github.nickbaynham.accessmodifiers.building;

import com.github.nickbaynham.accessmodifiers.library.Book;

public class StoryBook extends Book {
    public StoryBook(String isbn) {
        super(isbn);
        author = "Mark Harris";
        modifyTemplate();
    }

    public void setIsbn(String isbn) {
        super.isbn = isbn;   // We can reference the parent protected instance variable
    }
}
