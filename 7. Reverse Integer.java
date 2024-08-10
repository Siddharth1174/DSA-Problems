//Problem Link:
https://leetcode.com/problems/reverse-integer/description/
//Solution:
class Solution {
    public int reverse(int x) {
        int reversed = 0;
        int temp = x;
        while(temp!=0){
            int ld = temp%10;
            // Check if the reversed number will overflow after multiplying by 10
            if (reversed > Integer.MAX_VALUE/10 || (reversed == Integer.MAX_VALUE / 10 && ld > 7)) {
                return 0; // Overflow condition
            }
            if (reversed < Integer.MIN_VALUE/10 || (reversed == Integer.MIN_VALUE / 10 && ld < -8)) {
                return 0; // Underflow condition
            }
            reversed = reversed*10 + ld;
            temp = temp/10;
        }
        return reversed;
    }
}
