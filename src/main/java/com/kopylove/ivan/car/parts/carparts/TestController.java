package com.kopylove.ivan.car.parts.carparts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController
{
    private final Test test;

    public TestController(Test test) {this.test = test;}

    @GetMapping("/get/{name}")
    public String get(@PathVariable final String name)
    {
        test.qwer();
        return String.format("Hello, %s!", name);
    }
}