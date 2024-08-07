//Problem Link;
https://leetcode.com/problems/longest-consecutive-sequence/description/
//Solution:
class Solution {
    public int longestConsecutive(int[] nums) {
        int n  = nums.length;
        if(n==0) return 0;

        int longest = 1;
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i<n; i++){
            set.add(nums[i]);
        }
        for(int i: set){
            if(!set.contains(i-1)){
                int cnt = 1;
                int x = i;
                while(set.contains(x+1)){
                    x=x+1;
                    cnt =cnt+1;
                }
                longest = Math.max(longest, cnt);
            }
        }
        return longest;
    }
}
