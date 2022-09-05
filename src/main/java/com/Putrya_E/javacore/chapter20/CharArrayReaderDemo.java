package main.java.com.Putrya_E.javacore.chapter20;

import java.io.*;

// Продемонстрировать применение класса CharArrayReader
// В этой программе используется оператор try с ресурсами
// Требуется установка комплекта JDK, начиная с версии 7

public class CharArrayReaderDemo {
    public static void main(String[] args) {
        String tmp = "abcdefghijklmnopqrstuvwxyz";
        int length = tmp.length();
        char[] c = new char[length];

        tmp.getChars(0, length, c, 0);
        int i;

        try (CharArrayReader input1 = new CharArrayReader(c)) {
            System.out.println("imput1:");
            while ((i = input1.read()) != -1) {
                System.out.print((char) i);
            }
            System.out.println();
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }

        try (CharArrayReader inpu2 = new CharArrayReader(c, 0, 5)) {
            System.out.println("imput2:");
            while ((i = inpu2.read()) != -1) {
                System.out.print((char) i);
            }
            System.out.println();
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }
    }
}
