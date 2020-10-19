package collections;

import java.util.Comparator;

/**
 * Class SimpleEntityIdComparator
 * Project logictask
 *
 * @author Anton Prokhorov <vziks@live.ru>
 */
class SimpleEntityIdComparator implements Comparator<SimpleEntity> {

    @Override
    public int compare(SimpleEntity o1, SimpleEntity o2) {
        return o1.getId().compareTo(o2.getId());
    }
}
