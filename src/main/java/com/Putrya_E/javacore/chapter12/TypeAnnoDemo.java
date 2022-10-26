package main.java.com.Putrya_E.javacore.chapter12;

// Продемонстрировать применение нескольких типовых аннотаций

import java.lang.annotation.*;

// Аннотация-маркер, которую можно применить к типу данных
@Target(ElementType.TYPE_USE)
@interface TypeAnno {
}

// Еще одна аннотация-маркер, которую можно применить к типу данных
@Target(ElementType.TYPE_USE)
@interface NotZeroLen {
}

// И еще одна аннотация-маркер, которую можно применить к типу данных
@Target({ElementType.TYPE_USE})
@interface Unique {
}

// Параметризированная аннотация, которую можно применить к типу данных
@Target(ElementType.TYPE_USE)
@interface MaxLen {
    int value();
}

// Аннотация, которую можно применить к параметру типа
@Target(ElementType.TYPE_PARAMETER)
@interface What3 {
    String description();
}

// Аннотация, которую можно применить в объявлении поля
@Target(ElementType.FIELD)
@interface EmptyOk {
}

// Аннотация, которую можно применить в объявлении метода
@Target(ElementType.METHOD)
@interface Recommended {
}

// применить аннотацию в параметре типа
public class TypeAnnoDemo<@What3(description = "Данные обобщенного типа") T> {

    // применить типовую аннотацию в конструкторе
    public @Unique TypeAnnoDemo() {
    }

    // аннотировать тип (в данном случае - String), но не поле
    @TypeAnno String str;

    // аннотиолвать тест поля
    @EmptyOk
    String test;

    // применить типовую аннотацию для аннотирования
    // ссылки this на объект (получатель)
    public int f(@TypeAnno TypeAnnoDemo<T>this, int x) {
        return 10;
    }

    // аннотировать возвращаемый тип
    public @TypeAnno Integer f2(int j, int k) {
        return j + k;
    }

    // аннотировать объявление метода
    public @Recommended
    Integer f3(String str) {
        return str.length() / 2;
    }

    // применить типовую аннотацию в операторе throws
    public void f4() throws @TypeAnno NullPointerException {
        // ...
    }

    // аннотировать уровни доступа к массиву
    String @MaxLen(10) [] @NotZeroLen [] w;

    // аннотировать тип элемента массива
    @TypeAnno Integer[] vec;

    public static void myMeth(int i) {

        // применить типовую аннотацию в аргументе типа
        TypeAnnoDemo<@TypeAnno Integer> ob = new TypeAnnoDemo<@TypeAnno Integer>();

        // применить типовую аннотацию в операторе new
        @Unique TypeAnnoDemo<Integer> ob2 = new @Unique TypeAnnoDemo<Integer>();

        Object x = new Integer(10);
        Integer y;

        // применить типовую аннотацию в приведении типов
        y = (@TypeAnno Integer) x;
    }

    public static void main(String[] args) {
        myMeth(10);
    }

    // применить типовую аннотацию в выражении наследования
    class SomeClass extends @TypeAnno TypeAnnoDemo<Boolean> {
    }

}
