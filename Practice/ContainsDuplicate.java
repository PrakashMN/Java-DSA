/* 
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

Example 1:

Input: nums = [1,2,3,1]

Output: true

Explanation:

The element 1 occurs at the indices 0 and 3.

Example 2:

Input: nums = [1,2,3,4]

Output: false

Explanation:

All elements are distinct.

Example 3:

Input: nums = [1,1,1,3,3,4,3,2,4,2]

Output: true */

    // BruteForce Approch  TC = O(n^2) SC = O(1)

/* public class ContainsDuplicate {
    public static boolean Contains(int num[]){
        for(int i=0;i<num.length;i++){
            int key = num[i];
            for(int j=i+1;j<num.length;j++){
                if(key==num[j]){
                    System.out.println("Duplicates are Found at index : "+j);
                    return true;
                }
            }
        }
        System.out.println("NO Duplicates are Found");
        return false;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,4};
        Contains(nums);
    }
} */


    // By sorting Approch TC = O(nlogn)  SC = O(1)

import java.util.Arrays;

public class ContainsDuplicate {
        
        public static boolean Contains(int nums[]){
            if(nums.length==1){
                return false;
            }
            Arrays.sort(nums);
            for(int i=1;i<nums.length;i++){
                if(nums[i]==nums[i-1]){
                    System.out.println("Duplicates are present");
                    return true;
                }
            }
            System.out.println("No Duplicates are found");
            return false;
        }
        public static void main(String[] args) {
            int nums[] = {1,2,3,4};
            Contains(nums);
        }
    }

    // Another Approch is using Hashing TC = O(n) & SC = O(n)


