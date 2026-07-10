// Day 12 – Happy Number
// LeetCode Problem: Happy Number
// Difficulty: Easy
// https://leetcode.com/problems/happy-number/

class Solution {
    public boolean isHappy(int n) {

        HashSet<Integer> set = new HashSet<>();

        while (n != 1 && !set.contains(n)) {
            int sum = 0;
            set.add(n);

            while (n != 0) {
                int digit = n % 10;
                sum += digit * digit;
                n = n / 10;
            }
            n = sum;
        }
        return n == 1;
    }
}
