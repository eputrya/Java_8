package main.java.com.Putrya_E.javacore.chapter12;

import java.lang.annotation.*;
import java.lang.reflect.*;

// Показать все аннотации для класса и метода
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno3 {
    String str();

    int val();
}

@Retention(RetentionPolicy.RUNTIME)
@interface What {
    String description();
}

@What(description = "Аннотация тестового класса")
@MyAnno3(str = "Meta3", val = 99)

public class Meta3 {

    @What(description = "Аннотация тестового метода")
    @MyAnno3(str = "Testing", val = 100)
    public static void myMeth() {
        Meta3 ob = new Meta3();

        try {
            Annotation annos[] = ob.getClass().getAnnotations();

            // вывести все аннотации для класса Meta3
            System.out.println("Все аннотации для класса Meta3:");
            for (Annotation a : annos)
                System.out.println(a);

            System.out.println();

            // вывести все аннотации для метода myMeth()
            Method m = ob.getClass().getMethod("myMeth");
            annos = m.getAnnotations();

            System.out.println("Все аннотации для метода myMeth():");
            for (Annotation a : annos)
                System.out.println(a);
        } catch (NoSuchMethodException exc) {
            System.out.println("Метод не найден");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
