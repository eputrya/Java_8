package main.java.com.Putrya_E.javacore.chapter19;

import java.util.*;

// Продемонстрировать применение комплектов ресурсов
public class LRBDemo {
    public static void main(String[] args) {
        // загрузить комплект ресурсов по умолчанию
        ResourceBundle rd = ResourceBundle.getBundle("SampleRB");

        System.out.println("Английская версия программы: ");
        System.out.println("Строка по ключу Title: " + rd.getString("title"));
        System.out.println("Строка по ключу StopText: " + rd.getString("StopText"));
        System.out.println("Строка по ключу StartText: " + rd.getString("StartText"));

        // загрузить комплект ресурсов для поддержки немецкого языка
        rd = ResourceBundle.getBundle("SampleRB", Locale.GERMAN);

        System.out.println("Немецкая версия программы: ");
        System.out.println("Строка по ключу Title: " + rd.getString("title"));
        System.out.println("Строка по ключу StopText: " + rd.getString("StopText"));
        System.out.println("Строка по ключу StartText: " + rd.getString("StartText"));


    }
}
