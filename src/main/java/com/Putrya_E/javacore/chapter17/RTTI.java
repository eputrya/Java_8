package main.java.com.Putrya_E.javacore.chapter17;

// Продемонстрировать плучение сведений о типе
// объекта во время его выполнения
class X {
    int a;
    float b;
}

class Y extends X {
    double c;
}

public class RTTI {
    public static void main(String[] args) {
        X x = new X();
        Y y = new Y();
        Class<?> clObj;
        clObj = x.getClass(); // получить ссылку на объект типа Class
        System.out.println("x - объект типа: " + clObj.getName());
        clObj = y.getClass(); // получить ссылку на объект типа Class
        System.out.println("y - объект типа: " + clObj.getName());
        clObj = clObj.getSuperclass();
        System.out.println("Суперкласс объекта y: " + clObj.getName());
    }
}
