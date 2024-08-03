//Problem Link:
https://www.naukri.com/code360/problems/inorder-traversal_3839605?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&count=25&page=1&search=&sort_entity=order&sort_order=ASC&leftPanelTabValue=PROBLEM
//Solution:
/*
    Following is the TreeNode class structure:

    public class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode() {
            this.data = 0;
            this.left = null;
            this.right = null;
        }
        TreeNode(int val) {
            this.data = val;
            this.left = null;
            this.right = null;
        }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.data = val;
            this.left = left;
            this.right = right;
        }
    };
*/
import java.util.*;
import java.util.List;

public class Solution {
    public static List< Integer > getInOrderTraversal(TreeNode root) {
        // Write your code here.
        //USing Morris Inorder Traversal :
        List<Integer> inorder = new ArrayList<>();
        TreeNode cur = root;
        while(cur!=null){
            //1st Case:
            if(cur.left == null){
                inorder.add(cur.data);
                cur = cur.right;
            }//2nd Case:
            else{
                TreeNode prev = cur.left;
                while(prev.right!=null && prev.right!=cur){
                    prev = prev.right;
                }
                if(prev.right == null){
                    prev.right = cur;
                    cur = cur.left;
                } else{
                    prev.right = null;
                    inorder.add(cur.data);
                    cur = cur.right;
                }
            }
        }
        return inorder;
    }
}
