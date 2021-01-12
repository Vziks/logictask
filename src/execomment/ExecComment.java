package execomment;

/**
 * Class ExecComment
 * Project logictask
 *
 * @author Anton Prokhorov <vziks@live.ru>
 */
public class ExecComment {

    static void sum() {
        int a1,a2,c;

        a1 = 2;
        a2 = 4;
        c = a1 + a2;
        System.out.println(c);

    }

    public static void main(String[] args) {

        // Java compiler interprets the Unicode character \u000d
        // \u000d System.out.println("executable comment");


        // c = a1 + a2;
        // \u000d sum();

    }
}
