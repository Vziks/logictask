package maxnumber;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Class MaxNumber
 * Project logictask
 *
 * @author Anton Prokhorov <vziks@live.ru>
 */
public class MaxNumber {

    public static void main(String[] args) {
        Map<Integer, Integer> map = new LinkedHashMap<>();
        List<Integer> list = new ArrayList<Integer>() {{
            add(2);
            add(6);
            add(7);
            add(0);
            add(0);
            add(0);
            add(0);
            add(4);
            add(8);
            add(8);
            add(5);
            add(5);
            add(3);
            add(8);
            add(3);
            add(3);
            add(9);
            add(1);
        }};


        System.out.println(brutForce(list));
    }

    private static String brutForce(List<Integer> list) {
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < list.size(); i++) {
            int max = 0;
            int s = 0;
            Integer index;
            index = null;
            for (Integer y : list) {
                if (y >= 0 && max <= y && !map.containsKey(s)) {
                    index = s;
                    max = y;
                }
                s++;
            }
            map.put(index, max);

            System.out.println(map);
        }

//        return map.values().stream().map(Object::toString).collect(Collectors.joining(""));
        return map.values().stream().map(Object::toString).collect(StringBuilder::new, StringBuilder::append, StringBuilder::append).toString();
    }
}
