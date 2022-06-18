/* #13 Roman to Integer

    Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
    Given a roman numeral, convert it to an integer.

        EXAMPLE 1:
        Input: s = "III"
        Output: 3
        Explanation: III = 3.

        EXAMPLE 2:
        Input: s = "LVIII"
        Output: 58
        Explanation: L = 50, V= 5, III = 3.

        EXAMPLE 3:
        Input: s = "MCMXCIV"
        Output: 1994
        Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
*/

class Solution {
    public int romanToInt(String s) {
        //create a hashmap
        HashMap<Character, Integer> values = new HashMap<>();
        values.put('I', 1);
        values.put('V', 5);
        values.put('X', 10);
        values.put('L', 50);
        values.put('C', 100);
        values.put('D', 500);
        values.put('M', 1000);
        
        int result = values.get(s.charAt(s.length()-1));
        for(int i = s.length()-2; i >= 0; i--){
            if(values.get(s.charAt(i)) >= values.get(s.charAt(i+1))){
                result += values.get(s.charAt(i));
            } else {
                result -= values.get(s.charAt(i));
            }
        }
        return result;
    }
}