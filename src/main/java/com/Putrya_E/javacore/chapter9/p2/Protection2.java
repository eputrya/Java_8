package main.java.com.Putrya_E.javacore.chapter9.p2;
import main.java.com.Putrya_E.javacore.chapter9.p1.*;

public class Protection2 extends Protection {
    Protection2() {
        System.out.println("конструктор, унаследованный из другого пакета");
        // доступно только для данного класса или пакета
        //System.out.println("n = " + n);

        //доступно только для данного класса
        //System.out.println("n_pri = " + n_pri);

        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }
}

