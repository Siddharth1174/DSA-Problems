//Problem Link:https://leetcode.com/problems/intersection-of-two-arrays/
//Solution:
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();

        //Adding nums1 elements to set1 :
        for(int num: nums1){
            set1.add(num);
        }

        //Checking for common ones
        for(int num: nums2){
            if(set1.contains(num)){
                result.add(num);
            }
        }

        //converting result set to an array
        int ans[] = new int[result.size()];
        int i = 0;
        for(int num: result){
            ans[i++]=num;
        }

        return ans;
    }
}
