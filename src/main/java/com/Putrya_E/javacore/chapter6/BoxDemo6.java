package main.java.com.Putrya_E.javacore.chapter6;

// В данном примере программа для инициализации рамеров
// параллелепипеда в классе Box применяется конструктор
class Box6 {
    double width;
    double height;
    double depth;

    // Это конструктор класса Box
    Box6() {
        System.out.println("Конструирование объекта Box");
        width = 10;
        height = 10;
        depth = 10;
    }

    // рассчитать и возвратить объем
    double volume() {
        return width * height * depth;
    }
}

public class BoxDemo6 {
    public static void main(String[] args) {
        // объявить, выделить память и инициализировать объекты типа Box
        Box6 mybox1 = new Box6();
        Box6 mybox2 = new Box6();

        double vol;

        // получить объем первого параллелепипеда
        vol = mybox1.volume();
        System.out.println("Объем равен " + vol);

        // получить объем второго параллелепипеда
        vol = mybox2.volume();
        System.out.println("Объем равен " + vol);
    }
}