package com.example.SpLab_Robert;

import com.example.SpLab_Robert.di.ClientComponent;
import com.example.SpLab_Robert.di.PrototypeComponent;
import com.example.SpLab_Robert.di.SingletonComponent;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MySpringApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(MySpringApplication.class, args);


        PrototypeComponent p1 = context.getBean(PrototypeComponent.class);
        PrototypeComponent p2 = context.getBean(PrototypeComponent.class);
        SingletonComponent s1 = context.getBean(SingletonComponent.class);
        SingletonComponent s2 = context.getBean(SingletonComponent.class);

        System.out.println("\n--- Testing beans from context ---");
        p1.operation();
        p2.operation();
        s1.operation();
        s2.operation();

        System.out.println("\n--- Testing ClientComponent ---");
        ClientComponent c = context.getBean(ClientComponent.class);
        c.operation();
    }
}
