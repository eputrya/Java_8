package main.java.com.Putrya_E.javacore.chapter19;

import java.util.Formatter;

// Использование автоматического управления ресурсами
// для закрытия объекта типа Formatter
public class FormatDemo7 {
    public static void main(String[] args) {

        try (Formatter fmt = new Formatter()) {

            fmt.format("Форматироавть %s просто %d %f", "средствами Java",
                    10, 98.6);

            System.out.println(fmt);
        }
    }
}
