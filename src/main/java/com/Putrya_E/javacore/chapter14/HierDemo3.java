package main.java.com.Putrya_E.javacore.chapter14;

// Использовать оператор instanceof в иерархии обобщенных классов
class Gen4<T> {
    T ob;

    Gen4(T o){
        ob = o;
    }

    // возвратить объект ob
    T getOb() {
        return ob;
    }
}

// Подкласс, производный от класса Gen
class Gen5<T> extends Gen4<T> {
    Gen5(T o) {
        super(o);
    }
}

// Продемонстрировать последствия динамической идентификации типов в иерархии обобщенных классов
public class HierDemo3 {
    public static void main(String[] args) {
        // создать объект типа Gen4 для целых чисел
        Gen4<Integer> iOb = new Gen4<>(88);

        // создать объект типа Gen5 для целых чисел
        Gen5<Integer> iOb2 = new Gen5<>(99);

        // создать объект типа Gen5 для символьных строк
        Gen5<String> strOb2 = new Gen5<>("Текст обобщений");

        // проверить, является ли объект iOb2 какой-нибудь из форм класса Gen5
        if (iOb2 instanceof Gen5<?>)
            System.out.println("Объект iOb2 является экземпляром класса Gen5");

        // проверить, является ли объект типа iOb2 какой-нибудь  из форм класса Ge4
        if (iOb2 instanceof Gen4<?>)
            System.out.println("Объект iOb2 является экземпляром класса Gen4");

        // проверить, является ли объект типа strOb2 какой-нибудь  из форм класса Ge5
        if (strOb2 instanceof Gen5<?>)
            System.out.println("Объект strOb2 является экземпляром класса Gen5");

        // проверить, является ли объект типа strOb2 какой-нибудь  из форм класса Ge4
        if (strOb2 instanceof Gen4<?>)
            System.out.println("Объект strOb2 является экземпляром класса Gen4");

        System.out.println();

        // проверить, является ли iOb экземпляром класса Gen5, что совсем не так
        if (iOb instanceof Gen5<?>)
            System.out.println("Объект iOb является экземпляром класса Gen2");

        // проверить, является ли iOb экземпляром класса Gen4, что так и есть
        if (iOb instanceof Gen4<?>)
            System.out.println("Объект iOb является экземпляром класса Gen4");

        // Следующий код не скомпилируется, так как сведения об
        // обобщенном типе отсутствуют во время выполнения
        // if(iOb2 instanceof Gen2<Integer>)
        // System.out.println("Объект iOb2 является экземпляром класса Gen2<Integer>");
    }
}
