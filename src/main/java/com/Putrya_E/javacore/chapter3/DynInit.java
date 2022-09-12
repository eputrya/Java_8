package main.java.com.Putrya_E.javacore.chapter3;

// В этом примере демонстрируется динамическая инициализация
public class DynInit {
    public static void main(String[] args) {
        double a = 3.0, b = 4.0;

        // динамическая инициализация переменной с
        double c = Math.sqrt(a * a + b * b);
        System.out.println("Гипотенуза равна " + c);
    }
}
