//Problem Link:
https://www.geeksforgeeks.org/problems/left-view-of-binary-tree/1
//Solution:
//User function Template for Java

/* A Binary Tree node
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}*/
class Tree
{
    //Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root)
    {
      // Your code here
      ArrayList<Integer> result = new ArrayList<Integer>();
      leftView(root, result, 0);
      return result;
    }
    public void leftView(Node curr, ArrayList<Integer> result, int currDepth){
        if(curr == null) return;
        if(currDepth == result.size()) result.add(curr.data);
        leftView(curr.left, result, currDepth+1);
        leftView(curr.right, result, currDepth+1);
    }
}
