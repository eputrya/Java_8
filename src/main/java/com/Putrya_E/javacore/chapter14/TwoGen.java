package main.java.com.Putrya_E.javacore.chapter14;

// Простой обощенный класс с двумя параметрами типа: T и V
public class TwoGen<T, V> {
    T ob1;
    V ob2;

    // передать конструктору ссылки на объекты типа T и V

    public TwoGen(T o1, V o2) {
        ob1 = o1;
        ob2 = o2;
    }

    // показать типы T и V
    void showTypes() {
        System.out.println("Тип T: " + ob1.getClass().getName());
        System.out.println("Тип V: " + ob2.getClass().getName());
    }

    T getob1() {
        return ob1;
    }

    V getob2() {
        return ob2;
    }
}

// продемонстрировать применение класса TwoGen
class SimpGen {
    public static void main(String[] args) {

        TwoGen<Integer, String> tgObj = new TwoGen<Integer, String>(88, "Обощение");
        // показать типы
        tgObj.showTypes();

        // Получить и показать значения
        int v = tgObj.getob1();
        System.out.println("Значения: " + v);

        String str = tgObj.getob2();
        System.out.println("Значение: " + str);
    }
}

