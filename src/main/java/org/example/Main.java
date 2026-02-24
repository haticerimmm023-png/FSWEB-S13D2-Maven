package org.example;

public class Main {
    public static void main(String[] args) {

        ResultAnalyzer analyzer = new ResultAnalyzer();

        System.out.println(analyzer.isPalindrome(121));
        System.out.println(analyzer.isPerfectNumber(6));
        System.out.println(analyzer.numberToWords(123));
    }
}