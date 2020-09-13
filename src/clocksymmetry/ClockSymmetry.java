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
        System.out.println("The number of symmetries in 24 hours = " + symmetry());
    }

    public static long symmetry() {
        long count = 0;

        List<Integer> list = new ArrayList<Integer>() {{
            add(6);
            add(7);
            add(8);
            add(9);
        }};

        IntStream stream = IntStream.range(0, 24);

        count = stream.filter(value -> !list.contains(value % 10)).count();

        return count;
    }
}
