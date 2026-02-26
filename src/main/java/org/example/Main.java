package org.example;

public class Main {

    public static boolean isPalindrome(int number) {
        int n = Math.abs(number);
        int original = n;
        int reversed = 0;

        while (n > 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }

        return original == reversed;
    }

    public static boolean isPerfectNumber(int number) {
        if (number <= 1) return false;

        int sum = 1;

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        return sum == number;
    }

    public static String numberToWords(int number) {
        String[] words = {
                "zero","one","two","three","four",
                "five","six","seven","eight","nine"
        };

        String s = String.valueOf(number);
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            int digit = s.charAt(i) - '0';
            result.append(words[digit]);
            if (i < s.length() - 1) result.append(" ");
        }

        return result.toString();
    }
}