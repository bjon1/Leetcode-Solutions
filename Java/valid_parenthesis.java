/*
    #20 Valid Parentheses
    
        Given a string s containing just the characters '(', ')', '{', '}',         '[' and ']', determine if the input string is valid.

        An input string is valid if:
        1) Open brackets must be closed by the same type of brackets.
        2) Open brackets must be closed in the correct order.

    Example 1:
    Input: s = "()"
    Output: true
    
    Example 2:
    Input: s = "()[]{}"
    Output: true

    Example 3:
    Input: s = "(]"
    Output: false
*/

class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                st.push(')');
            } else if(s.charAt(i) == '['){
                st.push(']');
            } else if(s.charAt(i) == '{'){
                st.push('}');
            } else if(st.isEmpty() || st.pop() != s.charAt(i)){
                return false;
            }  
        }
        return st.isEmpty();
    }
}