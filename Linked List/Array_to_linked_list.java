//Problem Link:
https://www.naukri.com/code360/problems/introduction-to-linked-list_8144737?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
//Solution:
public static Node constructLL(int []arr) {
        // Write your code here
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i=1; i<arr.length;i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;

        }
        return head;
    }
