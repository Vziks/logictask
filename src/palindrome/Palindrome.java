package palindrome;

/**
 * Class Palindrome
 * Project logictask
 *
 * @author Anton Prokhorov <vziks@live.ru>
 */
public class Palindrome {

    public static void main(String[] args) {

        System.out.println(Palindrome.isPalindrome("!"));
        System.out.println(Palindrome.isPalindrome("!!!"));
        System.out.println(Palindrome.isPalindrome("!!?"));
        System.out.println(Palindrome.isPalindrome("100001"));
        System.out.println(Palindrome.isPalindrome("1001001"));
        System.out.println(Palindrome.isPalindrome("1001002"));
        System.out.println(Palindrome.isPalindrome("2301032"));
        System.out.println(Palindrome.isPalindrome("Sator Arepo Tenet Opera Rotas"));

    }

    static boolean isPalindrome(String str) {
        str = str.toLowerCase().replace("\\s+", "");
        int i = 0;
        int j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }


}
