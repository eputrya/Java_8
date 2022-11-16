package main.java.com.Putrya_E.javacore.chapter19;

import java.util.Currency;
import java.util.Locale;

// Продемонстрировать применение класса Currency
public class CurDemo {
    public static void main(String[] args) {
        Currency c;

        c = Currency.getInstance(Locale.US);

        System.out.println("Символ: " + c.getSymbol());
        System.out.println("Количество цифр в дробной части по умолчанию: " +
                c.getDefaultFractionDigits());
    }
}
