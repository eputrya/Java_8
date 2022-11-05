package main.java.com.Putrya_E.javacore.chapter17;

// Измерение времени выполнения программы
public class Elapsed {
    public static void main(String[] args) {
        long start, end;

        System.out.println("Измерение времени перебора от 0 до 100000000");
        // измерить время от 0 до 100000000

        start = System.currentTimeMillis(); // получить начальный момент времени

        for (long i = 0; i < 100000000L; i++) ;
        end = System.currentTimeMillis(); // получить конечный момент времени

        System.out.println("Время выполнения: " + (end - start));
    }
}
