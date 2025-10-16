package leetcode.easy.longest_common_prefix;

public class Solution {
    public static String getLongestCommonPrefix (String[] strs) {
        if (strs.length == 0 || strs == null) {
            return "";
        }

        StringBuilder result = new StringBuilder("");
        char[] firstWord = strs[0].toCharArray();

        for (int j = 0; j < firstWord.length; j++) { // буквы первого слова
            for ( int i = 1; i < strs.length; i++) { // слова
                char[] currentWord = strs[i].toCharArray();

                if (j >= currentWord.length) {
                    return result.toString();
                }

                if (firstWord[j] != currentWord[j]) {
                    return result.toString();
                }
            }
            result.append(firstWord[j]);
        }
        return result.toString();
    }
}
