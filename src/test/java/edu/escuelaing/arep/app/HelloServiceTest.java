package edu.escuelaing.arep.app;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.nio.file.Path;
import java.time.LocalDate;


import static org.junit.jupiter.api.Assertions.*;

class HelloServiceTest {

    private HelloService helloService;

    @TempDir
    Path tempDir;

    @BeforeEach
    void setUp() {
        helloService = new HelloService();
    }

    @Test
    void testHello() {
        assertEquals("Hello World", HelloService.hello());
    }

    @Test
    void testBye() {
        assertEquals("Bye!", HelloService.bye());
    }

    @Test
    void testGreeting() {
        assertEquals("Hello, World!", HelloService.greeting("World"));
    }

    @Test
    void testTime() {
        String result = HelloService.time();
        assertEquals("The current time is: " + java.time.LocalTime.now(), result);
    }
    @Test
    void testDayOfWeek() {
        String result = HelloService.dayOfWeek();
        assertEquals("Today is: " + LocalDate.now().getDayOfWeek(), result);
    }

}