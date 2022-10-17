package main.java.com.Putrya_E.javacore.chapter8;

// Динамическая диспетчерезация методов
class A7 {
    void callme() {
        System.out.println("В методе callme() из класса A6");
    }
}

class B7 extends A7 {
    // переопределить метод callme()
    void callme() {
        System.out.println("В методе callme() из класса B7");
    }
}

class C7 extends A7 {
    // переопределить метод callme()
    void callme() {
        System.out.println("В методе callme() из класса C7");
    }
}

public class Dispatch {
    public static void main(String[] args) {
        A7 a = new A7(); // объект класса A7
        B7 b = new B7(); // объект класса B7
        C7 c = new C7(); // объект класса C7

        A7 r;         // получить ссылку на объект типа A7

        r = a;        // переменная r ссылается на объект типа A7
        r.callme();   // вызвать вариант метода callme(), определенный в классе A7

        r = b;        // переменная r ссылается на объект типа B7
        r.callme();   // вызвать вариант метода callme(), определенный в классе B7

        r = c;        // переменная r ссылается на объект типа C7
        r.callme();   // вызвать вариант метода callme(), определенный в классе C7
    }
}
