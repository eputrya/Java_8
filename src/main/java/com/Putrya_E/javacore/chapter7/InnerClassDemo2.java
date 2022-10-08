package main.java.com.Putrya_E.javacore.chapter7;

// Эта программа не подлежит компиляции
class Outer2 {
    int outer_x = 100;

    void test() {
        Inner inner = new Inner();
        inner.display();
    }

    // это внутренний класс
    class Inner {
        int y = 10; // y - локальная переменная класса  Inner

        void display() {
            System.out.println("вывод: outer_x = " + outer_x);
        }
    }

    void showy() {
        //  System.out.println(y); // ошибка, здесь переменная y недоступна!
    }
}

public class InnerClassDemo2 {
    public static void main(String[] args) {
        Outer2 outer = new Outer2();
        outer.test();
    }
}
