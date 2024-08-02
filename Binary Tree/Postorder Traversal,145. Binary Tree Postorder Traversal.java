//Problem Link:
https://leetcode.com/problems/binary-tree-postorder-traversal/description/
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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> arr = new ArrayList<>();
        postorderFunc(root, arr);
        return arr;
    }
    static void postorderFunc(TreeNode root, List<Integer> arr){
        if(root==null) return;
        postorderFunc(root.left, arr);
        postorderFunc(root.right, arr);
        arr.add(root.val);
    }
}
