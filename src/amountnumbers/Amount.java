package amountnumbers;

import java.util.regex.Pattern;

/**
 * Class Amount
 *
 *
 * Amount sum of numbers in String
 * Project logictask
 *
 * @author Anton Prokhorov <vziks@live.ru>
 */
public class Amount {


    public static void main(String[] args) {
        System.out.println(amount("111ascas3asc3dc31"));
        System.out.println(amount("22323m231m1"));

    }

    static int amount(String str) {
        return Pattern.compile("\\D+")
                .splitAsStream(str)
                .filter(s -> !s.isEmpty())
                .mapToInt(Integer::parseInt).sum();
    }
}
