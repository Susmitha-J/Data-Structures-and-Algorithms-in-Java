/* Structure of Doubly Linked List
class Node {
    int data;
    Node next;
    Node prev;

    Node(int x) {
        data = x;
        next = null;
        prev = null;
    }
}
*/
class Solution {
    static Node deleteAllOccurOfX(Node head, int x) {
        // single node
        if(head == null || (head.next == null && head.data == x) )return null;
        
        Node temp = head;
        while(temp.next != null) {
            
            if(temp.data == x && temp == head) {
                temp.next.prev = temp.prev;
                head = temp.next;

            } else if(temp.data == x) {
                temp.next.prev = temp.prev;
                temp.prev.next = temp.next;
            }
            temp = temp.next;
        }
        
        if(temp.data == x) {
            temp.prev.next = temp.next;
        }
        
        return head;
    }
}