package main.java.com.Putrya_E.javacore.chapter12;

// Воспользовать встроенными в перечисление методами

// Перечисление сортов яблок
enum Apple2 {
    Jonathan, GoldenDel, RedDel, Winesap, Cortland
}

public class EnumDemo2 {
    public static void main(String[] args) {

        Apple2 ap;

        System.out.println("Константы перечислимого типа Apple2:");

        // применить метод values()
        Apple2 allapples[] = Apple2.values();
        for (Apple2 a : allapples)
            System.out.println(a);

        System.out.println();

        // применить метод valueOf()
        ap = Apple2.valueOf("Winesap");
        System.out.println("Переменная ap содержит " + ap);
    }
}
