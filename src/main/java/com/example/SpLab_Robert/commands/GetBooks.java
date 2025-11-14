package com.example.SpLab_Robert.commands;

import com.example.SpLab_Robert.services.BooksService;

public class GetBooks implements Command {

    private final BooksService service;

    public GetBooks(BooksService service) {
        this.service = service;
    }

    @Override
    public String execute() {
        return service.getAllBooks().toString();
    }
}
