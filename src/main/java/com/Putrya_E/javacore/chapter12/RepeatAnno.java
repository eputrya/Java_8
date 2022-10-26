package main.java.com.Putrya_E.javacore.chapter12;

// Продемонстрировать применение повторяющейся аннотации

import java.lang.annotation.*;
import java.lang.reflect.*;

// Сделать аннотацию MyAnno повторяющеймя
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(MyRepeatedAnnos.class)
@interface MyAnno5 {
    String str() default "Тестирование";

    int val() default 9000;
}

// Это контейнерная аннотация
@Retention(RetentionPolicy.RUNTIME)
@interface MyRepeatedAnnos {
    MyAnno5[] value();
}

public class RepeatAnno {

    // повторить аннотацию MyAnno в методе myMeth()
    @MyAnno5(str = "Первая аннотация", val = -1)
    @MyAnno5(str = "Вторая аннотация", val = 100)
    public static void myMeth(String str, int i) {
        RepeatAnno ob = new RepeatAnno();

        try {
            Class<?> c = ob.getClass();

            // получить аннотации для метода myMeth()
            Method m = c.getMethod("myMeth", String.class, int.class);

            // вычесть повторяющиеся аннотации MyAnno
            Annotation anno = m.getAnnotation(MyRepeatedAnnos.class);
            System.out.println(anno);
        } catch (NoSuchMethodException exc) {
            System.out.println("Метод не найден.");
        }
    }

    public static void main(String[] args) {
        myMeth("тест", 10);
    }
}
