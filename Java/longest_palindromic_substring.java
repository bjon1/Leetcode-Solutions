/* #5 Longest Palindromic Substring
 
    Given a string s, return the longest palindromic substring in s.

    EXAMPLE 1:
    Input: s = "babad"
    Output: "bab"
    Explanation: "aba" is also a valid answer.

    EXAMPLE 2:
    Input: s = "cbbd"
    Output: "bb"

 */

class Solution {
    public String longestPalindrome(String s) {
        if(s.length() <= 1){ //if the size of s is 1 or less, then the longest palindromic substring must be itself
            return s;
        }
        int start = 0; 
        int end = 0; 
        //start and end will help store the starting and ending value of the longest palindrome
        
        for(int i = 0; i < s.length(); i++){
            int len1 = expandUntilLongestPalindrome(s, i, i); 
            //in case s is odd, i will be the "center value" and the function will progressively check the "radius" of the values around it
            int len2 = expandUntilLongestPalindrome(s, i, i+1);
            /*
                len1 and len2 exist with foresight for two palindrome types: 
                1) that the palindrome's length is even 
                2) that the palindrome's length is odd. 
                
                If the palindrome's length is odd, then there is a "center point" which both points should start at, 
                and then they should incrementally expand their boundaries in opposite directions,
                all while checking if the value pointed by the left and the right boundaries are the same (as in len1).
                
                If the palindrome's length is even, then there is no "center point," and the initial comparison should be different (as in len2).
            */
            
            int len = Math.max(len1, len2); 
            
            /*
                The variable len will take the value of whichever is largest of the two: len1 or len2
                (which, as a byproduct, decides whether the found palindrome is of even or odd length).
            */
            
            if(len > end - start){ //updates len if need be
                start = i-(len-1)/2; 
                end = i+(len/2);
                //Note that (len-1)/2 is the "distance" from the "center value" to the end
            }
        }
        return s.substring(start, end+1);
    }
    
    public int expandUntilLongestPalindrome(String s, int left, int right){
        
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){     

        /*
            Variables left and right should not pass the constraints of String s. 
            The value they are pointing at should also be equal to each other. 
            This loop will expand the bounds of left and right until these constraints are no longer satisfied. 
            These constraints ensure that the function can find the longest palindromic substring.
        */

            left--;
            right++;                        
        }
        return right - left - 1; //(right-1) - (left+1) + 1; 
        
        /*
            Note: The commented code provides a more intuitive, but unsimplified code. 
            Variable right must be decremented and variable left must be incremented before being returned because right& left are checked immediately after incrementation. This means that the values of left and right the moment after the loop is exited are either one too low or one too high, respectively. The additional + 1 is due to the fact that indexes start at 0 and the value of the length must be the value of the last index + 1.
  
        */    
    } 
}