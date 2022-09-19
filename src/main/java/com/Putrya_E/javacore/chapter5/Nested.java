package main.java.com.Putrya_E.javacore.chapter5;

// Цмклы могут быть вложенными
public class Nested {
    public static void main(String[] args) {
        int i, j;

        for (i = 0; i < 10; i++) {
            for (j = 0; j < 10; j++)
                System.out.print(".");
            System.out.println();
        }
    }
}
