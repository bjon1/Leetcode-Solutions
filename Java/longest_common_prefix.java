/* #14. Longest Common Prefix

    Write a function to find the longest common prefix string amongst an array of       strings.

    If there is no common prefix, return an empty string "".

    EXAMPLE1:
    Input: strs = ["flower","flow","flight"]
    Output: "fl"

    EXAMPLE2:
    Input: strs = ["dog","racecar","car"]
    Output: ""
    Explanation: There is no common prefix among the input strings.
    
*/

class Solution {
    public String longestCommonPrefix(String[] strs) {
        String s = strs[0];
        for(int i = 1; i < strs.length; i++){
            while(strs[i].indexOf(s) != 0){
                s = s.substring(0, s.length()-1);
            }
        }
        return s;
    }
}