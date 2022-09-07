package main.java.com.Putrya_E.javacore.chapter21;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;

/* Это программа выводит тектовый файл, используя код
   потоковый ввода-вывода на основе системы NIO.
   Требуется установка комплекта JDK, начиная с версии 7

   Чтобы воспользоваться этой программой, укажите ися файла,
   который требуется просмотреть. Например, чтобы прсмотреть
   файл TEST.TXT, введите в режиме команжной строки
   следующую команду:

   java ShowFile TEST.TXT
*/
public class ShowFile {
    public static void main(String[] args) {
        int i;

        // сначало удостовериться, что указано имя файла
        if (args.length != 1) {
            System.out.println("Применение: ShowFile имя_файла");
            return;
        }

        // открыть файл и получить связанный с ним поток ввода-вывода
        try (InputStream fin = Files.newInputStream(Paths.get(args[0]))) {
            do {
                i = fin.read();
                if (i != -1) System.out.println((char) i);
            } while (i != -1);

        } catch (InvalidPathException e) {
            System.out.println("Ошибка указания пути " + e);
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода " + e);
        }
    }
}
