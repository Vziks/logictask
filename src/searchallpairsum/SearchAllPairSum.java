package searchallpairsum;

/**
 * Class SearchAllPairSum
 * Project logictask
 *
 * @author Anton Prokhorov <vziks@live.ru>
 */
public class SearchAllPairSum {
    public static void main(String[] args) {

        int[] array = {2, 4, 3, 7, 3, 2, 11, 4, 61, 1, 43, 52, 1, 1, 3, 4, 5, 2, 21, 1, 34, 45, 2, 1, 1, 4, 1, 123, 2, 2, 1, 3, 23};

        getAllPairSum(array, 8);
        getAllPairSum(array, 12);
        getAllPairSum(array, 18);

    }

    private static void getAllPairSum(int[] arrInt, int findSum) {
        int maxIndex;
        int minIndex;

        for (int i = 0; i < arrInt.length; i++) {
            maxIndex = arrInt.length - 1;
            minIndex = i;
            while (minIndex < maxIndex) {
                if (arrInt[minIndex] + arrInt[maxIndex - minIndex] == findSum) {
                    System.out.printf("Index {%d,%d} - Value {%d+%d}\n",
                            minIndex,
                            maxIndex - minIndex,
                            arrInt[minIndex],
                            arrInt[maxIndex - minIndex]
                    );
                }
                maxIndex--;
            }
        }
    }

}
