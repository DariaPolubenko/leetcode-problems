package leetcode.easy.palindrome_number;

public class Solution {
    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        String stringX = String.valueOf(x);
        int length = stringX.length();

        if (length == 1) {
            return true;
        }

        char[] array = stringX.toCharArray();
        int j = length - 1;
        for (int i = 0; i < length / 2; i++) {
            if (array[i] != array[j]) {
                return false;
            }
            j--;
        }
        return true;
    }
}
