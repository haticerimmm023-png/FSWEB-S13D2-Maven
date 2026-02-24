package org.example;

public class ResultAnalyzer {

    public boolean isPalindrome(int number) {
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

    public boolean isPerfectNumber(int number) {
        if (number <= 0) return false;

        int sum = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        return sum == number;
    }

    public String numberToWords(int number) {
        if (number < 0) return "Invalid Value";
        if (number == 0) return "Zero";

        String[] words = {
                "Zero", "One", "Two", "Three", "Four",
                "Five", "Six", "Seven", "Eight", "Nine"
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

