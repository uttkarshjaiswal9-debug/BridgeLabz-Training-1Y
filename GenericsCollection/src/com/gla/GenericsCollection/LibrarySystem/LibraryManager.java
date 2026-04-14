package com.gla.GenericsCollection.LibrarySystem;

import java.util.*;

public class LibraryManager {

    List<Book> books = new ArrayList<>();
    Set<String> members = new HashSet<>();
    Queue<Book> issueQueue = new LinkedList<>();
    Stack<Book> returned = new Stack<>();

    public void addBook(Book b) {
        books.add(b);
    }

    public void register(String id) {
        members.add(id);
    }

    public void issue(Book b) {
        issueQueue.add(b);
    }

    public void process() {
        while (!issueQueue.isEmpty()) {
            Book b = issueQueue.remove();
            System.out.println("Issued: " + b);
        }
    }

    public void returnBook(Book b) {
        returned.push(b);
    }

    public void reissue() {
        if (!returned.isEmpty()) {
            System.out.println("Reissued: " + returned.pop());
        }
    }
}
