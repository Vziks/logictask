package hashcollision;

import java.util.HashMap;
import java.util.Map;

/**
 * Class HashCollision
 * Project logictask
 *
 * @author Anton Prokhorov <vziks@live.ru>
 */
public class HashCollision {

    public static void main(String[] args) {

        HashMap<Person, String> map = new HashMap<>();
        Person p1 = new Person(1, "abc");
        Person p2 = new Person(2, "def");
        Person p3 = new Person(1, "xyz");
        Person p4 = new Person(1, "pqr");
        Person p5 = new Person(1, "pqr");

        map.put(p1, "one");
        map.put(p2, "two");
        map.put(p3, "three");
        map.put(p4, "four");
        map.put(p5, "five");

        System.out.println(map);

    }
}
