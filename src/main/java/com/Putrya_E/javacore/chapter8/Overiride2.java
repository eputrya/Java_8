package main.java.com.Putrya_E.javacore.chapter8;

// Метод с отличающимися сигнатурами считаются
// перегружаемыми, а не переопределяемыми
class A6 {
    int i, j;

    A6(int a, int b) {
        i = a;
        j = b;
    }

    // вывести содержимое переменных i и j
    void show() {
        System.out.println("i и j: " + i + " " + j);
    }
}

// создать подкласс путем расширения класса A6
class B6 extends A6 {
    int k;

    B6(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    // перегрузить метод show()
    void show(String msg) {
        System.out.println(msg + k);
    }
}

public class Overiride2 {
    public static void main(String[] args) {
        B6 subOb = new B6(1, 2, 3);

        subOb.show("Это k: "); // вызвать метод show() из класса B6
        subOb.show();               // вызвать метод show() из класса A6
    }
}
