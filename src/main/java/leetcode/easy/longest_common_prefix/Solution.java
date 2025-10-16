package leetcode.easy.longest_common_prefix;

public class Solution {
    public static String longestCommonPrefix1 (String[] strs) {
        if (strs.length == 0 || strs == null) {
            return "";
        }

        for (int j = 0; j < strs[0].length(); j++) { // буквы первого слова
            char c = strs[0].charAt(j);
            for ( int i = 1; i < strs.length; i++) { // слова
                if (j == strs[i].length() || strs[i].charAt(j) != c) {
                    return strs[0].substring(0, j);
                }
            }
        }
        return strs[0];
    }
}
