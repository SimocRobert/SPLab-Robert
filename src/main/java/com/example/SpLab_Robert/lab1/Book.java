package com.example.SpLab_Robert.lab1;

import java.util.ArrayList;
import java.util.List;

public class Book extends Section {
    private List<Author> authors = new ArrayList<>();

    public Book(String title) {
        super("Book: " + title);
    }

    public void addAuthor(Author author) {
        authors.add(author);
    }

    @Override
    public void print() {
        super.print();
        System.out.println("\nAuthors:");
        for (Author a : authors) {
            a.print();
        }
    }
}
