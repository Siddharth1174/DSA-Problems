//Problem Link:
https://leetcode.com/problems/delete-node-in-a-linked-list/description/
//Solution:
public void deleteNode(ListNode node) {
        if(node == null) return;
        node.val = node.next.val;
        node.next = node.next.next;
        return;
}
