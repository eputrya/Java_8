package main.java.com.Putrya_E.javacore.chapter23;

import java.applet.Applet;
import java.awt.*;

// Использовать параметры передаваемые аплету
/*
<applet code="ParamDemo" width=300 height=80>
<param name=fontName value=Courier>
<param name=fontSize value=14>
<param name=leading value=2>
<param name=accountEnabled value=true>
</applet>
 */

public class ParamDemo extends Applet {
    String fontName;
    int fontSize;
    float leading;
    boolean active;

    // инициализировать выводимую символьную строку
    public void start() {
        String param;

        fontName = getParameter("fontName");
        if (fontName == null)
            fontName = "Not Found"; // не найдено

        param = getParameter("fontSize");
        try {
            if (param != null)
                fontSize = Integer.parseInt(param);
            else
                fontSize = 0;
        } catch (NumberFormatException e) {
            fontSize = -1;
        }

        param = getParameter("leading");
        try {
            if (param != null)
                leading = Float.valueOf(param).floatValue();
            else
                leading = 0;
        } catch (NumberFormatException e) {
            leading = -1;
        }

        param = getParameter("accountEnabled");
        if (param != null)
            active = Boolean.valueOf(param).booleanValue();
    }

    // вывести параметры
    public void paint(Graphics g) {
        g.drawString("Font name: " + fontName, 0, 10); // шрифт
        g.drawString("Font size: " + fontSize, 0, 26); // кегль
        g.drawString("Leading: " + leading, 0, 42); // интерлиньяж
        g.drawString("Account Active: " + active, 0, 58); // активная учетная запись
    }
}
