package leetcode.easy.roman_to_integer;

import java.util.Map;

public class Solution {
    public static int romanToInt(String s) {
        if (s == null || s.isEmpty()) {
            throw new IllegalArgumentException("Введено неверное значение");
        }

        Map<Character, Integer> symbols = Map.of(
                'I', 1,
                'V', 5,
                'X', 10,
                'L', 50,
                'C', 100,
                'D', 500,
                'M', 1000
        );

        char[] sArray = s.toCharArray();
        int result = 0;

        for (int i = 0; i < sArray.length; i++) {
            int current = symbols.get(sArray[i]);

            if (i + 1 < sArray.length) {
                int next = symbols.get(sArray[i + 1]);
                result += next > current ? - current : current;
            } else {
                result += current;
            }

        }
        return result;
    }
}