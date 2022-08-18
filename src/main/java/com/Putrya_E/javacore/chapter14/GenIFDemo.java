package main.java.com.Putrya_E.javacore.chapter14;

// Пример применения обощенного нтерфейса
// Обощенный интерфейс MinMax для определения минимального и максимального значений
interface MinMax<T extends Comparable<T>> {
    T min();
    T max();
}

// Реализовать обобщенный интерфейс MinMax
class MyClass<T extends Comparable<T>> implements MinMax<T> {
    T [] vals;

    public MyClass(T[] o) { vals = o; }

    // возвратить минимальное значение из массива vals
    public  T min() {
        T v = vals[0];

        for (int i = 0; i < vals.length; i++)
            if (vals[i].compareTo(v) < 0) v = vals[i];
            return v;
    }

    // возвратить максимально значение из массива vals

    public  T max() {
        T v = vals[0];
        for (int i = 0; i < vals.length; i++)
            if (vals[i].compareTo(v) > 0) v = vals[i];
            return v;
    }
}


public class GenIFDemo {
    public static void main(String[] args) {
        Integer[] inums = { 3, 6, 2, 8, 6 };
        Character[] chs = {'b', 'r', 'p', 'w'};

        MyClass<Integer> iob = new MyClass<>(inums);
        MyClass<Character> cob = new MyClass<>(chs);

        System.out.println("Максимальное значение в массиве inums: " + iob.max());
        System.out.println("Минимальное значение в массиве inums: " + iob.min());

        System.out.println("Максимальное значение в массиве chs: " + cob.max());
        System.out.println("Минимальное значение в массиве chs: " + cob.min());
    }
}
