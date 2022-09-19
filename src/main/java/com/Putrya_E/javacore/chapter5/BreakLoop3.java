package main.java.com.Putrya_E.javacore.chapter5;

// Применение оператора break во вложенных циклах
public class BreakLoop3 {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.println("Проход " + i + ": ");
            for (int j = 0; j < 100; j++) {
                if (j == 10) break; // выход из цикла, значение переменной j равно 10
                System.out.println(j + " ");
            }
            System.out.println();
        }
        System.out.println("Циклы завершены.");
    }
}
