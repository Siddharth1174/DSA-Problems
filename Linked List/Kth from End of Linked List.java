//Problem Link:
https://www.geeksforgeeks.org/problems/nth-node-from-end-of-linked-list/1?page=2&sortBy=submissions
//Solution:
class Solution {

    // Function to find the data of kth node from
    // the end of a linked list.
    int getKthFromLast(Node head, int k) {
        // Your code here
        if(head==null) return -1;
        
        Node slow = head, fast = head;
        
        for(int i = 0; i<k; i++){
            if(fast==null) return -1;
            fast = fast.next;
        }
        
        while(fast!=null){
            fast = fast.next;
            slow = slow.next;
        }
        
        return slow.data;
    }
}
