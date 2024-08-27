//Problem Link:
https://www.geeksforgeeks.org/problems/children-sum-parent/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=hildren-sum-parent
//Solution:
class Solution
{
    //Function to check whether all nodes of a tree have the value 
    //equal to the sum of their child nodes.
    public static int isSumProperty(Node root)
    {
        // add your code here
        if(root == null || (root.right==null && root.left==null)) return 1;
        
        int leftval = 0, rightval = 0;
        if(root.left!=null) leftval = root.left.data;
        if(root.right!=null) rightval = root.right.data;
        
        if(root.data == leftval+rightval && isSumProperty(root.left)==1 && isSumProperty(root.right)==1){
            return 1;
        } else {
            return 0;
        }
        
        
    }
}
