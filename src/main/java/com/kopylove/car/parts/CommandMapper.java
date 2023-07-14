package com.kopylove.car.parts;

import org.springframework.stereotype.Service;

import static com.kopylove.car.parts.Command.UNKNOWN;

@Service
public class CommandMapper
{

    public Command mapCommand(String command)
    {
        if (command.startsWith("/start"))
        {
            return Command.START;
        }
        return UNKNOWN;
    }
}
