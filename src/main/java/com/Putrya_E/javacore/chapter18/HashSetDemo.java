package main.java.com.Putrya_E.javacore.chapter18;
import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        //создать хеш-множество
        HashSet<String> hs = new HashSet<>();

        //ввести элементы в хеш-множество
        hs.add("Бета");
        hs.add("Альфа");
        hs.add("Эта");
        hs.add("Гамма");
        hs.add("Эпсилон");
        hs.add("Омега");
        //элементы множества выводятся в рандомном порядке
        System.out.println(hs);
    }
}
