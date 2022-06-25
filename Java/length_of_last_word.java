/* #58 Length of Last Word

    Given a string s consisting of words and spaces, return the length of the last word in the string.

    A word is a maximal substring consisting of non-space characters only.

        Example 1:
        Input: s = "Hello World"
        Output: 5
        Explanation: The last word is "World" with length 5.

        Example 2:
        Input: s = "   fly me   to   the moon  "
        Output: 4
        Explanation: The last word is "moon" with length 4.

        Example 3:
        Input: s = "luffy is still joyboy"
        Output: 6
        Explanation: The last word is "joyboy" with length 6.
*/

/* //utilizing the .split() method
    public int lengthOfLastWord(String s) {
        String[] arr = s.split(" ");
        return arr[arr.length-1].length();
    }
}
*/

class Solution {
    public int lengthOfLastWord(String s) { 
        int length = 0;
        for(int i = s.length()-1; i >= 0; i--){
            if(s.charAt(i) != ' '){
                length++;
            } else if(length > 0) {
                return length;
            }
        }
        return length;
    }
}
