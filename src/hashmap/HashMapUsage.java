package hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class HashMapUsage
 * Project logictask
 *
 * @author Anton Prokhorov <vziks@live.ru>
 */
public class HashMapUsage {

    static private Map<Element, Integer> map = new HashMap<>();

    public static void main(String[] args) {
        // Create new object
        Element element = new Element(1, "Name");
        // Show hashCode
        System.out.println("Hash " + element.hashCode());
        // Put into map
        map.put(element, element.getId());
        // assert count map
        assert (map.size() == 1);
        // let's try to add the same object
        map.put(element, element.getId());
        // assert count map
        assert (map.size() == 1);
        // change state of object
        element.setName("some name");
        // Show hashCode
        System.out.println("Hash " + element.hashCode());
        // Put into map object with changed state, but the same reference
        map.put(element, element.getId());
        // We will see an increase in size, but the same reference
        assert (map.size() == 2);
        // Get keys from map
        List<Element> keys = new ArrayList<>(map.keySet());
        // Hard get by index and equals
        assert (keys.get(0).equals(keys.get(1)));

    }

}
