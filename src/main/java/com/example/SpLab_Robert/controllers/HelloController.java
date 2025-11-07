package com.example.SpLab_Robert.controllers;

import com.example.SpLab_Robert.di.ClientComponent;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private final ClientComponent clientComponent;

    public HelloController(ClientComponent clientComponent) {
        this.clientComponent = clientComponent;
    }

    @GetMapping("/")
    public String sayHello() {
        clientComponent.operation();
        return "Hello from ClientComponent = " + clientComponent;
    }
}
