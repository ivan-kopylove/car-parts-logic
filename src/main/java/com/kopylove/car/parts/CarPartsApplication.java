package com.kopylove.car.parts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.io.IOException;
import java.net.URISyntaxException;

@SpringBootApplication
public class CarPartsApplication
{

    public static void main(final String[] args) throws URISyntaxException, IOException, InterruptedException
    {
        ConfigurableApplicationContext run = SpringApplication.run(CarPartsApplication.class, args);
        BotStarter bean = run.getBean(BotStarter.class);
        bean.start();
    }
}
