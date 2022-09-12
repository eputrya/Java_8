package main.java.com.Putrya_E.javacore.chapter3;

// Скомпилировать эту прорамму нельзя
public class ScopeErr {
    public static void main(String[] args) {
        int bar = 1;
        {
            // создается новая область действия
            // int bar = 2;    // ошибка во время компиляции -
            // переменная bar уже определена!
        }
    }
}
