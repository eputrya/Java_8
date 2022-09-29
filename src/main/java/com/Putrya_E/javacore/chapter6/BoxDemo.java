package main.java.com.Putrya_E.javacore.chapter6;

/* Программа, использующая класс Box

   Присвоить исходному файлу имя BoxDemo.java
 */
class Box {
    double width;
    double height;
    double depth;
}

// В этом классе объявляется объект типа Box
public class BoxDemo {
    public static void main(String[] args) {
        Box mybox = new Box();
        double vol; // присвоить значение переменным экземпляра mybox
        mybox.width = 10;
        mybox.height = 20;
        mybox.depth = 15;

        // рассчитать объем параллелепипеда
        vol = mybox.width * mybox.height * mybox.depth;
    }
}
