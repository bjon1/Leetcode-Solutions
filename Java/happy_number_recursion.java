import java.util.HashSet;
// #202. Happy Number

/*
    Write an algorithm to determine if a number n is happy.

    A happy number is a number defined by the following process:

        1) Starting with any positive integer, replace the number by the sum of the                  squares of its digits.
        2) Repeat the process until the number equals 1 (where it will stay), or it loops            endlessly in a cycle which does not include 1.
        3) Those numbers for which this process ends in 1 are happy.
    
    Return true if n is a happy number, and false if not.
    
    EXAMPLE1: 
        Input: n = 19
        Output: true
        Explanation:
        1^2 + 9^2 = 82
        8^2 + 2^2 = 68
        6^2 + 8^2 = 100
        1^2 + 0^2 + 0^2 = 1
    EXAMPLE2:
        Input: n = 2
        Output: false
*/

class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        return isHappyHelper(n, set);
    }
    public boolean isHappyHelper(int n, HashSet<Integer> set){
        if(n == 1){
            return true;
        }
        int sum = 0;
        int curr = n;
        while(curr != 0){
            sum += Math.pow((curr%10), 2); //(curr % 10) * (curr % 10)
            curr/= 10;
        }
        
        if(set.contains(sum)){
            return false;
        }
        
        set.add(sum);
        return isHappyHelper(sum, set);       
    }
}