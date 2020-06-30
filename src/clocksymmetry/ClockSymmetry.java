package clocksymmetry;

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

    public static int symmetry() {
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
