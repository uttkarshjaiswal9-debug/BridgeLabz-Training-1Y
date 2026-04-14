package com.gla.GenericsCollection.LibrarySystem;

public class Main {

    public static void main(String[] args) {

        LibraryManager m = new LibraryManager();

        m.addBook(new Book("Java"));
        m.addBook(new Book("DSA"));

        m.register("U1");

        m.issue(new Book("Java"));
        m.process();

        m.returnBook(new Book("Java"));
        m.reissue();
    }
}
