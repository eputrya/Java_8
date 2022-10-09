package main.java.com.Putrya_E.javacore.chapter7;

// Продемонстрировать применение массивов объектов типа String
public class StringDemo3 {
    public static void main(String[] args) {
        String[] str = {"один", "два", "три"};

        for(int i=0; i<str.length; i++) {
            System.out.println("str[" + i + "]: " + str[i]);
        }
    }
}
