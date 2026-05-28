/*
Structure of a Doubly LinkList
class Node {
    int data;
    Node next;
    Node prev;

    Node(int val) {
        data = val;
        next = null;
        prev = null;
    }
}
*/
class Solution {
    public Node delPos(Node head, int x) {
        // code here
        if(head == null) return head;
        
        if(x == 1) {
            head = head.next;
            head.prev = null;
            return head;
        }
        
        Node temp = head;
        for(int i = 1;temp != null && i<x;i++) {
            temp = temp.next;
        }
        
        temp.prev.next = temp.next;
        if(temp.next!= null)
        temp.next.prev = temp.prev;
        
        return head;
        
        
    }
}