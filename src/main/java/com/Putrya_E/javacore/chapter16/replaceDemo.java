package main.java.com.Putrya_E.javacore.chapter16;

// Продемонстрировать применение метода replace()
public class replaceDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Это простой тест.");
        sb.replace(4, 11, "был");
        System.out.println("После замены: " + sb);
    }
}
