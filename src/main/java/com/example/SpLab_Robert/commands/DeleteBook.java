package com.example.SpLab_Robert.commands;

import com.example.SpLab_Robert.services.BooksService;

public class DeleteBook implements Command {

    private final BooksService service;
    private final int id;

    public DeleteBook(BooksService service, int id) {
        this.service = service;
        this.id = id;
    }

    @Override
    public String execute() {
        return service.deleteBook(id);
    }
}
