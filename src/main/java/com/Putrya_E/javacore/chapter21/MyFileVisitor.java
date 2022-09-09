package main.java.com.Putrya_E.javacore.chapter21;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

// создать специальную версию класса SimpleFileVisitor,
// в которую переопределяется метод visitFile()
public class MyFileVisitor extends SimpleFileVisitor<Path> {
    public FileVisitResult visitFile(Path path, BasicFileAttributes attributes) throws IOException {
        System.out.println(path);
        return FileVisitResult.CONTINUE;
    }
}


class DirTreeLst {
    public static void main(String[] args) {
        String dirname = "\\MyDir";

        System.out.println("Дерево каталогов, начиная с каталога " + dirname + ":\n");
        try {
            Files.walkFileTree(Paths.get(dirname), new MyFileVisitor());
        } catch (IOException exc) {
            System.out.println("Ошибка ввода-вывода");
        }
    }
}