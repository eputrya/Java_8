package main.java.com.Putrya_E.javacore.chapter23;

import java.applet.Applet;
import java.awt.*;

// Параметризованный баннер
/*
Вывод сообщения "Java оживляет веб!"
<applet code="ParamBanner" width=300 height=50>
</applet>
 */

public class ParamBanner extends Applet implements Runnable {
    String msg;
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
        msg = getParameter("message");
        if (msg == null) msg = "Message not found."; //сообщение не найдено
        msg = " " + msg;
        t = new Thread(this);
        stopFlag = false;
        t.start();
    }

    // точка входа в поток исполнения, воспроизодящего баннера
    public void run() {
        // воспроизвести баннер повторно
        for (; ; ) {
            try {
                repaint();
                Thread.sleep(250);
                if (stopFlag)
                    break;
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
