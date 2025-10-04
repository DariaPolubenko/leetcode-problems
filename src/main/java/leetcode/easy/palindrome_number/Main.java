package leetcode.easy.palindrome_number;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {0, 1, 121, -121, 30};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Является ли число " + numbers[i] + " палиндромом: "
                    + Solution.isPalindrome(numbers[i]));
        }
    }
}
