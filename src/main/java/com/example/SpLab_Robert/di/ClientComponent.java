package com.example.SpLab_Robert.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClientComponent {

    private final PrototypeComponent prototype;
    private final SingletonComponent singleton;

    @Autowired
    public ClientComponent(PrototypeComponent prototype, SingletonComponent singleton) {
        this.prototype = prototype;
        this.singleton = singleton;
        System.out.println("ClientComponent::ClientComponent = " + this);
        System.out.println("  o PrototypeComponent = " + prototype);
        System.out.println("  o SingletonComponent = " + singleton);
    }

    public void operation() {
        System.out.println("Invoked ClientComponent::operation() on " + this);
        System.out.println("  o PrototypeComponent = " + prototype);
        System.out.println("  o SingletonComponent = " + singleton);
    }
}
