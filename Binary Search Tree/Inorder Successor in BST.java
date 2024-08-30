//Problem Link:
https://www.geeksforgeeks.org/problems/inorder-successor-in-bst/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card
//Solution:

class Solution
{
    // returns the inorder successor of the Node x in BST (rooted at 'root')
	public Node inorderSuccessor(Node root,Node x)
         {
          //add code here.
          Node successor = null;
          while(root!=null){
              if(x.data>=root.data) root = root.right;
              else{
                  successor = root;
                  root = root.left;
              }
          }
          return successor;
         }
}
