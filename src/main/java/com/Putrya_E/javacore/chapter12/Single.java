package main.java.com.Putrya_E.javacore.chapter12;

import java.lang.annotation.*;
import java.lang.reflect.*;

// Одночленная аннотация
@Retention(RetentionPolicy.RUNTIME)
@interface MySingle {
    int value(); // эта переменная должна иметь имя value
}

public class Single {

    // аннотировать метод одночленной аннотацией
    @MySingle(100)
    public static void myMeth() {
        Single ob = new Single();

        try {
            Method m = ob.getClass().getMethod("myMeth");

            MySingle anno = m.getAnnotation(MySingle.class);

            System.out.println(anno.value());  // выводит значение 100
        } catch (NoSuchMethodException exc) {
            System.out.println("Метод не найден");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
