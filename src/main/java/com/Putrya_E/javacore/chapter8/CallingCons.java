package main.java.com.Putrya_E.javacore.chapter8;

// Продемонстрировать порядок вызова конструкторов

// создать супер класс
class A4 {
    A4() {
        System.out.println("В конструкторе A.");
    }
}

// создать подкласс путем расширения класса A
class B4 extends A4 {
    B4() {
        System.out.println("В конструкторе B.");
    }
}

// создать еще один подкласс путем расширения класса B
class C extends B4 {
    C() {
        System.out.println("В конструкторе C.");
    }
}

public class CallingCons {
    public static void main(String[] args) {
        C c = new C();
    }
}
