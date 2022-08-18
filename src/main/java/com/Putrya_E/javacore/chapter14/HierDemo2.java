package main.java.com.Putrya_E.javacore.chapter14;

// Необощенный класс может быть суперклассом для обощенного подкласса

// Необобщенный класс
class NonGen1 {
    int num;

    NonGen1(int i) {
        num = i;
    }

    int getNum() {
        return num;
    }
}

// Обобщенный подкласс
class Gen3<T> extends NonGen1 {
    T ob; // объявить объект типа T;

    // передать конструктору объект типа T
    Gen3(T o, int i) {
        super(i);
        ob = o;
    }

    // возвратить объект ob
    T getOb() {
        return ob;
    }
}

// создать объект типа Gen3
public class HierDemo2 {
    public static void main(String[] args) {

        // создать объект типа Gen для символьных строк
        Gen3<String> w = new Gen3<>("Добро пожаловать", 47);

        System.out.print(w.getOb() + " ");
        System.out.println(w.getNum());
    }
}
