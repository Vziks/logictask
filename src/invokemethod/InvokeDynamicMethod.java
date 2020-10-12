package invokemethod;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * Class InvokeDynamicMethod
 * Project logictask
 *
 * @author Anton Prokhorov <vziks@live.ru>
 */
public class InvokeDynamicMethod {


    public static Object objectMethod() {


        return new Object() {
            int sum(int a, int b) {
                return a + b;
            }
        };
    }

    public static void main(String[] args) {


        Assxas as = new Assxas();

        as.start();

        int a= 0;

        a -=- 1;

        System.out.println(a);

        try {
            Object obj = objectMethod();
            Class[] partypes = new Class[2];
            partypes[0] = Integer.TYPE;
            partypes[1] = Integer.TYPE;
            Method o = obj.getClass().getDeclaredMethod("sum", partypes);

            Object arglist[] = new Object[2];
            arglist[0] = 37;
            arglist[1] = 47;

            System.out.println(o.invoke(obj, arglist));
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }

        Sum clz = new Object() {
            class Nested implements Sum {
                public int sum(int a, int b) {
                    return a + b;
                }
            }
        }.new Nested();

        System.out.println(clz.sum(1, 2));
        System.out.println(clz.sum(5, 6));
    }
}


class Assxas extends Thread {

}