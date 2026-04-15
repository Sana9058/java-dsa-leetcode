// Day 01 - Two Sum
// LeetCode Problem: Two Sum
// https://leetcode.com/problems/two-sum/

import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++){
            
            int need = target - nums[i];
            
            if(map.containsKey(need)){
                return new int[]{map.get(need), i};
            }
            
            map.put(nums[i], i);
        }
        
        return new int[]{};
    }
}
