/* 

242. Valid Anagram(https://leetcode.com/problems/valid-anagram/description/)

Given two strings s and t, return true if t is an anagram of s, and false otherwise.

Example 1:
Input: s = "anagram", t = "nagaram"
Output: true

Example 2:
Input: s = "rat", t = "car"
Output: false

Constraints:
1 <= s.length, t.length <= 5 * 104
s and t consist of lowercase English letters. */

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] freq = new int[26];

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }

        for (int count : freq) {
            if (count != 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "anagram", t1 = "nagaram";
        String s2 = "rat", t2 = "car";

        System.out.println("Case 1: " + isAnagram(s1, t1));
        System.out.println("Case 2: " + isAnagram(s2, t2)); 
    }
}
