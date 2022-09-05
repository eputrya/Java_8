package main.java.com.Putrya_E.javacore.chapter20;

import java.io.*;

// Продемонстрировать применение класса FileReader
// В этой программе используется оператор try с ресурсами
// Требуется установка JDK, начиная с версии 7
public class FileReaderDemo {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("FileReader,java")) {
            int c;

            //прочитать и вывести содержимое файла
            while ((c = fr.read()) != -1) System.out.println((char) c);
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }
    }
}
