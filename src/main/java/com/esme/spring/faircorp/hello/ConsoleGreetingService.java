package com.esme.spring.faircorp.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Service
@Component
public class ConsoleGreetingService implements GreetingService {
    @Autowired
    private CycleService cycleService;

    @Override
    public void greet(String name) {
        System.out.println("Hello, " + name+"!");
    }
}
