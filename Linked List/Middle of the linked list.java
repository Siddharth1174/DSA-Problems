//Problem Link:
https://leetcode.com/problems/middle-of-the-linked-list/description/
//Solution:
public ListNode middleNode(ListNode head) {
        ListNode slow = head, fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
}
