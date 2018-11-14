package com.esme.spring.faircorp;

import com.esme.spring.faircorp.hello.ConsoleGreetingService;
import org.hamcrest.Matchers;
import org.junit.Rule;
import org.junit.Test;
import org.springframework.boot.test.rule.OutputCapture;

public class FaircropApplicationConfigTest {
    @Rule
    public OutputCapture outputCapture = new OutputCapture();

    @Test
    public void testGreeting() {
        ConsoleGreetingService greetingService = new ConsoleGreetingService(); // (1)
        greetingService.greet("Spring");
        outputCapture.expect(Matchers.startsWith("Hello, Spring!"));


    }
}