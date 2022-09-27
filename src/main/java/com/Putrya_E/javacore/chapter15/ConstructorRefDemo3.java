package main.java.com.Putrya_E.javacore.chapter15;

// Реализовать простую фабрику классов, используя ссылку на конструктор
interface MyFunc10<R, T> {
    R func(T n);
}

// Простой обобщенный класс
class MyClass10<T> {
    private T val;

    // Конструктор, принимающий один параметр
    MyClass10(T v) {
        val = v;
    }

    // Конструктор по умолчанию. Этот конструктор в 
    // данной программе НЕ используется.
    MyClass10() {
        val = null;
    }
    // ...

    T getVal() {
        return val;
    }
}

// Простой необощенный класс
class MyClass11 {
    String str;

    // Конструктор, принимающий один аргумент
    MyClass11(String s) {
        str = s;
    }

    // Конструктор по умолчанию. Этот конструктор в
    // данной программе НЕ используется.
    MyClass11() {
        str = "";
    }

    // ...

    String getVal() {
        return str;
    }

    ;
}

// Фабричный метод для объектов разных классов.
// У каждого класса должен быть свой конструктор,
// принимающий один параметр типа T. А параметр R
// обозначает тип создаваемого объекта.
public class ConstructorRefDemo3 {
    static <R, T> R myClassFactory(MyFunc10<R, T> cons, T v) {
        return cons.func(v);
    }

    public static void main(String[] args) {
        // Создать ссылку на конструктор класса MyClass10.
        // В данном случае оператор new обращается к конструктору,
        // принимабщему аргумент
        MyFunc10<MyClass10<Double>, Double> myClassCons = MyClass10<Double>::new;


        // Создать экземпляр типа класса MyClass10, используя фабричный метод
        MyClass10<Double> mc = myClassFactory(myClassCons, 100.1);

        // использовать только что созданный экземпляр класса MyClass10
        System.out.println("Значение val в объекте mc равно " + mc.getVal());

        // А теперь создать экземпляр другого класса,
        // используя метод myClassFactory()
        MyFunc10<MyClass11, String> myClassCons2 = MyClass11::new;

        // сохдать экземпляр класса MyClass11, используя фабричный метод
        MyClass11 mc2 = myClassFactory(myClassCons2, "Лямбда");

        // используя только что созданный экземпляр класса MyClass
        System.out.println("Значение str в объекте mc2 равно " + mc.getVal());

    }
}
