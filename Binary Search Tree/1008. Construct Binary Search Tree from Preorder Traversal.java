//Problem Link:
https://leetcode.com/problems/construct-binary-search-tree-from-preorder-traversal/description/
//Solution:
class Solution {
    public TreeNode bstFromPreorder(int[] preorder) {
        return bstFromPreorder(preorder, Integer.MAX_VALUE, new int[]{0});
    }
    public TreeNode bstFromPreorder(int[] A, int bound, int[] i){
        if(i[0]==A.length || A[i[0]]>bound) return null;
        TreeNode root = new TreeNode(A[i[0]++]); 
        root.left = bstFromPreorder(A, root.val, i);
        root.right = bstFromPreorder(A, bound, i);
        return root;
    }
}
