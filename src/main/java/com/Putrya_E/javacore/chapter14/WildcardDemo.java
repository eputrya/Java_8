package main.java.com.Putrya_E.javacore.chapter14;

// Применение метасимвола
class Stat<T extends Number> {
    T[] nums; // массив класса Number или его подкласса

    // передать конструктору ссылку на массив элементов класса Number или его подкласса
    Stat(T[] o) {
        nums = o;
    }

    // возвратить значение типа double в любом случае
    double average() {
        double sum = 0.0;
        for(int i=0; i < nums.length; i++)
            sum += nums[i].doubleValue();
        return sum / nums.length;
    }

    // определить равенство двух средних значений.
    // Обратите внимание на применение метасимвола
    boolean sameAvg(Stat<?> ob) {
        if(average() == ob.average())
            return true;
        return false;
    }
}

// Продемонстрировать применение метасимвола
public class WildcardDemo {
    public static void main(String[] args) {
        Integer inums[] = { 1, 2, 3, 4, 5};
        Stat<Integer> iob = new Stat<Integer>(inums);
        double v = iob.average();
        System.out.println("Среднее значение iob равно " + v);

        Double dnums[] = { 1.1, 2.2, 3.3, 4.4, 5.5 };
        Stat<Double> dob = new Stat<Double>(dnums);
        double w = dob.average();
        System.out.println("Среднее значение dob равно " + w);

        Float fnums[] = { 1.0F, 2.0F, 3.0F, 4.0F, 5.0F };
        Stat<Float> fob = new Stat<Float>(fnums);
        double x = fob.average();
        System.out.println("Среднее значение fob равно " + x);

        // выяснить, какие массивы имеют одинаковые средние значения
        System.out.println("Средние значения iob и dob ");
        if (iob.sameAvg(dob))
            System.out.println("равны.");
        else
            System.out.println("отличаются.");

        System.out.println("Среднее iob и fob ");
        if(iob.sameAvg(fob))
            System.out.println("одинаковы.");
        else
            System.out.println("отличаются");
    }
}
