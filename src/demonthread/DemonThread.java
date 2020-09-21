package demonthread;

/**
 * Class DemonThread
 * Project logictask
 *
 * @author Anton Prokhorov <vziks@live.ru>
 */
public class DemonThread extends Thread {
    public DemonThread() {
        this.setDaemon(true);
    }

    public void run() {
        int count = 0;

        while (true) {
            System.out.println("Hello from DemonThread " + count++);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                // handle exception here
            }
        }
    }
}
