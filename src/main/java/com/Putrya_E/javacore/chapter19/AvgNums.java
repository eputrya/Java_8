package main.java.com.Putrya_E.javacore.chapter19;

import java.util.Scanner;

// Использовать класс Scanner для вычисления среднего
// из списка введенных числовых значений
public class AvgNums {
    public static void main(String[] args) {
        Scanner conin = new Scanner(System.in);

        int count = 0;
        double sum = 0.0;

        System.out.println("Введите числа для подсчепта среднего.");

        // читать и суммировать числовые значения
        while (conin.hasNext()) {
            if (conin.hasNextDouble()) {
                sum += conin.nextDouble();
                count++;
            } else {
                String str = conin.next();
                if (str.equals("готово")) break;
                else {
                    System.out.println("Ошибка формата данных.");
                    return;
                }
            }
        }
        conin.close();
        System.out.println("Среднее равно " + sum / count);
    }
}
