package main.java.com.Putrya_E.javacore.chapter19;

import javax.naming.NamingEnumeration;
import java.util.StringTokenizer;

// Продемонстрировать применение класса StringTokenizer
public class STDemo {
    static String in = "Название=Java. Полное руководство;" +
            "Автор=Шилдт;" +
            "Издательство=McGraw-Hill;" +
            "Авторское право=2014";

    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer(in, "=;");
        while (st.hasMoreTokens()) {
            String key = st.nextToken();
            String val = st.nextToken();

            System.out.println(key + "\t" + val);
        }
    }
}
