package main.java.com.Putrya_E.javacore.chapter7;

// В этой версии класса Box3 один объект допускается
// инициализировать другим объектом
class Box3 {
    double width;
    double height;
    double depth;

    // Обратите внимание на этот конструтор.
    // В качестве параметра в нем используется объект типа Box3
    Box3(Box3 ob) { // передать объект конструктору
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    // конструктор,используемый при указании всех размеров
    Box3(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // конструктор, используемый, если ни один из размеров не указан
    Box3() {
        width = -1;    // использовать значение -1 для обозначения
        height = -1;   // неинициализированного параллелепипеда
        depth = -1;
    }

    // конструктор, используемый при создании куба
    Box3(double len) {
        width = height = depth = len;
    }

    // рассчитать и возвратить объем
    double volume() {
        return width * height * depth;
    }
}


public class OverloadCons2 {
    public static void main(String[] args) {
        // создать параллелепипеды, используя разные конструкторы
        Box3 mybox1 = new Box3(10, 20, 15);
        Box3 mybox2 = new Box3();
        Box3 mycube = new Box3(7);

        // создать копию объекта mybox1
        Box3 myclone = new Box3(mybox1);
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

        // получить объем клона
        vol = myclone.volume();
        System.out.println("Объем клона равен " + vol);

    }
}
