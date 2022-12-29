package main.java.com.Putrya_E.javacore.chapter23;

// Скелет аплета

import java.awt.*;
import java.applet.*;

/*
<applet code="AppletSkel" width=300 height=100>
</applet>
 */

public class AppletSkel extends Applet {
    // Этот метод вызывается первым
    public void init() {
        // инициализация
    }

    // Этот метод вызывается вторым, после метода init()
    public void start() {
        // начать или возобновить выполнение аплета
    }

    // Этот метод вызывается при остановке аплета
    public void stop() {
        // приостановить выполнение аплета
    }

    // Этот метод вызывается перед уничтожением аплета.
    // Это последний выполняемый метод.
    public void destroy() {
        // выполнить завершающие действия
    }

    // Этот метод вызывается, когда окно аплета должно быть восстановлено.
    public void paint(Graphics g) {
        // повторно воспроизвести содержимое окна
    }
}
