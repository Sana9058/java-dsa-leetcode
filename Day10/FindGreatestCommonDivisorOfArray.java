// Day 10 – Find Greatest Common Divisor of Array
// LeetCode Problem: Find Greatest Common Divisor of Array
// Difficulty: Easy
// https://leetcode.com/problems/find-greatest-common-divisor-of-array/

class Solution {
    public int findGCD(int[] nums) {

        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (largest < nums[i]) {
                largest = nums[i];
            }

            if (smallest > nums[i]) {
                smallest = nums[i];
            }
        }

        while (smallest != 0) {
            int temp = smallest;
            smallest = largest % smallest;
            largest = temp;
        }

        return largest;
    }
}
