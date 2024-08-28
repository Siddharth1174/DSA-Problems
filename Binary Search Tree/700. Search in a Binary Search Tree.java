//Problem Link:
https://leetcode.com/problems/search-in-a-binary-search-tree/description/
//Solution:
class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        //O(log(N))
        if(root==null || root.val == val){
            return root;
        }
        //Prop of BST: left child will be smaller and right will be bigger.
        if(val<root.val){
            return searchBST(root.left, val);
        }
        return searchBST(root.right, val);
    }
}
