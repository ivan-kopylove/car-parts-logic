package com.kopylove.ivan.car.parts.carparts;

import com.github.lazyf1sh.telegram.api.client.TelegramClient;
import com.github.lazyf1sh.telegram.api.domain.GetMe;
import com.github.lazyf1sh.telegram.api.domain.GetUpdate;
import com.github.lazyf1sh.telegram.api.domain.Message;
import com.github.lazyf1sh.telegram.api.domain.Update;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.concurrent.ScheduledExecutorService;

import static java.util.concurrent.Executors.newScheduledThreadPool;
import static java.util.concurrent.TimeUnit.SECONDS;

@Service
public class BotStarter
{
    private static final Logger LOGGER = LoggerFactory.getLogger(BotStarter.class);

    private final TelegramClient telegramClient;

    public BotStarter(final TelegramClient telegramClient)
    {
        this.telegramClient = telegramClient;
    }

    public void start() throws URISyntaxException, IOException, InterruptedException
    {
        GetMe me = telegramClient.getMe();

        LOGGER.info("me {}", me);

        final ScheduledExecutorService ses = newScheduledThreadPool(1);

        ses.scheduleAtFixedRate(new Runnable()
        {
            @Override
            public void run()
            {
                try
                {
                    final GetUpdate getUpdate = telegramClient.getUpdate();

                    for (final Update update : getUpdate.getResult())
                    {
                        final long start = System.currentTimeMillis();

                        LOGGER.info("update {}", update);
                        Message message = update.getMessage();
                        if (message != null)
                        {
                            telegramClient.sendSingleMessage("abc",
                                                             message.getChat()
                                                                    .getId());
                        }
                        LOGGER.info("Processed update in {} ms.", System.currentTimeMillis() - start);
                    }
                }
                catch (IOException | InterruptedException e)
                {
                    LOGGER.error("", e);
                    throw new RuntimeException(e);
                }
            }
        }, 0, 10, SECONDS);
    }
}
