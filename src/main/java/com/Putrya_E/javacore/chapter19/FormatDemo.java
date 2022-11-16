package main.java.com.Putrya_E.javacore.chapter19;

import java.util.Formatter;

// Очень протсой пример применения класса Formatter
public class FormatDemo {
    public static void main(String[] args) {
        Formatter fmt = new Formatter();

        fmt.format("Форматировать %s просто %d %f", "средствами Java", 10, 98.6);

        System.out.println(fmt);
        fmt.close();
    }
}
