package main.java.com.Putrya_E.javacore.chapter6;

// В этой программе применяется метод, введенный в класс Box
class Box3 {
    double width;
    double height;
    double depth;

    // вывести объем параллалепипеда
    void volume() {
        System.out.print("Объем равен ");
        System.out.println(width * height * depth);
    }
}

public class BoxDemo3 {
    public static void main(String[] args) {
        Box3 mybox1 = new Box3();
        Box3 mybox2 = new Box3();

        // присвоить значение переменным экземпляра mybox1
        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        // присвоить значение переменным экземпляра mybox2
        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        // вывести объем первого параллелепипеда
        mybox1.volume();

        // вывести объем второго параллелепипеда
        mybox2.volume();
    }
}
