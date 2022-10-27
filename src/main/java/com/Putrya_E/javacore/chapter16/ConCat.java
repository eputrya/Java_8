package main.java.com.Putrya_E.javacore.chapter16;

// Использовать сцепление во избежание длинных строк
public class ConCat {
    public static void main(String[] args) {
        String longStr = "Это может быть очень длинная строка, " +
                "которую следовало бы перенести на " +
                "новую строку. Но благодаря сцеплению " +
                "этого удается избежать.";

        System.out.println(longStr);
    }
}
