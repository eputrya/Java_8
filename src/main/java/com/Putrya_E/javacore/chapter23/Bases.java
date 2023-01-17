package main.java.com.Putrya_E.javacore.chapter23;

import java.applet.Applet;
import java.awt.*;
import java.net.URL;

// Отобразить базу документов и кодовую базу
/*
<applet cade="Bases" width=300 height=50>
</applet>
 */

public class Bases extends Applet {
    // вывести в окне аплета базу документов и кодовую базу
    public void paint(Graphics g) {
        String msg;
        URL url = getCodeBase(); // получить кодовую базу
        msg = "Code base: " + url.toString(); //кодовая база
        g.drawString(msg, 10, 20);

        url = getDocumentBase(); // получить базу документов
        msg = "Document base: " + url.toString(); // база документа
        g.drawString(msg, 10, 40);
    }
}
