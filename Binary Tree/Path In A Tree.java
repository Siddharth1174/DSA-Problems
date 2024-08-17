//Problem Link:
https://www.naukri.com/code360/problems/path-in-a-tree_3843990?leftPanelTabValue=PROBLEM
//Solution:

import java.util.* ;
import java.io.*; 
/*   
    Following is the Binary Tree node structure for referance:

    class TreeNode
    {
        int data;
        TreeNode left, right;
    
        public TreeNode(int item)
        {
            data = item;
            left = right = null;
        }
    }
*/

public class Solution {
    private boolean getPath(TreeNode root, ArrayList<Integer> arr, int x){
        if(root==null){
            return false;
        }
        arr.add(root.data);
        if(root.data == x) return true;
        if(getPath(root.left, arr, x) || getPath(root.right, arr, x)){
            return true;
        }
        arr.remove(arr.size()-1);
        return false;
    }
    public static ArrayList<Integer> pathInATree(TreeNode root, int x) {
        // Write your code here..
        ArrayList<Integer> arr = new ArrayList<>();
        if(root == null) return arr;
        // getPath(root, arr, x);
        Solution solution = new Solution();
        solution.getPath(root, arr, x);
        return arr;
    }
}
