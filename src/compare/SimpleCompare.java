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
                new Animal("Wolf", 500),
                new Animal("Wolf", 500),
                new Animal("Wolf", 500),
                new Animal("Fox", 500),
                new Animal("Wolf", 500),
                new Animal("Wolf", 600),
                new Animal("Wolf", 100),
                new Animal("Fox", 100),
                new Animal("Wolf", 200),
                new Animal("Wolf", 400),
                new Animal("Wolf", 200),
                new Animal("Fox", 200),
                new Animal("Wolf", 200),
                new Animal("Rabbit", 100),
                new Animal("Rabbit", 200),
                new Animal("Rabbit", 200),
                new Animal("Fox", 200),
                new Animal("Rabbit", 200),
                new Animal("Rabbit", 50),
                new Animal("Fox", 50),
                new Animal("Wolf", 50),
                new Animal("Rabbit", 400),
                new Animal("Rabbit", 400),
                new Animal("Fox", 400),
                new Animal("Rabbit", 400),
                new Animal("Rabbit", 400)
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


    }
}
