package main.java.com.Putrya_E.javacore.chapter17;

public class PBDemo {
    public static void main(String[] args) {
        try {
            ProcessBuilder proc = new ProcessBuilder("notepad.exe", "testfile");
            proc.start();
        } catch (Exception e) {
            System.out.println("Ошибка запуска Notepad");
        }
    }
}
