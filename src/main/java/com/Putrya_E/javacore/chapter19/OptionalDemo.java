package main.java.com.Putrya_E.javacore.chapter19;

// Продемонстрировать применение нескольких
// методов из обобщенного класса Optional<T>

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {

        Optional<String> noVal = Optional.empty();

        Optional<String> hasVal = Optional.of("ABCDEFG");

        if (noVal.isPresent()) System.out.println("Не подлежит выводу");
        else System.out.println("Объект noVal не содержит значение");

        if (hasVal.isPresent())
            System.out.println("Объект hasVal содержит следующую строку: " + hasVal.get());

        String defStr = noVal.orElse("Строка по умолчанию");
        System.out.println(defStr);
    }
}
