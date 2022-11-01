package main.java.com.Putrya_E.javacore.chapter16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Использовать метод trim() для обработки команд,
// вводимых пользователем
public class UseTrim {
    public static void main(String[] args) throws IOException {
        // создать буферизированный поток чтения типа BufferedReader,
        // используя стандартный поток ввода System.in
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        System.out.println("Введите 'стоп' для завершения.");
        System.out.println("Введите название штата: ");
        do {
            str = br.readLine();
            str = str.trim();    // удалить порбелы
            if (str.equals("Иллинойс"))
                System.out.println("Столица - Спрингфилд.");
            else if (str.equals("Миссури"))
                System.out.println("Столица - Джефферсон-сити.");
            else if (str.equals("Калифорния"))
                System.out.println("Столица - Сакраменто.");
            else if (str.equals("Вашингтон"))
                System.out.println("Столица - Олимпия.");
            // ...
        } while (!str.equals("стоп"));
    }
}
