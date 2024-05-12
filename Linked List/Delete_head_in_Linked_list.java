//Problem Link:
https://www.naukri.com/code360/problems/delete-head-of-a-given-linked-list_9941216?leftPanelTabValue=PROBLEM
//Solution:
public static Node deleteHead(Node head) {
        // Write Your Code Here.
        if(head==null) return head;
        head = head.next;
        return head;
  }
