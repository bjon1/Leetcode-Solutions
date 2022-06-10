/*

9. Palindrome Number
Given an integer x, return true if x is palindrome integer.
An integer is a palindrome when it reads the same backward as forward.

  > For example, 121 is a palindrome while 123 is not.
  
EXAMPLE:
Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.

*/

class Solution {
    //given x, return true if x is a palindrome
    public boolean isPalindrome(int x) {
        
        /*
            What is a palindrome?
            1) must be positive
            2) must be the same from the left and the right 
            of the "middle point"
            3) 0 is a palindrome

        */
         
        long y = Integer.valueOf(x);
        
        if(y < 0){
            return false;
        }
        
        if(y == 0){
            return true;            
        }
    
        long sigNum = 1;
        
        while(sigNum * 10 <= y){ //This will figure out the greatest place
            sigNum *= 10;
        }
        
        while(y != 0){ 
            
    /*
        keep trimming until x is equal to 0. If it is equal to 0, that               means that x was originally a palindrome
    */
            long rightNum  = y % 10;
            long leftNum = y / sigNum;
            
            if(rightNum != leftNum){
                return false;            
            }
            
            y = (y % sigNum) / 10;
            sigNum  = sigNum/100;

        }
        
        return true;
    }
}