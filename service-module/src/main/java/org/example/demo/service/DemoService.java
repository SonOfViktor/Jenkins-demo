package org.example.demo.service;

import org.apache.commons.lang3.RandomUtils;

public class DemoService {
    private static final DemoService INSTANCE = new DemoService();

    private DemoService() {
    }

    public String createHelloWorld() {
        int year = RandomUtils.nextInt(22, 51);

        return "Hello world from 20" + year + " year";
    }

    public String theSameNotUsedCreateHelloWorld() {
        int year = RandomUtils.nextInt(22, 51);

        return "Hello world from 20" + year + " year";
    }

    public String createHelloWorldWithParam(int number) {
        int year;

        if (number > 50) {
            year = 22;
        } else {
            year = 20;
        }

        return "Hello world from 20" + year + " year";
    }

    public static DemoService getInstance() {
        return INSTANCE;
    }
}
