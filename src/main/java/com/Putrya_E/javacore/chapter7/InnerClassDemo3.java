package main.java.com.Putrya_E.javacore.chapter7;

// Определить внутренний класс в цикле for
class Outer3 {
    int outer_x = 100;

    void test() {
        for (int i = 0; i < 10; i++) {
            class Inner {
                void display() {
                    System.out.println("вывод: outer_x = " + outer_x);
                }
            }
            Inner inner = new Inner();
            inner.display();
        }
    }
}

public class InnerClassDemo3 {
    public static void main(String[] args) {
        Outer3 outer = new Outer3();
        outer.test();
    }
}
