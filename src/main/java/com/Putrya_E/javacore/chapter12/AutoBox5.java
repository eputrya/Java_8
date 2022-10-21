package main.java.com.Putrya_E.javacore.chapter12;

// Автоупаковка/распаковка значений из класса Boolean и Character
public class AutoBox5 {
    public static void main(String[] args) {

        // Автоупаковка/распаковка логического значения типа boolean
        Boolean b = true;

        // объект b автоматически распаковывается,
        // когда он употребляется в условном операторе if
        if (b) System.out.println("b равно true");

        // Автоупаковка/распаковка значений типа char
        Character ch = 'x'; // упаковать значение типа char
        char ch2 = ch;      // распаковать значение типа char

        System.out.println("ch2 равно " + ch2);
    }
}
