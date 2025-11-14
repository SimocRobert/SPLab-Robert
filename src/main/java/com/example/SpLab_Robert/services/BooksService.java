package com.example.SpLab_Robert.services;

import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class BooksService {

    private Map<Integer, String> books = new HashMap<>();
    private int idCounter = 1;

    public List<String> getAllBooks() {
        return new ArrayList<>(books.values());
    }

    public String getBook(int id) {
        return books.get(id);
    }

    public String createBook(String name) {
        books.put(idCounter, name);
        return "Created book with ID " + (idCounter++);
    }

    public String updateBook(int id, String newName) {
        books.put(id, newName);
        return "Updated book " + id;
    }

    public String deleteBook(int id) {
        books.remove(id);
        return "Deleted book " + id;
    }
}
