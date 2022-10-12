package main.java.com.Putrya_E.javacore.chapter8;

/*
    В иерархии классов закрытые члены остаются закрытыми
    в пределах своего класса.
 */

// создать суперкласс
class A2 {
    int i;         // этот член открыт по умолчанию,
    private int j; // а этот закрыт в классе A

    void setij(int x, int y) {
        i = x;
        j = y;
    }
}

// Член j класса A в этом классе недоступен
class B2 extends A2 {
    int total;

    void sum() {
       // total = i + j; // ОШИБКА: член j в этом классе недоступен
    }
}

public class Access {
    public static void main(String[] args) {
        B2 subOb = new B2();

        subOb.setij(10, 12);

        subOb.sum();
        System.out.println("Сумма равна " + subOb.total);
    }
}
