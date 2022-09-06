package main.java.com.Putrya_E.javacore.chapter21;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;

// Более компактный способ открытия канала
// Требуется установка комплека JDK, начиная с версии 7
public class ExplicitChannelRead2 {
    public static void main(String[] args) {
        int count;

        // Здесь канал открывается по пути, возвращаемому
        // методом Paths.get() в виде объекта типа Path.
        // Переменная filepath больше не нужна.
        try (SeekableByteChannel fChan =
                     Files.newByteChannel(Paths.get("test.txt"))) {
            // выделить память под буфер
            ByteBuffer mBuf = ByteBuffer.allocate(128);

            do {
                // читать данные из файла в буфер
                count = fChan.read(mBuf);

                // прекратить чтение по достижению конца файла
                if (count != -1) {

                    // подготовить буфер к чтению из него данных
                    mBuf.rewind();

                    // читать байты данных из буфера и
                    // выводить их на экран как символы
                    for (int i = 0; i < count; i++)
                        System.out.println((char) mBuf.get());
                }
            } while (count != -1);
            System.out.println();
        } catch (InvalidPathException e) {
            System.out.println("Ошибка указания пути " + e);
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода " + e);
        }
    }
}
