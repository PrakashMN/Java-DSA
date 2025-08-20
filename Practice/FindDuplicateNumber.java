/* 

       287. Find the Duplicate Number(https://leetcode.com/problems/find-the-duplicate-number/description/)

Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

There is only one repeated number in nums, return this repeated number.

You must solve the problem without modifying the array nums and using only constant extra space.

 

Example 1:

Input: nums = [1,3,4,2,2]
Output: 2
Example 2:

Input: nums = [3,1,3,4,2]
Output: 3
Example 3:

Input: nums = [3,3,3,3,3]
Output: 3
 

Constraints:

1 <= n <= 105
nums.length == n + 1
1 <= nums[i] <= n
All the integers in nums appear only once except for precisely one integer which appears two or more times. */


public class FindDuplicateNumber {

    public static int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];

        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        fast = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,3,4,2,2};
        int[] arr2 = {3,1,3,4,2};
        int[] arr3 = {1,1};
        int[] arr4 = {1,1,2};

        System.out.println("Duplicate in arr1: " + findDuplicate(arr1)); // 2
        System.out.println("Duplicate in arr2: " + findDuplicate(arr2)); // 3
        System.out.println("Duplicate in arr3: " + findDuplicate(arr3)); // 1
        System.out.println("Duplicate in arr4: " + findDuplicate(arr4)); // 1
    }
}
