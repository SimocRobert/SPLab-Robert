package com.example.SpLab_Robert.di;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class PrototypeComponent {

    public PrototypeComponent() {
        System.out.println("PrototypeComponent::PrototypeComponent = " + this);
    }

    public void operation() {
        System.out.println("Invoked PrototypeComponent::operation() on " + this);
    }
}
