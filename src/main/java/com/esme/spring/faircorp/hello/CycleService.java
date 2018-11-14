package com.esme.spring.faircorp.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CycleService {

    private final GreetingService consoleGreetingService;

    @Autowired
    public CycleService(GreetingService consoleGreetingService) {
        this.consoleGreetingService = consoleGreetingService;
    }
}