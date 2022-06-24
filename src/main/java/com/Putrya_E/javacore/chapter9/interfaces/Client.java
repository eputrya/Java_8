package main.java.com.Putrya_E.javacore.chapter9.interfaces;

public class Client implements Callback{
    //реализовать интерфейс Callback
    public void callback(int p){
        System.out.println("Метод callback(), вызываемый со значением " + p);
    }

    void nonIfaceMeth(){
        System.out.println("В классах, реализующих интерфейсы, могут определяться и другие члены");
    }
}
