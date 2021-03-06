package main.java.com.Putrya_E.javacore.chapter9.interfaces;

public class FixedStack implements IntStack{
    private int[] stck;
    private int tos;
    // выделить память и инициализировать стек
    FixedStack(int size) {
        stck = new int[size];
        tos = -1;
    }

    // разместить элементы в стеке
    public void push(int item){
        if(tos==stck.length-1) //использовать поле длины стека
            System.out.println("Стек заполнен");
        else
            stck[++tos] = item;
    }

    // извлечь элемент из стека
    public int pop() {
        if(tos < 0) {
            System.out.println("Стек не загружен");
            return 0;
        }
        else
            return  stck[tos--];
    }
}