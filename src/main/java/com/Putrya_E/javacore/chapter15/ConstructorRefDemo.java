package main.java.com.Putrya_E.javacore.chapter15;

// Продемонстрировать применение ссылки на конструктор

// В функциональном интерфейсе MyFunc определяется метод,
// возвращающий ссылку на класс MyClass
interface MyFunc7 {
    MyClass4 func(int n);
}

class MyClass4 {
    private int val;

    // Этот конструктор принимает один аргумент
    MyClass4(int v) {
        val = v;
    }

    // А эьтот конструктор по умолчанию
    MyClass4() {
        val = 0;
    }

    // ...

    int getVal() {
        return val;
    }
}

public class ConstructorRefDemo {
    public static void main(String[] args) {
        // Создать ссылку на конструктор класса MyClass4.
        // Метод func() из интерфейса MyFunc7 принимает аргумент,
        // поэтому оператор new обращается к параметризированному
        // конструктору класса MyClass4, а не к его конструктору по умолчанию
        MyFunc7 myClassCons = MyClass4::new;

        // создать экземпляр класса MyClass4 по ссылке на его конструктор
        MyClass4 mc = myClassCons.func(100);

        // использовать только что созданный экземпляр класса MyClass4
        System.out.println("Значение val в объекте mc равно " + mc.getVal());
    }
}
