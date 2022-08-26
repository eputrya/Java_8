package main.java.com.Putrya_E.javacore.chapter10;

// Эта программа написана верно
public class ThrowsDemo {
    static  void throwOne() throws IllegalAccessException {
        System.out.println("В теле метода throwObe().");
        throw new IllegalAccessException("демонстрация");
    }

    public static void main(String[] args) {
        try {
            throwOne();
        } catch (IllegalAccessException e) {
            System.out.println("Перехвачено исключение: " + e);
        }
    }
}
