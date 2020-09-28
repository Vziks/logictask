package invokemethod;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Class InvokeDynamicMethod
 * Project logictask
 * ˚
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


        int sum = new Object() {
            class Nested {
                public int sum(int a, int b) {
                    return a + b;
                }
            }
        }.new Nested().sum(1, 2);


        System.out.println(sum);


    }
}
