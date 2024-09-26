//Problem Link:
https://www.geeksforgeeks.org/problems/remove-loop-in-linked-list/1?page=1&sortBy=submissions
//Solution:
/*
class Node
{
    int data;
    Node next;
}
*/

class Solution {
    // Function to remove a loop in the linked list.
    public static void removeLoop(Node head) {
        // code here
        // remove the loop without losing any nodes
        if(head==null || head.next==null) return;
        
        Node slow = head, fast = head;
        
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            
            //Loop Detection:
            if(slow==fast) break;
        }
        //if loop doesn't exist
        if(slow!=fast) return;
        
        //If loop exists
        slow=head;
        if(slow==fast){//if loop starts at head
            while(fast.next!=slow){
                fast=fast.next;
            }
        }
        else{
            while(slow.next!=fast.next){
                slow = slow.next;
                fast = fast.next;
            }
        }
        fast.next = null;
    }
}
