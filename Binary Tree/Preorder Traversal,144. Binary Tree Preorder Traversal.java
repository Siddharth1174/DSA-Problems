//Problem Link:
https://leetcode.com/problems/binary-tree-preorder-traversal/description/
//Solution:
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> arr = new ArrayList<>();
        preorderFunc(root,arr);
        return arr;
    }
    static void preorderFunc(TreeNode root, List<Integer> arr){
        if(root==null) return;
        arr.add(root.val);
        preorderFunc(root.left, arr);
        preorderFunc(root.right, arr);
    }
}
