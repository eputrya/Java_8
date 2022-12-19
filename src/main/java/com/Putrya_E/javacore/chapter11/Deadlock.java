package main.java.com.Putrya_E.javacore.chapter11;

// Пример взаимной блокировки
class A3 {
    synchronized void foo(B3 b) {
        String name = Thread.currentThread().getName();

        System.out.println(name + " вошел в метод A3.foo()");

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("Класс A3 прерван");
        }
        System.out.println(name + " пытается вызвать метод B3.last()");
        b.last();
    }

    synchronized void last() {
        System.out.println("В методе A3.last()");
    }
}

class B3 {
    synchronized void bar(A3 a) {
        String name = Thread.currentThread().getName();
        System.out.println(name + " вошел в метод B3.bar()");

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("Класс B3 прерван");
        }

        System.out.println(name + " пытается вызвать метод A3.last()");
        a.last();
    }

    synchronized void last() {
        System.out.println("В методе A3.last()");
    }
}

public class Deadlock implements Runnable {
    A3 a = new A3();
    B3 b = new B3();


    Deadlock() {
        Thread.currentThread().setName("Главный поток");
        Thread t = new Thread(this, "Соперничающий поток");
        t.start();

        a.foo(b); // получить блокировку для объекта a в этом потоке исполения
        System.out.println("Назад в главный поток");
    }


    public void run() {
        b.bar(a); // получить блокировку для объекта b в другом потоке исполнения
        System.out.println("Назад в другой поток");
    }

    public static void main(String[] args) {
        new Deadlock();
    }
}

