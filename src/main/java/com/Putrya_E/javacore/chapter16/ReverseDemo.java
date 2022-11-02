package main.java.com.Putrya_E.javacore.chapter16;

// Изменить порядок следования символов в объекте
// типа StringBuffer с помощью метода reverse()
public class ReverseDemo {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("abcdef");

        System.out.println(s);
        s.reverse();
        System.out.println(s);
    }
}
