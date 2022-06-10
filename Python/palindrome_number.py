


#9. Palindrome Number
#Given an integer x, return true if x is palindrome integer.
#An integer is a palindrome when it reads the same backward as forward.

#  > For example, 121 is a palindrome while 123 is not.
  
#EXAMPLE:
#Input: x = 121
#Output: true
#Explanation: 121 reads as 121 from left to right and from right to left.

class Solution:
    def isPalindrome(self, x: int) -> bool:
        if x < 0:
            return False
        if x == 0:
            return True
        div = 1
        while x >= div * 10:
            div *= 10
        while x:
            left = x // div
            right = x % 10
            if left != right:
                return False
            x = (x%div) // 10
            div = div/100
        return True