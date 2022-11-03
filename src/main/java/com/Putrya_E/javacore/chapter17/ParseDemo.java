package main.java.com.Putrya_E.javacore.chapter17;

/*
Эта программа суммирует ряд целых чисел, вводимых пользователем.
Она преобразует строковое представление каждого числа в целое
значение методов parseInt()
 */

import java.io.*;

public class ParseDemo {
    public static void main(String[] args) throws IOException {
        // создать буферизированный поток чтения типа BufferedReader,
        // используя стандартный поток ввода System.in
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        int i;
        int sum = 0;
        System.out.println("Введите число, 0 - для выхода.");
        do {
            str = br.readLine();
            try {
                i = Integer.parseInt(str);
            } catch (NumberFormatException e) {
                System.out.println("Неверный формат");
                i = 0;
            }
            sum += i;
            System.out.println("Текущая сумма: " + sum);
        } while (i != 0);
    }
}
