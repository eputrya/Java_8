package main.java.com.Putrya_E.javacore.chapter15;

// Продемонстрировать применение ссылки на
// конструктор обобщенного класса

// Теперь функциональный интерфейс MyFunc8 обобщенный
interface MyFunc9<T> {
    MyClass8<T> func(T n);
}

class MyClass8<T> {
    private T val;

    // Этот конструктор принимает один аргумент
    MyClass8(T v) {
        val = v;
    }

    ;

    // А этот конструктор по умолчанию
    MyClass8() {
        val = null;
    }

    // ...
    T getVal() {
        return val;
    }

    ;
}

public class ConstructorRefDemo2 {
    public static void main(String[] args) {

        // создать ссылку на конструктор обобщенного класса MyClass<T>
        MyFunc9<Integer> myClassCons = MyClass8<Integer>::new;

        // создать экземпляр класса MyClass8<T>
        // по данной ссылке на конструктор
        MyClass8<Integer> mc = myClassCons.func(100);

        // воспользоваться только что созданным
        // экземпляром класса MyClass8<T>

        System.out.println("Значение val в объекте mc равно " + mc.getVal());
    }
}