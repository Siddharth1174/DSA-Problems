//Problem link:
https://leetcode.com/problems/flatten-binary-tree-to-linked-list/
//Solution:
class Solution {
    public void flatten(TreeNode root) {
        TreeNode curr = root;

        while(curr!=null){
            if(curr.left!=null){
                TreeNode pre = curr.left;
                while(pre.right!=null){
                    pre = pre.right;
                }
                // Connect the rightmost node in
                // the left subtree to the current
                // node's right child
                pre.right = curr.right;
                // Move the entire left subtree to the
                // right child of the current node
                curr.right = curr.left;
                // Set the left child of the current node to NULL
                curr.left = null;
            }
            // Move to the next node on the right side
            curr = curr.right;
        }
    }
}
