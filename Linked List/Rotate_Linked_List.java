//Problem Link:
https://leetcode.com/problems/rotate-list/
//Solution:
public ListNode rotateRight(ListNode head, int k) {
        //EDGE CASE
        if(head==null || head.next==null || k==0) return head;

        //compute length;
        ListNode cur = head;
        int len = 1;
        while(cur.next!=null){
            len++;
            cur = cur.next;
        }

        //go till that node
        cur.next = head;
        k = k%len;
        k = len-k;
        while(k-- >0) cur = cur.next;

        //make node head and break connection
        head = cur.next;
        cur.next = null;

        return head;
    }
