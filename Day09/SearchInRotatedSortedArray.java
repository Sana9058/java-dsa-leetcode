// Day 09 – Search in Rotated Sorted Array
// LeetCode Problem: Search in Rotated Sorted Array
// Difficulty: Medium
// https://leetcode.com/problems/search-in-rotated-sorted-array/

class Solution {
    public int search(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            // Left half is sorted
            if (nums[start] <= nums[mid]) {
                if (target >= nums[start] && target < nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            }
            // Right half is sorted
            else {
              if (target > nums[mid] && target <= nums[end]) {
                start = mid + 1;
              } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
