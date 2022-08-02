package main.java.com.Putrya_E.javacore.chapter14;

// Класс NonGen - функциональный эквивалент класса Gen без обобщений
public class NonGen {
    Object ob; // объект ob теперь имеет тип Object

    // передать конструктору ссылку на объект типа Object
    NonGen(Object o) {
        ob = o;
    }

    // возвратить тип Object
    Object getOb() {
        return ob;
    }

    // показать тип объекта ob
    void showType() {
        System.out.println("Объект ob относится к типу " + ob.getClass().getName());
    }
}

// продемонстрировать необобщенный класс
class NonGenDemo {
    public static void main(String[] args) {
        NonGen iOb;

        // создать объект типа NonGen и сохранить в нем объект типа Integer. Выполняется автоупаковка.
        iOb = new NonGen(88);

        // показать тип данных, хранящихся в переменной iOb
        iOb.showType();

        // получить значение переменной iOb, на этот раз требуется приведение типов
        int v = (Integer)iOb.getOb();
        System.out.println("Значение: " + v);
        System.out.println();

        // создать другой объект типа NonGen и сохранить в нем объект типа String
        NonGen strOb = new NonGen("Текст без обобщений");

        // показать тип данных, хранящихся в переменой strOb
        strOb.showType();

        // получить значение переменной strOb.
        // И в этом случае потребуется приведение типов
        String str =(String)strOb.getOb();
        System.out.println("Значение: " + str);

        // Этот код компилируется, но он принципиально неверный!
        iOb = strOb;
        v = (Integer)iOb.getOb(); // Ошибка во време выполнения!
    }
}

