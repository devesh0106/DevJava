package NeetCode;

import java.util.HashSet;
import java.util.Set;

//NeetCode: https://neetcode.io/roadmap
/*
* Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
Example 1:

Input: nums = [1,2,3,1]
Output: true
Example 2:

Input: nums = [1,2,3,4]
Output: false
Example 3:

Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true


Constraints:

1 <= nums.length <= 105
-109 <= nums[i] <= 109
* */
public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums){
       /* Boolean flag = false;
        int len = nums.length;
        for (int i = 0; i <len; i++) {
            for(int j=i+1;j<len;j++){
                if(nums[i]==nums[j]){
                    flag=true;
                    System.out.println("true");
                }
            }
        }
        if(flag!=true){
            System.out.println("false");
        }
        return flag;*/
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(hs.contains(nums[i])){
                return true;
            }
            hs.add(nums[i]);
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums = {1,4, 2, 3, 1};
        System.out.println(containsDuplicate(nums));
    }
}
