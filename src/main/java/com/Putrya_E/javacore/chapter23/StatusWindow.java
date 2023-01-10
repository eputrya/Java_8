package main.java.com.Putrya_E.javacore.chapter23;

import java.applet.Applet;
import java.awt.*;

// Использовать строку состояния в окне аплета
/*
<applet code="StatusWindow" width=300 height=50>
</applet>
 */

public class StatusWindow extends Applet {
    public void init() {
        setBackground(Color.cyan);
    }

    // вывести сообщение в окне аплета и в строке сосятония
    public void paint(Graphics g) {
        g.drawString("This is in the applet window.", 10, 20);
        showStatus("This is shown in the status window.");
    }
}
