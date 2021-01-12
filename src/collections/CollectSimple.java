package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/**
 * Class CollectSimple
 * Project logictask
 *
 * @author Anton Prokhorov <vziks@live.ru>
 */
public class CollectSimple {


    public static void main(String[] args) {

        List<SimpleEntity> simpleEntityList = new ArrayList<>();
        List<Integer> integerArrayList = new ArrayList<>();

        String[] arrString = {"A1", "V3", "B#"};

        Arrays.sort(arrString);

        integerArrayList.add(1);
        integerArrayList.sort(null);

        simpleEntityList.add(new SimpleEntity(5, "Five", true));
        simpleEntityList.add(new SimpleEntity(8, "Eight", false));
        simpleEntityList.add(new SimpleEntity(9, "Nine", true));
        simpleEntityList.add(new SimpleEntity(9, "ANine", true));
        simpleEntityList.add(new SimpleEntity(9, "ANine", false));

        Iterator<SimpleEntity> entityIterator  = simpleEntityList.iterator();

        while (entityIterator.hasNext()) {
            System.out.println(entityIterator.next());
        }

        // Adds a value to the desired cell, shifting everything else, if the cell is empty, an exception(IndexOutOfBoundsException) occurs
        // simpleEntityList.add(8, new SimpleEntity(8, "Eight"));

        for (SimpleEntity entity : simpleEntityList) {
            // can modify entry fields
            entity.setName(entity.getName() + " modify");
        }

        System.out.println(simpleEntityList);

        // We can pass null if the Comparable interface is implemented
        simpleEntityList.sort(null);
        // or we can pass Comparator
        //simpleEntityList.sort(Comparator.comparing(SimpleEntity::getName));
        simpleEntityList.sort(Comparator.comparing(SimpleEntity::getId).thenComparing(SimpleEntity::getName).thenComparing(new Comparator<SimpleEntity>() {
            @Override
            public int compare(SimpleEntity o1, SimpleEntity o2) {
                return o2.getTrue().compareTo(o1.getTrue());
            }
        }));
        // or we can pass Comparator
        // simpleEntityList.sort(Comparator.comparing(SimpleEntity::getId));

        simpleEntityList.sort((new SimpleEntityIdComparator()).thenComparing(new SimpleEntityNameComparator()));

        for (SimpleEntity entity : simpleEntityList) {
            // but can modify entry ref
            entity = new SimpleEntity(6, "Six", true);
        }

        System.out.println(simpleEntityList);

        for (int i = 0; i < simpleEntityList.size(); i++) {
            simpleEntityList.set(i, new SimpleEntity(6, "Six", true));
        }
        System.out.println(simpleEntityList);
    }
}
