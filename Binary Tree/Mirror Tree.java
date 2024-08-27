//Problem Link:
https://www.geeksforgeeks.org/problems/mirror-tree/1
//Solution:
class Solution {
    // Function to convert a binary tree into its mirror tree.
    void mirror(Node node) {
        // Your code here
        if(node == null) return;
        
        //To recursively mirror the left and right subtree
        mirror(node.left);
        mirror(node.right);
        
        Node temp = node.left;
        node.left = node.right;
        node.right = temp;
        
    }
}
