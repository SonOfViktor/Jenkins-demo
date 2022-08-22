package org.example.demo.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DemoServiceTest {

    @Test
    void testCreateHelloWorld() {
        String expected = "Hello world from 2020 year";
        String actual = DemoService.getInstance().createHelloWorldWithParam(40);

        assertEquals(expected, actual);
    }
}