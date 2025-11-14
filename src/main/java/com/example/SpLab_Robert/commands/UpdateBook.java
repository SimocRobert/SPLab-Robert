package com.example.SpLab_Robert.commands;

import com.example.SpLab_Robert.services.BooksService;

public class UpdateBook implements Command {

    private final BooksService service;
    private final int id;
    private final String name;

    public UpdateBook(BooksService service, int id, String name) {
        this.service = service;
        this.id = id;
        this.name = name;
    }

    @Override
    public String execute() {
        return service.updateBook(id, name);
    }
}
