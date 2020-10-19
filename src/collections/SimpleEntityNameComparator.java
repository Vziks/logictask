package collections;

import java.util.Comparator;

/**
 * Class SimpleEntityNameComparator
 * Project logictask
 *
 * @author Anton Prokhorov <vziks@live.ru>
 */
public class SimpleEntityNameComparator implements Comparator<SimpleEntity> {
    @Override
    public int compare(SimpleEntity o1, SimpleEntity o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
