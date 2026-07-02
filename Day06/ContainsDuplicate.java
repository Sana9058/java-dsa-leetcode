// Day 06 - Contains Duplicate
// LeetCode Problem: Contains Duplicate
// Difficulty: Easy
// https://leetcode.com/problems/contains-duplicate/

import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }
}
