package main.java.com.Putrya_E.javacore.chapter17;

// Переопределить метод clone()
class TestClone2 implements Cloneable {
    int a;
    double b;

    // метод clone() переопределяется теперь как public
    public Object clone() {
        try {
            // вызвать метод clone() из класса Object
            return super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Клонирование невозможно.");
            return this;
        }
    }
}

public class CloneDemo2 {
    public static void main(String[] args) {
        TestClone2 x1 = new TestClone2();
        TestClone2 x2;
        x1.a = 10;
        x1.b = 20.98;
        // здесь метод clone() вызывается непосредственно
        x2 = (TestClone2) x1.clone();
        System.out.println("x1: " + x1.a + " " + x1.b);
        System.out.println("x2: " + x2.a + " " + x2.b);
    }
}

