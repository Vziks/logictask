package fan;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Class FanTask
 * Project logictask
 *
 * @author Anton Prokhorov <vziks@live.ru>
 *
 * Вы согласились проследить за квартирой друга пока он в отпуске.
 * В одной из комнат вы нажали на выключатель потолочного вентилятора,
 * но когда ничего не произошло, поняли, что в доме отключили электричество.
 * К сожалению, вам уже нужно бежать и вы не сможете приехать сюда снова несколько дней.
 *
 * Вы помните, что вентилятор был выключен до того, как вы нажали на кнопку,
 * а также что каждое нажатие будет переключать режимы вентилятора: «выключен», «средний», «сильный» и т. д.
 * Вы не знаете точное количество режимов, но уверены, что их не больше 4.
 *
 * Что нужно сделать, чтобы наверняка выключить вентилятор, при том, что вы не можете его обесточить?
 *
 * Вам нужно нажать на выключатель ещё 11 раз.
 *
 * Почему?
 * 12 — наименьшее общее кратное чисел 2, 3 и 4.
 * Поэтому если вы нажмёте на выключатель 12 раз, то вентилятор будет выключен
 * независимо от того, 2, 3 или 4 у него режима работы. Так как вы уже нажали на него 1 раз,
 * остаётся нажать ещё 11.
 *
 */
public class FanTask {
    public static void main(String[] args) {

        Random random = new Random();

        List<FanInterface> list = Arrays.asList(
                new FanTwoMode(Arrays.asList("OFF", "ON")),
                new FanThreeMode(Arrays.asList("OFF", "SMALL", "SUPER")),
                new FanFourMode(Arrays.asList("OFF", "SMALL", "MEDIUM", "SUPER")));

        Fan fan = new Fan(list.get(random.nextInt(list.size())));

        fan.click();

        for (int i = 0; i < 11; i++) {
            fan.click();
        }
        System.out.println(fan);
    }
}
