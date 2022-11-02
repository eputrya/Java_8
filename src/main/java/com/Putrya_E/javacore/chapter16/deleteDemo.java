package main.java.com.Putrya_E.javacore.chapter16;

// Продемонстрировать применение методов delete() и deleteCharAt()
public class deleteDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Это простой текст.");

        sb.delete(3, 11);
        System.out.println("После вызова delete(): " + sb);

        sb.deleteCharAt(0);
        System.out.println("После вызова deleteCharAt(): " + sb);
    }
}
