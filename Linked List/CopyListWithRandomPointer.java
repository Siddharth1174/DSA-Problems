//Problme Link:
https://leetcode.com/problems/copy-list-with-random-pointer/description/
//Solution:
public void insertCopyInBetween(Node head){
        Node temp = head;
        while(temp!=null){
            Node nextElement = temp.next;
            Node copy = new Node(temp.val);
            copy.next = nextElement;
            temp.next = copy;
            temp = nextElement;
        }
    }
    public void connectRandomPointers(Node head) {
    Node temp = head;
    while (temp != null) {
        Node copyNode = temp.next;

        if (temp.random != null) {
            
            copyNode.random = temp.random.next;
        } else {
            
            copyNode.random = null;
        }

        
        temp = temp.next.next;
    }
    }
    public Node getDeepCopyList(Node head) {
    Node temp = head;
    
    Node dummyNode = new Node(-1);
    
    Node res = dummyNode;

    while (temp != null) {
                
        res.next = temp.next;
        res = res.next;

        
        temp.next = temp.next.next;
        temp = temp.next;
    }


    return dummyNode.next;
    }

    public Node copyRandomList(Node head) {
        if (head == null) return null;

    
    insertCopyInBetween(head);
    
    connectRandomPointers(head);
    
    return getDeepCopyList(head);
    }
