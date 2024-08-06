//Problem Link:
https://leetcode.com/problems/find-the-duplicate-number/description/
//Solution:
class Solution {
    //nlogn complexity:
    // public int findDuplicate(int[] nums) {
    //     Arrays.sort(nums);
    //     for(int i = 0; i<nums.length-1; i++){
    //         if(nums[i]==nums[i+1]) return nums[i];
    //     }
        
    //     return -1;
    // }

    
    //O(n) complexity:--
    public int findDuplicate(int[] nums) {
        Set<Integer> set = new HashSet();
        for(int i=0; i<nums.length; i++){
            if(set.contains(nums[i])) return nums[i];
            set.add(nums[i]);
        }
        return -1;
    }
}
