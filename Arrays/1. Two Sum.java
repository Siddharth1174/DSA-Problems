//Problem Link:
https://leetcode.com/problems/two-sum/description/
//Solution:
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                return new int[] {map.get(complement), i};
            }
            map.put(nums[i], i);
            //it stores number as the key and its index as the value
        }
        return null;
    }
}
