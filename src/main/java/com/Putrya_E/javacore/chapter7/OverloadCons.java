package main.java.com.Putrya_E.javacore.chapter7;

/*
 В данном примере конструкторы определяются в классе Box2 для
 инициализации размеров параллелепипеда тремя разными способами
 */
class Box2 {
    double width;
    double height;
    double depth;

    // конструктор, используемый при указании всех размеров
    Box2(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // конструктор, используемый, когда ни один из размеров не указан
    Box2() {
        width = -1;   // использовать значение -1 для обозначения
        height = -1;  // неинициализированного
        depth = -1;   // параллелепипеда
    }

    // конструктор, используемый при создании куба
    Box2(double len) {
        width = height = depth = len;
    }

    // рассчитать и возвратить объем
    double volume() {
        return width * height * depth;
    }
}

public class OverloadCons {
    public static void main(String[] args) {
        // создать параллелепипеды, используя разные конструкторы
        Box2 mybox1 = new Box2(10, 20, 15);
        Box2 mybox2 = new Box2();
        Box2 mycube = new Box2(7);

        double vol;

        // получить объем первого параллелепипеда
        vol = mybox1.volume();
        System.out.println("Объем mybox1 равен " + vol);

        // получить объем второго параллелепипеда
        vol = mybox2.volume();
        System.out.println("Объем mybox2 равен " + vol);

        // получить объем куба
        vol = mycube.volume();
        System.out.println("Объем mycube равен " + vol);
    }
}
