package main.java.com.Putrya_E.javacore.chapter13;

// Простой пример применения платформенно-ориентированного метода
public class NativeDemo {
    int i;

    public static void main(String[] args) {
        NativeDemo ob = new NativeDemo();
        ob.i = 10;
        System.out.println("Содержимое переменной ob.i перед вызовом" +
                "платформенно-ориентированного метода:" + ob.i);
        ob.test(); // вызвать платформенно-ориентированный метод
        System.out.println("Содержимое переменной ob.i после вызова" +
                "платформенно-ориентированного метода:" + ob.i);
    }

    // объявить платформенно-ориентированный метод
    public native void test();

    // загрузить библиотеку DLL, содержащую статический мтеод
    static {
        System.loadLibrary("NativeDemo");
    }
}
