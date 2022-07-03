/* #937 Reorder Data in Log Files

    You are given an array of logs. Each log is a space-delimited string of words, where the first word is the identifier.

    There are two types of logs:

    Letter-logs: All words (except the identifier) consist of lowercase English letters.
    Digit-logs: All words (except the identifier) consist of digits.
    Reorder these logs so that:

    The letter-logs come before all digit-logs.
    The letter-logs are sorted lexicographically by their contents. If their contents are the same, then sort them lexicographically by their identifiers.
    The digit-logs maintain their relative ordering.
    Return the final order of the logs.

 
        Example 1:
        Input: logs = ["dig1 8 1 5 1","let1 art can","dig2 3 6","let2 own kit dig","let3 art zero"]
        Output: ["let1 art can","let3 art zero","let2 own kit dig","dig1 8 1 5 1","dig2 3 6"]
        Explanation:
        The letter-log contents are all different, so their ordering is "art can", "art zero", "own kit dig".
        The digit-logs have a relative order of "dig1 8 1 5 1", "dig2 3 6".

        Example 2:
        Input: logs = ["a1 9 2 3 1","g1 act car","zo4 4 7","ab1 off key dog","a8 act zoo"]
        Output: ["g1 act car","a8 act zoo","ab1 off key dog","a1 9 2 3 1","zo4 4 7"]
*/

public class Solution {
    public String[] reorderLogFiles(String[] logs) {
        Arrays.sort(logs, (log1, log2) -> {
            String[] arr1 = log1.split(" ", 2);
            String[] arr2 = log2.split(" ", 2);
            
            boolean isDigit1 = Character.isDigit(arr1[1].charAt(0));
            boolean isDigit2 = Character.isDigit(arr2[1].charAt(0));
            /*there are four cases:
                isDigit1 & isDigit2 are both digits
                isDigit1 is true and isDigit2 is false  
                isDigit1 is false and isDigit2 is true
                isDigit1 is false and isDigit2 is false (they are both letters)
            */
            if(isDigit1 && isDigit2){
                return 0;
            } else if(isDigit1){
                return 1;
            } else if(isDigit2){
                return -1;
            }
            //if it reaches here, we are dealing with two letters
            boolean isSame = arr1[1].equals(arr2[1]);
            if(isSame){
                return arr1[0].compareTo(arr2[0]);
            }
            return arr1[1].compareTo(arr2[1]);
        });
        return logs;             
    }
}