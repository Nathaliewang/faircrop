package com.esme.spring.faircorp;

import com.esme.spring.faircorp.hello.GreetingService;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//import org.springframework.stereotype.Component;

@Configuration
public class FaircropApplicationConfig {// (2)



    @Bean
    public CommandLineRunner greetingCommandLine(GreetingService greetingService) { // (3)
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                greetingService.greet("spring");

                // (4)

            }
        };
    }
}





