package main.java.com.Putrya_E.javacore.chapter5;

import java.io.File;
import java.nio.file.Files;

// Продемонстрировать применение оператора цикла do-while
public class DoWhile {
    public static void main(String[] args) {
        int n = 10;
        do {
            System.out.println("такт " + n);
            n--;
        } while (n > 0);
    }
}
