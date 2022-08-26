package main.java.com.Putrya_E.javacore.chapter10;

// Продемонстрировать цепочки исключений
public class ChainExcDemo {
    static void demoproc() {

        // создать исключение
        NullPointerException e = new NullPointerException("вержний уровень");

        // добавить причину исключения
        e.initCause(new ArithmeticException("причина"));
        throw e;
    }

    public static void main(String[] args) {
        try {
            demoproc();
        } catch (NullPointerException e) {
            // вывести исключение акрхнего уровня
            System.out.println("Перехвачено исключение: " + e);

            // вывести исключение, послужившее причиной
            // для исключения верхнего уровня

            System.out.println("Первопричина: " + e.getCause());
        }
    }
}
