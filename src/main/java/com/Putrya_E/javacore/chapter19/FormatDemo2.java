package main.java.com.Putrya_E.javacore.chapter19;

import java.util.Formatter;

// Продемонстрировать применение спецификаторов %f и %e
public class FormatDemo2 {
    public static void main(String[] args) {
        Formatter fmt = new Formatter();

        for (double i = 1.23; i < 1.0+6; i += 100) {
            fmt.format("%f %e", i, i);
            System.out.println(fmt);
        }
        fmt.close();
    }
}
