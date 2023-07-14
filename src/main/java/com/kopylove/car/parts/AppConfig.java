package com.kopylove.car.parts;

import com.github.lazyf1sh.telegram.api.client.TelegramClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static com.github.lazyf1sh.telegram.api.client.TelegramClient.telegramClient;
import static com.kopylove.car.parts.Util.getTelegramApiKey;

@Configuration
public class AppConfig {

	@Bean
	public TelegramClient telegramClient() {
		return TelegramClient.telegramClient(getTelegramApiKey());
	}


}