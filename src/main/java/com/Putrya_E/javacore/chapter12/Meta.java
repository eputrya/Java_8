package main.java.com.Putrya_E.javacore.chapter12;

import java.lang.annotation.*;
import java.lang.reflect.*;

// Объявление типа аннотации

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno {
    String str();

    int val();
}

public class Meta {
    // аннотировать метод
    @MyAnno(str = "Пример аннотации", val = 100)
    public static void myMeth() {

        Meta ob = new Meta();

        // получить аннотацию из метода
        // и вернуть значение ее члена
        try {
            // сначала получить объект типа Class,
            // представляющий данный класс
            Class<?> c = ob.getClass();

            // затем получить объект типа Method,
            // представляющий данный метод
            Method m = c.getMethod("myMeth");

            // далее получить аннотацию для данного класса
            MyAnno anno = m.getAnnotation(MyAnno.class);

            // и наконец, вывести значение членов аннотации
            System.out.println(anno.str() + " " + anno.val());
        } catch (NoSuchMethodException exc) {
            System.out.println("Метод не найден.");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
