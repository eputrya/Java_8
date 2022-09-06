package main.java.com.Putrya_E.javacore.chapter21;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;

// Использовать сопостовление для чтения данных из файла
// Требуется установка комплекта JDK, начиная с версии 7
public class MappedChannelRead {
    public static void main(String[] args) {

        // получить канал к файлу в блокеоператора try с ресурсами
        try (FileChannel fChan =
                     (FileChannel) Files.newByteChannel(Paths.get("test.txt"))) {

            // получить размер файла
            long fSize = fChan.size();

            // а теперь сопоставить файл с буфером
            MappedByteBuffer mBuf = fChan.map(FileChannel.MapMode.READ_ONLY, 0, fSize);

            // читать байты из буфера и выводить их на экран
            for (int i = 0; i < fSize; i++)
                System.out.println((char) mBuf.get());

            System.out.println();
        } catch (InvalidPathException e) {
            System.out.println("Ошибка указания пути " + e);
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода " + e);
        }
    }
}
