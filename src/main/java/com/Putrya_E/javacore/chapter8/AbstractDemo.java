package main.java.com.Putrya_E.javacore.chapter8;

// Простой пример абстракции
abstract class A8 {
    abstract void callme();

    // абстрактные классы все же могут содержать конкретные методы
    void callmetoo() {
        System.out.println("Это конкретный метод.");
    }
}

class B8 extends A8 {
    void callme() {
        System.out.println("Реализация метода callme() из класса B8.");
    }
}


public class AbstractDemo {
    public static void main(String[] args) {
        B8 b = new B8();

        b.callme();
        b.callmetoo();
    }
}
