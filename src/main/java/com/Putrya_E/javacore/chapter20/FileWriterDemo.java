package main.java.com.Putrya_E.javacore.chapter20;

import java.io.*;

// Продемонстрировать применение класса FileWriter
// В этой программе используется оператор try с ресурсами.
// Требуется установить комплект JDK, начиная с версии 7
public class FileWriterDemo {
    public static void main(String[] args) throws IOException {
        String source = "Now is the time for all good men\n" +
                " to come to the aid of their country\n" +
                " and pay their due taxes.";
        char[] buffer = new char[source.length()];
        source.getChars(0, source.length(), buffer, 0);

        try (FileWriter f0 = new FileWriter("file1.txt");
             FileWriter f1 = new FileWriter("file2.txt");
             FileWriter f2 = new FileWriter("file3.txt")) {
            // вывести символы в первый файл
            for (int i = 0; i < buffer.length; i += 2) {
                f0.write(buffer[i]);
            }

            // вывести символы во второй файл
            f1.write(buffer);

            // вывести символы в третий файл
            f2.write(buffer, buffer.length - buffer.length / 4, buffer.length / 4);
        } catch (IOException e) {
            System.out.println("Произошла ошибка ввода-вывода");
        }
    }
}
