package reverseonlyletter;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Class ReverseStringOnlyLetter
 * Project logictask
 *
 * @author Anton Prokhorov <vziks@live.ru>
 */
public class ReverseStringOnlyLetter {


    public static void main(String[] args) {

        String str1 = "j<3d aw3d1 as!d a1bcd";
        String str2 = "48d9m 3k2-s 8ed3l 9!cv;";

        System.out.println(Stream.of(str1.split(" ")).map(ReverseStringOnlyLetter::reverseString).collect(Collectors.joining(" ")));
        System.out.println(Stream.of(str2.split(" ")).map(ReverseStringOnlyLetter::reverseString).collect(Collectors.joining(" ")));

    }

    /**
     * Reverse String but keep non-letters on their positions
     */
    static String reverseString(String str) {

        char[] stringToCharArray = str.toCharArray();

        ArrayList<Character> destArr = new ArrayList<>();

        Map<Integer, Character> map = new HashMap<>();

        for (int i = stringToCharArray.length - 1, y = 0; i >= 0; i--, y++) {
            if (Character.isLetter(stringToCharArray[i])) {
                destArr.add(stringToCharArray[i]);
            } else {
                map.put(i, stringToCharArray[i]);
            }
        }

        for (Map.Entry<Integer, Character> entry :
                map.entrySet()) {
            destArr.add(entry.getKey(), entry.getValue());
        }

        return destArr.stream().map(Object::toString).collect(Collectors.joining());
    }
}
