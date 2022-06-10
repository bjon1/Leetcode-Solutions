//brute force solution

class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0; //start sum at 0
        int maxVal = nums[0]; //maxVal should start being the first value of the array 
        for(int i = 0; i < nums.length; i++){ //first loop slowly constrains until nums.length 
            for(int j = i; j < nums.length; j++){ //second loop iterates from i to end, that way **every possible case** is considered
                sum+=nums[j]; 
                if(sum > maxVal){ //update maxVal if sum is greater than it
                    maxVal = sum;
                }
            }
            sum = 0; //reset sum because we are testing the next subarray starting at i
        }
        return maxVal;
    }   
}