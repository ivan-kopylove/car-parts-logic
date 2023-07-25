package com.github.ivan.kopylove;

import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CarPartsApplicationTests
{

    @BeforeAll
    void contextLoads()
    {
        System.setProperty("CAR_PARTS_TELEGRAM_BOT_DEV", "");
    }
}
