/*  #70 Climbing Stairs

        You are climbing a staircase. It takes n steps to reach the top.

        Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

        Example 1:
        Input: n = 2
        Output: 2
        Explanation: There are two ways to climb to the top.
        1. 1 step + 1 step
        2. 2 steps
        
        Example 2:
        Input: n = 3
        Output: 3
        Explanation: There are three ways to climb to the top.
        1. 1 step + 1 step + 1 step
        2. 1 step + 2 steps
        3. 2 steps + 1 step
*/

class Solution {
    public int climbStairs(int n) {
        
        /*
            stairs[0] = # of distinct ways you can climb 0 stair (1)
            stairs[1] = # of distinct ways you can climb 1 stair (1)
            stairs[2] = # of distinct ways you can climb 2 stairs (2)
            stairs[3] = # of distinct ways you can climb 3 stairs (3)
            (so stairs[i-1] + stairs[i-2] = stairs[i])
        */ 
        
        int[] steps = new int[n+1];
        steps[0] = 1;
        steps[1] = 1;
        for(int i = 2; i <= n; i++){
            steps[i] = steps[i-1] + steps[i-2];
        }
        return steps[n];
    }
}