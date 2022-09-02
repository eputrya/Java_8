package main.java.com.Putrya_E.javacore.chapter20;

import java.io.*;

// Использовать буферизованный ввод.
// В этой программе применяется оператор try с ресурсами.
// Требуется установка комплекта JDK, НАЧИНАЯ С ВЕРСИИ 7.
public class BufferedInputStreamDemo {
    public static void main(String[] args) {
        String s = "Это знак авторского права &copy; " + ", а &copy - нет.\n";
        byte[] buf = s.getBytes();

        ByteArrayInputStream in = new ByteArrayInputStream(buf);
        int c;
        boolean marked = false;

        // испльзовать оператор try с ресурсами для управления файлами
        try (BufferedInputStream f = new BufferedInputStream(in)) {
            while ((c = f.read()) != -1) {
                switch (c) {
                    case '&':
                        if (!marked) {
                            f.mark(32);
                            marked = true;
                        } else {
                            marked = false;
                        }
                        break;
                    case ' ':
                        if (marked) {
                            marked = false;
                            f.reset();
                            System.out.println("&");
                        } else
                            System.out.println((char) c);
                        break;
                    default:
                        if (!marked)
                            System.out.println((char) c);
                        break;
                }
            }
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }
    }
}
