package main.java.com.Putrya_E.javacore.chapter20;

import java.io.ByteArrayInputStream;
import java.io.IOException;

// Продемонстрировать применение класса ByteArrayInputStream
public class ByteArrayInputStreamDemo {
    public static void main(String[] args) throws IOException {
        String tmp  = "abcdefghijklmnopqrstuvwxyz";
        byte[] b = tmp.getBytes();

        ByteArrayInputStream input1 = new ByteArrayInputStream(b);
        ByteArrayInputStream input2 = new ByteArrayInputStream(b, 0, 3);
    }
}
