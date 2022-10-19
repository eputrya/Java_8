package main.java.com.Putrya_E.javacore.chapter12;

// Использовать конструктор, переменную экземпляра и метод в перечислении
enum Apple3 {
    Jonathan(10), GoldenDel(9), RedDel(12), Winesap(15), Cortland(8);

    private int price; // цена яблок каждого сорта

    Apple3(int p) {
        price = p;
    }

    int getPrice() {
        return price;
    }
}

public class EnumDemo3 {
    public static void main(String[] args) {

        Apple ap;

        // вывести цены на все сорта яблок
        System.out.println("Цена на все сорта яблок:");
        for (Apple3 a : Apple3.values()) {
            System.out.println(a + " стоит " + a.getPrice() + " центов");
        }
    }
}
