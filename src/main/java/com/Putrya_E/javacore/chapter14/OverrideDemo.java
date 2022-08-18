package main.java.com.Putrya_E.javacore.chapter14;

// Переопределение обобщенного метода в обобщенном классе
class Gen6<T> {
    T ob; // объявить объект типа T

    // передать конструктору ссылку на объект типа T
    Gen6(T o) {
        ob = o;
    }

    // возвратить объект ob
    T getOb() {
        System.out.print("Метод getOb() из класса Gen6: ");
        return ob;
    }
}

// Подкласс, производный от класса Gen6 и переопределяющий метод getOb()
class Gen7<T> extends Gen6<T> {

    Gen7(T o) {
        super(o);
    }

    // переопределить метод getOb()
    T getOb(){
        System.out.print("Метод getOb() из класса Gen7: ");
        return ob;
    }
}

// Продемонстрировать переопределение обощенных методов
public class OverrideDemo {
    public static void main(String[] args) {

        // создать объект типа Gen6 для целых чисел
        Gen6<Integer> iOb = new Gen6<>(88);

        // создать объект типа Gen7 для целых чисел
        Gen7<Integer> iOb2 = new Gen7<>(99);

        // создать объект Gen7 для символьных строк
        Gen7<String> strOb2 = new Gen7<>("Тест обобщений");
        System.out.println(iOb.getOb());
        System.out.println(iOb2.getOb());
        System.out.println(strOb2.getOb());
    }
}
