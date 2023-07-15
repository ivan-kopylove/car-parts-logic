package com.kopylove.car.parts;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static com.kopylove.car.parts.Constant.*;

@Service
public class CommandHandler
{
    public List<String> handle(Command command)
    {
        List<String> answer = new ArrayList<>();
        switch (command)
        {
            case START ->
            {
                answer.add(HELLO_1);
                answer.add(HELLO_2);
                answer.add(HELLO_3);
                answer.add(HELLO_4);
            }
        }
        return answer;
    }
}
