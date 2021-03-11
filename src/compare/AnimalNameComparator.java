package compare;

import java.util.Comparator;

/**
 * Class AnimalNameComparator
 * Project logictask
 *
 * @author Anton Prokhorov <vziks@live.ru>
 */
public class AnimalNameComparator implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
//        return o1.getName().compareTo(o2.getName());
        return o2.getName().compareTo(o1.getName());
    }
}
