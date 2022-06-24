/* 28. Implement strStr()

    Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

    Clarification:
    We will return 0 when needle is an empty string. This is consistent to C's strstr() and Java's indexOf().

        EXAMPLE 1:
        Input: haystack = "hello", needle = "ll"
        Output: 2

        EXAMPLE 2:
        Input: haystack = "aaaaa", needle = "bba"
        Output: -1
*/


class Solution {
    public int strStr(String haystack, String needle) {
        
        if(needle.length() == 0){
            return 0;
        }
        
        int start = 0;
        while(start + needle.length() <= haystack.length()){ 
        //start + needle.length() is the index of the last position + 1
            if(!haystack.substring(start, start + needle.length()).equals(needle)){
                start++; 
            //if the substring does not contain needle, move the bounds of substring until it does
            } else {
                return start;
            }
        }
        //if it gets here, then haystack does not contain needle
        return -1;
    }
}



/*
 * In Java, this solution is possible but it defeats the purpose of implementing strStr()
 * 
 * class Solution {
    public int strStr(String haystack, String needle) {
        
        if(needle.length() == 0){
            return 0;
        }
        return haystack.indexOf(needle);
    }
}

 */