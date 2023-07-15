package com.github.ivan.kopylove;

import com.github.ivan.kopylove.telegram.api.client.TelegramClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static com.github.ivan.kopylove.telegram.api.client.TelegramClient.telegramClient;
import static com.github.ivan.kopylove.Util.getTelegramApiKey;

@Configuration
public class AppConfig {

	@Bean
	public TelegramClient telegramClient() {
		return TelegramClient.telegramClient(getTelegramApiKey());
	}


}