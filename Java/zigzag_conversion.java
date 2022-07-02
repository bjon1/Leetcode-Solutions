/* #6 Zigzag Conversion

        The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

        P   A   H   N
        A P L S I I G
        Y   I   R

        And then read line by line: "PAHNAPLSIIGYIR"

        Write the code that will take a string and make this conversion given a number of rows:

        string convert(string s, int numRows);

        EXAMPLE 1:
        Input: s = "PAYPALISHIRING", numRows = 3
        Output: "PAHNAPLSIIGYIR"

        EXAMPLE 2:
        Input: s = "PAYPALISHIRING", numRows = 4
        Output: "PINALSIGYAHRPI"
        Explanation:
        P     I    N
        A   L S  I G
        Y A   H R
        P     I

        EXAMPLE 3:
        Input: s = "A", numRows = 1
        Output: "A"
*/

class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1){
            return s;
        }
        String result = "";
        for(int i = 0; i < numRows; i++){
            int step = (numRows-1) * 2; 
            for(int j = i; j < s.length(); j+=step){
                result += s.charAt(j);
                if(i > 0 && i < numRows - 1 && j + step - 2*i < s.length()){
                    result += s.charAt(j + step - 2*i);
                }
            }
        }
        return result;
    }
}