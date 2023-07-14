package com.kopylove.car.parts;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CommandHandler
{
    private static final String hello1 = "Привет! Мы команда менеджеров по подбору автозапчастей, масла и технические жидкости. Данный проект позволит вам быстро узнать стоимость запчасти, и сравнить ее со своим поставщиком.";
    private static final String hello2 = "Для запроса стоимости и сроков пришлите vin номер машины (можно фото) и нужную деталь, или артикул (номер) самой детали.  Для комплекта ТО можете указать: Марка, модель, объем двигателя, кол-во лошадиных сил и год производства автомобиля.";
    private static final String hello3 = "Мы обработаем ваш запрос, ответом вышлем стоимость и срок поставки.  К сожалению не осуществляем подбор на российский и китайский автопром.";
    private static final String hello4 = "Заявки обрабатываются \n" + "ПН 9:20 до 16:30 \n" + "ВТ 9:20 до 16:30 \n" + "СР 9:20 до 16:30 \n" + "ЧТ 9:20 до 16:30 \n" + "ПТ 9:20 до 16:30 \n" + "СБ 11:00 до 15:00\n" + "\n" + "Если вы отправили заявку в нерабочее время, она будет получена и обработана по графику следующего дня.";

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
