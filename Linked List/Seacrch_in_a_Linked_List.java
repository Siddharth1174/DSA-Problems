//Problem Link:
https://www.naukri.com/code360/problems/search-in-a-linked-list_975381?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=PROBLEM
//Solution:
 public static int searchInLinkedList(Node head, int k)
    {
        // Write Your Code Here.
        Node temp = head;

        while (temp!=null){
            if(temp.data==k){
                return 1;
            }
            temp=temp.next;
        }
        return 0;
    }
