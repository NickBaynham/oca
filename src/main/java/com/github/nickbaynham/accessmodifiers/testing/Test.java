package com.github.nickbaynham.accessmodifiers.testing;


import com.github.nickbaynham.accessmodifiers.building.*;
import com.github.nickbaynham.accessmodifiers.library.*;

class Test {
    public static void main(String[] args) {
        House house;                // House is in a different package, so we can declare a reference of type House
        House.doSomething();

        Book book;                  // Book is in a different package, so it's access must be public
        book = new Book("1234");          // A new Book object can be created since Book is public
        // book.isbn = "12346";        // Instance Variable isbn is protected, so can only be accessed within a subclass
        book.printBook();           // Method printBook() is public, so a reference in another package can access

        StoryBook storyBook;        // Class StoryBook is public, so we can declare a reference of type StoryBook
        storyBook = new StoryBook("54321");
        storyBook.setIsbn("54321");   // Field is protected, but we can use a public method to set it
        storyBook.printBook();      // Method is public, inherited from Book

        CourseBook courseBook;
        courseBook = new CourseBook("2222");
        courseBook.setIsbn("33333");
        courseBook.printBook();
    }
}
