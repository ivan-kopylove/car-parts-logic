package com.kopylove.car.parts;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController
{
    private static final Logger LOGGER = LoggerFactory.getLogger(TestController.class);

    @GetMapping("/get/{name}")
    public String get(@PathVariable final String name)
    {
        LOGGER.info("name {}", name);
        return String.format("Hello, %s!", name);
    }
}