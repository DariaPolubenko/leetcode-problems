package leetcode.easy.two_sum;

import java.util.Arrays;
import static leetcode.easy.two_sum.TwoSum.twoSum;

public class Main {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 3, 3};
        int[] result = twoSum(nums, 6); // [1, 2]
        System.out.println("Результат: " + Arrays.toString(result));

        int[] nums1 = new int[]{3, 3, 3};
        int[] result1 = twoSum(nums1, 6); // [0, 1]
        System.out.println("Результат: " + Arrays.toString(result1));
    }
}
