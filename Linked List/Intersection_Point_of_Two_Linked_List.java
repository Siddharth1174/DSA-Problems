//Problem Link:
https://leetcode.com/problems/intersection-of-two-linked-lists/description/
//Solution:
public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null || headB==null) return null;

        ListNode a = headB;
        ListNode b = headA;

        while(a!=b){
            a = a == null? headB : a.next;
            b = b == null? headA : b.next;
        }
        return a;
    }
