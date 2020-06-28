package fingers;

import java.util.Arrays;
import java.util.List;

/**
 * Class Fingers
 * Project logictask
 *
 * @author Anton Prokhorov <vziks@live.ru>
 *
 * Маленькая девочка считает от 1 до 1000 на пальцах левой руки следующим образом.
 *
 * Она начинает с большого пальца — это 1. Указательный — 2. Средний — 3. Безымянный — 4. Мизинец — 5.
 *
 * И продолжает в обратную сторону: безымянный — 6, средний — 7, указательный — 8, большой — 9. Потом указательный — 10 и так далее.
 *
 * Если она продолжит считать таким образом, на каком пальце она закончит?
 */
public class Fingers {

    public static void main(String[] args) {
        List<String> finger = Arrays.asList("БОЛЬШОЙ", "УКАЗАТЕЛЬНЫЙ", "СРЕДНИЙ", "БЕЗЫМЯННЫЙ", "МИЗИНЕЦ");

        int n = 1000;
        int position, position1;

        position = getPos(n);
        position1 = numFinger(n);

        System.out.println(finger.get(position - 1));
        System.out.println(finger.get(position1 - 1));

    }

    /**
     * Перебор
     */
    private static int getPos(int n) {
        int i = 1, pos = 1, shift = 1;
        while (i < n) {
            i++;

            if (pos == 5) {
                shift = -1;
            }
            if (pos == 1) {
                shift = +1;
            }
            pos += shift;
        }
        return pos;
    }


    /**
     * Полный цикл занимает 8 счетов.
     */
    static int numFinger(int n)
    {
        int r = n % 8;
        if (r == 1)
            return r;
        if (r == 5)
            return r;
        if (r == 0 || r == 2)
            return 2;
        if (r == 3 || r == 7)
            return 3;
        if (r == 4 || r == 6)
            return 4;
        return n;
    }
}
