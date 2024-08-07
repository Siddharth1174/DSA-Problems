//Problem Link:
https://leetcode.com/problems/find-the-highest-altitude/description/
//Solution:
class Solution {
    public int largestAltitude(int[] gain) {
        int sum = 0;
        int maxSum = 0;
        for(int i = 0; i<gain.length; i++){
            sum =gain[i] + sum;
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
}
