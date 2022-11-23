package main.java.com.Putrya_E.javacore.chapter19;

import java.util.Scanner;

// Продемонстрировать применение метода findInLine()
public class FindInLineDemo {
    public static void main(String[] args) {
        String instr = "Имя: Том Возраст: 28 ID: 77";
        Scanner conin = new Scanner(instr);

        // найти поле возраста и вывести его содержимое
        conin.findInLine("Возраст:");
        if (conin.hasNext())
            System.out.println(conin.next());
        else
            System.out.println("Ошибка");
        conin.close();
    }
}
