//Problem Link:
https://leetcode.com/problems/sqrtx/
//Solution:
class Solution {
    public int mySqrt(int x) {
        if(x==0 || x==1) return x;
        long l = 1, h =x/2;
        long ans = 0;
        while(l<=h){
            long m = (l+h)/2;
            if(m*m == x) return (int)m;
            else if(m*m < x) {
                l=m+1;
                ans = m;
            }    
            else h = m-1;
        }
        return (int)ans;

    }
}
