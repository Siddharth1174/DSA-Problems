//Problem Link:
https://leetcode.com/problems/palindrome-linked-list/description/
//Solution:
public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) return true;
        ListNode slow = head;
        ListNode fast = head;

        //middle of LL
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        //Reverse right half
        slow.next = reverseList(slow.next);

        //move slow to right half
        slow = slow.next;

        //comparing left and right half
        while(slow!=null){
            if(head.val!=slow.val)      return false;
            head = head.next;
            slow = slow.next;
        }
        return true;
    }
    ListNode reverseList(ListNode head){
        ListNode pre = null;
        ListNode next = null;
        while(head!=null){
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }
