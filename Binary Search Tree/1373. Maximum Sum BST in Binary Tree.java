//Problem Link:
https://leetcode.com/problems/maximum-sum-bst-in-binary-tree/
//Solution:
class Solution {
    private class SubtreeInfo{
        boolean isBST;
        int sum;
        int min;
        int max;

        SubtreeInfo(boolean isBST, int sum, int min, int max){
            this.isBST = isBST;
            this.sum = sum;
            this.min = min;
            this.max = max;
        }
    }
    private int maxSum = 0;
    public int maxSumBST(TreeNode root) {
        postOrder(root);
        return maxSum;
    }
    private SubtreeInfo postOrder(TreeNode node){
        if(node==null){
            return new SubtreeInfo(true,0,Integer.MAX_VALUE, Integer.MIN_VALUE);
        }
        SubtreeInfo left = postOrder(node.left);
        SubtreeInfo right = postOrder(node.right);

        if(left.isBST && right.isBST && node.val>left.max && node.val<right.min){
            int currentSum = node.val + left.sum + right.sum;
            maxSum = Math.max(maxSum, currentSum);

            int minVal = Math.min(node.val, left.min);
            int maxVal = Math.max(node.val, right.max);
            return new SubtreeInfo(true, currentSum, minVal, maxVal);
        } else{
            return new SubtreeInfo(false, 0, 0 ,0);
        }
    }
}
