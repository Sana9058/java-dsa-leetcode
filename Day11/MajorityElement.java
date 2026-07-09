// Day 11 – Majority Element
// LeetCode Problem: Majority Element
// Difficulty: Easy
// https://leetcode.com/problems/majority-element/

class Solution {
    public int majorityElement(int[] nums) {

        int candidate = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                candidate = nums[i];
            }

            if (nums[i] == candidate) {
                count++;
            } else {
                count--;
            }
        }
        return candidate;
    }
}
