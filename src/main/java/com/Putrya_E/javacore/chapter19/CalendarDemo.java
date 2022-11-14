package main.java.com.Putrya_E.javacore.chapter19;

import java.nio.file.StandardOpenOption;
import java.util.Calendar;

// Продемонстрировать применение класса Calandar
public class CalendarDemo {
    public static void main(String[] args) {
        String[] months = {
                "Jan", "Feb", "Mar", "Apr",
                "May", "Jun", "Jul", "Aug",
                "Sep", "Oct", "Nov", "Dec"};

        // создать календарь, инициализируемый
        // текущей датой и временем с учетом региональных
        // настроек и часового пояса по умолчанию
        Calendar calendar = Calendar.getInstance();

        //вывести текущие дату и время
        System.out.print("Дата: ");
        System.out.print(months[calendar.get(Calendar.MONTH)]);
        System.out.print(" " + calendar.get(Calendar.DATE) + " ");
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.print("Время: ");
        System.out.print(calendar.get(Calendar.HOUR) + ":");
        System.out.print(calendar.get(Calendar.MINUTE) + ":");
        System.out.println(calendar.get(Calendar.SECOND));

        // установить дату и время и вывести их
        calendar.set(Calendar.HOUR, 10);
        calendar.set(Calendar.MINUTE, 29);
        calendar.set(Calendar.SECOND, 22);

        System.out.print("Измененное время: ");
        System.out.print(calendar.get(Calendar.HOUR) + ":");
        System.out.print(calendar.get(Calendar.MINUTE) + ":");
        System.out.println(calendar.get(Calendar.SECOND));
    }
}
