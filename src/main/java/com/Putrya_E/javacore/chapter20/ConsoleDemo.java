package main.java.com.Putrya_E.javacore.chapter20;
import java.io.*;

// Продемонстрировать применение класса Console
public class ConsoleDemo {
    public static void main(String[] args) {
        String str;
        Console con;

        // получить ссылку на консоль
        con = System.console();

        // выйти из программы, если кончоль недоступна
        if (con == null) return;

        // прочитать строку и вывести ее
        str = con.readLine("Введите строку: ");
        con.printf("Введенная вами строка: %s\n", str);
    }
}
