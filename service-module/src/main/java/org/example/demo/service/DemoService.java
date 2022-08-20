package org.example.demo.service;

import org.apache.commons.lang3.RandomUtils;

public class DemoService {
    private static final DemoService INSTANCE = new DemoService();

    private DemoService() {
    }

    public String createHelloWorld() {
        int year = RandomUtils.nextInt(22, 51);

        return "Hello world from " + year;
    }

    public static DemoService getInstance() {
        return INSTANCE;
    }
}
