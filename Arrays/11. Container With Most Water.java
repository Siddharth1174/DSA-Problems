//Problem Link:
https://leetcode.com/problems/container-with-most-water/description/
//Solution:
class Solution {
    public int maxArea(int[] height) {
        int left = 0, right = height.length-1;
        int maxArea = 0;

        while(left<right){
            int currentArea = Math.min(height[left], height[right])*(right-left);
            
            maxArea = Math.max(maxArea, currentArea);

            if(height[left]<height[right]) left++;
            else right--;
        }
        return maxArea;
    }
}
