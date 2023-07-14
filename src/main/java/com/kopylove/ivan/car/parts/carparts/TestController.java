package com.kopylove.ivan.car.parts.carparts;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.net.URISyntaxException;

@RestController
public class TestController
{
    private final BotStarter test;

    public TestController(BotStarter test) {this.test = test;}

    @GetMapping("/get/{name}")
    public String get(@PathVariable final String name) throws URISyntaxException, IOException, InterruptedException
    {
        test.start();
        return String.format("Hello, %s!", name);
    }
}