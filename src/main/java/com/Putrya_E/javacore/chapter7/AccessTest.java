package main.java.com.Putrya_E.javacore.chapter7;

/*
    В этой программе демонстрируется отличие
    модификаторов public и private
 */
class Test5 {
    int a;           // доступ, определяемый по умолчанию
    public int b;    // открытый доступ
    private int c;  // закрытый доступ

    // методы доступа к члену c данного класса
    void setc(int i) { // установить значение члена c данного класса
        c = i;
    }

    int getc() { // получить значение члена c данного класса
        return c;
    }
}

public class AccessTest {
    public static void main(String[] args) {
        Test5 ob = new Test5();

        // Эти операторы правильны, поэтому члены a и b
        // данного класса доступны непосредственно
        ob.a = 10;
        ob.b = 20;

        // Этот оператор неверен и может вызвать ошибку
        // ob.c = 100; // ОШИБКА!

        // Доступ к члену c данного класса должен осуществляться
        // с помощью методов класса
        ob.setc(100); // ВЕРНО!
        System.out.println("a, b и c: " + ob.a + " " + ob.b + " " + ob.getc());
    }
}
