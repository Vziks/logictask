package functional;

/**
 * Class FunctionalDemo
 * Project logictask
 *
 * @author Anton Prokhorov <vziks@live.ru>
 */
public class FunctionalDemo {

    public static void main(String[] args) {

        // Anonymous inner class
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("In anonymous classes");
            }
        }).start();

        // Lambda expression in constructor
        new Thread(() -> System.out.println("In lambda")).start();

        // Lambda expression in variable
        Runnable runnable = () -> System.out.println("Runnable variable");

        new Thread(runnable).start();
    }
}
