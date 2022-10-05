package main.java.com.Putrya_E.javacore.chapter7;

public class Box {
    double width;
    double height;
    double depth;

    // Это конструктор класса Box
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // расчитать и возвратить объем
    double volume() {
        return width * height * depth;
    }
}
