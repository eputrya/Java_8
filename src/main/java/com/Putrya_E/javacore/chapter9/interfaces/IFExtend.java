package main.java.com.Putrya_E.javacore.chapter9.interfaces;

// Один интерфейс может расширять другой
interface Aa {
    void meth1();
    void meth2();
}

// Теперь интерфейс Bb включает в себя методы meth1() и meth2() и добавляет метод meth3()
interface Bb extends Aa {
    void meth3();
}

// Этот класс должен реализовать все методы из интерфейсов Aa и Bb
class MyClass implements Bb {
    public void meth1() {
        System.out.println("Реализация метода meth1().");
    }

    public void meth2() {
        System.out.println("Реализация методы meth2().");
    }

    public void meth3() {
        System.out.println("Реализация метода meth3().");
    }
}

public class IFExtend {
    public static void main(String[] args) {
        MyClass ob = new MyClass();

        ob.meth1();
        ob.meth2();
        ob.meth3();
    }
}
