package main.java.com.Putrya_E.javacore.chapter19;

import java.util.*;

// Продемонстрировать применение классов Timer и TimerTask
class MyTimerTask extends TimerTask {
    public void run() {
        System.out.println("Задание по таймеру выполняется.");
    }
}

public class TTest {
    public static void main(String[] args) {
        MyTimerTask myTask = new MyTimerTask();
        Timer myTimer = new Timer();
        /*
        Установит первоначальную паузу в течение одной
        секунды, а затем повторять задание каждые полсекунды
         */
        myTimer.schedule(myTask, 1000, 500);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException exc) {
        }
        myTimer.cancel();
    }
}


