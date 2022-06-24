package main.java.com.Putrya_E.javacore.chapter9.interfaces;

// Еще одна реализация интерфейса Callback
public class AnotherClient implements Callback {
    //реализовать интерфейс Callback
    public void callback(int p){
        System.out.println("Еще один вариант метода callback()");
        System.out.println("p в квадрате равно " + (p*p));
    }
}