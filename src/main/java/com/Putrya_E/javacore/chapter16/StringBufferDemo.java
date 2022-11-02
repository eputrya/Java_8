package main.java.com.Putrya_E.javacore.chapter16;

// Сравнить методы length() и capacity() из класса StringBuffer
public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println("буфер = " + sb);
        System.out.println("длина = " + sb.length());
        System.out.println("емкость = " + sb.capacity());
    }
}
