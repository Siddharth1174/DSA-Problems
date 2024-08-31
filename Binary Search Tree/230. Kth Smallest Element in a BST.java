//Problem Link:
https://leetcode.com/problems/kth-smallest-element-in-a-bst/description/
//Solution:
class Solution {
    public int kthSmallest(TreeNode root, int k) {
        int[] kSmallest = new int[]{Integer.MIN_VALUE};
        //Counter to count nodes visited
        int[] counter = new int[]{0};
        inorder(root, counter, k, kSmallest);
        return kSmallest[0];
    }
    private void inorder(TreeNode node, int[] counter, int k, int[]kSmallest){
        if(node==null || counter[0]>=k) return;
        //TO traverse left subtree
        inorder(node.left, counter, k, kSmallest);
        counter[0]++;
        //check if current node is kth smallest
        if(counter[0]==k){
            kSmallest[0]=node.val;
            return;
        }
        //Traverse right subtree if kth smallest not found yet
        inorder(node.right, counter, k, kSmallest);
    }
}
