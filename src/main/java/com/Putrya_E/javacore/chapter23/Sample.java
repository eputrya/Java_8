package main.java.com.Putrya_E.javacore.chapter23;

import java.applet.Applet;
import java.awt.*;

/*
Простой аплет, устанавливающий цвета фона
и переднего плана и выводящий символьную строку

<applet code="Sample" width=300 height=50>
</applet>

 */

public class Sample extends Applet {
    String msg;

    // установить цвета фона и переднего плана
    public void init() {
        setBackground(Color.cyan);
        setForeground(Color.red);
        msg = "Inside init() --";
    }

    // инициализировать выводимую символьную строку
    public void start() {
        msg += " Inside start() --";
    }

    // вывести символьную строку msg в окне аплета
    public void paint(Graphics g) {
        msg += " Inside paint().";
        g.drawString(msg, 10, 30);
    }
}
