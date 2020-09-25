package inversecase;

/**
 * Class InverseCase
 * Project logictask
 *
 * @author Anton Prokhorov <vziks@live.ru>
 */
public class InverseCase {

    public static void main(String[] args) {
        System.out.println(inverseWithStream("qwkjxnKJAS2asx12&^gqwx76G&^XW"));
        System.out.println(inverseWithArray("qwkjxnKJAS2asx12&^gqwx76G&^XW"));
        System.out.println(inverseWithStream("21casJcsjb&^gqqwd76GIc"));
        System.out.println(inverseWithArray("21casJcsjb&^gqqwd76GIc"));
    }

    private static String inverseWithArray(String srt) {
        char[] chars = srt.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            chars[i] = Character.isLowerCase(chars[i]) ? Character.toUpperCase(chars[i])
                    : Character.toLowerCase(chars[i]);
        }
        return new String(chars);
    }

    private static String inverseWithStream(String str) {
        return str.chars().map(c -> Character.isLowerCase(c) ? Character.toUpperCase(c) : Character.toLowerCase(c))
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
    }


}
