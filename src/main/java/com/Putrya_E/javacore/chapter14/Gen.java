package main.java.com.Putrya_E.javacore.chapter14;

// Простой обощеный класс.
// Здесь T обозначает парамет типа, который будет заменен реальным типом при создании объекта типа Gen
public class Gen<T>{
    T ob; // объявить объект типа T

    // передать конструктору ссылку на объект типа T
    Gen(T o) {
        ob = o;
    }

    // возвратить объект ob
    T getOb() {
        return ob;
    }

    // показать тип T
    void showType() {
        System.out.println("Типом T является " + ob.getClass().getName());
    }
}

// Продемонстрировать применение обобщенного класса
class GenDemo {
    public static void main(String[] args) {
        // создать ссылку типа Gen для целых чисел
        Gen<Integer> iOb;

        // Создать объект типа Gen<Integer> и присвоить ссылку на него переменной iOb.
        // Обратите внимание на применение автоупаковки для инкапсуляции значения 88 в объект типа Integer
        iOb = new Gen<Integer>(88);

        // показать тип данных, хранящихся в переменной iOb
        iOb.showType();

        // получить значение переменной iOb. Обратите внимание на то, что для этого не требуется никакого приведения типов
        int v = iOb.getOb();
        System.out.println("Значение: " + v);
        System.out.println();

        // создать объект типа Gen для символьных строк
        Gen<String> strOb = new Gen<String>("Текст обобщений");

        // показать тип данных, хранящихся в переменной srtOb
        strOb.showType();

        // получить значение переменной strOb. И в этом случае приведение типов не требуется
        String str = strOb.getOb();
        System.out.println("Значение: " + str);
    }
}