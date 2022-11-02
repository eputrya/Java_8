package main.java.com.Putrya_E.javacore.chapter16;

// Продемонстрировать применение метода insert()
public class insertDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Мне Java!");

        sb.insert(4, "нравиться ");
        System.out.println(sb);
    }
}
