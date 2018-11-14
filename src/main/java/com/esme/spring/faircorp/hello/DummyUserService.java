package com.esme.spring.faircorp.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//In Spring, we can use a stereotype on our classes
// to defined them as a Bean Spring : @Service,
@Service
public class DummyUserService implements UserService {

    private GreetingService greetingService;
    //When a class need another object,
    // we use @Autowired to inject them via Spring
    @Autowired
    public DummyUserService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @Override
    public void greetAll() {
        List<String> names = Arrays.asList("Elodie","Charles");
        names.forEach(i -> greetingService.greet(i));
    }
}
