//Problem Link:
https://leetcode.com/problems/linked-list-cycle/description/
//Solution:
public boolean hasCycle(ListNode head) {
        if(head==null || head.next==null) return false;

        ListNode fast = head;
        ListNode slow = head;

        while(fast.next!=null && fast.next.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast==slow)   return true;
        }
        return false;
  }
