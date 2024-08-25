//Problem Link:
https://www.geeksforgeeks.org/problems/palindrome-string0817/1?page=3&sortBy=submissions
//Solution:
class Solution {
    int isPalindrome(String S) {
        // code here
        StringBuilder reversed_S = new StringBuilder();
        for(int i = S.length()-1; i>=0; i--){
            reversed_S.append(S.charAt(i));
        }
        if(reversed_S.toString().equals(S)) return 1;
        else return 0;
    }
};
