//Problem link:
https://www.geeksforgeeks.org/problems/power-of-2-1587115620/1?page=2&sortBy=submissions
//Solution:
class Solution {

    // Function to check if given number n is a power of two.
    public static boolean isPowerofTwo(long n) {
        if(n<=0) return false;
        return (n&(n-1))==0;
    }
}
