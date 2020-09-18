package clocksymmetry;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Class ClockSymmetry
 * Project logictask
 *
 * @author Anton Prokhorov <vziks@live.ru>
 *
 * Электронные часы показывают время в формате от 00:00 до 23:59.
 * Подсчитать сколько раз за сутки случается так, что слева от двоеточия показывается
 * симметричная комбинация для той, что справа от двоеточия (например, 02:20, 11:11 или
 */
public class ClockSymmetry {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 1000000; i++) {
            long aaa = symmetry();
        }
        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        System.out.println(elapsedTime);

        startTime = System.currentTimeMillis();

        for (int i = 0; i < 1000000; i++) {
            int aaa1 = symmetry1();
        }
        stopTime = System.currentTimeMillis();
        elapsedTime = stopTime - startTime;
        System.out.println(elapsedTime);

    }

    public static long symmetry() {
        long count = 0;

//        int[] arr = {6,7,8,9};
        List<Integer> list = new ArrayList<Integer>() {{
            add(6);
            add(7);
            add(8);
            add(9);
        }};


        count = IntStream.range(0, 24).filter(value -> !list.contains(value % 10)).count();
//        count = IntStream.range(0, 24).parallel().filter(value -> Arrays.stream(arr).noneMatch(i -> i == value % 10)).count();

        return count;
    }


    public static int symmetry1() {
        int count = 0;
        for (int hour = 0; hour < 24; hour++) {
            switch (hour % 10) {
                case 6:
                case 7:
                case 8:
                case 9:
                    break;
                default:
                    count++;
                    break;
            }
        }
        return count;
    }
}
