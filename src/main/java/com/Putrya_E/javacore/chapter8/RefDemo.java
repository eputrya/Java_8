package main.java.com.Putrya_E.javacore.chapter8;

public class RefDemo {
    public static void main(String[] args) {
        BoxWeight weightbox = new BoxWeight(3, 5, 7, 8.37);
        Box plainbox = new Box();
        double vol;

        vol = weightbox.volume();
        System.out.println("Объем weightbox равен " + vol);
        System.out.println("Вес weightbox равен " + weightbox.weight);
        System.out.println();

        // присвоить ссылке на объект BoxWeight ссылки на объект Box
        plainbox = weightbox;
        vol = plainbox.volume(); // Верно, т.к. метод volume() определен в классе Box
        System.out.println("Объем plainbox равен " + vol);

        /* Следующий оператор ошибочен, поскольку член plainbox
           не определяет член weight.
           // System.out.println("Вес plainbox равен " + plainbox.weight);
         */
    }
}
