//Problem Link:
https://www.naukri.com/code360/problems/count-nodes-of-linked-list_5884?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=PROBLEM
//Solution:
public static int length(Node head){
        //Your code goes here
        int length = 0;
        Node current = head;
        while(current!=null){
            length++;
            current = current.next;
        }
        return length;
    }
