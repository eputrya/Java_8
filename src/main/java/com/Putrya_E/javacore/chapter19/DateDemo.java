package main.java.com.Putrya_E.javacore.chapter19;

import java.util.Date;

// Вывести дату и время,используя только методы из класса Date
public class DateDemo {
    public static void main(String[] args) {

        // создать объект типа Date
        Date date = new Date();

        // вывести дату и время методом toString()
        System.out.println(date);

        // вывести количество миллисекунд, поршедшиъ
        // с 1 января 1970 г. по Гринвичу
        long msec = date.getTime();
        System.out.println("Количество миллисекунд, прошедших с " +
                "1 января 1970 г. по Гринвичу = " + msec);
    }
}
