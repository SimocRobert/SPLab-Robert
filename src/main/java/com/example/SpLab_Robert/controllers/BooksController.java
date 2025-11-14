package com.example.SpLab_Robert.controllers;

import com.example.SpLab_Robert.commands.*;
import com.example.SpLab_Robert.services.BooksService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")
public class BooksController {

    private final BooksService service;

    public BooksController(BooksService service) {
        this.service = service;
    }

    @GetMapping
    public String getAll() {
        return new GetBooks(service).execute();
    }

    @GetMapping("/{id}")
    public String getById(@PathVariable int id) {
        return new GetBookById(service, id).execute();
    }

    @PostMapping
    public String create(@RequestBody String name) {
        return new CreateBook(service, name).execute();
    }

    @PutMapping("/{id}")
    public String update(@PathVariable int id, @RequestBody String name) {
        return new UpdateBook(service, id, name).execute();
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id) {
        return new DeleteBook(service, id).execute();
    }
}
