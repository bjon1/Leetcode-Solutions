class Solution {
    public int maxSubArray(int[] nums) {
        
        int sum = nums[0];
        int highestNum = sum;
        
        for(int i = 1; i < nums.length; i++){
            sum = Math.max(sum + nums[i], nums[i]);
            highestNum = Math.max(highestNum, sum);
        }
        return highestNum;
    }   
}

