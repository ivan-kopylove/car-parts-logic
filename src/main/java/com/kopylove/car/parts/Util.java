package com.kopylove.car.parts;

public class Util
{
    public static String getTelegramApiKey()
    {
        final String devKey = System.getenv("CAR_PARTS_TELEGRAM_BOT_DEV");
        if (!devKey.isBlank())
        {
            return devKey;
        }
        final String prodKey = System.getenv("CAR_PARTS_TELEGRAM_BOT_PROD");
        if (!prodKey.isBlank())
        {
            return prodKey;
        }
        throw new RuntimeException("Invalid configuration");
    }
}
