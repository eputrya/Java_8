package main.java.com.Putrya_E.javacore.chapter5;

// Применение оператора break в качестве цивилизованной
// формы оператора goto
public class Break {
    public static void main(String[] args) {
        boolean t = true;

        first:
        {
            second:
            {
                third:
                {
                    System.out.println("Предшевствует оператору break.");
                    if (t) break second; // выход из блока second
                    System.out.println("Этот оператор не будет выпролняться");
                }
                System.out.println("Этот оператор следует за блоком second.");
            }
        }
    }
}
