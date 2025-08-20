/* 
    344. Reverse String(https://leetcode.com/problems/reverse-string/description/)

Write a function that reverses a string. The input string is given as an array of characters s.

You must do this by modifying the input array in-place with O(1) extra memory.

 

Example 1:

Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
Example 2:

Input: s = ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]
 

Constraints:

1 <= s.length <= 105
s[i] is a printable ascii character. */
public class ReverseString {

    public static void reverseString(char[] s) {
        int left = 0, right = s.length - 1;

        while (left < right) {

            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        char[] s1 = {'h','e','l','l','o'};
        reverseString(s1);
        System.out.println("Output 1: " + java.util.Arrays.toString(s1));

        char[] s2 = {'H','a','n','n','a','h'};
        reverseString(s2);
        System.out.println("Output 2: " + java.util.Arrays.toString(s2));
    }
}
