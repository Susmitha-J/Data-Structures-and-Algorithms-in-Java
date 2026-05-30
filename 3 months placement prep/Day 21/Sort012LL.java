/*
class Node {
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}*/

class Solution {
    public Node segregate(Node head) {
        // code here
        Node dummy0 = new Node(0);
        Node dummy1 = new Node(1);
        Node dummy2 = new Node(2);
        
        if(head == null || head.next == null) return head;
        
        Node tail0 = dummy0, tail1= dummy1, tail2 = dummy2;
        
        while(head != null) {
            if(head.data == 0) {
                tail0.next = head;
                tail0 = tail0.next;
            } else if( head.data == 1) {
                tail1.next = head;
                tail1 = tail1.next;
            } else {
                tail2.next = head;
                tail2 = tail2.next;
            }
             head = head.next;
             
        }
        
           tail2.next = null;
        // Merge lists
        tail1.next = dummy2.next;
        tail0.next = dummy1.next != null ? dummy1.next : dummy2.next;
        
        return dummy0.next;
    }
}