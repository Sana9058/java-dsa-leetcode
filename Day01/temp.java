// Day 02 - Valid Anagram
// LeetCode Problem: Valid Anagram
// Difficulty: Easy
// https://leetcode.com/problems/valid-anagram/

import java.util.HashMap;

class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        // Count characters of first string
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Decrease count using second string
        for(int i = 0; i < t.length(); i++){
            char ch = t.charAt(i);

            if(!map.containsKey(ch)){
                return false;
            }

            map.put(ch, map.get(ch) - 1);

            if(map.get(ch) < 0){
                return false;
            }
        }

        return true;
    }
}
