package main.java.com.Putrya_E.javacore.chapter19;

/*
За одним объектом могут наблюдать
несколько наблюдателей
 */

import java.util.Observable;
import java.util.Observer;

// Класс первого наблюдателя
class Watcher1 implements Observer {
    public void update(Observable obj, Object arg) {
        System.out.println(" Метод update() вызван, отсчет count равен " +
                ((Integer) arg).intValue());
    }
}

// Класс второго наблюдателя
class Watcher2 implements Observer {
    public void update(Observable obj, Object arg) {
        // по окончании выдать звуковой сигнал
        if (((Integer) arg).intValue() == 0)
            System.out.println("Готово" + '\7');
    }
}

// Наблюдаемый класс
class BeingWatched2 extends Observable {
    void counter(int period) {
        for (; period >= 0; period--) {
            setChanged();
            notifyObservers((period));

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Ожидание прервано");
            }
        }
    }
}

public class TwoObservers {
    public static void main(String[] args) {
        BeingWatched observed = new BeingWatched();
        Watcher1 observing1 = new Watcher1();
        Watcher2 observing2 = new Watcher2();

        // ввести в список оба наблюдателя
        observed.addObserver(observing1);
        observed.addObserver(observing2);
        observed.counter(10);
    }
}
