package twosum;

import java.util.HashMap;
import java.util.Map;

/**
 * Class TwoSum
 * Project logictask
 *
 * @author Anton Prokhorov <vziks@live.ru>
 */
public class TwoSum {

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 1000000; i++) {
            int[] aaa = twoSum1(new int[]{1, 2, 3, 4, 6}, 9);
        }
        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        System.out.println("twoSum1 time " + elapsedTime);

        startTime = System.currentTimeMillis();

        for (int i = 0; i < 1000000; i++) {
            int[] aaa = twoSum2(new int[]{1, 2, 3, 4, 6}, 9);
        }
        stopTime = System.currentTimeMillis();
        elapsedTime = stopTime - startTime;
        System.out.println("twoSum2 time " + elapsedTime);


        startTime = System.currentTimeMillis();

        for (int i = 0; i < 1000000; i++) {
            int[] aaa = twoSum3(new int[]{1, 2, 3, 4, 6}, 9);
        }
        stopTime = System.currentTimeMillis();
        elapsedTime = stopTime - startTime;
        System.out.println("twoSum3 time " + elapsedTime);

    }

    public static int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }

        throw new IllegalArgumentException("No two sum solution");
    }

    public static int[] twoSum3(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[]{i, map.get(complement)};
            }
        }

        throw new IllegalArgumentException("No two sum solution");
    }


    public static int[] twoSum1(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

}
