package main.java.com.Putrya_E.javacore.chapter21;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

// Вывести содержимое каталога. Требуется установка комплекта JDK, начиная с версии 7
public class DirList {
    public static void main(String[] args) {
        String dirname = "\\MyDir";

        // получить и обработать поток вводда каталога
        // в блоке оператора try
        try (DirectoryStream<Path> dirstrm =
                     Files.newDirectoryStream(Paths.get(dirname))) {
            System.out.println("Каталог " + dirname);

            // Класс DirectoryStream реализует интерфейс Iterable,
            // поэтому для вывода содержимого каталога можно
            // организовать цикл for в стиле for each
            for (Path entry : dirstrm) {
                BasicFileAttributes attribs = Files.readAttributes(entry, BasicFileAttributes.class);

                if (attribs.isDirectory())
                    System.out.println("<DIR> ");
                else
                    System.out.println("     ");

                System.out.println(entry.getName(1));
            }
        } catch (InvalidPathException e) {
            System.out.println("Ошибка указания пути " + e);
        } catch (NotDirectoryException e) {
            System.out.println(dirname + " не является каталогом.");
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }
    }
}
