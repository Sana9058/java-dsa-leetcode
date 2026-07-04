// Day 07 - Add Digits
// LeetCode Problem: Add Digits
// Difficulty: Easy
// https://leetcode.com/problems/add-digits/

class Solution {
    public int addDigits(int num) {
        while (num >= 10) {
            int sum = 0;

            while (num > 0) {
                int lastDigit = num % 10;
                sum += lastDigit;
                num = num / 10;
            }
            num = sum;
        }
        return num;
    }
}
