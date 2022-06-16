
/*
    53. Maximum Subarray

    Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
    A subarray is a contiguous part of an array.

    EXAMPLE:

        Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
        Output: 6
        Explanation: [4,-1,2,1] has the largest sum = 6.
*/

class Solution {
    //Kadane's Algorithm
    public int maxSubArray(int[] nums) {

        int sum = nums[0]; //initial sum value
        int highestNum = sum; //initial highestNum
        
        for(int i = 1; i < nums.length; i++){ 
            //if nums[i] is higher, restart the subarray and set sum equal to it
            //if sum + nums[i] is higher, continue the chain
            sum = Math.max(sum + nums[i], nums[i]); 
            //if sum is greater than highestNum, update highestNum
            highestNum = Math.max(highestNum, sum);
        }
        return highestNum;
    }   
}

