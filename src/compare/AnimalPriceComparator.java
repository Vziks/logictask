package compare;

import java.util.Comparator;

/**
 * Class AnimalPriceComparator
 * Project logictask
 *
 * @author Anton Prokhorov <vziks@live.ru>
 */
public class AnimalPriceComparator implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        return Integer.compare(o1.getPrice(), o2.getPrice());
    }
}
