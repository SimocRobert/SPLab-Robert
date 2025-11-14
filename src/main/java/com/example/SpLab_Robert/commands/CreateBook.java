package com.example.SpLab_Robert.commands;

import com.example.SpLab_Robert.services.BooksService;

public class CreateBook implements Command {

    private final BooksService service;
    private final String name;

    public CreateBook(BooksService service, String name) {
        this.service = service;
        this.name = name;
    }

    @Override
    public String execute() {
        return service.createBook(name);
    }
}
