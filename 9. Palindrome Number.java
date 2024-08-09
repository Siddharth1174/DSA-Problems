//Problem Link;
https://leetcode.com/problems/palindrome-number/description/
//Solution:
class Solution {
    static boolean isPalindrome(int x) {
        if(x<0) return false;
        int reversed = 0;
        int temp = x;
        while(temp!=0){
            int lastDig = temp%10;
            reversed = reversed*10 + lastDig;
            temp = temp/10;
        }       
        if(reversed == x) return true;
        else return false;
        
    }
    
}
