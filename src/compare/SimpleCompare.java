package compare;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Class SimpleCompare
 * Project logictask
 *
 * @author Anton Prokhorov <vziks@live.ru>
 */
public class SimpleCompare {

    public static void main(String[] args) {

        Animal[] animals = new Animal[]{
                new Animal("Wolf", 500, 10),
                new Animal("Wolf", 500, 5),
                new Animal("Wolf", 500, 4),
                new Animal("Fox", 500, 10),
                new Animal("Wolf", 100, 2),
                new Animal("Fox", 100, 10),
                new Animal("Wolf", 200, 10),
                new Animal("Rabbit", 50, 3),
                new Animal("Wolf", 400, 9),
                new Animal("Wolf", 50, 10),
                new Animal("Wolf", 500, 7),
                new Animal("Wolf", 200, 10),
                new Animal("Fox", 200, 10),
                new Animal("Wolf", 200, 8),
                new Animal("Rabbit", 100, 10),
                new Animal("Rabbit", 200, 4),
                new Animal("Wolf", 600, 10),
                new Animal("Rabbit", 400, 4),
                new Animal("Fox", 200, 10),
                new Animal("Rabbit", 200, 1),
                new Animal("Rabbit", 400, 10),
                new Animal("Fox", 50, 10),
                new Animal("Rabbit", 200, 2),
                new Animal("Fox", 400, 10),
                new Animal("Rabbit", 400, 6),
                new Animal("Rabbit", 400, 5)
        };
        for (Animal a : animals) {
            System.out.println(a);
        }


        System.out.println("");
        Arrays.sort(animals);

        for (Animal a : animals) {
            System.out.println(a);
        }


        Arrays.sort(animals, new AnimalNameComparator());

        System.out.println("");

        for (Animal a : animals) {
            System.out.println(a);
        }


        Arrays.sort(animals, new AnimalPriceComparator());

        System.out.println("");

        for (Animal a : animals) {
            System.out.println(a);
        }

        Arrays.sort(animals, (new AnimalPriceComparator()).thenComparing(new AnimalNameComparator()));

        System.out.println("");

        for (Animal a : animals) {
            System.out.println(a);
        }


        Arrays.sort(animals, new Comparator()
        {
            public int compare(Object o1, Object o2)
            {
               return ((Animal)o1).getName().compareTo(((Animal)o2).getName());
            }
        } );

        System.out.println("");

        for (Animal a : animals) {
            System.out.println(a);
        }


        Arrays.sort(animals, new Comparator<Animal>()
        {
            public int compare(Animal o1, Animal o2)
            {
                return o1.getName().compareTo(o2.getName());
            }
        } );

        System.out.println("");

        for (Animal a : animals) {
            System.out.println(a);
        }


        Arrays.sort(animals, Comparator.comparing(Animal::getName));

        System.out.println("");

        for (Animal a : animals) {
            System.out.println(a);
        }



        Arrays.sort(animals, (new AnimalPriceComparator()).thenComparing((o1, o2) -> Integer.compare(o1.getAge(), o2.getAge())).thenComparing(new AnimalNameComparator()));

        System.out.println("");

        for (Animal a : animals) {
            System.out.println(a);
        }


    }
}
