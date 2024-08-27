//Problem Link:
https://leetcode.com/problems/populating-next-right-pointers-in-each-node/
//Solution:
class Solution {
    public Node connect(Node root) {
        if(root==null) return null;
        Node leftmost = root;
        while(leftmost.left!=null){
            Node head = leftmost;
            while(head!=null){
                //Connecting left child with right child
                head.left.next = head.right;
                
                if(head.next!=null){
                    //Connecting right child to next node's left child
                    head.right.next = head.next.left;
                }
                //Move to the next node in same level
                head = head.next;
            }
            //Move to next level
            leftmost = leftmost.left;
        }
        return root;
    }
}
