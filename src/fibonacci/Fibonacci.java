package fibonacci;

import java.util.Arrays;

/**
 * Class Fibonacci
 * Project logictask
 *
 * @author Anton Prokhorov <vziks@live.ru>
 */
public class Fibonacci {

    public static void main(String[] args) {

        int n = 100;
        long[] memory = new long[n + 1];
        Arrays.fill(memory, -1);

        System.out.println(getFibonacciMemory(n, memory));
        System.out.println(getFibonacci(100));

    }

    private static long getFibonacci(int i) {
        long[] arr = new long[i + 1];

        arr[0] = 0;
        arr[1] = 1;

        for (int j = 2; j <= i; j++) {
            arr[j] = arr[j - 1] + arr[j - 2];
        }

        return arr[i];
    }

    private static long getFibonacciMemory(int i, long[] memory) {

        if (memory[i] != -1) {
            return memory[i];
        }
        if (i <= 1) return i;

        long result = getFibonacciMemory(i - 1, memory) + getFibonacciMemory(i - 2, memory);

        memory[i] = result;

        return memory[i];
    }

}
