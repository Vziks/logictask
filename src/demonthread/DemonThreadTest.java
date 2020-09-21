package demonthread;

/**
 * Class DemonThreadTest
 * Project logictask
 *
 * @author Anton Prokhorov <vziks@live.ru>
 */
public class DemonThreadTest {
    public static void main(String[] args) {
        DemonThread demonThread = new DemonThread() {
            {
                start();
            }
        };
//        demonThread.start();

        try {
            Thread.sleep(7000);
//            demonThread.interrupt();
//            demonThread.join();
        } catch (InterruptedException e) {
            // handle here exception
        }

        System.out.println("DaemonTest Thread ending");
    }
}
