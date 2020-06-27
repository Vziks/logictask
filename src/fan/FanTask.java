package fan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Class FanTask
 * Project logictask
 *
 * @author Anton Prokhorov <vziks@live.ru>
 * <p>
 * Вы согласились проследить за квартирой друга пока он в отпуске.
 * В одной из комнат вы нажали на выключатель потолочного вентилятора,
 * но когда ничего не произошло, поняли, что в доме отключили электричество.
 * К сожалению, вам уже нужно бежать и вы не сможете приехать сюда снова несколько дней.
 * <p>
 * Вы помните, что вентилятор был выключен до того, как вы нажали на кнопку,
 * а также что каждое нажатие будет переключать режимы вентилятора: «выключен», «средний», «сильный» и т. д.
 * Вы не знаете точное количество режимов, но уверены, что их не больше 4.
 * <p>
 * Что нужно сделать, чтобы наверняка выключить вентилятор, при том, что вы не можете его обесточить?
 * <p>
 * Вам нужно нажать на выключатель ещё 11 раз.
 * <p>
 * Почему?
 * 12 — наименьшее общее кратное чисел 2, 3 и 4.
 * Поэтому если вы нажмёте на выключатель 12 раз, то вентилятор будет выключен
 * независимо от того, 2, 3 или 4 у него режима работы. Так как вы уже нажали на него 1 раз,
 * остаётся нажать ещё 11.
 */
public class FanTask {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();

        List<FanMode> list = Arrays.asList(
                new FanMode(Arrays.asList("OFF", "ON")),
                new FanMode(Arrays.asList("OFF", "SLOW", "SUPER")),
                new FanMode(Arrays.asList("OFF", "SLOW", "MEDIUM", "SUPER")),
                new FanMode(Arrays.asList("OFF", "SLOW", "MEDIUM", "FAST", "SUPER")),
                new FanMode(Arrays.asList("OFF", "SLOW", "MEDIUM", "FAST", "SUPER", "VERY FAST")),
                new FanMode(Arrays.asList("OFF", "SLOW", "MEDIUM", "FAST", "SUPER", "VERY FAST", "SUPER FAST")),
                new FanMode(Arrays.asList("OFF", "SLOW", "MEDIUM", "FAST", "SUPER", "VERY FAST", "SUPER FAST", "HURRICANE")),
                new FanMode(Arrays.asList("OFF", "SLOW", "MEDIUM", "FAST", "SUPER", "VERY FAST", "SUPER FAST", "HURRICANE", "TORNADO"))
        );

        Fan fan = new Fan(list.get(random.nextInt(list.size())));

        fan.click();

        if (list.size() >= 2) {
            for (int i = 2; i <= fan.getFanMode().getMode().size(); i++) {
                numbers.add(i);
            }
        }

        int lcm = LCM(numbers);

        System.out.println("numbers " + numbers);
        System.out.println("LCM(aka НОД) " + lcm);

        for (int i = 0; i < lcm - 1; i++) {
            fan.click();
        }
        System.out.println(fan);
    }

    public static int LCM(List<Integer> a) {
        for (int m = 1; ; m++) {
            int n = a.size();
            for (int i : a) {
                if (m % i != 0) {
                    break;
                }
                if (--n == 0) {
                    return m;
                }
            }
        }
    }

}
