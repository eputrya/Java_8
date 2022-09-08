package main.java.com.Putrya_E.javacore.chapter21;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

// Вывести только те файлы из каталога, которые доступны для записи
public class DirList2 {
    public static void main(String[] args) {
        String dirname = "\\MyDir";

        // создать фильтр, возвращающий логическое значение true
        // только в отношении доступных для записи файлов
        DirectoryStream.Filter<Path> how = new DirectoryStream.Filter<Path>() {
            public boolean accept(Path filename) throws IOException {
                if (Files.isWritable(filename)) return true;
                return false;
            }
        };

        // получить и использовать поток ввода из каталога
        // только доступных для записи файлов
        try (DirectoryStream<Path> dirstrm =
                     Files.newDirectoryStream(Paths.get(dirname), how)) {
            System.out.println("Каталог " + dirname);

            for (Path entry : dirstrm) {
                BasicFileAttributes attribs =
                        Files.readAttributes(entry, BasicFileAttributes.class);

                if (attribs.isDirectory())
                    System.out.print("<DIR> ");
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
