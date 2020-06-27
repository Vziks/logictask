import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;


/**
 * Class TabletBottle
 * Project logictask
 *
 * @author Anton Prokhorov <vziks@live.ru>
 *
 * Task У вас есть 20 баночек, в каждой из которых находится какое-то количество таблеток.
 * Все таблетки весят по 1 грамму, кроме одной банки, в которой каждая таблетка весит 1.1 грамм.
 * Соответсвенно у вас есть 19 баночек с одинаковым весом и еще одна банка, которая будет весить больше остальных.
 * Задача: вам необходимо за одно взвешивание понять какая из баночек является именно той, где все таблетки весят больше.
 * Весы, на которых вы будете взвешивать дают точную цифру.
 */
public class TabletBottle {

    public static void main(String[] args) {
        BigDecimal bigDecimal = new BigDecimal("0.0");
        List<BigDecimal> decimalArrayList = new ArrayList<>();

        boolean flag = false;

        for (int i = 0; i < 20; i++) {
            if ((new Random()).nextBoolean() && !flag) {
                decimalArrayList.add(new BigDecimal("1.1"));
                flag = true;
            } else {
                decimalArrayList.add(new BigDecimal("1.0"));
            }
        }

        Collections.shuffle(decimalArrayList);

        for (int i = 0; i < decimalArrayList.size(); i++) {
            bigDecimal = bigDecimal.add(decimalArrayList.get(i).multiply(new BigDecimal(i + 1)));
        }

        System.out.println(decimalArrayList);

        System.out.printf("Tablet bottle № %d", bigDecimal.subtract(new BigDecimal("210")).divide(new BigDecimal("0.1")).intValue());

    }
}
