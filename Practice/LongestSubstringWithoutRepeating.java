/* 
3. Longest Substring Without Repeating Characters(https://leetcode.com/problems/longest-substring-without-repeating-characters/description/)

Given a string s, find the length of the longest substring without duplicate characters.

 

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring. */


import java.util.*;

public class LongestSubstringWithoutRepeating {

    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int[] lastIndex = new int[256]; 
        Arrays.fill(lastIndex, -1);

        int left = 0, maxLen = 0;

        for (int right = 0; right < n; right++) {
            char c = s.charAt(right);

            if (lastIndex[c] >= left) {
                left = lastIndex[c] + 1;
            }

            lastIndex[c] = right;
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb")); // 3
        System.out.println(lengthOfLongestSubstring("bbbbb"));    // 1
        System.out.println(lengthOfLongestSubstring("pwwkew"));   // 3
        System.out.println(lengthOfLongestSubstring(""));         // 0
    }
}
