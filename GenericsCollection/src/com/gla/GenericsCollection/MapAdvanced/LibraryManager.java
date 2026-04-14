package com.gla.GenericsCollection.MapAdvanced;

import java.util.*;

public class LibraryManager {

    Map<String, String> books = new HashMap<>();

    public void add(String isbn, String title) {
        books.put(isbn, title);
    }

    public void search(String isbn) {
        if (books.containsKey(isbn)) {
            System.out.println(books.get(isbn));
        } else {
            System.out.println("Book not found");
        }
    }

    public void remove(String isbn) {
        books.remove(isbn);
    }

    public void display() {
        TreeMap<String, String> sorted = new TreeMap<>(books);
        for (String isbn : sorted.keySet()) {
            System.out.println(isbn + " : " + sorted.get(isbn));
        }
    }

    public void searchByTitle(String title) {
        for (String key : books.keySet()) {
            if (books.get(key).equalsIgnoreCase(title)) {
                System.out.println(key + " : " + title);
            }
        }
    }
}
