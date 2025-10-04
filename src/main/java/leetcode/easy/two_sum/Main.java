package leetcode.easy.two_sum;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Solution 1
        int[] nums = new int[]{1, 3, 3};
        int[] result = Solution.twoSum(nums, 6); // [1, 2]
        System.out.println("Результат: " + Arrays.toString(result));

        int[] nums1 = new int[]{3, 3, 3};
        int[] result1 = Solution.twoSum(nums1, 6); // [0, 1]
        System.out.println("Результат: " + Arrays.toString(result1));

        //Solution 2
        int[] nums2 = new int[]{1, 3, 3};
        int[] result2 = Solution.twoSum2(nums, 6); // [1, 2]
        System.out.println("Результат: " + Arrays.toString(result2));

        int[] nums3 = new int[]{3, 3, 3};
        int[] result3 = Solution.twoSum2(nums1, 6); // [0, 1]
        System.out.println("Результат: " + Arrays.toString(result3));
    }
}
