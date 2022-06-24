package main.java.com.Putrya_E.javacore.chapter9.interfaces;

public class TestIface {
    public static void main(String[] args) {
        Callback c = new Client();
        c.callback(42);
    }
}
