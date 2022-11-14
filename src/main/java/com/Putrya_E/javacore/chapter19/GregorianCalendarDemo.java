package main.java.com.Putrya_E.javacore.chapter19;

import java.util.Calendar;
import java.util.GregorianCalendar;

// Продемонстрировать применение класса типа GregorianCalendar
public class GregorianCalendarDemo {
    public static void main(String[] args) {
        String[] months = {
                "Jan", "Feb", "Mar", "Apr",
                "May", "Jun", "Jul", "Aug",
                "Sep", "Oct", "Nov", "Dec"};
        int year;

        // создать григорианский календарь, инициализируемый
        // текущими датой и временем с учетом региональных
        // настроек и часового пояса по умолчанию
        GregorianCalendar gcalendar = new GregorianCalendar();

        // вывести текущие время и дату
        System.out.print("Дата: ");
        System.out.print(months[gcalendar.get(Calendar.MONTH)]);
        System.out.print(" " + gcalendar.get(Calendar.DATE) + " ");
        System.out.println(year = gcalendar.get(Calendar.YEAR));

        System.out.print("Время: ");
        System.out.print(gcalendar.get(Calendar.HOUR) + ":");
        System.out.print(gcalendar.get(Calendar.MINUTE) + ":");
        System.out.println(gcalendar.get(Calendar.SECOND));

        // проверить, является ли текущий год високосным
        if (gcalendar.isLeapYear(year)) {
            System.out.println("Текущий год високосный");
        } else {
            System.out.println("Текущий год не високосный");
        }
    }
}
