//Problem Link:
https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/description/
//Solution:
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums, 0, nums.length-1);
    }
    private TreeNode helper(int[] nums, int left, int right){
        if(left>right) return null;

        //To determine middle element
        int mid = left + (right-left)/2;
        TreeNode root = new TreeNode(nums[mid]);

        root.left = helper(nums, left, mid-1);
        root.right = helper(nums, mid+1, right);
        return root;
    }
}
