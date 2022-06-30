package main.java.com.Putrya_E.javacore.chapter18;
import java.util.*;

// Компаратор для сравнения символьных строк в обратном порядке
public class MyComp implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        String aStr, bStr;
        aStr = a;
        bStr = b;
        // выполнить сравнение в обратном порядке
        return bStr.compareTo(aStr);
    }
    // переопределять метод equals() не требуется
}

class CompDemo {
    public static void main(String[] args) {
        // создать древовидное множество типа TreeSet
        TreeSet<String> ts = new TreeSet<>(new MyComp());
        // ввести элементы в древовидное множество
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");

        // вывести элементы из древовидного множества
        for(String element : ts)
            System.out.print(element + " ");
        System.out.println();
    }
}

class CompDemo2 {
    public static void main(String[] args) {

        // передать компаратор с обратным упорядочением древовидному множеству типа TreeSet
        TreeSet<String> ts = new TreeSet<>((aStr, bStr) -> bStr.compareTo(aStr));

        // ввести элементы в древовидное множество
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");
        // вывести элементы из древовидного множества
        for (String element : ts){
            System.out.print(element + " ");
        }

        System.out.println();
    }
}
