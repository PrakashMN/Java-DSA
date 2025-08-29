/* 
 Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.

 

Example 1:

Input: num = 38
Output: 2
Explanation: The process is
38 --> 3 + 8 --> 11
11 --> 1 + 1 --> 2 
Since 2 has only one digit, return it.
Example 2:

Input: num = 0
Output: 0
 
 */

public class addDigits {
    public static int sumDigits(int n) {
        while (n >= 10) {
            int sum = 0;
            while (n > 0) {
                sum += n % 10;
                n /= 10;     
            }
            n = sum;
        }
        return n;
    }

    public static void main(String args[]) {
        int n = 38;
        int result = sumDigits(n);
        System.out.println("The digital root of " + n + " is " + result); 
    }
}