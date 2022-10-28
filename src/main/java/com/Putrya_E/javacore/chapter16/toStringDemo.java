package main.java.com.Putrya_E.javacore.chapter16;

// Переопределить метод toString() в классе Box10
class Box10 {
    double width;
    double height;
    double depth;

    Box10(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    public String toString() {
        return "Размеры " + width + " на " +
                depth + " на " + height + ".";
    }
}

public class toStringDemo {
    public static void main(String[] args) {
        Box10 b = new Box10(10, 12, 14);
        String s = "Объект b типа Box10: " + b; // выполнить сцепление символьной строки с объектом типа Box10
        System.out.println(b); // преобразовать объект типа Box10 в символьную строку при выводе
        System.out.println(s);
    }
}

