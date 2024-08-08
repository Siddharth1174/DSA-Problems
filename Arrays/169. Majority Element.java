//Problem Link:
https://leetcode.com/problems/majority-element/description/
//Solution:
class Solution {
    public int majorityElement(int[] nums) {
        int cnt = 0;
        int number = 0;
        for(int i : nums){
            if(cnt == 0) number = i;
            if(i==number) cnt++;
            else cnt--;
        }
        return number;
    }
        
}
