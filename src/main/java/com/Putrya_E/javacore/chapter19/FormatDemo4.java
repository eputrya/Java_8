package main.java.com.Putrya_E.javacore.chapter19;

import java.util.Formatter;

// Продемонстрировать применение спецификатора ширины поля
public class FormatDemo4 {
    public static void main(String[] args) {
        Formatter fmt = new Formatter();

        fmt.format("|%f|%n|%12f|%n|%012f",
                10.12345, 10.12345, 10.12345);

        System.out.println(fmt);
        fmt.close();
    }
}
