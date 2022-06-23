package main.java.com.Putrya_E.javacore.chapter18;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        //создать связаное хеш-множество
        LinkedHashSet<String> lhs = new LinkedHashSet<>();

        //ввести элементы в хеш-множество
        lhs.add("Бета");
        lhs.add("Альфа");
        lhs.add("Эта");
        lhs.add("Гамма");
        lhs.add("Эпсилон");
        lhs.add("Омега");
        //элементы множества выводятся в порядке ввода
        System.out.println(lhs);
    }
}
