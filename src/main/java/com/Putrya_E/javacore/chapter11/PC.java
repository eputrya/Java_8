package main.java.com.Putrya_E.javacore.chapter11;

// Неправильная реализация поставщика и потребителя
class Q {
    int n;

    synchronized int get() {
        System.out.println("Получено: " + n);
        return n;
    }

    synchronized void put(int n) {
        this.n = n;
        System.out.println("Отправлено: " + n);
    }
}

class Producer implements Runnable {
    Q2 q;

    Producer(Q2 q) {
        this.q = q;
        new Thread(this, "Поставщик").start();
    }

    public void run() {
        int i = 0;

        while (true) {
            q.put(i++);
        }
    }
}

class Consumer implements Runnable {
    Q2 q;

    Consumer(Q2 q) {
        this.q = q;
        new Thread(this, "Потребитель").start();
    }

    public void run() {
        while (true) {
            q.get();
        }
    }
}

public class PC {
    public static void main(String[] args) {
        Q2 q = new Q2();
        new Producer2(q);
        new Consumer2(q);

        System.out.println("Для остановки нажмите Ctrl-C.");
    }
}
