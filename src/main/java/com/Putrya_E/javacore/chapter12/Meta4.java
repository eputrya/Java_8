package main.java.com.Putrya_E.javacore.chapter12;

import java.lang.annotation.*;
import java.lang.reflect.*;

// Объявление типа аннотации, включая значения ее членов по умолчанию
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno4 {
    String str() default "Тестирование";

    int val() default 9000;
}

public class Meta4 {

    // аннотировать метод, используя значения по умолчанию
    @MyAnno4()
    public static void myMeth() {
        Meta4 ob = new Meta4();

        // получить аннотацию для данного метода
        // и вывести значение членов
        try {
            Class<?> c = ob.getClass();

            Method m = c.getMethod("myMeth");

            MyAnno4 anno = m.getAnnotation(MyAnno4.class);

            System.out.println(anno.str() + " " + anno.val());
        } catch (NoSuchMethodException exc) {
            System.out.println("Метод не найден.");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
