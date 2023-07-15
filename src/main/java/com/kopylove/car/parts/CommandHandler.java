package com.kopylove.car.parts;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CommandHandler
{
    private static final String hello1 = """
            Привет!
                        
            Мы — команда менеджеров по подбору автозапчастей, масла и технических жидкостей автопрома Евросоюза (Германия, Испания, Англия, Италия и т.д), Корея, Америка, Япония, Канада и многие другие.
            
            К сожалению, не осуществляем подбор на российский и китайский автопром.
                        
            Этот бот поможет Вам быстро узнать стоимость запчасти и сравнить ее со своим поставщиком.""";
    private static final String hello2 = """
            Для запроса стоимости и(ли) сроков пришлите:
            - VIN номер машины (можно фото) и искомую деталь;
            - или артикул (номер) самой детали.
                
            Для комплекта ТО:
            - марка автомобиля;
            - модель автомобиля;
            - объем двигателя;
            - кол-во лошадиных сил;
            - год производства автомобиля.""";
    private static final String hello3 = """
            Мы обработаем Ваш запрос и ответом вышлем стоимость и срок поставки.
            """;
    private static final String hello4 = """
            Мы обрабатываем заявки
            - ПН 9:20 — 16:30
            - ВТ 9:20 — 6:30
            - СР 9:20 — 16:30
            - ЧТ 9:20 — 16:30
            - ПТ 9:20 — 16:30
            - СБ 11:00 — 15:00
                
            Мы обработаем заявку по графику ближайшего дня если заявка отправлена позже.
            """;

    public List<String> handle(Command command)
    {
        List<String> answer = new ArrayList<>();
        switch (command)
        {
            case START ->
            {
                answer.add(hello1);
                answer.add(hello2);
                answer.add(hello3);
                answer.add(hello4);
            }
        }
        return answer;
    }
}
