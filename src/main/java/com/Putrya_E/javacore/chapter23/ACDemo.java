package main.java.com.Putrya_E.javacore.chapter23;

import java.applet.*;
import java.net.*;
/*
<applet code="ACDemo" width=300 height=50>
</applet>
 */

/*
Использование контекста аплета, методов getCodeBase()
и showDocument() для отображения HTML-документа
 */
public class ACDemo extends Applet {
    public void start() {
        AppletContext ac = getAppletContext();
        URL url = getCodeBase(); // получить URL данного аплета

        try {
            ac.showDocument(new URL(url + "Test.html"));
        } catch (MalformedURLException e) {
            showStatus("URL not found"); // URL не найден
        }
    }
}
