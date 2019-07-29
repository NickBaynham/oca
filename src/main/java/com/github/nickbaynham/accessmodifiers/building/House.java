package com.github.nickbaynham.accessmodifiers.building;

import com.github.nickbaynham.accessmodifiers.library.Book;

public class House {
    StoryBook storyBook;

    public House() {
        Book book = new Book("9988");
        book.printBook();
    }

    public static void doSomething() {
        System.out.println("I'm busy!!!");
    }
}
