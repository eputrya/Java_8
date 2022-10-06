package main.java.com.Putrya_E.javacore.chapter7;

// Простой пример рекурсии
class Factorial {
    // это рекурсивный метод
    int fact(int n) {
        int result;

        if (n == 1) return 1;
        result = fact(n - 1) * n;
        return result;
    }
}

public class Recursion {
    public static void main(String[] args) {
        Factorial f = new Factorial();

        System.out.println("Факториал 3 равен " + f.fact(3));
        System.out.println("Факториал 4 равен " + f.fact(4));
        System.out.println("Факториал 5 равен " + f.fact(5));
        System.out.println("Факториал 5 равен " + f.fact(5));
    }
}
