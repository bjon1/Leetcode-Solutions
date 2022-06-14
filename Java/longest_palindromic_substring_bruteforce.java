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

class Solution { //brute force method
    public String longestPalindrome(String s) {
        
        if(s.length() == 1){
            return s;
        }
        
        String maxPalindrome = "";
        for(int i = 0; i < s.length(); i++){
            for(int j = i+1; j <= s.length(); j++){
                if(isPalindrome(s.substring(i,j))){
                    if(s.substring(i,j).length() > maxPalindrome.length()){
                        maxPalindrome = s.substring(i,j);
                    }
                }
            }  
        }       
        return maxPalindrome;
    }
    
    public boolean isPalindrome(String s){
        while(s.length() > 1){
            if(s.charAt(0) == s.charAt(s.length()-1)){
                s = s.substring(1, s.length()-1);
            } else {
                return false;
            }
        }
        return true;        
    }
}