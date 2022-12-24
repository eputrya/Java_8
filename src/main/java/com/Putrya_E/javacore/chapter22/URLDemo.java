package main.java.com.Putrya_E.javacore.chapter22;

import java.net.MalformedURLException;
import java.net.URL;

// Продемонстрировать прменение класса URL
public class URLDemo {
    public static void main(String[] args) throws MalformedURLException {
        URL hp = new URL("http://www.HerbSchildt.com/Articles");

        System.out.println("Протокол: " + hp.getProtocol());
        System.out.println("Порт: " + hp.getPort());

        System.out.println("Холст: " + hp.getHost());
        System.out.println("Файл: " + hp.getFile());
        System.out.println("Полная форма: " + hp.toExternalForm());
    }
}
