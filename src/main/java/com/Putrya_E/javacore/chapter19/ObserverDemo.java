package main.java.com.Putrya_E.javacore.chapter19;

/*
Продемонстрировать применение класса Observable
и интерфейса Observer
 */

import java.util.*;

// Это наблюдающий класс
class Watcher implements Observer {
    public void update(Observable obj, Object arg) {
        System.out.println(
                "Метод update() вызван, отсчет count равен " +
                        ((Integer) arg).intValue());
    }
}

// А это наблюдаемый класс
class BeingWatched extends Observable {
    void counter(int period) {
        for (; period >= 0; period--) {
            setChanged();
            notifyObservers(new Integer(period));
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Ожидание прервано");
            }
        }
    }
}


public class ObserverDemo {
    public static void main(String[] args) {
        BeingWatched observed = new BeingWatched();
        Watcher observing = new Watcher();
        /*
          Вывести наблюдающий объект в список наблюдателей
          за наблюдаемым объектом
         */
        observed.addObserver(observing);
        observed.counter(10);
    }
}
