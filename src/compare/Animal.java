package compare;

/**
 * Class Animal
 * Project logictask
 *
 * @author Anton Prokhorov <vziks@live.ru>
 */
public class Animal implements Comparable<Animal>{

    private String name;
    private int price;
    private int age;


    public Animal(String name, int price, int age) {
        this.name = name;
        this.price = price;
        this.age = age;
    }

    @Override
    public int compareTo(Animal o) {
        return Integer.compare(this.price, o.price);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", age=" + age +
                '}';
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
