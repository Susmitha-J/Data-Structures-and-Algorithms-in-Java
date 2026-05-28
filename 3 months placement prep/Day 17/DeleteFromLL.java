/*
class Node
{
    int data;
    Node next;

    Node(int d)
    {
        this.data = d;
        this.next = null;
    }
}
*/
class Solution {
    Node deleteNode(Node head, int x) {
        // code here
        if(head == null) return head;
        
        //head
        if(x == 1) {
            head = head.next;
            return head;
        }
        
        Node temp = head;
        for(int i = 1; temp != null && i< x-1;i++){
                        temp = temp.next;

        }
        
        //tail 
        if(temp == null || temp.next == null) {
            return head;
        }
        
        temp.next = temp.next.next;
        return head;

    }
}