//Problem Link:
https://www.geeksforgeeks.org/problems/sum-of-series2811/1?page=2&sortBy=submissions
//Solution:
class Solution {
    public static long seriesSum(int n) {
        // code here
        long sum = 0;
        for(int i = 0; i<=n; i++){
            sum+=i;
        }
        return sum;
    }
}
