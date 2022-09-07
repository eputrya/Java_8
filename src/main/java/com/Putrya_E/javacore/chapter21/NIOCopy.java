package main.java.com.Putrya_E.javacore.chapter21;

import java.io.IOException;
import java.nio.file.*;

// Скопировать файл средствами системы ввода-вывода NIO.
// Требуется установка комплекта JDK, начиная с версии 7.
public class NIOCopy {
    public static void main(String[] args) {

        if (args.length != 2) {
            System.out.println("Применение: откуда и куда копировать");
            return;
        }

        try {
            Path source = Paths.get(args[0]);
            Path target = Paths.get(args[1]);

            // копировать файл
            Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
        } catch (InvalidPathException e) {
            System.out.println("Ошибка указания пути " + e);
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода " + e);
        }
    }
}
