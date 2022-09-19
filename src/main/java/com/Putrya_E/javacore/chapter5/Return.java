package main.java.com.Putrya_E.javacore.chapter5;

// Продемонстрировать применение оператора return
public class Return {
    public static void main(String[] args) {
        boolean t = true;

        System.out.println("До возврата.");

        if (t) return; // возврат в вызывающий код

        System.out.println("Этот оператор выполняться не будет.");
    }
}
