package main.java.com.Putrya_E.javacore.chapter19;

import java.util.Random;

// Продемонстрировать генерирование случайных значений
// с нормальным распределением
public class RandDemo {
    public static void main(String[] args) {
        Random r = new Random();
        double val;
        double sum = 0;
        int[] bell = new int[10];

        for (int i = 0; i < 100; i++) {
            val = r.nextGaussian();
            sum += val;
            double t = -2;

            for (int x = 0; x < 10; x++, t += 0.5)
                if (val < t) {
                    bell[x]++;
                    break;
                }
        }
        System.out.println("Среднее всех значений: " + (sum / 100));

        // вывести кривую распределения
        for (int i = 0; i < 10; i++) {
            for (int x = bell[i]; x > 0; x--)
                System.out.print("*");
            System.out.println();

        }
    }
}

