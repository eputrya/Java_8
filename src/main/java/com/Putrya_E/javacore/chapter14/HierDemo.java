package main.java.com.Putrya_E.javacore.chapter14;

// В подкласс могут быть введены свои параметры типа
class Gen1<T> {
    T ob; // объявить объект типа T

    // передать конструктору ссылку на объект типа T
    Gen1(T o) {
        ob = o;
    }

    // возвратить ссылку ob
    T getOb() {
        return ob;
    }
}

// Подкласс, производный от класса Gen, где определяется второй параметр типа V
class Gen2<T, V> extends Gen<T> {
    V ob2;

    Gen2(T o, V o2) {
        super(o);
        ob2 = o2;
    }

    V getOb2() {
        return ob2;
    }
}

// создать объект типа Gen2
public class HierDemo {
    public static void main(String[] args) {

        // создать объект типа Gen2 для символьных строк целых чисел
        Gen2<String, Integer> x = new Gen2<>("Значение равно: ", 99);

        System.out.println(x.getOb());
        System.out.println(x.getOb2());
    }
}
