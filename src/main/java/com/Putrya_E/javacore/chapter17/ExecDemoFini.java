package main.java.com.Putrya_E.javacore.chapter17;

// Ожидать завершения работы текстового редактора Notepad
public class ExecDemoFini {
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        Process p = null;

        try {
            p = r.exec("Notepad");
            p.waitFor();
        } catch (Exception e) {
            System.out.println("Ошибка запуска Notepad.");
        }
        System.out.println("Notepad возвратил " + p.exitValue());
    }
}
