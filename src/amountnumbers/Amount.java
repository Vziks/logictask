package amountnumbers;

import java.util.function.Predicate;
import java.util.regex.Pattern;

/**
 * Class Amount
 *
 *
 * Amount sum of numbers in S
 * Project logictask
 *
 * @author Anton Prokhorov <vziks@live.ru>
 */
public class Amount {

    static <T> Predicate<T> not(Predicate<T> p) { return o -> !p.test(o); }
    static Predicate<String> blank = String::isEmpty;

    public static void main(String[] args) {
        System.out.println(amountBlank("111ascas3asc3dc31"));
        System.out.println(amountNot("111ascas3asc3dc31"));
        System.out.println(amountBlank("22323m231m1"));
        System.out.println(amountNot("22323m231m1"));

    }

    static int amountBlank(String str) {
        Predicate<String> blank = String::isEmpty;
        return Pattern.compile("\\D+")
                .splitAsStream(str)
                .filter(Amount.blank.negate())
                .mapToInt(Integer::parseInt).sum();
    }

    static int amountNot(String str) {
        Predicate<String> blank = String::isEmpty;
        return Pattern.compile("\\D+")
                .splitAsStream(str)
                .filter(not(String::isEmpty))
                .mapToInt(Integer::parseInt).sum();
    }
}
