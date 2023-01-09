package main.java.com.Putrya_E.javacore.chapter23;

import java.applet.Applet;
import java.awt.*;

/*
Простой аплет, воспроизводящий баннер
Этот аплет создает поток исполнения, прокручивающий
сообщения, содержащиееся в переменной msg, справа
налево в окне аплнта.
 */

/*
<applet code="SimpleBanner" width=300 height=50>
</applet>
 */

public class SimpleBanner extends Applet implements Runnable {
    String msg = " A Simple Moving Banner."; // Простой движущийся баннер
    Thread t = null;
    int state;
    volatile boolean stopFlag;

    // установить цвета и инициализировать поток исполнения
    public void init() {
        setBackground(Color.cyan);
        setForeground(Color.red);
    }

    // запустить поток исполнения
    public void start() {
        t = new Thread(this);
        stopFlag = false;
        t.start();
    }

    // точка входа в поток исполнения, прокручивающий баннер
    public void run() {
        // воспроизвести баннер повторно
        for (; ; ) {
            try {
                repaint();
                Thread.sleep(250);
                if (stopFlag)
                    break;
                ;
            } catch (InterruptedException e) {
            }
        }
    }

    // приостановить воспроизведение баннера
    public void stop() {
        stopFlag = true;
        t = null;
    }

    // воспроизвести баннер
    public void paint(Graphics g) {
        char ch;
        ch = msg.charAt(0);
        msg = msg.substring(1, msg.length());
        msg += ch;

        g.drawString(msg, 50, 30);
    }
}

